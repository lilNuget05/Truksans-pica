package lvt;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Panel7 {
	public static JPanel p = new JPanel();
	public Panel7() {
		p.setBounds(0,0,200, 351);
		
		Panel2.sp.add(p);
		p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
		p.validate();
	}

}
