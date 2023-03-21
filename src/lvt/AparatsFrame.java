package lvt;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AparatsFrame {
	
	public static JFrame f = new JFrame("aparats");
	public AparatsFrame() {
		f.setSize(700, 513);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setLayout(null);
		f.add(Panel1.p);
		f.add(Panel2.sp);
		f.add(Panel3.p);
		f.add(Panel4.p);
		f.add(Panel5.p);
		f.add(Panel8.p);
		f.setResizable(false);

	}
}
