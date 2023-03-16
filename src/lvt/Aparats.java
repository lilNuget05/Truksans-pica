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
        panel.add(grozaSubPanel1()); panel.add(grozaSubPanel2());
		return panel;
	}
	public static JPanel pasutijumaPanelis() {
		JPanel panel=new JPanel();  
        panel.setBounds(200,0,500,500);    
        panel.setBackground(Color.gray);
        panel.setLayout(null);
        panel.add(pasutijumasChoosePanel());
        panel.add(pasutijumasPicaPanel());
		return panel;
	}
	public static JPanel grozaSubPanel1() {
		JPanel panel=new JPanel();  
        panel.setBounds(0,0,200,100);    
        panel.setBackground(Color.yellow);
        panel.setLayout(null); 
		return panel;
	}
	public static JPanel grozaSubPanel2() {
		JPanel panel=new JPanel();  
        panel.setBounds(0,10,200,500);    
        panel.setBackground(Color.pink);
        panel.setLayout(null); 
		return panel;
	}
	public static JPanel pasutijumasChoosePanel() {
		JPanel panel=new JPanel();  
        panel.setBounds(0,0,500,50);    
        panel.setBackground(Color.cyan);
        panel.setLayout(null); 
		return panel;
	}
	public static JPanel pasutijumasPicaPanel() {
		JPanel panel=new JPanel();  
        panel.setBounds(0,50,500,450);    
        panel.setBackground(Color.green);
        panel.setLayout(null); 
		return panel;
	}
	
	
	
	
	
	public static void main(String[] args) {
		myFrame();

	}

}
