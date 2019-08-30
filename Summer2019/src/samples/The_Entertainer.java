package samples;

import static music.CreatingMusic.A;
import static music.CreatingMusic.B;
import static music.CreatingMusic.D;
import static music.CreatingMusic.T;
import static music.CreatingMusic.key;
import static music.CreatingMusic.measureMonitor;
import static music.CreatingMusic.player;
import static music.CreatingMusic.thirdVoiceTime;
import static music.CreatingMusic.trebleTime;
import static music.Util.addNotes;
import static music.Util.addRest;
import static music.Util.tie;

import music.MeasureMonitor;


import static music.Util.measure;

public class The_Entertainer extends songs.Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub

		player.setTempoInBPM(180);
		
		measure(1);
	
		addNotes("D6s+D7s E6s+E7s C6s+C7s",T);
		tie(D,T,"A5s","A5s");
		tie(A,T,"A6s","A6s");
		addNotes("B5s+B6s G5i+G6i",T);
	
		for (int counter=0;counter<6;counter++)
			addRest("s",B);
	
		addRest("i",B);
	
        measure(2);
	
        addNotes("D6s E6s C6s",T);
        tie(A,T,"A5s","A5s");
        addNotes("B5s G5i",T);
	
        addNotes("D5s E5s C5s",B);
        tie(A,B,"A4s","A4s");
        addNotes("B4s G4i",B);
	
        measure(3);
	
        addNotes("D5s E5s C5s",T);
        tie(A,T,"A4s","A4s");
        addNotes("B4s A4s Ab4s",T);
	
        addNotes("D4s E4s C4s",B);
        tie(A,B,"A3s","A3s");
        addNotes("B4s A3s Ab4s",B);
	
        measure(4);
	
        addRest("i",T);
        addRest("i",T);
        addNotes("G5i+B5i+D6i+G6i D5s D#5s",T);
        addNotes("G3i+G4i",B);
        addRest("i",B);
        addNotes("G3i+G2i G4i+B4i",B);
	
        measure(5);
	
        addNotes("E5s C6i E5s C6i E5s",T);
        addNotes("C4i E4i+G4i+C5i G3i+G4i G4i+Bb4i+C5i",B);
	
        measure(6);
	
        tie(A,T,"C6s","C6q","C6s");
        addNotes("C6s+E6s+C7s",T);
        addNotes("D6s+F6s+D7s",T);
        addNotes("D#6s+F#6s+D#7s",T);
        addNotes("F3i+F4i A4i+C5i E3i+E4i G4i+C5i",B);
	
        measure(7);
	
        addNotes("E6s+G6s+E7s C6s+E6s+C7s D6s+F6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(D,T,"G6s","G6s");
        tie(A,T,"E7s","E7s");
        addNotes("B5s+D6s+B6s",T);
        addNotes("D6i+F6i+D7i",T);
        addNotes("G3i E4i+G4i+C5i G3i F4i+G4i+B4i",B);
	
        measure(8);
	
        tie(D,T,"C6q","C6i");
        tie(D,T,"E6q","E6i");
        tie(A,T,"C7q","C7i");
        addNotes("D5s D#5s",T);
        addNotes("C4i E4i+G4i+C5i E4i+G4i+C5i G4i+B4i",B);
	
        measure(9);
	
        addNotes("E5s C6i E5s C6i E5s",T);
        addNotes("C4i E4i+G4i+C5i G3i+G4i G4i+Bb4i+C5i",B);

        measure(10);
        
        tie(A,T,"C6s","C6q","C6i");
        addNotes("A5s+C6s+B6s G5s+C6s+B6s",T);
        addNotes("F3i+F4i A4i+C5i E3i+E4i Eb3i+Eb4i",B);
	
        measure(11);
	
        addNotes("F#5s+C6s+F#6s A5s+A6s C6s+C7s",T);
        tie(D,T,"E6s","E6s");
        tie(A,T,"E7s","E7s");
        addNotes("D6s+D7s C6s+C7s A5s+A6s",T);
        addNotes("D3i+D4i D4i+F#4i+A4i+C5i D4i F4i+A4i+C5i",B);
	
        measure(12);
	
        tie(D,T,"D6q","D6i");
        tie(D,T,"F6q","F6i");
        tie(A,T,"D7q","D7i");
        addNotes("D5s D#5s",T);
        addNotes("G4i+B4i G3i+G4i A3i+A4i B3i+B4i",B);
	
        measure(13);
	
        addNotes("E5s C6i E5s C6i E5s",T);
        addNotes("C4i E4i+G4i+C5i G3i+G4i G4i+Bb4i+C5i",B);
				
        measure(14);
				
        tie(A,T,"C6s","C6q","C6s");
        addNotes("C6s+E6s+C7s",T);
        addNotes("D6s+F6s+D7s",T);
        addNotes("D#6s+F#6s+D#7s",T);
        addNotes("F3i+F4i A4i+C5i E3i+E4i G4i+C5i",B);
				
        measure(15);
				
        addNotes("E6s+G6s+E7s C6s+E6s+C7s D6s+F6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(D,T,"G6s","G6s");
        tie(A,T,"E7s","E7s");
        addNotes("B5s+D6s+B6s",T);
        addNotes("D6i+F6i+D7i",T);
        addNotes("G3i E4i+G4i+C5i G3i F4i+G4i+B4i",B);
							
        measure(16);
	
        tie(D,T,"C6q","C6i");
        tie(D,T,"E6q","E6i");
        tie(A,T,"C7q","C7i");
        addNotes("C6s+C7s D6s+D7s",T);
        addNotes("C4i E4i+G4i+C5i G4i+C5i+E5i",B);
        addRest("i",B);
	
        measure(17);
	
        addNotes("E6s+E7s C6s+C7s D6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(A,T,"E7s","E7s");
        addNotes("C6s+C7s D6s+D7s C6s+C7s",T);
        addNotes("C4i+C5i G4i+C5i+E5i Bb3i+Bb4i G4i+C5i+E5i",B);
	
        measure(18);
	
        addNotes("E6s+E7s C6s+C7s D6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(A,T,"E7s","E7s");
        addNotes("C6s+C7s D6s+D7s C6s+C7s",T);
        addNotes("A3i+A4i A4i+C5i+F5i Ab3i+Ab4i Ab4i+C5i+F5i",B);
	
        measure(19);
	
        addNotes("E6s+G6s+E7s C6s+E6s+C7s D6s+F6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(D,T,"G6s","G6s");
        tie(A,T,"E7s","E7s");
        addNotes("B5s+D6s+B6s D6i+F6i+D7i",T);
        addNotes("G3i+G4i G4i+C5i+E5i G3i G4i+B4i",B);
	
        measure(20);
	
        tie(D,T,"C6q","C6i");
        tie(D,T,"E6q","E6i");
        tie(A,T,"C7q","C7i");
        addNotes("D5s D#5s",T);
        addNotes("C4i+G4i+C5i G3i+G4i A3i+A4i B3i+B4i",B);
	
        measure(21);
	
        addNotes("E5s C6i E5s C6i E5s",T);
        addNotes("C4i E4i+G4i+C5i G3i+G4i G4i+Bb4i+C5i",B);
				
        measure(22);
				
        tie(A,T,"C6s","C6q","C6s");
        addNotes("C6s+E6s+C7s",T);
        addNotes("D6s+F6s+D7s",T);
        addNotes("D#6s+F#6s+D#7s",T);
        addNotes("F3i+F4i A4i+C5i E3i+E4i G4i+C5i",B);
				
        measure(23);
				
        addNotes("E6s+G6s+E7s C6s+E6s+C7s D6s+F6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(D,T,"G6s","G6s");
        tie(A,T,"E7s","E7s");
        addNotes("B5s+D6s+B6s",T);
        addNotes("D6i+F6i+D7i",T);
        addNotes("G3i E4i+G4i+C5i G3i F4i+G4i+B4i",B);
				
        measure(24);
				
        tie(D,T,"C6q","C6i");
        tie(D,T,"E6q","E6i");
        tie(A,T,"C7q","C7i");
        addNotes("D5s D#5s",T);
        addNotes("C4i E4i+G4i+C5i E4i+G4i+C5i G4i+B4i",B);
				
        measure(25);
				
        addNotes("E5s C6i E5s C6i E5s",T);
        addNotes("C4i E4i+G4i+C5i G3i+G4i G4i+Bb4i+C5i",B);

        measure(26);
				
        tie(A,T,"C6s","C6q","C6i");
        addNotes("A5s+C6s+B6s G5s+C6s+B6s",T);
        addNotes("F3i+F4i A4i+C5i E3i+E4i Eb3i+Eb4i",B);
				
        measure(27);
				
        addNotes("F#5s+C6s+F#6s A5s+A6s C6s+C7s",T);
        tie(D,T,"E6s","E6s");
        tie(A,T,"E7s","E7s");
        addNotes("D6s+D7s C6s+C7s A5s+A6s",T);
        addNotes("D3i+D4i D4i+F#4i+A4i+C5i D4i F4i+A4i+C5i",B);
				
        measure(28);
				
        tie(D,T,"D6q","D6i");
        tie(D,T,"F6q","F6i");
        tie(A,T,"D7q","D7i");
        addNotes("D5s D#5s",T);
        addNotes("G4i+B4i G3i+G4i A3i+A4i B3i+B4i",B);
				
        measure(29);
				
        addNotes("E5s C6i E5s C6i E5s",T);
        addNotes("C4i E4i+G4i+C5i G3i+G4i G4i+Bb4i+C5i",B);
							
        measure(30);
							
        tie(A,T,"C6s","C6q","C6s");
        addNotes("C6s+E6s+C7s",T);
        addNotes("D6s+F6s+D7s",T);
        addNotes("D#6s+F#6s+D#7s",T);
        addNotes("F3i+F4i A4i+C5i E3i+E4i G4i+C5i",B);
							
        measure(31);
							
        addNotes("E6s+G6s+E7s C6s+E6s+C7s D6s+F6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(D,T,"G6s","G6s");
        tie(A,T,"E7s","E7s");
        addNotes("B5s+D6s+B6s",T);
        addNotes("D6i+F6i+D7i",T);
        addNotes("G3i E4i+G4i+C5i G3i F4i+G4i+B4i",B);
										
        measure(32);
				
        tie(D,T,"C6q","C6i");
        tie(D,T,"E6q","E6i");
        tie(A,T,"C7q","C7i");
        addNotes("C6s+C7s D6s+D7s",T);
        addNotes("C4i E4i+G4i+C5i G4i+C5i+E5i",B);
        addRest("i",B);
				
        measure(33);
				
        addNotes("E6s+E7s C6s+C7s D6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(A,T,"E7s","E7s");
        addNotes("C6s+C7s D6s+D7s C6s+C7s",T);
        addNotes("C4i+C5i G4i+C5i+E5i Bb3i+Bb4i G4i+C5i+E5i",B);
				
        measure(34);
				
        addNotes("E6s+E7s C6s+C7s D6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(A,T,"E7s","E7s");
        addNotes("C6s+C7s D6s+D7s C6s+C7s",T);
        addNotes("A3i+A4i A4i+C5i+F5i Ab3i+Ab4i Ab4i+C5i+F5i",B);
				
        measure(35);
				
        addNotes("E6s+G6s+E7s C6s+E6s+C7s D6s+F6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(D,T,"G6s","G6s");
        tie(A,T,"E7s","E7s");
        addNotes("B5s+D6s+B6s D6i+F6i+D7i",T);
        addNotes("G3i+G4i G4i+C5i+E5i G3i G4i+B4i",B);
		
//Beginning of part 2
	
        measure(36);
        
        tie(D,T,"C6q","C6s");
        tie(D,T,"E6q","E6s");
        tie(A,T,"C7q","C7s");
        addNotes("E5s+C6s+E6s F5s+D6s+F6s F#5s+D#6s+F#6s",T);
        addNotes("C4i+G4i+C5i G3i+G4i C3i+C4i",B);
        addRest("i",B);
	
        measure(37);
	
        addNotes("G5i+E6i+G6i A5s+E6s+A6s",T);
        tie(D,T,"G5s","G5s");
        tie(D,T,"E6s","E6s");
        tie(A,T,"G6s","G6s");
        addNotes("E5s+C6s+E6s F5s+D6s+F6s F#5s+D#6s+F#6s",T);
        addNotes("C3i+C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
	
        measure(38);
	
        addNotes("G5i+E6i+G6i A5s+E6s+A6s",T);
        tie(D,T,"G5s","G5s");
        tie(D,T,"E6s","E6s");
        tie(A,T,"G6s","G6s");
        addNotes("E6s C6s G5s",T);
        addNotes("C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
	
        measure(39);
	
        addNotes("A5s B5s C6s D6s E6s D6s C6s D6s",T);
        addNotes("F3i A4i+C5i+F5i F4i Ab4i+C5i+F5i",B);
	
        measure(40);
	
        addNotes("G5s E6s F6s G6s A6s G6s E6s F6s",T);
        addNotes("E4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
	
        measure(41);
	
        addNotes("G5i+E6i+G6i A5s+E6s+A6s",T);
        tie(D,T,"G5s","G5s");
        tie(D,T,"E6s","E6s");
        tie(A,T,"G6s","G6s");
        addNotes("E5s+C6s+E6s F5s+D6s+F6s F#5s+D#6s+F#6s",T);
        addNotes("B3i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
	
        measure(42);
	
        addNotes("G5i+E6i+G6i A5s+E6s+A6s",T);
        tie(D,T,"G5s","G5s");
        tie(D,T,"E6s","E6s");
        tie(A,T,"G6s","G6s");
        addNotes("G6s A6s A#6s",T);
        addNotes("B3i G4i+C5i+E5i E4i Eb4i",B);
	
        measure(43);
	
        addNotes("D6s+G6s+B6s D6i+G6i+B6i",T);
        tie(D,T,"C6s","C6s");
        tie(D,T,"F#6s","F#6s");
        tie(A,T,"B6s","B6s");
        addNotes("A6s C6s+F#6s D6s",T);
        addNotes("D4i G4i+B4i+D5i D4i A4i+C5i+D5i",B);
	
        measure(44);
	
        tie(D,T,"B5q","B5s");
        tie(A,T,"G6q","G6s");
        addNotes("E5s+C6s+E6s F5s+D6s+F6s F#5s+D#6s+F#6s",T);
        addNotes("G4i+B4i+D5i F3i+F4i E3i+E4i D3i+D4i",B);
	
        measure(45);
	
        addNotes("G5i+E6i+G6i A5s+E6s+A6s",T);
        tie(D,T,"G5s","G5s");
        tie(D,T,"E6s","E6s");
        tie(A,T,"G6s","G6s");
        addNotes("E5s+C6s+E6s F5s+D6s+F6s F#5s+D#6s+F#6s",T);
        addNotes("C3i+C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);

        measure(46); 
	
        addNotes("G5i+E6i+G6i A5s+E6s+A6s",T);
        tie(D,T,"G5s","G5s");
        tie(D,T,"E6s","E6s");
        tie(A,T,"G6s","G6s");
        addNotes("E6s C6s G5s",T);
        addNotes("C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
	
        measure(47);
	
        addNotes("A5s B5s C6s D6s E6s D6s C6s D6s",T);
        addNotes("F3i A4i+C5i+F5i F4i Ab4i+C5i+F5i",B);

        measure(48);
	
        tie(A,T,"C6q","C6s");
        addNotes("G5s F#5s G5s",T);
        addNotes("E4i G4i+C5i+E5i B3i Bb4i+C5i+E5i",B);
	
        measure(49);
	
        addNotes("C6i A5s",T);
        tie(A,T,"C6s","C6s");
        addNotes("A5s C6s A5s",T);
        addNotes("F4i+A4i+C5i+F5i F4i+A4i+C5i+F5i F#4i+A4i+C#5i+D5i F#4i+A4i+C#5i+D5i",B);

        measure(50);
	
        addNotes("G5s C6s E6s",T);
        tie(A,T,"G6s","G6s");
        addNotes("E6s C6s G5s",T);
        addNotes("G4i+C5i+E5i G4i+C5i+E5i G4i+C5i+E5i G4i+C5i+E5i",B);
	
        measure(51);
        
        addNotes("F#5i+A5i F#5i+C6i F5s+E6s F5i+D6i",T);
        addNotes("D4i+C5i D4i+A4i G4i+B4i G4i+B4i",B);
	
        measure(52);
	
        tie(D,T,"E5s","E5q","E5s");
        tie(A,T,"C6s","C6q","C6s");
        addNotes("E5s+C6s+E6s F5s+D6s+F6s F#5s+D#6s+F#6s",T);
        addNotes("C4i+C5i G3i+G4i E3i+E4i D3i+D4i",B);

        measure(53);
	
        addNotes("G6i+E7i+G7i A6s+E7s+A7s",T);
        tie(D,T,"G6s","G6s");
        tie(D,T,"E7s","E7s");
        tie(A,T,"G7s","G7s");
        addNotes("E6s+C7s+E7s F6s+D7s+F7s F#6s+D#7s+F#7s",T);
        addNotes("C3i+C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
				
        measure(54);
				
        addNotes("G6i+E7i+G7i A6s+E7s+A7s",T);
        tie(D,T,"G6s","G6s");
        tie(D,T,"E7s","E7s");
        tie(A,T,"G7s","G7s");
        addNotes("E7s C7s G6s",T);
        addNotes("C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
				
        measure(55);
				
        addNotes("A6s B6s C7s D7s E7s D7s C7s D7s",T);
        addNotes("F3i A4i+C5i+F5i F4i Ab4i+C5i+F5i",B);

        measure(56);
				
        addNotes("G6s E7s F7s G7s A7s G7s E7s F7s",T);
        addNotes("E4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
				
        measure(57);
				
        addNotes("G6i+E7i+G7i A6s+E7s+A7s",T);
        tie(D,T,"G6s","G6s");
        tie(D,T,"E7s","E7s");
        tie(A,T,"G7s","G7s");
        addNotes("E6s+C7s+E7s F6s+D7s+F7s F#6s+D#7s+F#7s",T);
        addNotes("B3i G4i+C5i+E5i G3i G4i+C5i+E5i",B);

        measure(58);
				
        addNotes("G6i+E7i+G7i A6s+E7s+A7s",T);
        tie(D,T,"G6s","G6s");
        tie(D,T,"E7s","E7s");
        tie(A,T,"G7s","G7s");
        addNotes("G7s A7s A#7s",T);
        addNotes("B3i G4i+C5i+E5i E4i Eb4i",B);
				
        measure(59);
				
        addNotes("D7s+G7s+B7s D7i+G7i+B7i",T);
        tie(D,T,"C7s","C7s");
        tie(D,T,"F#7s","F#7s");
        tie(A,T,"B7s","B7s");
        addNotes("A7s C7s+F#7s D7s",T);
        addNotes("D4i G4i+B4i+D5i D4i A4i+C5i+D5i",B);

        measure(60);
				
        tie(D,T,"B6q","B6s");
        tie(A,T,"G7q","G7s");
        addNotes("E6s+C7s+E7s F6s+D7s+F7s F#6s+D#7s+F#7s",T);
        addNotes("G4i+B4i+D5i F3i+F4i E3i+E4i D3i+D4i",B);
				
        measure(61);
				
        addNotes("G6i+E7i+G7i A6s+E7s+A7s",T);
        tie(D,T,"G6s","G6s");
        tie(D,T,"E7s","E7s");
        tie(A,T,"G7s","G7s");
        addNotes("E6s+C7s+E7s F6s+D7s+F7s F#6s+D#7s+F#7s",T);
        addNotes("C3i+C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
				
        measure(62);
				
        addNotes("G6i+E7i+G7i A6s+E7s+A7s",T);
        tie(D,T,"G6s","G6s");
        tie(D,T,"E7s","E7s");
        tie(A,T,"G7s","G7s");
        addNotes("E7s C7s G6s",T);
        addNotes("C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
				
        measure(63);
				
        addNotes("A6s B6s C7s D7s E7s D7s C7s D7s",T);
        addNotes("F3i A4i+C5i+F5i F4i Ab4i+C5i+F5i",B);

        measure(64);
				
        tie(A,T,"C7q","C7s");
        addNotes("G6s F#6s G6s",T);
        addNotes("E4i G4i+C5i+E5i B3i Bb4i+C5i+E5i",B);
				
        measure(65);
				
        addNotes("C7i A6s",T);
        tie(A,T,"C7s","C7s");
        addNotes("A6s C7s A6s",T);
        addNotes("F4i+A4i+C5i+F5i F4i+A4i+C5i+F5i F#4i+A4i+C#5i+D5i F#4i+A4i+C#5i+D5i",B);
				
        measure(66);
				
        addNotes("G6s C7s E7s",T);
        tie(A,T,"G7s","G7s");
        addNotes("E7s C7s G6s",T);
        addNotes("G4i+C5i+E5i G4i+C5i+E5i G4i+C5i+E5i G4i+C5i+E5i",B);

        measure(67);
				
        addNotes("F#6i+A6i F#6i+C7i F6s+E7s F6i+D7i E6s+C7s",T);
        addNotes("D4i+C5i D4i+A4i G4i+B4i G4i+B4i",B);
   
        measure(68);
	
        tie(D,T,"E5q","E5i");
        tie(A,T,"C6q","C6i");
        addNotes("D5s D#5s",T);
        addNotes("C4i+C5i G3i+G4i C3i+C4i",B);
        addRest("i",B);

        measure(69);
	
        addNotes("E5s C6i E5s C6i E5s",T);
        addNotes("C4i E4i+G4i+C5i G3i+G4i G4i+Bb4i+C5i",B);
	
        measure(70);
	
        tie(A,T,"C6s","C6q","C6s");
        addNotes("C6s+E6s+C7s D6s+F6s+D7s D#6s+F#6s+D#7s",T);
        addNotes("F3i+F4i A4i+C5i E3i+E4i G4i+C5i",B);
	
        measure(71);
	
        addNotes("E6s+G6s+E7s C6s+E6s+C7s D6s+F6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(D,T,"G6s","G6s");
        tie(A,T,"E7s","E7s");
        addNotes("B5s+D6s+B6s D6i+F6i+D7i",T);
        addNotes("G3i E4i+G4i+C5i G3i F4i+G4i+B4i",B);
	
        measure(72);
	
        tie(D,T,"C6q","C6i");
        tie(D,T,"E6q","E6i");
        tie(A,T,"C7q","C7i");
        addNotes("D5s D#5s",T);
        addNotes("C4i E4i+G4i+C5i E4i+G4i+C5i G4i+B4i",B);
	
        measure(73);
	
        addNotes("E5s C6i E5s C6i E5s",T);
        addNotes("C4i E4i+G4i+C5i G3i+G4i G4i+Bb4i+C5i",B);
	
        measure(74);
	
        tie(A,T,"C6s","C6q","C6i");
        addNotes("A5s+C6s+A6s G5s+C6s+G6s",T);
        addNotes("F3i+F4i A4i+C5i E3i+E4i Eb3i+Eb4i",B);
	
        measure(75);
	
        addNotes("F#5s+C6s+F#6s A5s+A6s C6s+C7s",T);
        tie(D,T,"E6s","E6s");
        tie(A,T,"E7s","E7s");
        addNotes("D6s+D7s C6s+C7s A5s+A6s",T);
        addNotes("D3i+D4i D4i+F#4i+A4i+C5i D4i F#4i+A4i+C5i",B);
	
        measure(76);
	
        tie(D,T,"D6q","D6i");
        tie(D,T,"F6q","F6i");
        tie(A,T,"D7q","D7i");
        addNotes("D5s D#5s",T);
        addNotes("G4i+B4i G3i+G4i A3i+A4i B3i+B4i",B);
	
        measure(77);
	
        addNotes("E5s C6i E5s C6i E5s",T);
        addNotes("C4i E4i+G4i+C5i G3i+G4i G4i+Bb4i+C5i",B);
	
        measure(78);
	
        tie(A,T,"C6s","C6q","C6s");
        addNotes("C6s+E6s+C7s D6s+F6s+D7s D#6s+F#6s+D#7s",T);
        addNotes("F3i+F4i A4i+C5i E3i+E4i G4i+C5i",B);
	
        measure(79);
	
        addNotes("E6s+G6s+E7s C6s+E6s+C7s D6s+F6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(D,T,"G6s","G6s");
        tie(A,T,"E7s","E7s");
        addNotes("B5s+D6s+B6s D6i+F6i+D7i",T);
        addNotes("G3i E4i+G4i+C5i G3i F4i+G4i+B4i",B);

        measure(80);
	
        tie(D,T,"C6q","C6i");
        tie(D,T,"E6q","E6i");
        tie(A,T,"C7q","C7i");
        addNotes("C6s+C7s D6s+D7s",T);
        addNotes("C4i E4i+G4i+C5i G4i+C5i+E5i",B);
        addRest("i",B);

        measure(81);
	
        addNotes("E6s+E7s C6s+C7s D6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(A,T,"E7s","E7s");
        addNotes("C6s+C7s D6s+D7s C6s+C7s",T);
        addNotes("C4i+C5i G4i+C5i+E5i Bb3i+Bb4i G4i+C5i+E5i",B);

        measure(82);
	
        addNotes("E6s+E7s C6s+C7s D6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(A,T,"E7s","E7s");
        addNotes("C6s+C7s D6s+D7s C6s+C7s",T);
        addNotes("A3i+A4i A4i+C5i+F5i Ab3i+Ab4i Ab4i+C5i+F5i",B);

        measure(83);
	
        addNotes("E6s+G6s+E7s C6s+E6s+C7s D6s+F6s+D7s",T);
        tie(D,T,"E6s","E6s");
        tie(D,T,"G6s","G6s");
        tie(A,T,"E7s","E7s");
        addNotes("B5s+D6s+B6s D6i+F6i+D7i",T);
        addNotes("G3i+G4i G4i+C5i+E5i G3i G4i+B4i",B);
	
        measure(84);
	
        addNotes("C6q+E6q+C7q C6i+E6i+C7i",T);
        addRest("i",T);
        addNotes("C4i+G4i+C5i G3i+G4i C3i+C4i",B);
        addRest("i",B);
	
        key = "F";
	
        measure(85);
	
        addNotes("F6s+A6s G#6s",T);
        tie(D,T,"F6i","F6i");
        tie(A,T,"A6i","A6i");
        addNotes("F6i+A6i+C7i",T);
        addNotes("F3i A4i+C5i+F5i C4i A4i+C5i+F5i",B);
	
        thirdVoiceTime = trebleTime;

        measure(86);
	
        addRest("i",T);
        addNotes("B5s A5s B5s C6s D6i",T);
        addNotes("B3i B4i+D5i+F5i F4i B4i+D5i+F5i",B);
        addNotes("F6h+B6h+D7h",T,T);

        measure(87);
	
        addNotes("D6s+F6s E6s",T);
        tie(D,T,"D6i","D6i");
        tie(A,T,"F6i","F6i");
        addNotes("D6i+F6i+A6i",T);
        addNotes("D3i A4i+D5i+F5i A3i A4i+D5i+F5i",B);

        measure(88);
	
        thirdVoiceTime = trebleTime;
	
        addRest("i",T);
        addNotes("G5s F#5s G5s A5s B5i",T);
        addNotes("G3i B4i+D5i D4i B4i+D5i",B);
        tie(D,T,T,"D6q","D6i.");
        tie(D,T,T,"G6q","G6i.");
        tie(A,T,T,"B6q","B6i.");
        addNotes("G6s",T,T);

        measure(89);
	
        addNotes("D6i G6s",T);
        tie(A,T,"D6s","D6s");
        addNotes("G6s D6i",T);
        addNotes("B3i+B4i B4i+D5i G3i+G4i G#3i+G#4i",B);

        measure(90);
	
        addNotes("C6q F6q",T);
        addNotes("A3i+A4i A4i+C5i+F5i D4i A4i+D5i+F5i",B);

        measure(91);
	
        addNotes("E6s G#6s Bn6s",T);
        tie(A,T,"E7s","E7s");
        addNotes("D7s Bn6s C7s",T);
        addNotes("E4i Bn4i+D5i+F5i G#4i Bn4i+D5i+F5i",B);

        measure(92);
        
        addNotes("A6q Bb6q",T);
        addNotes("A4q+C5q+E5q Gn4i+C5i+E5i C4i",B);

        measure(93);
	
        addNotes("F6s+A6s G#6s",T);
        tie(D,T,"F6i","F6i");
        tie(A,T,"A6i","A6i");
        addNotes("F6i+A6i+C7i",T);
        addNotes("F3i A4i+C5i+F5i C4i A4i+C5i+F5i",B);

        thirdVoiceTime = trebleTime;
	
        measure(94);
	
        addRest("i",T);
        addNotes("B5s A5s B5s C6s D6i",T);
        addNotes("B3i B4i+D5i+F5i F4i A4i+C5i+F5i",B);
        addNotes("F6h+B6h+D7h",T,T);

        measure(95);
	
        addNotes("D6s+F6s E6s",T);
        tie(D,T,"D6i","D6i");
        tie(A,T,"F6i","F6i");
        addNotes("D6i+F6i+A6i",T);
        addNotes("D3i A4i+D5i+F5i A3i A4i+D5i+F5i",B);

        measure(96);
        
        thirdVoiceTime = trebleTime;
	
        addRest("i",T);
        addNotes("G5s F#5s G5s A5s B5i",T);
        addNotes("G3i B4i+D5i D4i B4i+D5i",B);
        tie(D,T,T,"D6q","D6i.");
        tie(D,T,T,"G6q","G6i.");
        tie(A,T,T,"B6q","B6i.");
        addNotes("G6s",T,T);

        measure(97);
	
        addNotes("D6i G6s",T);
        tie(A,T,"D6s","D6s");
        addNotes("G6s D6i",T);
        addNotes("B3i+B4i B4i+D5i G3i+G4i G#3i+G#4i",B);

        measure(98);
	
        addNotes("C6q G#5i.+Bn5i.+F6i. F6s",T);
        addNotes("A3s+A4s F3s+F4s E3s+E4s D3s+D4s Db3q+Db4q",B);

        thirdVoiceTime = trebleTime;
	
        measure(99);
	
        addNotes("A5s+C6s+A6s C6i+C7i",T);
        tie(A,T,"G6s","G6s");
        addNotes("C6s D6s E6s",T);
        addNotes("C3i+C4i A4i+C5i+F5i C4i+C5i C3i+C4i",B);
        addRest("s",T,T);
        addRest("i",T,T);
        tie(A,T,T,"B5s","B5i");
        addNotes("B5i",T,T);

        measure(100);
	
        addNotes("A5i+F6i Bn5s C6s D6s E6s F6s G6s",T);
        addNotes("F3i+F4i",B);
        addRest("i",B);
        addRest("q",B);

        measure(101);
	
        addNotes("F6s+A6s G#6s",T);
        tie(D,T,"F6i","F6i");
        tie(A,T,"A6i","A6i");
        addNotes("F6i+A6i+C7i",T);
        addNotes("F3i A4i+C5i+F5i C4i A4i+C5i+F5i",B);
				
        thirdVoiceTime = trebleTime;

        measure(102);
				
        addRest("i",T);
        addNotes("B5s A5s B5s C6s D6i",T);
        addNotes("B3i B4i+D5i+F5i F4i B4i+D5i+F5i",B);
        addNotes("F6h+B6h+D7h",T,T);

        measure(103);
				
        addNotes("D6s+F6s E6s",T);
        tie(D,T,"D6i","D6i");
        tie(A,T,"F6i","F6i");
        addNotes("D6i+F6i+A6i",T);
        addNotes("D3i A4i+D5i+F5i A3i A4i+D5i+F5i",B);

        measure(104);
				
        thirdVoiceTime = trebleTime;
				
        addRest("i",T);
        addNotes("G5s F#5s G5s A5s B5i",T);
        addNotes("G3i B4i+D5i D4i B4i+D5i",B);
        tie(D,T,T,"D6q","D6i.");
        tie(D,T,T,"G6q","G6i.");
        tie(A,T,T,"B6q","B6i.");
        addNotes("G6s",T,T);

        measure(105);
				
        addNotes("D6i G6s",T);
        tie(A,T,"D6s","D6s");
        addNotes("G6s D6i",T);
        addNotes("B3i+B4i B4i+D5i G3i+G4i G#3i+G#4i",B);

        measure(106);
				
        addNotes("C6q F6q",T);
        addNotes("A3i+A4i A4i+C5i+F5i D4i A4i+D5i+F5i",B);

        measure(107);
				
        addNotes("E6s G#6s Bn6s",T);
        tie(A,T,"E7s","E7s");
        addNotes("D7s Bn6s C7s",T);
        addNotes("E4i Bn4i+D5i+F5i G#4i Bn4i+D5i+F5i",B);

        measure(108);
				
        addNotes("A6q Bb6q",T);
        addNotes("A4q+C5q+E5q Gn4i+C5i+E5i C4i",B);

        measure(109);
				
        addNotes("F6s+A6s G#6s",T);
        tie(D,T,"F6i","F6i");
        tie(A,T,"A6i","A6i");
        addNotes("F6i+A6i+C7i",T);
        addNotes("F3i A4i+C5i+F5i C4i A4i+C5i+F5i",B);

        thirdVoiceTime = trebleTime;
	
        measure(110);
				
        addRest("i",T);
        addNotes("B5s A5s B5s C6s D6i",T);
        addNotes("B3i B4i+D5i+F5i F4i A4i+C5i+F5i",B);
        addNotes("F6h+B6h+D7h",T,T);

        measure(111);
				
        addNotes("D6s+F6s E6s",T);
        tie(D,T,"D6i","D6i");
        tie(A,T,"F6i","F6i");
        addNotes("D6i+F6i+A6i",T);
        addNotes("D3i A4i+D5i+F5i A3i A4i+D5i+F5i",B);

        measure(112);
				
        thirdVoiceTime = trebleTime;
				
        addRest("i",T);
        addNotes("G5s F#5s G5s A5s B5i",T);
        addNotes("G3i B4i+D5i D4i B4i+D5i",B);
        tie(D,T,T,"D6q","D6i.");
        tie(D,T,T,"G6q","G6i.");
        tie(A,T,T,"B6q","B6i.");
        addNotes("G6s",T,T);

        measure(113);
				
        addNotes("D6i G6s",T);
        tie(A,T,"D6s","D6s");
        addNotes("G6s D6i",T);
        addNotes("B3i+B4i B4i+D5i G3i+G4i G#3i+G#4i",B);

        measure(114);
				
        addNotes("C6q G#5i.+Bn5i.+F6i. F6s",T);
        addNotes("A3s+A4s F3s+F4s E3s+E4s D3s+D4s Db3q+Db4q",B);

        thirdVoiceTime = trebleTime;
				
        measure(115);
				
        addNotes("A5s+C6s+A6s C6i+C7i",T);
        tie(A,T,"G6s","G6s");
        addNotes("C6s D6s E6s",T);
        addNotes("C3i+C4i A4i+C5i+F5i C4i+C5i C3i+C4i",B);
        addRest("s",T,T);
        addRest("i",T,T);
        tie(A,T,T,"B5s","B5i");
        addNotes("B5i",T,T);
	
        measure(116);
	
        addNotes("A5i+F6i",T);
        addRest("i",T);
        addNotes("F6i+A6i+C7i+F7i",T);
        addRest("i",T);
        addNotes("F3i+F4i",B);
        addRest("i",B);
        addNotes("F2i+F3i",B);
        addRest("i",B);
	
        key = "C";
	
        measure(117);
	
        addNotes("C6i A5s",T);
        tie(A,T,"C6s","C6s");
        addNotes("A5s C6s A5s",T);
        addNotes("F4i+A4i+C5i+F5i F4i+A4i+C5i+F5i F#4i+A4i+C#5i+D5i F#4i+A4i+C#5i+D5i",B);
	
        measure(118);
	
        addNotes("G5s C6s E6s",T);
        tie(A,T,"G6s","G6s");
        addNotes("E6s C6s G5s",T);
        addNotes("G4i+C5i+E5i G4i+C5i+E5i G4i+C5i+E5i G4i+C5i+E5i",B);

        measure(119);
	
        addNotes("F#5i+A5i F#5i+C6i F5s+E6s F5i+D6i",T);
        addNotes("D4i+C5i D4i+A4i G4i+B4i G4i+B4i",B);

        measure(120);
	
        tie(D,T,"E5s","E5q");
        tie(A,T,"C6s","C6q");
        addNotes("C6i+E6i+G6i+C7i",T);
        addRest("i",T);
        addNotes("C4q+C5q C3i+C4i",B);
        addRest("i",B);

        measure(121);
	
        addNotes("D5i+F5i C#5s+E5s",T);
        tie(D,T,"D5s","D5s");
        tie(A,T,"F5s","F5s");
        addNotes("C5s+E5s D5i+F5i",T);
        addNotes("F3i F4i+A4i A3i F4i+A4i",B);
	
        measure(122);
	
        addRest("s",T);
        addNotes("A5s F5s+D6s A5s C6s D6s C6s A5s",T);
        addNotes("F3i F4i+A4i A3i F4i+A4i",B);

        measure(123);
	
        addNotes("E5i+G5i D#5s+F#5s",T);
        tie(D,T,"E5s","E5s");
        tie(A,T,"G5s","G5s");
        addNotes("D5s+F5s E5i+G5i",T);
        addNotes("C4i E4i+G4i+C5i G3i E4i+G4i+C5i",B);

        measure(124);
        
        addRest("s",T);
        addNotes("C6s G5s+E6s C6s D6s E6s D6s C6s",T);
        addNotes("C4i E4i+G4i+C5i G3i E4i+G4i+C5i",B);

        measure(125);
	
        addNotes("B5i+D6i A#5s+C#6s",T);
        tie(D,T,"B5s","B5s");
        tie(A,T,"D6s","D6s");
        addNotes("A5s+C6s B5i+D6i",T);
        addNotes("G3i F4i+G4i+B4i B3i F4i+G4i+B4i",B);

        measure(126);
	
        addRest("s",T);
        addNotes("F6s B5s+A6s F6s G6s A6s G6s F6s",T);
        addNotes("G3i F4i+G4i+B4i D4i F4i+G4i+B4i",B);

        measure(127);
	
        addNotes("C6s+C7s C6s+C7s C6q+C7q C6i+A6i",T);
        addNotes("D#4i+F#4i+C5i D#4q+F#4q+C5q D#4i+F#4i+C5i",B);
	
        measure(128);
	
        addNotes("C6i+G6i E5s+G5s E5s+G5s E5i+G5i E5i+G5i",T);
        addNotes("E4i+G4i+C5i",B);
        addRest("i",B);
        addRest("q",B);
	
        measure(129);
	
        addNotes("D5i+F5i C#5s+E5s",T);
        tie(D,T,"D5s","D5s");
        tie(A,T,"F5s","F5s");
        addNotes("C5s+E5s D5i+F5i",T);
        addNotes("F3i F4i+A4i A3i F4i+A4i",B);
	
        measure(130);
	
        addRest("s",T);
        addNotes("A5s F5s+D6s A5s C6s D6s C6s A5s",T);
        addNotes("F3i F4i+A4i A3i F4i+A4i",B);
	
        measure(131);
	
        addNotes("E5i+G5i D#5s+F#5s",T);
        tie(D,T,"E5s","E5s");
        tie(A,T,"G5s","G5s");
        addNotes("D5s+F5s E5i+G5i",T);
        addNotes("C4i E4i+G4i+C5i G3i E4i+G4i+C5i",B);
	
        measure(132);
	
        addRest("s",T);
        addNotes("C6s G5s+E6s C6s D6s E6s D6s C6s",T);
        addNotes("C4i E4i+G4i+C5i G3i E4i+G4i+C5i",B);

        measure(133);
        
        addNotes("A5s G#5s A5s",T);
        tie(D,T,"A5s","A5s");
        tie(A,T,"G6s","G6s");
        addNotes("A5i+F6i A5s+C6s",T);
        addNotes("F3i+F4i D3i+D4i E3i+E4i F3i+F4i",B);
	
        measure(134);
	
        addNotes("G5s+E6s D#6s E6s",T);
        tie(A,T,"A6s","A6s");
        addNotes("C7s G6s E6s",T);
        addNotes("G3i+G4i G4i+C5i+E5i F#4i+C#5i+D5i G4i+C5i+E5i",B);
	
        measure(135);
	
        addNotes("F#5i+C6i F#5i+C6i Fn5s+B5s+E6s F5i+B5i+D6i",T);
        addNotes("A3i+A4i D3i+D4i G3i+G4i B3i+B4i",B);
	
        measure(136);
	
        tie(D,T,"E5s","E5i");
        tie(D,T,"G5s","G5i");
        tie(A,T,"C6s","C6i");
        addNotes("E5s+G5s E5s+G5s E5i+G5i E5i+G5i",T);
        addNotes("C4i+C5i",B);
        addRest("i",B);
        addRest("q",B);
	
        measure(137);
	
        addNotes("D5i+F5i C#5s+E5s",T);
        tie(D,T,"D5s","D5s");
        tie(A,T,"F5s","F5s");
        addNotes("C5s+E5s D5i+F5i",T);
        addNotes("F3i F4i+A4i A3i F4i+A4i",B);
				
        measure(138);
				
        addRest("s",T);
        addNotes("A5s F5s+D6s A5s C6s D6s C6s A5s",T);
        addNotes("F3i F4i+A4i A3i F4i+A4i",B);

        measure(139);
				
        addNotes("E5i+G5i D#5s+F#5s",T);
        tie(D,T,"E5s","E5s");
        tie(A,T,"G5s","G5s");
        addNotes("D5s+F5s E5i+G5i",T);
        addNotes("C4i E4i+G4i+C5i G3i E4i+G4i+C5i",B);

        measure(140);
				
        addRest("s",T);
        addNotes("C6s G5s+E6s C6s D6s E6s D6s C6s",T);
        addNotes("C4i E4i+G4i+C5i G3i E4i+G4i+C5i",B);

        measure(141);
				
        addNotes("B5i+D6i A#5s+C#6s",T);
        tie(D,T,"B5s","B5s");
        tie(A,T,"D6s","D6s");
        addNotes("A5s+C6s B5i+D6i",T);
        addNotes("G3i F4i+G4i+B4i B3i F4i+G4i+B4i",B);
		
        measure(142);
				
        addRest("s",T);
        addNotes("F6s B5s+A6s F6s G6s A6s G6s F6s",T);
        addNotes("G3i F4i+G4i+B4i D4i F4i+G4i+B4i",B);
	
        measure(143);
				
        addNotes("C6s+C7s C6s+C7s C6q+C7q C6i+A6i",T);
        addNotes("D#4i+F#4i+C5i D#4q+F#4q+C5q D#4i+F#4i+C5i",B);
				
        measure(144);
				
        addNotes("C6i+G6i E5s+G5s E5s+G5s E5i+G5i E5i+G5i",T);
        addNotes("E4i+G4i+C5i",B);
        addRest("i",B);
        addRest("q",B);
				
        measure(145);
				
        addNotes("D5i+F5i C#5s+E5s",T);
        tie(D,T,"D5s","D5s");
        tie(A,T,"F5s","F5s");
        addNotes("C5s+E5s D5i+F5i",T);
        addNotes("F3i F4i+A4i A3i F4i+A4i",B);
				
        measure(146);
				
        addRest("s",T);
        addNotes("A5s F5s+D6s A5s C6s D6s C6s A5s",T);
        addNotes("F3i F4i+A4i A3i F4i+A4i",B);
				
        measure(147);
				
        addNotes("E5i+G5i D#5s+F#5s",T);
        tie(D,T,"E5s","E5s");
        tie(A,T,"G5s","G5s");
        addNotes("D5s+F5s E5i+G5i",T);
        addNotes("C4i E4i+G4i+C5i G3i E4i+G4i+C5i",B);
				
        measure(148);
				
        addRest("s",T);
        addNotes("C6s G5s+E6s C6s D6s E6s D6s C6s",T);
        addNotes("C4i E4i+G4i+C5i G3i E4i+G4i+C5i",B);

        measure(149);
				
        addNotes("A5s G#5s A5s",T);
        tie(D,T,"A5s","A5s");
        tie(A,T,"G6s","G6s");
        addNotes("A5i+F6i A5s+C6s",T);
        addNotes("F3i+F4i D3i+D4i E3i+E4i F3i+F4i",B);
				
        measure(150);
				
        addNotes("G5s+E6s D#6s E6s",T);
        tie(A,T,"A6s","A6s");
        addNotes("C7s G6s E6s",T);
        addNotes("G3i+G4i G4i+C5i+E5i F#4i+C#5i+D5i G4i+C#5i+E5i",B);

        measure(151);
				
        addNotes("F#5i+C6i F#5i+C6i Fn5s+B5s+E6s F5i+B5i+D6i E5s+G5s+C6s",T);
        addNotes("A3i+A4i D3i+D4i G3i+G4i B3i+B4i",B);

        measure(152);
	
        addNotes("E5q+G5q+C6q",T);
        addNotes("C6i+E6i+G6i+C7i",T);
        addRest("i",T);
        addNotes("C4i+C5i G3i+G4i C3i+C4i",B);
        addRest("i",B);
	}
	
	public static void main(String[] args) {
		new The_Entertainer().play();
	}

}
