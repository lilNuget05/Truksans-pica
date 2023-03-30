package lvt;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel5 implements ActionListener {
	public static JPanel p = new JPanel();
	public static JButton b1 = new JButton("Add"), b2 = new JButton("Pay");
	public Panel5() {
		p.setBackground(Color.red);
		p.setBounds(199, 400, 486, 74);
		p.setLayout(new GridLayout(0,2));
		b1.addActionListener(this); b2.addActionListener(this);
		p.add(b1); p.add(b2);
		p.validate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			if (AparatsFrame.f.isAncestorOf(Panel4.p)) {
				String pica = (String) Panel4.c1.getSelectedItem();
				//System.out.println("pica: "+pica);
				String izmers = (String) Panel4.c2.getSelectedItem();
				//System.out.println("izmers: "+izmers);
				if (pica !="" && izmers != "") {
					Pasutijums.pievieno(pica, izmers, 5.00);
					Pasutijums.Cena1(5.0);
				}
			}
			else {
				String drink = (String) Panel6.c1.getSelectedItem();
				//System.out.println("drink: "+drink);
				String izmers = (String) Panel6.c2.getSelectedItem();
				//System.out.println("izmers: "+izmers);
				if (drink !="" && izmers != "") {
					Pasutijums.pievieno(drink, izmers, 3.0);
					Pasutijums.Cena1(3.0);
				}
				
			}
			
		}
		else {
			PaswordPane pas = new PaswordPane();
		}
		
	}
}
