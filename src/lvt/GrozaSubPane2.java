package lvt;

import javax.swing.JScrollPane;

public class GrozaSubPane2 {
	
	public static JScrollPane panel=new JScrollPane();  
	public GrozaSubPane2() {
        panel.setBounds(0,75,200,435);    
        //panel.setBackground(Color.pink);
        panel.setLayout(null); 
        panel.setViewportView (GrozaSubPanel2_2.panel);
        panel.validate();
	}

}
