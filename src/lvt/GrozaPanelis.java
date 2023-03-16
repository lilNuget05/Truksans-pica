package lvt;

import java.awt.Color;
import javax.swing.JPanel;

public class GrozaPanelis {
	
	public static JPanel panel = new JPanel();
	public GrozaPanelis () {
		panel.setBounds(0,0,200,510);    
		panel.setBackground(Color.lightGray);
	    panel.setLayout(null);
	    panel.add(GrozaSubPanel1.panel); panel.add(GrozaSubPane2.panel);
	    panel.validate();
	}
	
}
