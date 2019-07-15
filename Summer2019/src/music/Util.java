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
			tie("A5s","A5s",D,T);
			tie("A6s","A6s",A,T);
			addNotes("B5s+B6s G5i+G6i",T);
			
			for (int counter=0;counter<6;counter++)
				addRest("s",B);
			
			addRest("i",B);
			
// Measure 2
			
			addNotes("D6s E6s C6s",T);
			tie("A5s","A5s",A,T);
			addNotes("B5s G5i",T);
			
			addNotes("D5s E5s C5s",B);
			tie("A4s","A4s",A,B);
			addNotes("B4s G4i",B);
			
// Measure 3
			
			addNotes("D5s E5s C5s",T);
			tie("G4s","G4s",A,T);
			addNotes("B4s A4s Ab4s",T);
			
			addNotes("D4s E4s C4s",B);
			tie("A3s","A3s",A,B);
			addNotes("B4s A3s Ab4s",B);
			
			
			
			
			
			
		//	addNotes("D5s E5s C5s A4i B4s A4s ")
			
				
			player.setSequence(sequence);
				
			player.start();	
		} catch (Exception e) {
			e.printStackTrace();	
		}
	}
		
}

