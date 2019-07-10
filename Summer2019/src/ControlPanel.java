import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {
	
	public ControlPanel(int width,
			            int height,
			            JButton start) {
		setPreferredSize(new Dimension(width,height));
		
		add(start);
	}

}
