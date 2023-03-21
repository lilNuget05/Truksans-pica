package lvt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class PaswordPane implements ActionListener {
	private JFrame frame = new JFrame();  
	private JPasswordField passwordField = new JPasswordField();
	
	PaswordPane (){
		 
	                   
	       JLabel label = new JLabel("Enter Password");
	       JButton button = new JButton("Submit");
	       button.addActionListener(this);
	    
	       frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
	       passwordField.setBorder(BorderFactory.createLineBorder(Color.red));
	       passwordField.setPreferredSize(new Dimension(150, 25));
	       passwordField.setMaximumSize(new Dimension(250, 25));
	 
	       frame.add(label);
	       frame.add(passwordField);
	       frame.add(button);
	 
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(200,100);
	       frame.setResizable(false);
	       frame.setLocationRelativeTo(null);
	       frame.setVisible(true);
	   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		char[] pass1 = passwordField.getPassword();
		if (pass1[0]== '0') {
			Pasutijums.payIsOk = true;
			try {
				Pasutijums.Pay();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			frame.dispose();
		}
		
	}

}
