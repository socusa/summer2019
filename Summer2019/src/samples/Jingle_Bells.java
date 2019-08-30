package samples;

import static music.CreatingMusic.player;
import static music.CreatingMusic.track;
import static music.CreatingMusic.A;
import static music.CreatingMusic.B;
import static music.CreatingMusic.T;
import static music.CreatingMusic.player;
import static music.Util.addNote;
import static music.Util.addNotes;
import static music.Util.addRest;
import static music.CreatingMusic.measureMonitor;
import static music.Util.measure;

import music.MeasureMonitor;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;

import music.MyMetaEventListener;


public class Jingle_Bells extends songs.Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		
		player.setTempoInBPM(320);
		
        measure(1);
		
		addNotes("G4q E5q D5q C5q",T);
		addNotes("C3h G3h",B);

        measure(2);
		
		addNotes("G4h. G4i G4i",T);
		addNotes("C3h G3h",B);

        measure(3);
		
		addNotes("G4q E5q D5q C5q",T);
		addNotes("C3h G3h",B);
		
        measure(4);

		addNotes("A4h.",T);
		addRest("q",T);
        addNotes("F3h C4h",B);
        
        measure(5);

		addNotes("A4q F5q E5q D5q",T);
		addNotes("F3h C4h",B);
		
        measure(6);

		addNote("B4h.",A,T);
		addRest("q",T);
		addNotes("G3h D4h",B);
		
        measure(7);

		addNotes("G5q G5q F5q D5q",T);
		addNotes("G3h B3h",B);
		
        measure(8);
		
		addNote("E5h.",A,T);
		addRest("q",T);
		addNotes("C4h E4h",B);
		
        measure(9);

		addNotes("G4q E5q D5q C5q",T);
		addNotes("C3h G3h",B);
		
        measure(10);

		addNote("G4h.",A,T);
		addRest("q",T);
		addNotes("C3h G3h",B);
		
        measure(11);
		
		addNotes("G4q E5q D5q C5q",T);
		addNotes("C3h G3h",B);
		
        measure(12);

		addNotes("A4h. A4q",T);
		addNotes("F3h C4h",B);
		
        measure(13);

		addNotes("A4q F5q E5q D5q",T);
		addNotes("F3h C4h",B);
		
        measure(14);

		addNotes("G5q G5q G5q G5q",T);
		addNotes("F3h C4h",B);
		
        measure(15);

		addNotes("A5q G5q F5q D5q",T);
		addNotes("G3h B3h",B);
		
        measure(16);

		addNotes("C5h B4h+G5h",T);
		addNotes("C4h G3h+D4h",B);
		
        measure(17);

		addNotes("C5q+E5q C5q+E5q C5h+E5h",T);
		addNotes("C4h B3h",B);
		
        measure(18);

		addNotes("C5q+E5q C5q+E5q C5h+E5h",T);
		addNotes("A3h G4h",B);
		
        measure(19);

		addNotes("E5q G5q C5q. D5i",T);
		addNotes("C4h G3h",B);
		
        measure(20);

		addNotes("C5h.+E5h.",T);
		addRest("q",T);
		addNotes("C4h G3h",B);
		
        measure(21);
		
		addNotes("F5q F5q F5q. F5i",T);
		addNotes("F3h A4h",B);
		
        measure(22);
		
		addNotes("F5q E5q E5q E5i E5i",T);
		addNotes("C3h G3h",B);
		
        measure(23);

		addNotes("E5q D5q D5q E5q",T);
		addNotes("D3h F#3h",B);
		
        measure(24);

		addNotes("D5h B4h+G5h",T);
		addNotes("G3h G3h",B);
		
        measure(25);

		addNotes("C5q+E5q C5q+E5q C5h+E5h",T);
		addNotes("C4h B3h",B);
		
        measure(26);

		addNotes("C5q+E5q C5q+E5q C5h+E5h",T);
		addNotes("A3h G3h",B);
		
        measure(27);

		addNotes("E5q G5q C5q. D5i",T);
		addNotes("C4h G3h",B);
		
        measure(28);

		addNotes("C5h.+E5h.",T);
		addRest("q",T);
		addNotes("C4h G3h",B);
		
        measure(29);
		
		addNotes("F5q F5q F5q. F5i",T);
		addNotes("F3h A3h",B);
		
        measure(30);

		addNotes("F5q E5q E5q E5i E5i",T);
		addNotes("C3h G3h",B);
		
        measure(31);

		addNotes("G5q G5q F5q D5q",T);
		addNotes("G3h B3h",B);
		
        measure(32);

		addNote("C5w",A,T);
		addNotes("C4w+E4w",B);
	}
	
	public static void main(String[] args) {
		new Jingle_Bells().play();
	}

}
