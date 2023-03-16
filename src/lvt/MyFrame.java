package lvt;

import javax.swing.JFrame;

public class MyFrame {

	
	public MyFrame() {
		 JFrame f = new JFrame("aparats");
	     f.add(GrozaPanelis.panel);
	     f.add(PasutijumaPanelis.panel);
	     f.setSize(716,549);    
	     f.setLayout(null); 
	     f.setResizable(false);
	     f.setVisible(true);    
	}
}
