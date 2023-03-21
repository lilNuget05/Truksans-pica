package lvt;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel1 implements ActionListener {
	public static JPanel p = new JPanel();
	public Panel1() {
		
		p.setBounds(0, 0, 200, 74);
		JLabel t = new JLabel("Your order:");
		JButton b = new JButton("remove");
		b.addActionListener(this);
		p.setLayout(new GridLayout(2,0));
		p.add(t);p.add(b);
		p.validate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (Pasutijums.order != null)
		Pasutijums.nonemt();
		
	}
}
