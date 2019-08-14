package music;

import static music.CreatingMusic.player;
import static music.CreatingMusic.track;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import static music.Util.*;

public class CreatingMusic extends JFrame implements ActionListener {
	public static int trebleTime;
	public static int bassTime;
	public static int thirdVoiceTime;
	public static int fourthVoiceTime;
	public static final boolean T = true;
	public static final boolean B = false;
	public static final boolean A = true; // Advance
	public static final boolean D = false; // Don't advance
	public static Track track;
	public static String key = "C";
	public static JComboBox<String> songs;
	public static JButton play;
	public static int factor = 1;
	public static int tripletFactor = 1;
	public static Sequencer player;
	public static MyControllerEventListener myListener;
	
	/*
	 
	static {
		try {
		   player = MidiSystem.getSequencer();
		   
		   int[] controllersOfInterest = {1,2,4};
		   
		   player.addControllerEventListener(myListener, controllersOfInterest);
		   
		} catch (Exception e) {
		   System.out.println(e);
		}
		
		myListener = new MyControllerEventListener();
	}
	
	*/
	
	public CreatingMusic(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		add(songs = new JComboBox<String>());
		
		songs.setPreferredSize(new Dimension(250,50));
		
		songs.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		
	    Method[] methods = Songs.class.getDeclaredMethods();
	    
	    String[] songs1 = new String[methods.length];
	
	    for (int counter=0;counter<songs1.length;counter++)
	    	songs1[counter] = methods[counter].getName().substring(4).replaceAll("_", " ");	    
	    
	    Arrays.sort(songs1);

	    for (int counter=0;counter<songs1.length;counter++)
	    	songs.addItem(songs1[counter]);
	    	    
	    add(play = new JButton("Play"));
	    
	    play.setFont(new Font("Comic Sans MS",Font.BOLD,20));
	    
	    play.addActionListener(this);
	    
	    getNote("A",5);
	}
	
	/*
	
	public static void play() {
		try {
			Sequencer player = MidiSystem.getSequencer();
			
			player.open();
			
			player.setTempoInBPM(140);
			
			Sequence sequence = new Sequence(Sequence.PPQ,4);
			
			track = sequence.createTrack();
			
			for (int counter=0;counter<3;counter++) {
				addNote("C#7i",A,T);
				addNote("F#6i",A,T);
				addNote("F#6i",A,T);
				addNote("C#7i",A,T);
				addNote("C#7i",A,T);
				addNote("F#6i",A,T);
				addNote("D7i",A,T);
				addNote("F#6i",A,T);
				
				for (int counter1=0;counter1<8;counter1++)
					addRest("i",B);
			}
			

			player.setSequence(sequence);
			
			player.start();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		play();
		
		CreatingMusic creatingMusic = new CreatingMusic("Creating Music");
		
		creatingMusic.setSize(500,500);
		creatingMusic.setLocationRelativeTo(null);
		creatingMusic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        creatingMusic.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (player != null && player.isOpen())
		   JOptionPane.showMessageDialog(null, "You need to exit and restart to play another");
		else {		
		   String item = songs.getSelectedItem().toString();

		   Method[] methods = Songs.class.getDeclaredMethods();
		
		   for (int counter=0;counter<methods.length;counter++) {
		      if ((methods[counter].getName().substring(4).replaceAll("_", " ")).equalsIgnoreCase(item))
			     try {
					methods[counter].invoke(null,this);
				 } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				 }
		   }
		}
		
		
	}
}
