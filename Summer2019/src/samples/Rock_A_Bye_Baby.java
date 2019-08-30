package samples;

import static music.CreatingMusic.*;
import static music.Util.*;

import javax.sound.midi.Sequence;



public class Rock_A_Bye_Baby extends songs.Song {

	@Override
	public void measures() {
		player.setTempoInBPM(200);
		
		key = "F";
	
        measure(1);
		
		addRest("q",2,T);
		addNote("A5q",A,T);
		addNotes("A4q C5q",B);
		addRest("q",B);
		
        measure(2);
		
		addNotes("G5h F5q",T);
		addRest("h",B);
		addRest("q",B);
		
		measure(3);
		
		addRest("q",2,T);
		addNote("F5q",A,T);
		addNotes("A4q C5q",B);
		addRest("q",B);
		
        measure(4);
		
		addNote("E5h.",A,T);
		addNote("C5h.",A,B);
		
        measure(5);
		
		addRest("q",2,T);
		addNote("B5q",A,T);
		addNotes("B4q D5q",B);
		addRest("q",B);
		
        measure(6);
		
		addNotes("A5h G5q",T);
		addRest("h",B);
		addRest("q",B);
		
        measure(7);
		
		addNotes("G5q F5q",T);
		addRest("q",T);
		addRest("q",2,B);
		addNote("D5q",A,B);
		
        measure(8);
		
		addRest("h",T);
		addRest("q",T);
		addNote("C5h.",A,B);
		
        measure(9);
		
		addRest("q",2,T);
		addNote("A5q",A,T);
		addNotes("A4q C5q",B);
		addRest("q",B);
		
        measure(10);
		
		addNotes("G5h F5q",T);
		addRest("h",B);
		addRest("q",B);
		
        measure(11);
		
		addRest("q",2,T);
		addNote("F5q",A,T);
		addNotes("A4q C5q",B);
		addRest("q",B);
	}

}
