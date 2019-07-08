
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Second extends JFrame implements ActionListener {
	public WordPanel wordPanel;
	public AlphabetPanel alphabetPanel;
	public HangmanPanel hangmanPanel;
	public Button[] buttons;
	public Button[] alphabet;
	
	public Second(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		wordPanel = new WordPanel(400,200,null);
		
		alphabet = new Button[26];
		
		alphabetPanel = new AlphabetPanel(400,200,alphabet,this);
		
		hangmanPanel = new HangmanPanel(400,750);
		
		JPanel panel = new JPanel();
		
		panel.setPreferredSize(new Dimension(400,750));
		
		panel.add(wordPanel);
		panel.add(alphabetPanel);
		
		add(panel);
	
		add(hangmanPanel);
	}
	
	public static void main(String[] args) {
		Second second = new Second("Hangman");
		
		second.setSize(850,800);
		second.setLocationRelativeTo(null);
		second.setDefaultCloseOperation(EXIT_ON_CLOSE);
		second.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
