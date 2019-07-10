
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Second extends JFrame implements ActionListener {
	public WordPanel wordPanel;
	public ControlPanel controlPanel;
	public AlphabetPanel alphabetPanel;
	public HangmanPanel hangmanPanel;
	public JButton[] alphabet;
	public JButton start;
	public String word;
	
	public Second(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		wordPanel = new WordPanel(400,200);
		
		alphabet = new JButton[26];
		
		start = new JButton("Start");
		
		start.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		
		start.addActionListener(this);
		
		controlPanel = new ControlPanel(400,200,start);
		
		alphabetPanel = new AlphabetPanel(400,200,alphabet,this);
		
		hangmanPanel = new HangmanPanel(400,750);
		
		JPanel panel = new JPanel();
		
		panel.setPreferredSize(new Dimension(400,750));
		
		panel.add(wordPanel);
		panel.add(controlPanel);
		panel.add(alphabetPanel);
		
		add(panel);
	
		add(hangmanPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == start) {
			String[] words = Words.words();
			
			word = words[(int)(words.length*Math.random())];
			
			word = word.toUpperCase();
			
			wordPanel.setButtons(word);
		} else {
			char letter = ((JButton)e.getSource()).getText().charAt(0);
			
			boolean found = false;
			
			for (int counter=0;counter<word.length();counter++)
				if (word.charAt(counter) == letter) {
					found = true;
					
					wordPanel.setCharacterAt(counter,letter);
				}
			
			((JButton)e.getSource()).setVisible(false);
		}
		
		
	}
	
	public static void main(String[] args) {
		Second second = new Second("Hangman");
		
		second.setSize(850,800);
		second.setLocationRelativeTo(null);
		second.setDefaultCloseOperation(EXIT_ON_CLOSE);
		second.setVisible(true);
	}


}
