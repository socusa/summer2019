package samples;

import songs.Song;

import static music.CreatingMusic.*;
import static music.Util.*;

public class Moonlight_Sonata extends Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		factor = 300;
		
		player.setTempoInBPM(120*300);
		
		key = "E";
		
		measure(0);

		tripletFactor = 2;
		
		for (int counter=0;counter<4;counter++)
		   addNotes("G4i C5i E5i",T);
		
		tripletFactor = 1;
		
		addNotes("C3w+C4w",B);
		
		measure(1);
		
		tripletFactor = 2;
		
		for (int counter=0;counter<4;counter++)
		   addNotes("G4i C5i E5i",T);
		
		tripletFactor = 1;
		
		addNotes("B2w+B3w",B);
		
		measure(2);
		
		tripletFactor = 2;
		
		addNotes("A4i C5i E5i A4i C5i E5i A4i Dn5i F5i A4i D5i F5i",T);
		
		tripletFactor = 1;
		
		addNotes("A2h+A3h F2h+F3h",B);
		
		measure(3);
		
		tripletFactor = 2;
		
		addNotes("G4i B#4i F5i G4i C5i F5i G4i C5i D5i F4i B4i D5i",T);
		
		tripletFactor = 1;
		
		addNotes("G2h+G3h G2h+G3h",B);
		
		measure(4);
		
		tripletFactor = 2;
		
		addNotes("E4i G4i C5i B4i C5i E5i B4i C5i E5i B4i C5i E5i",T);

		tripletFactor = 1;
		
		addRest("i",6,T,T);
		addNotes("G5i. G5s",T,T);
		addNotes("C2w+G3w+C4w",B);
		
		measure(5);
		
		tripletFactor = 2;
		
		for (int counter=0;counter<4;counter++)
		   addNotes("G4i D5i F5i",T);
		
		tripletFactor = 1;
		
		addNotes("G5h. G5i. G5s",T,T);
		addNotes("B#2w+G3w+B#3w",B);
		
		measure(6);
		
		tripletFactor = 2;
		
		addNotes("G4i C5i E5i G4i C5i E5i A4i C5i F5i A4i C5i F5i",T);
		
		tripletFactor = 1;
		
		addNotes("G5h A5h",T,T);
		addNotes("C3h+C4h F2h+F3h",B);
		
		measure(7);
		
		tripletFactor = 2;
		
		addNotes("G4i B4i E5i G4i B4i E5i A4i B4i D5i A4i B4i D5i",T);
		
		tripletFactor = 1;
		
		addNotes("G5h F5q B5q",T,T);
		addNotes("B2h+B3h B2h+B3h",B);
		
		measure(8);
		
		tripletFactor = 2;
		
		addNotes("G4i B4i E5i G4i B4i E5i G4i B4i E5i G4i B4i E5i",T);
		
		tripletFactor = 1;
		
		addNote("E5q",A,T,T);
		addRest("q",T,T);
		addRest("h",T,T);
		addNotes("E3w+E4w",B);
		
		measure(9);
		
		tripletFactor = 2;
		
		addNotes("Gn4i B4i E5i G4i B4i E5i G4i B4i E5i G4i B4i E5i",T);
		
		tripletFactor = 1;
		
		addRest("h",T,T);
		addRest("q",T,T);
		addNotes("Gn5i. G5s",T,T);
	    addNotes("E3w+E4w",B);
	    
	    measure(10);
	    
	    tripletFactor = 2;
	    
	    addNotes("Gn4i B4i Fn5i G4i B4i F5i G4i B4i F5i G4i B4i F5i",T);
	    
	    tripletFactor = 1;
	    
	    addNotes("Gn5h. G5i. G5s",T,T);
	    addNotes("Dn3w+Dn4w",B);
	    
	    measure(11);
	    
	    tripletFactor = 2;
	    
	    addNotes("Gn4i Cn5i E5i G4i B4i E5i G4i C#5i E5i F4i C5i E5i",T);
	    
		tripletFactor = 1;
		
		addNotes("Gn5h. F5q",T,T);
		addNotes("Cn3q+Cn4q B2q+B3q A#2h+A#3h",B);
		
		measure(12);
		
		addNotes("F5h Gn5q E5q",T);
		
		tripletFactor = 2;
		
		addNotes("F4i B4i Dn5i F4i B4i D5i Gn4i B4i C5i E4i B4i C5i",B);
		
		tripletFactor = 1;
		
		addNotes("B2h+B3h E3q Gn3q",B,B);
		
		measure(13);
		
		addNotes("F5h F5h",T);
		
		tripletFactor = 2;
		
		addNotes("F4i B4i Dn5i F4i B4i D5i F4i A#4i C5i F4i A4i C5i",B);
		
		tripletFactor = 1;
		
		addNotes("F3h F2h+F3h",B,B);
		
		measure(14);
		
		tripletFactor = 2;
		
		addNotes("B4i Dn4i F5i B4i D5i F5i B4i D#5i F5i B4i D5i F5i",T);
		
		tripletFactor = 1;
		
		addNote("B4i",A,T,T);
		addRest("q",2,T,T);
		addNote("B5q",A,T,T);
		
		measure(15);
		
		tripletFactor = 2;
		
		addNotes("B4i E5i Gn5i B4i E5i G5i B4i E5i G5i B4i E5i G5i",T);
		
		tripletFactor = 1;
		
		addNotes("Cn6h. A#5q",T,T);
		tie(D,B,"B2w","B2q");
		tie(A,B,"B3w","B3q");
		addNotes("E3q+E4q Gn3q+Gn4q E3q+E4q",B);
		
		measure(16);
		
		tripletFactor = 2;
		
		addNotes("B4i D5i F5i B4i D5i F5i B4i D5i F5i B4i D5i F5i",T);
		
		tripletFactor = 1;
		
		addNotes("B5h. B5q",T,T);
		
		measure(17);
		
		tripletFactor = 2;
		
		addNotes("B4i E5i Gn5i B4i E5i G5i B4i E5i G5i B4i E5i G5i",T);
		
		tripletFactor = 1;
		
		addNotes("Cn6h. A#5q",T,T);
		tie(D,B,"B2w","B2q");
		tie(A,B,"B3w","B2q");
		addNotes("E3q+E4q Gn3q+Gn4q E3q+E4q",B);
		
		measure(18);
		
		tripletFactor = 2;
		
		addNotes("B4i D5i F5i B4i D5i F5i B4i Dn5i E#5i B4i D5i E5i",T);
		
		tripletFactor = 1;
		
		addNotes("B5h B5h",T,T);
		addNotes("B2h+B3h G2h+G3h",B);
		
		measure(19);
		
		tripletFactor = 2;
		
		addNotes("B4i C5i G5i B4i C5i G5i A4i C5i F5i A4i C5i F5i",T);
		
		tripletFactor = 1;
		
		addNotes("B5h B5h",T,T);
		addNotes("E#2h+E#3h F2h+F3h",B);
		
		measure(20);
		
		addNotes("Gn5h F5h",T);
		
		tripletFactor = 2;
		
		addNotes("Gn4i B4i Dn5i G4i B4i D5i F4i A4i D#5i F4i A4i D5i",B);
		
		tripletFactor = 1;
		
		addNotes("B2h+B3h B#2h+B#3h",B,B);
		
		
		
		

	}

}
