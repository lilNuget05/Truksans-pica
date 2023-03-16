package lvt;

import java.awt.Color;

import javax.swing.JPanel;

public class PasutijumaPanelis {

	public static JPanel panel=new JPanel(); 
	public PasutijumaPanelis() {
        panel.setBounds(200,0,500,500);    
       // panel.setBackground(Color.gray);
        panel.setLayout(null);
        panel.add(PasutijumaChoosePanel.panel);
        panel.add(PasutijumaPicaPanel.panel);
        panel.validate();
		
	}
}
