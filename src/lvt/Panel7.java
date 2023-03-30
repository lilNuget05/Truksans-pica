package lvt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class Panel7 {
	public static JPanel p = new JPanel();
	public Panel7() {
		p.setBounds(0,0,200, 351);
		p.setPreferredSize(new Dimension(180, 1500));
		
		FlowLayout layout = new FlowLayout();
		Panel2.sp.add(p);
		p.setLayout(layout);
		p.validate();
	}

}