package music;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JFrame;

public class MeasureMonitor extends JFrame {
	public String message;
	public int trebleTime;
	public int bassTime;
	
	public MeasureMonitor(String title) {
		message = "";
		
		setSize(700,100);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	public void setMessage(String message) {
		this.message = message;
		
		repaint();
	}
	
	public void setTrebleTime(int trebleTime) {
        this.trebleTime = trebleTime;
        
        repaint();
	}
	
	public void setBassTime(int bassTime) {
		this.bassTime = bassTime;
		
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		
		FontMetrics metrics = g.getFontMetrics();
		
		int width = metrics.stringWidth(message);
		
		int height = metrics.getHeight();
		
		g.drawString(message, 350 - width/2, 55);		

		String message1 = "Treble Time: " + trebleTime + " Bass Time: " + bassTime;
		
        width = metrics.stringWidth(message1);
        
        g.drawString(message1, 350 - width/2, 80);
		
	}

}
