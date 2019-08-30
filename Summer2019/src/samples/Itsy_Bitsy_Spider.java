package samples;

import static music.CreatingMusic.*;
import static music.Util.*;

import javax.sound.midi.Sequence;



public class Itsy_Bitsy_Spider extends songs.Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		
	   player.setTempoInBPM(180);
		
   	   key = "G";
   	   
   	   measure(1);
	
	   addRest("i",T);
	   addNotes("D5i",T);
	   addRest("q",B);
	   
	   measure(2);
	
	   addNotes("G5i. G5s G5i. A5s B5q B5i. B5s",T);
	   addNotes("G4h+B4h G4h+B4h",B);
	   
	   measure(3);
	
	   addNotes("A5i. G5s A5i. B5s G5q",T);
	   addRest("q",T);
	   addNotes("D4h+F4h G4h+B4h",B);
	
	   measure(4);
	   
	   addNotes("B5q B5i. C6s D6q D6q",T);
	   addNotes("G4h+B4h G4h+B4h",B);
	   
	   measure(5);
	
	   addNotes("C6i. B5s C6i. D6s B5q",T);
	   addRest("q",T);
	   
	   measure(6);
	
	   addNotes("G5q G5i. A5s B5q B5q",T);
	   addNotes("G4i+B4i G4i+B4i",B);
	   
	   measure(7);
	
	   addNotes("A5i. G5s A5i. B5s G5q D5i. D5s",T);
	   addNotes("D4h+F4h G4h+B4h",B);
	   
	   measure(8);
	
	   addNotes("G5i. G5s G5i. A5s B5q B5i. B5s",T);
	   addNotes("G4h+B4h G4h+B4h",B);
	   
	   measure(9);
	
	   addNotes("A5i. G5s A5i. B5s G5q",T);
	   addRest("q",T);
	   addNotes("D4h+F4h G4h+B4h",B);
	}

}
