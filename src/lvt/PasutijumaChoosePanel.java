package lvt;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PasutijumaChoosePanel {

	public static JPanel panel=new JPanel();  
	public  PasutijumaChoosePanel() {
		
        panel.setBounds(0,0,500,25);    
        //panel.setBackground(Color.cyan);
        
        GridLayout layout = new GridLayout(0,3);
        panel.setLayout(layout);
        JButton btn1 = new JButton("pizza");
        JButton btn2 = new JButton("add");
        JButton btn3 = new JButton("checkout");
        
        
        panel.add(btn1);panel.add(btn2); panel.add(btn3);
        panel.validate();
        
        
		
	}
}
