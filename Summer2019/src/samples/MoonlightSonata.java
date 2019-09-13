package samples;

import songs.Song;

import static music.CreatingMusic.*;
import static music.Util.*;

public class MoonlightSonata extends Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		factor = 300;
		
		player.setTempoInBPM(120*300);
		
		key = "E";
		
		measure(1);

		tripletFactor = 2;
		
		for (int counter=0;counter<4;counter++)
		   addNotes("G4i C5i E5i",T);
		
		tripletFactor = 1;
		
		addNotes("C2w+C4w",B);
		
		measure(2);
		
		tripletFactor = 2;
		
		for (int counter=0;counter<4;counter++)
		   addNotes("G4i C5i E5i",T);
		
		tripletFactor = 1;
		
		addNotes("B2w+B3w",B);
		
		measure(3);
		
		tripletFactor = 2;
		
		addNotes("A4i C5i E5i A4i C5i E5i A4i Dn5i F5i A4i D5i F5i",T);
		
		tripletFactor = 1;
		
		addNotes("A2h+A3h F2h+F3h",B);
		
		measure(4);
		
		tripletFactor = 2;
		
		addNotes("G4i B#4i F5i G4i C5i F5i G4i C5i D5i F4i B4i D5i",T);
		
		tripletFactor = 1;
		
		addNotes("G2h+G3h G2h+G3h",B);
		
		measure(5);
		
		tripletFactor = 2;
		
		addNotes("E4i G4i C5i B4i C5i E5i B4i C5i E5i B4i C5i E5i",T);

		tripletFactor = 1;
		
		addRest("i",6,T,T);
		addNotes("G5i. G5s",T,T);
		addNotes("C2w+G3w+C4w",B);
		
		measure(6);
		
		tripletFactor = 2;
		
		for (int counter=0;counter<4;counter++)
		   addNotes("G4i D5i F5i",T);
		
		tripletFactor = 1;
		
		addNotes("G5h. G5i. G5s",T,T);
		addNotes("B#2w+G3w+B#3w",B);
		
		measure(7);
		
		tripletFactor = 2;
		
		addNotes("B4i C5i E5i B4i C5i E5i A4i C5i F5i A4i C5i F5i",T);
		
		tripletFactor = 1;
		
		addNotes("G5h A5h",T,T);
		addNotes("C2h+C4h F2h+F3h",B);
		
		measure(8);
		
		tripletFactor = 2;
		
		addNotes("G4i B4i E5i G4i B4i E5i A4i B4i D5i A4i B4i D5i",B);
		
		tripletFactor = 1;
		
		addNotes("G5h F5q B5q",T,T);
		addNotes("B2h+B3h B2h+B3h",B);
		
		measure(9);
		
		tripletFactor = 2;
		
		addNotes("G4i B4i E5i G4i B4i E5i G4i B4i E5i G4i B4i E5i",T);
		
		tripletFactor = 1;
		
		addNote("E5q",A,T,T);
		addRest("q",T,T);
		addRest("h",T,T);
		addNotes("E3w+E4w",B);
		

	}

}
