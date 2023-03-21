package lvt;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;

public class Panel2 {
	public static JScrollPane sp = new JScrollPane();
	public Panel2() {
		sp.setBackground(Color.cyan);
		sp.setBounds(0, 74, 200, 351);
		sp.setPreferredSize(new Dimension(200,351));
		sp.setViewportView(Panel7.p);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setLayout(new ScrollPaneLayout());
		sp.validate();
	}
}
