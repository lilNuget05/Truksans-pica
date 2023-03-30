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
import javax.swing.WindowConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

public class PaswordPane implements ActionListener {
	
	public JPasswordField passwordField = new JPasswordField(4);
	public JFrame frame = new JFrame("pin");
	
	public PaswordPane() {
		PlainDocument document = (PlainDocument) passwordField.getDocument();
        document.setDocumentFilter(new DocumentFilter() {

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String string = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;

                if (string.length() <= 4) {
                    super.replace(fb, offset, length, text, attrs); //To change body of generated methods, choose Tools | Templates.
                }
            }

        });
        JButton button = new JButton("Enter");
        passwordField.setBounds(5, 5, 30, 20);
        button.setBounds(40, 5, 120, 20);
        button.addActionListener(this);
        frame.setBounds(750, 50 , 210, 70);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(button); frame.add(passwordField);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		char[] pass1 = passwordField.getPassword();
		if (pass1[0]== '0' && pass1[1]== '0' && pass1[2]== '0' && pass1[3]== '0') {
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
