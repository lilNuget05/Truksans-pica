package lvt;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel8 {

	public static JPanel p = new JPanel();
	static JLabel t = new JLabel("Cena: 0Eur");
	public Panel8() {
		
		p.setBounds(0, 430, 198, 74);
		p.add(t);
		p.validate();
	}
}
