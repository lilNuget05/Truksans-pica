package lvt;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class Panel6 {
	public static Panel p = new Panel();
	public static JLabel t1 = new JLabel("Drink:"), t2 = new JLabel("Size:");
	public static String[] s1 = {"", "Fanta", "Pepsi", "water", "Sparkling water", "Milkshake", "Coffe"}, s2 = {"","0,3L", "0,5L", "0,7L"};
	public static JComboBox c1 = new JComboBox(s1), c2 = new JComboBox(s2);
	public Panel6() {
		p.setBounds(200, 50, 400, 350);
		t1.setFont(new Font("Arial", Font.BOLD, 30)); t2.setFont(new Font("Arial", Font.BOLD, 30));
		c1.setFont(new Font("Arial", Font.BOLD, 30)); c2.setFont(new Font("Arial", Font.BOLD, 30));
		p.add(t1);p.add(c1); p.add(t2);p.add(c2);
		p.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 50));    
		p.validate();
	}
}
