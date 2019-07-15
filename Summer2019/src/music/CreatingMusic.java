package music;

import static music.CreatingMusic.track;

import java.util.HashMap;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JOptionPane;

public class CreatingMusic {
	public static int trebleTime;
	public static int bassTime;
	public static final boolean T = true;
	public static final boolean B = false;
	public static final boolean A = true; // Advance
	public static final boolean D = false; // Don't advance
	public static Track track;
	
	public static int getNote(String noteName,
			                  int octave) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("C", 60);
		map.put("C#", 61);
		map.put("Db",61);
		map.put("D", 62);
		map.put("D#", 63);
		map.put("Eb",63);
		map.put("E", 64);
		map.put("F", 65);
		map.put("F#", 66);
		map.put("Gb",66);
		map.put("G", 67);
		map.put("G#", 68);
		map.put("Ab",68);
		map.put("A", 69);
		map.put("A#", 70);
		map.put("Bb",70);
		map.put("B", 71);
		
		return(map.get(noteName) + (octave - 5)*12);
	}
	
	public static int lengthOfDuration(String duration) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("s", 1);
		map.put("i", 2);
		map.put("q", 4);
		map.put("h", 8);
		map.put("w", 16);
		
		if (!duration.endsWith("."))		
		   return(map.get(duration));
		else {
			int temp = map.get(duration.substring(0,1));
			
			return(temp + temp/2);
		}
	}
	
	public static void addNote(String note,
                               boolean advance,
                               boolean treble) {
       String[] tokens = note.split("\\d");

       String noteName = tokens[0];
       String duration = tokens[1];
       int octave = Integer.parseInt(note.substring(noteName.length(),noteName.length()+1));
       
       int temp = (treble) ? trebleTime : bassTime;
       
       ShortMessage message = new ShortMessage();
       
       try {
		message.setMessage(144,1,getNote(noteName,octave),120);
       } catch (InvalidMidiDataException e) {
    	   // TODO Auto-generated catch block
    	   e.printStackTrace();
       }
       
       track.add(new MidiEvent(message,temp));
       
       temp += lengthOfDuration(duration);
       
       message = new ShortMessage();
       
       try {
		message.setMessage(128,1,getNote(noteName,octave),120);
       } catch (InvalidMidiDataException e) {
    	   // TODO Auto-generated catch block
    	   e.printStackTrace();
       }
       
       track.add(new MidiEvent(message,temp));
       
       if (advance) {
    	   trebleTime = (treble) ? temp : trebleTime;
    	   bassTime = (!treble) ? temp : bassTime;
       }
	}
	
	public static void addNote(String noteName,
			                   int duration,
			                   int octave,
			                   boolean advance,
			                   boolean treble) {
		int temp = (treble) ? trebleTime : bassTime;
	       
	    ShortMessage message = new ShortMessage();
	       
	    try {
			message.setMessage(144,1,getNote(noteName,octave),120);
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	    track.add(new MidiEvent(message,temp));
	    
	    temp += duration;
	       
	    message = new ShortMessage();
	       
	    try {
			message.setMessage(128,1,getNote(noteName,octave),120);
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	    track.add(new MidiEvent(message,temp));
	    
	    if (advance) {
	        trebleTime = (treble) ? temp : trebleTime;
	    	bassTime = (!treble) ? temp : bassTime;
	    } 
	}
	
	public static void addNotes(String notes,
			                    boolean treble) {
		String[] tokens = notes.split(" ");
		
		for (int counter=0;counter<tokens.length;counter++) {
			if (!tokens[counter].contains("+"))
				addNote(tokens[counter],true,treble);
			else {
				String[] tokens1 = tokens[counter].split("\\+");
				
				for (int counter1=0;counter1<tokens1.length-1;counter1++)
					addNote(tokens1[counter1],false,treble);
				
				addNote(tokens1[tokens1.length-1],true,treble);
			}			
		}
	}
	
	public static void addRest(String duration,
                               boolean treble) {
       if (treble)
    	   trebleTime += lengthOfDuration(duration);
       else
    	   bassTime += lengthOfDuration(duration);
	}
	
	public static void tie(boolean advance,
			               boolean treble,
			               String... notes) {
		String[] noteNames = new String[notes.length];
		String[] durations = new String[notes.length];
		int[] octaves = new int[notes.length];
		
		int duration = 0;
		
		for (int counter=0;counter<notes.length;counter++) {
		   String[] tokens = notes[counter].split("\\d");

	       noteNames[counter] = tokens[0];
	       durations[counter] = tokens[1];
	       
	       duration += lengthOfDuration(durations[counter]);
	       
	       octaves[counter] = Integer.parseInt(notes[counter].substring(noteNames[counter].length(),noteNames[counter].length()+1));
		}
		
	    String error = "";
	    
	    boolean noteNamesNotTheSame = false;
	    
	    for (int counter=1;counter<notes.length;counter++)
	    	noteNamesNotTheSame &= (noteNames[0].equals(noteNames[counter]));
	    
        boolean octavesNotTheSame = false;
	    
	    for (int counter=1;counter<notes.length;counter++)
	    	octavesNotTheSame &= (octaves[0] == octaves[counter]);
	    
	    if (noteNamesNotTheSame)
	    	error += "The note names are not the same\n";
	    
	    if (octavesNotTheSame)
	    	error += "The octaves are not the same";
	    
	    if (!error.equals(""))
	    	JOptionPane.showMessageDialog(null, error);
	    else {
	    	addNote(noteNames[0],
	    			duration,
	    			octaves[0],
	    			advance,
	    			treble);	    	
	    }
	}

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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		play();
		
		CreatingMusic creatingMusic = new CreatingMusic();
		
		Util.theEntertainer(creatingMusic);

	}
}
