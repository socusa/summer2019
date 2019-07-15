package music;

import static music.CreatingMusic.*;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;

public class Util {
	
	public static void jingleBells(CreatingMusic creatingMusic) {
		try {
            Sequencer player = MidiSystem.getSequencer();
			
			player.open();
			
			player.setTempoInBPM(160);
			
			Sequence sequence = new Sequence(Sequence.PPQ,4);
			
			track = sequence.createTrack();
			
			addNote("G4q",A,T);
			addNote("E5q",A,T);
			addNote("D5q",A,T);
			addNote("C5q",A,T);
			
			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("G4h.",A,T);
			addNote("G4i",A,T);
			addNote("G4i",A,T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("G4q",A,T);
			addNote("E5q",A,T);
			addNote("D5q",A,T);
			addNote("C5q",A,T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("A4h.",A,T);
			addRest("q",T);

			addNote("F3h",A,B);
			addNote("C4h",A,B);

			addNote("A4q",A,T);
			addNote("F5q",A,T);
			addNote("E5q",A,T);
			addNote("D5q",A,T);

			addNote("F3h",A,B);
			addNote("C4h",A,B);

			addNote("B4h.",A,T);
			addRest("q",T);

			addNote("G3h",A,B);
			addNote("D4h",A,B);

			addNote("G5q",A,T);
			addNote("G5q",A,T);
			addNote("F5q",A,T);
			addNote("D5q",A,T);

			addNote("G3h",A,B);
			addNote("B3h",A,B);
			
			addNote("E5h.",A,T);
			addRest("q",T);

			addNote("C4h",A,B);
			addNote("E4h",A,B);

			addNote("G4q",A,T);
			addNote("E5q",A,T);
			addNote("D5q",A,T);
			addNote("C5q",A,T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("G4h.",A,T);
			addRest("q",T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);
			
			addNote("G4q",A,T);
			addNote("E5q",A,T);
			addNote("D5q",A,T);
			addNote("C5q",A,T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("A4h.",A,T);
			addNote("A4q",A,T);

			addNote("F3h",A,B);
			addNote("C4h",A,B);

			addNote("A4q",A,T);
			addNote("F5q",A,T);
			addNote("E5q",A,T);
			addNote("D5q",A,T);

			addNote("F3h",A,B);
			addNote("C4h",A,B);

			addNote("G5q",A,T);
			addNote("G5q",A,T);
			addNote("G5q",A,T);
			addNote("G5q",A,T);

			addNote("F3h",A,B);
			addNote("C4h",A,B);

			addNote("A5q",A,T);
			addNote("G5q",A,T);
			addNote("F5q",A,T);
			addNote("D5q",A,T);

			addNote("G3h",A,B);
			addNote("B3h",A,B);

			addNote("C5h",A,T);
			addNote("B4h",D,T);
			addNote("G5h",A,T);

			addNote("C4h",A,B);
			addNote("G3h",D,B);
			addNote("D4h",A,B);

			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5h",D,T);
			addNote("E5h",A,T);

			addNote("C4h",A,B);
			addNote("B3h",A,B);

			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5h",D,T);
			addNote("E5h",A,T);

			addNote("A3h",A,B);
			addNote("G4h",A,B);

			addNote("E5q",A,T);
			addNote("G5q",A,T);
			addNote("C5q.",A,T);
			addNote("D5i",A,T);

			addNote("C4h",A,B);
			addNote("G3h",D,B);

			addNote("C5h.",D,T);
			addNote("E5h.",A,T);
			addRest("q",T);

			addNote("C4h",A,B);
			addNote("G3h",A,B);
			
			addNote("F5q",A,T);
			addNote("F5q",A,T);
			addNote("F5q.",A,T);
			addNote("F5i",A,T);

			addNote("F3h",A,B);
			addNote("A4h",A,B);
			
			addNote("F5q",A,T);
			addNote("E5q",A,T);
			addNote("E5q",A,T);
			addNote("E5i",A,T);
			addNote("E5i",A,T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("E5q",A,T);
			addNote("D5q",A,T);
			addNote("D5q",A,T);
			addNote("E5q",A,T);
			
			addNote("D3h",A,B);
			addNote("F#3h",A,B);

			addNote("D5h",A,T);
			addNote("B4h",D,T);
			addNote("G5h",A,T);

			addNote("G3h",A,B);
			addNote("G3h",A,B);

			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5h",D,T);
			addNote("E5h",A,T);

			addNote("C4h",A,B);
			addNote("B3h",A,B);

			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5h",D,T);
			addNote("E5h",A,T);
			
			addNote("A3h",A,B);
			addNote("G3h",A,B);

			addNote("E5q",A,T);
			addNote("G5q",A,T);
			addNote("C5q.",A,T);
			addNote("D5i",A,T);

			addNote("C4h",A,B);
			addNote("G3h",A,B);

			addNote("C5h.",D,T);
			addNote("E5h.",A,T);
			addRest("q",T);

			addNote("C4h",A,B);
			addNote("G3h",A,B);
			
			addNote("F5q",A,T);
			addNote("F5q",A,T);
			addNote("F5q.",A,T);
			addNote("F5i",A,T);

			addNote("F3h",A,B);
			addNote("A3h",A,B);

			addNote("F5q",A,T);
			addNote("E5q",A,T);
			addNote("E5q",A,T);
			addNote("E5i",A,T);
			addNote("E5i",A,T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("G5q",A,T);
			addNote("G5q",A,T);
			addNote("F5q",A,T);
			addNote("D5q",A,T);

			addNote("G3h",A,B);
			addNote("B3h",A,B);

			addNote("C5w",A,T);

			addNote("C4w",A,B);
			addNote("E4w",D,B);
			
			player.setSequence(sequence);
			
			player.start();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		}
		
	public static void theEntertainer(CreatingMusic creatingMusic) {
		try {
	        Sequencer player = MidiSystem.getSequencer();
				
			player.open();
				
			player.setTempoInBPM(60);
				
			Sequence sequence = new Sequence(Sequence.PPQ,4);
				
			track = sequence.createTrack();
				
// Measure 1
			
			addNotes("D6s+D7s E6s+E7s C6s+C7s",T);
			tie(D,T,"A5s","A5s");
			tie(A,T,"A6s","A6s");
			addNotes("B5s+B6s G5i+G6i",T);
			
			for (int counter=0;counter<6;counter++)
				addRest("s",B);
			
			addRest("i",B);
			
// Measure 2
			
			addNotes("D6s E6s C6s",T);
			tie(A,T,"A5s","A5s");
	    	addNotes("B5s G5i",T);
			
			addNotes("D5s E5s C5s",B);
			tie(A,B,"A4s","A4s");
			addNotes("B4s G4i",B);
			
// Measure 3
			
			addNotes("D5s E5s C5s",T);
			tie(A,T,"A4s","A4s");
			addNotes("B4s A4s Ab4s",T);
			
			addNotes("D4s E4s C4s",B);
			tie(A,B,"A3s","A3s");
			addNotes("B4s A3s Ab4s",B);
			
// Measure 4
			
			addRest("i",T);
			addRest("i",T);
			addNotes("G5i+B5i+D6i+G6i D5s D#5s",T);
			addNotes("G3i+G4i",B);
			addRest("i",B);
			addNotes("G3i+G2i G4i+B4i",B);
			
// Measure 5
			
			addNotes("E5s C6i E5s C6i E5s",T);
			addNotes("C4i E4i+G4i+C5i G3i+G4i G4i+Bb4i+C5i",B);
			
// Measure 6
			
			tie(A,T,"C6s","C6q","C6s");
			addNotes("C6s+E6s+C7s",T);
			addNotes("D6s+F6s+D7s",T);
			addNotes("D#6s+F#6s+D#7s",T);
			addNotes("F3i+F4i A4i+C5i E3i+E4i G4i+C5i",B);
			
// Measure 7
			
			addNotes("E6s+G6s+E7s C6s+E6s+C7s D6s+F6s+D7s",T);
			tie(D,T,"E6s","E6s");
			tie(D,T,"G6s","G6s");
			tie(A,T,"E7s","E7s");
			addNotes("B5s+D6s+B6s",T);
			addNotes("D6i+F6i+D7i",T);
			addNotes("G3i E4i+G4i+C5i G3i F4i+G4i+B4i",B);
			
// Measure 8
			
			tie(D,T,"C6q","C6i");
			tie(D,T,"E6q","E6i");
			tie(A,T,"C7q","C7i");
			addNotes("D5s D#5s",T);
			addNotes("C4i E4i+G4i+C5i E4i+G4i+C5i G4i+B4i",B);
			
// Measure 9
			
			addNotes("E5s C6i E5s C6i E5s",T);
			addNotes("C4i E4i+G4i+C5i G3i+G4i G4i+Bb4i+C5i",B);

// Measure 10
			
			tie(A,T,"C6s","C6q","C6i");
			addNotes("A5s+C6s+B6s G5s+C6s+B6s",T);
			addNotes("F3i+F4i A4i+C5i E3i+E4i Eb3i+Eb4i",B);
			
// Measure 11
			
			addNotes("F#5s+C6s+F#6s A5s+A6s C6s+C7s",T);
			tie(D,T,"E6s","E6s");
			tie(A,T,"E7s","E7s");
			addNotes("D6s+D7s C6s+C7s A5s+A6s",T);
			addNotes("D3i+D4i D4i+F#4i+A4i+C5i D4i F4i+A4i+C5i",B);
			
// Measure 12
			
			tie(D,T,"D6q","D6i");
			tie(D,T,"F6q","F6i");
			tie(A,T,"D7q","D7i");
			addNotes("D5s D#5s",T);
			addNotes("G4i+B4i G3i+G4i A3i+A4i B3i+B4i",B);
			
// Measure 13
			
			addNotes("E5s C6i E5s C6i E5s",T);
			addNotes("C4i E4i+G4i+C5i G3i+G4i G4i+Bb4i+C5i",B);
						
// Measure 14
						
			tie(A,T,"C6s","C6q","C6s");
		    addNotes("C6s+E6s+C7s",T);
			addNotes("D6s+F6s+D7s",T);
			addNotes("D#6s+F#6s+D#7s",T);
			addNotes("F3i+F4i A4i+C5i E3i+E4i G4i+C5i",B);
						
// Measure 15
						
			addNotes("E6s+G6s+E7s C6s+E6s+C7s D6s+F6s+D7s",T);
			tie(D,T,"E6s","E6s");
			tie(D,T,"G6s","G6s");
			tie(A,T,"E7s","E7s");
			addNotes("B5s+D6s+B6s",T);
			addNotes("D6i+F6i+D7i",T);
			addNotes("G3i E4i+G4i+C5i G3i F4i+G4i+B4i",B);
									
// Measure 16
			
			tie(D,T,"C6q","C6i");
			tie(D,T,"E6q","E6i");
			tie(A,T,"C7q","C7i");
			addNotes("C6s+C7s D6s+D7s",T);
			addNotes("C4i E4i+G4i+C5i G4i+C5i+E5i",B);
			addRest("i",B);
			
// Measure 17
			
			addNotes("E6s+E7s C6s+C7s D6s+D7s",T);
			tie(D,T,"E6s","E6s");
			addNotes("C6s+C7s D6s+D7s C6s+C7s",T);
			addNotes("C4i+C5i G4i+C5i+E5i Bb3i+Bb4i G4i+C5i+E5i",B);
			
// Measure 18
			
			addNotes("E6s+E7s C6s+C7s D6s+D7s",T);
			tie(D,T,"E6s","E6s");
			addNotes("C6s+C7s D6s+D7s C6s+C7s",T);
			addNotes("A3i+A4i A4i+C5i+E5i Ab3i+Ab4i Ab4i+C5i+E5i",B);
			
// Measure 19
			
			addNotes("E6s+G6s+E7s C6s+E6s+C7s D6s+F6s+D7s",T);
			tie(D,T,"E6s","E6s");
			tie(D,T,"G6s","G6s");
			tie(A,T,"E7s","E7s");
			addNotes("B5s+D6s+B6s D6i+F6i+D7i",T);
			addNotes("G3i+G4i G4i+C5i+E5i G3i G4i+B4i",B);
			
// Measure 20
			
			tie(D,T,"C6q","C6i");
			tie(D,T,"E6q","E6i");
			tie(A,T,"C7q","C7i");
			addNotes("D5s D#5s",T);
			addNotes("C4i+G4i+C5i G3i+G4i A3i+A4i B3i+B4i",B);
			
			
			
			
			
			
			
			
			
			
		//	addNotes("D5s E5s C5s A4i B4s A4s ")
			
				
			player.setSequence(sequence);
				
			player.start();	
		} catch (Exception e) {
			e.printStackTrace();	
		}
	}
		
}

