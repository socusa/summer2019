import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class WordPanel extends JPanel {
	
	public WordPanel(int width,
			         int height,
			         Button[] buttons) {
		setPreferredSize(new Dimension(width,height));
		
		setBackground(new Color(200,0,0));
	}

}
