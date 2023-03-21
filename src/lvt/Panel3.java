package lvt;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel3 implements ActionListener {
	public static JPanel p = new JPanel();
	public static JButton b1 = new JButton("piza"), b2 = new JButton("Drinks");
	public Panel3() {
		
		p.setBackground(Color.pink);
		p.setBounds(200, 0, 484, 50);
		p.setLayout(new GridLayout(0,2));
		b1.addActionListener(this); b2.addActionListener(this);    
		p.add(b1); p.add(b2);
		p.validate();
	}
	
	public void actionPerformed(ActionEvent e){  
        if (e.getSource() == b1) {
        	System.out.println("btn1");
        AparatsFrame.f.remove(Panel6.p);
        AparatsFrame.f.add(Panel4.p);
        AparatsFrame.f.revalidate();
        AparatsFrame.f.repaint();
        
        }
        if (e.getSource() == b2) {
        	System.out.println("btn2");
        	AparatsFrame.f.remove(Panel4.p);
            AparatsFrame.f.add(Panel6.p);
            AparatsFrame.f.revalidate();
            AparatsFrame.f.repaint();
        }
	}  

}
