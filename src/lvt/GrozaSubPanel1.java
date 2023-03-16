package lvt;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GrozaSubPanel1 {
	
	
	public static JPanel panel = new JPanel();
	public static JLabel t1 = new JLabel("Your order:");
	public static JButton btn = new JButton("delete");
	
	public GrozaSubPanel1() {  
        panel.setBounds(0,0,200,75);
        t1.setFont(new Font("Arial", Font.BOLD, 20));
        btn.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(t1);
        panel.add(btn);
        panel.validate();
        
		
	}
}
