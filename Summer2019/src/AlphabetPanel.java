import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AlphabetPanel extends JPanel {
	
	public AlphabetPanel(int width,
			             int height,
			             JButton[] alphabet,
			             ActionListener listener) {
		setPreferredSize(new Dimension(width,height));
		
		setBackground(new Color(0,200,0));
		
		JPanel panel = new JPanel();
		
		panel.setPreferredSize(new Dimension(13*30,60));
		
		panel.setLayout(new GridLayout(2,13));
		
		for (int counter=0;counter<alphabet.length;counter++) {
			alphabet[counter] = new JButton("" + (char)(counter + 65));
			
			alphabet[counter].setFont(new Font("Comic Sans MS",Font.BOLD,20));
			
			Insets insets = alphabet[counter].getInsets();
			
			insets.left = 0;
			insets.right = 0;
			
			alphabet[counter].setMargin(insets);
			
			alphabet[counter].setPreferredSize(new Dimension(50,50));
			
			alphabet[counter].addActionListener(listener);
			
			panel.add(alphabet[counter]);
		}
		
		add(panel);
	}

}
