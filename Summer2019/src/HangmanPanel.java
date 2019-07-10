import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class HangmanPanel extends JPanel {
	private int width;
	private int height;
	public boolean drawHead;
	public boolean drawLeftArm;
	public boolean drawRightArm;
	public boolean drawBody;
	public boolean drawLeftLeg;
	public boolean drawRightLeg;
	public int numberMissed;
	
	public HangmanPanel(int width,
			            int height) {
		setPreferredSize(new Dimension(width,height));
		
		setBackground(new Color(0,0,200));
		
		this.width = width;
		this.height = height;
	}
	
	public void increaseNumberMissed() {
		numberMissed++;
	}
	
	public void check() {		
		switch (numberMissed) {
		case 6 : drawRightLeg = true;
		case 5 : drawLeftLeg = true;
		case 4 : drawBody = true;
		case 3 : drawRightArm = true;
		case 2 : drawLeftArm = true;
		case 1 : drawHead = true;
		}
		
		repaint();		
	}
	
	public void drawCircle(Graphics g,
			               int centerx,
			               int centery,
			               int radius) {
		g.drawOval(centerx - radius, 
				   centery - radius, 
				   2*radius, 2*radius);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		drawHead = true;
		drawLeftArm = true;
		drawRightArm = true;
		drawBody = true;
		drawLeftLeg = true;
		drawRightLeg = true;
		
		g.setColor(Color.white);
		
		if (drawHead) {
			drawCircle(g,width/2,100,50);
			g.drawLine(width/2,150,width/2,200);
		}
		
		if (drawLeftArm) {
			g.drawLine(width/2, 200, width/2-width/4, 300);
		}
		
		if (drawRightArm) {
			g.drawLine(width/2,200,width/2+width/4,300);
		}
		
		if (drawBody) {
			g.drawLine(width/2, 200, width/2, 500);
		}
		
		if (drawLeftLeg) {
			g.drawLine(width/2, 500, width/2-width/4, 600);
		}
		
		if (drawRightLeg) {
			g.drawLine(width/2, 500, width/2+width/4, 600);
		}
		
		
	}

}
