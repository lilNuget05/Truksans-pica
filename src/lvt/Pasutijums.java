package lvt;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pasutijums {
	public static int i=0;
	public static double kopa=0, cen1=0;
	public static LinkedList<JPanel> order = new LinkedList<JPanel>();
	public static boolean payIsOk=false;
	public static LinkedList<String> iteams = new LinkedList<String>();
	
	public static void pievieno(String item, String size, double cena) {
		cen1 = cena;
		JPanel p = new JPanel();
		p.setBounds(0, i, 150, 50);
		JLabel t = new JLabel(item+" "+size+" "+cena+"Eur");
		iteams.add(item+size);
		p.add(t);
		order.add(p);
		p.revalidate();
		Panel7.p.add(p);
		Panel7.p.revalidate();
		Panel7.p.repaint();
		
		i = i+50;
	}
	public static void nonemt() {
		Panel7.p.remove(order.getLast());
		order.remove(order.getLast());
		Cena1(cen1-(2*cen1));
		Panel7.p.revalidate();
		Panel7.p.repaint();
		Panel8.p.revalidate();
		Panel8.p.repaint();
		i = i -50;
		
		
	}
	public static void Cena1(double d) {
		kopa +=d;
		Panel8.t.setText("Cena: "+kopa+"Eur");
		
	}
	public static void Pay() throws IOException{
		if (payIsOk == true) {
			
			String virkne = "";
			double cenaKopa = kopa;
			for (int k=0;k<iteams.size();k=0) {
				virkne += iteams.getFirst()+ " ";
				nonemt();
				iteams.remove(iteams.getFirst());
				
			}
			
			
			virkne += cenaKopa+"\n";
			System.out.println(virkne);
			saglaba(virkne);
			payIsOk = false;
			
			
		}
	}
	private static void saglaba(String virkne) throws IOException {
		FileWriter fr = new FileWriter("orderList.txt", true); 
		try (BufferedWriter raksta = new BufferedWriter(fr)) {
			raksta.write(virkne);
		}
		
	}
	

}
