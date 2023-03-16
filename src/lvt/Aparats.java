package lvt;
import javax.swing.*;
import java.awt.*;

public class Aparats {

	public static void myFrame() {
		 JFrame f= new JFrame("Panel Example");      
	     f.add(grozaPanelis());
	     f.add(pasutijumaPanelis());
	     f.setSize(700,500);    
	     f.setLayout(null);    
	     f.setVisible(true);    
	}
	public static JPanel grozaPanelis() {
		JPanel panel=new JPanel();  
        panel.setBounds(0,0,200,500);    
        panel.setBackground(Color.lightGray);
        panel.setLayout(null); 
		return panel;
	}
	public static JPanel pasutijumaPanelis() {
		JPanel panel=new JPanel();  
        panel.setBounds(200,0,500,500);    
        panel.setBackground(Color.gray);
        panel.setLayout(null); 
		return panel;
	}
	
	
	
	public static void main(String[] args) {
		myFrame();

	}

}
