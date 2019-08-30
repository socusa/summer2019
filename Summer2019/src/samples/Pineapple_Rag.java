package samples;

import static music.CreatingMusic.*;
import static music.Util.*;

import javax.sound.midi.Sequence;

public class Pineapple_Rag extends songs.Song {

	@Override
	public void measures() {
		player.setTempoInBPM(200);
			
        key = "Bb";
        
        measure(1);
        
        addNotes("G5s F5i E5s D5s C#5s D5s Cn5s",T);
        addNotes("G4s F4i E4s D4s C#4s D4s Cn4s",B);
        
        measure(2);
        
        addNotes("B4s C5s D5s",T);
        tie(A,T,"F5s","F5q");
        addNotes("B3s C4s D4s",B);
        tie(A,B,"F4s","F4q");
        
        measure(3);
        
        addNotes("G5s G5i F#5s G5s A5s B5i",T);
        addNotes("G4s G4i F#4s G4s A4s B4i",B);
        
        measure(4);
        
        addNote("C6i",A,T);
        tie(A,T,"F5i","F5i");
        addNote("F5i",A,T);
        addNote("C5i",A,B);
        tie(A,B,"F4i","F4i");
        addNote("F4i",A,B);
        
        measure(5);
        
        addNotes("B5s+D6s+G6s F6i E6s D6s C#6s D6s Cn6s",T);
        addNotes("B3i F4i+B4i+D5i F3i F4i+B4i+D5i",B);
        
        measure(6);
        
        addNotes("B5s C6s D6s",T);
        tie(A,T,"F6s","F6s");
        addNotes("B6s F6i+D7i",T);
        addNotes("B3i F4i+B4i+D5i F3i F4i+B4i+D5i",B);
        
        measure(7);
        
        addNotes("B5s+D6s+G6s F6i E6s D6s C#6s D6s E6s",T);
        addNotes("B3i F4i+B4i+D5i F3i F4i+B4i+D5i",B);
        
        measure(8);
        
        addNotes("B5i+D6i+F6i B5s+F6s D6s B5s+F6s D6s B5i+F6i",T);
        addNotes("B3i D4i F4i Ab4i",B);
        
        measure(9);
        
        addNotes("B5s E6i+B6i B5s E6i+B6i B5s",T);
        addNotes("G3i+G4i G4i+B4i+E5i Gb3i+Gb4i G4i+B4i+E5i",B);
        
        thirdVoiceTime = trebleTime;

        measure(10);
        
        tie(D,T,"F6s","F6s");
        tie(A,T,"B6s","B6s");
        addNotes("D7s B6s D6s F6s En6s F6s G6s",T);
        addNotes("F3i+F4i F4i+B4i+D5i D3i+D4i Db3i+Db4i",B);
        
        addRest("s",4,T,T);
        addNote("B5q",A,T,T);
        
        measure(11);
        
        addNotes("A6s C6i+F6i A6s B5i+En6i+G6i B5s+E6s+A6s",T);
        addNotes("C3i+C4i A4i+C5i+F5i C3i+C4i A4i+C5i+En5i",B);

        measure(12);
        
        tie(D,T,"A5s","A5i");
        tie(A,T,"F6s","F6i");
        addNotes("A5s B5s C6s D6s E6s F6s",T);
        addNotes("F3i+F4i C4i A3i F3i",B);
        
        measure(13);
        
        addNotes("B5s+D6s+G6s F6i E6s D6s C#6s D6s Cn6s",T);
        addNotes("B3i F4i+B4i+D5i F3i F4i+B4i+D5i",B);
        
        measure(14);
        
        addNotes("B5s C6s D6s",T);
        tie(A,T,"F6s","F6s");
        addNotes("B6s F6i+D7i",T);
        addNotes("B3i F4i+B4i+D5i F3i F4i+B4i+D5i",B);
        
        measure(15);
        
        addNotes("B5s+D6s+G6s F6i E6s D6s C#6s D6s E6s",T);
        addNotes("B3i F4i+B4i+D5i F3i F4i+B4i+D5i",B);
        
        measure(16);
        
        addNotes("B5i+D6i+F6i B5s+F6s D6s B5s+F6s D6s B5i+F6i",T);
        addNotes("B3i D4i F4i Ab4i",B);

        measure(17);
        
        addNotes("B5s E6i+B6i B5s E6i+B6i B5s",T);
        addNotes("G3i+G4i G4i+B4i+E5i Gb3i+Gb4i Gb4i+B4i+E5i",B);
        
        measure(18);
        
        tie(D,T,"E6s","E6s");
        tie(A,T,"B6s","B6s");
        addNotes("D7s B6s F6s D6s F6s G6s B6s",T);
        addNotes("F3i+F4i F4i+B4i+D5i F3i+F4i F4i+B4i+D5i",B);
        
        thirdVoiceTime = trebleTime;
        
        measure(19);
        
        addNotes("En5i Bb5i E5i.+A5i.",T);
        addNotes("G3i+G4i Gb3i+Gb4i F3q+F4q",B);
        
        addNotes("B5q C6s D6i",T,T);
        addRest("s",T,T);
        
        measure(20);
        
        tie(D,T,"D5s","D5i");
        tie(A,T,"B5s","B5i");
        addNotes("B5s C6s D6s E6s A5i+E6i+F6i",T);
        addNotes("B3i+B4i",B);
        addRest("i",2,B);
        addNotes("F3i+F4i",B);
	}

}
