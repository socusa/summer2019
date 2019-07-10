import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class WordPanel extends JPanel {
	public JButton[] buttons;
	
	public WordPanel(int width,
			         int height) {
		setPreferredSize(new Dimension(width,height));
		
		setBackground(new Color(200,0,0));
	}
	
	public void setButtons(String word) {
		removeAll();
		
	    JPanel panel = new JPanel();
	    
	    panel.setPreferredSize(new Dimension(300,50));
		
		panel.setLayout(new GridLayout(1,word.length()));
		
		buttons = new JButton[word.length()];
		
		for (int counter=0;counter<buttons.length;counter++) {
			buttons[counter] = new JButton();
			
			Insets insets = buttons[counter].getInsets();
			
			insets.left = 0;
			insets.right = 0;
			
			buttons[counter].setMargin(insets);
			
			buttons[counter].setFont(new Font("Comic Sans MS",Font.BOLD,20));
			
			panel.add(buttons[counter]);
		}
		
		add(panel);
		
		validate();
	}
	
	public void setCharacterAt(int index,
			                char character) {
		buttons[index].setText("" + character);
	}
	
	public char getCharacterAt(int index) {
		return(buttons[index].getText().charAt(0));
	}

}
