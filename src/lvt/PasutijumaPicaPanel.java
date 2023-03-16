package lvt;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PasutijumaPicaPanel {
	public static JPanel panel=new JPanel(); 
	public PasutijumaPicaPanel() {  
        panel.setBounds(0,25,500,475);    
        GridLayout layout = new GridLayout(3,2);
        panel.setLayout(layout);
        
        JLabel t1 = new JLabel("Pizza: "), t2= new JLabel("Size: "), t3= new JLabel("Drinks: ");
        String[] opt1 = {"studentu","tropiskā","gaļas"};
        String[] opt2 = {"20cm","25cm","30cm"};
        String[] opt3 = {"nav","ūdens","sula", "pepsi"};
        JComboBox box1 = new JComboBox(opt1), box2 = new JComboBox(opt2), box3 = new JComboBox(opt3);
        //JButton btn = new JButton("pievienot");
        t1.setFont(new Font("Arial", Font.BOLD, 30));
        t2.setFont(new Font("Arial", Font.BOLD, 30));
        t3.setFont(new Font("Arial", Font.BOLD, 30));
        box1.setFont(new Font("Arial", Font.BOLD, 30));
        box2.setFont(new Font("Arial", Font.BOLD, 30));
        box3.setFont(new Font("Arial", Font.BOLD, 30));
        
        panel.add(t1);
        panel.add(box1);
        panel.add(t2);
        panel.add(box2);
        panel.add(t3);
        panel.add(box3);
        panel.validate();
	}
       
		
}
