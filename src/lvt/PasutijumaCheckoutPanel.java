package lvt;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class PasutijumaCheckoutPanel {

	public static JPanel panel=new JPanel();
	public PasutijumaCheckoutPanel() {
		  
        panel.setBounds(0,25,500,450);    
        //panel.setBackground(Color.green);
        GridLayout layout = new GridLayout(0,3);
        panel.setLayout(layout);
        JPasswordField pf = new JPasswordField(4);
        JLabel t1 = new JLabel("PIN: ");
        JButton btn = new JButton("enter");
        layout.setVgap(50);
        t1.setFont(new Font("Arial", Font.BOLD, 35));
        pf.setFont(new Font("Arial", Font.BOLD, 35));
        btn.setFont(new Font("Arial", Font.BOLD, 35));
        panel.add(t1); panel.add(pf); panel.add(btn);
        panel.validate();
		
	}
}
