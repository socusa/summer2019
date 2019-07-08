import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class HangmanPanel extends JPanel {
	private int width;
	private int height;
	
	public HangmanPanel(int width,
			            int height) {
		setPreferredSize(new Dimension(width,height));
		
		setBackground(new Color(0,0,200));
		
		this.width = width;
		this.height = height;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.white);
		
		
	}

}
