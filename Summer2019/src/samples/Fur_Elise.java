package samples;

import static music.CreatingMusic.*;
import static music.Util.*;

import javax.sound.midi.Sequence;

import music.MyMetaEventListener;

public class Fur_Elise extends songs.Song {

	@Override
	public void measures() {		
		factor = 300;
			
		player.setTempoInBPM(120*300);

		key = "C";
		
		measure(1);
		
		addNotes("E6s D#6s",T);
		addRest("s",2,B);
		
		measure(2);
		
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
		measure(3);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(4);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s G#5s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);

		measure(5);
		
		addNote("C6i",A,T);
		addRest("s",T);
		addNotes("E5s E6s D#6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
				
		measure(6);
		
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
		measure(7);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
	
		measure(8);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s C6s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(9);
		
		addNote("A5q",A,T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
	
		measure(10);
					
		addNotes("E6s D#6s",T);
		addRest("s",2,B);
			
		measure(11);
					
	    addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
			
		measure(12);
					
	    addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(13);
					
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s G#5s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);

		measure(14);
					
	    addNote("C6i",A,T);
		addRest("s",T);
		addNotes("E5s E6s D#6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
				
		measure(15);
					
	    addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
		measure(16);
					
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(17);
					
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s C6s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
							
		measure(18);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("B5s C6s D6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
        
		measure(19);
		
		addNotes("E6i. G5s F6s E6s",T);
		addNotes("C4s G4s C5s",B);
		addRest("s",B);
		addRest("i",B);

		measure(20);
		
		addNotes("D6i. F5s E6s D6s",T);
		addNotes("G3s G4s B4s",B);
		addRest("s",B);
		addRest("i",B);
				
		measure(21);
		
		addNotes("C6i. E5s D6s C6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(22);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s E6s",T);
		addRest("s",T);
		addNotes("E3s E4s E5s",B);
		addRest("s",2,B);
		addNote("E5s",A,B);
		
		measure(23);
		
		addRest("s",T);
		addNotes("E6s E7s",T);
		addRest("s",2,T);
		addNote("D#6s",A,T);
		addNote("E6s",A,B);
		addRest("s",2,B);
		addNotes("D#6s E6s",B);
		addRest("s",B);
		
		measure(24);
		
		addNote("E6i",A,T);
		addRest("s",T);
		addNotes("D#6s E6s D6s",T);
		addRest("s",B);
		addNotes("D#6s E6s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(25);
		
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
		measure(26);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(27);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s G#5s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(28);
		
		addNote("C6i",A,T);
		addRest("s",T);
		addNotes("E5s E6s D#6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(29);
		
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
		measure(30);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(31);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s C6s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(32);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("B5s C6s D6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(33);
		
		addNotes("E6i. G5s F6s E6s",T);
		addNotes("C4s G4s C5s",B);
		addRest("s",B);
		addRest("i",B);

		measure(34);
					
		addNotes("D6i. F5s E6s D6s",T);
		addNotes("G3s G4s B4s",B);
		addRest("s",B);
		addRest("i",B);
							
		measure(35);
					
		addNotes("C6i. E5s D6s C6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
					
		measure(36);
					
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s E6s",T);
		addRest("s",T);
		addNotes("E3s E4s E5s",B);
		addRest("s",2,B);
		addNote("E5s",A,B);
					
		measure(37);
					
		addRest("s",T);
		addNotes("E6s E7s",T);
		addRest("s",2,T);
		addNote("D#6s",A,T);
		addNote("E6s",A,B);
		addRest("s",2,B);
		addNotes("D#6s E6s",B);
		addRest("s",B);
					
		measure(38);
					
		addNote("E6i",A,T);
		addRest("s",T);
		addNotes("D#6s E6s D6s",T);
		addRest("s",B);
		addNotes("D#6s E6s",B);
		addRest("s",B);
		addRest("i",B);
					
		measure(39);
					
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
					
		measure(40);
					
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
					
		measure(41);
					
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s G#5s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
					
		measure(42);
					
		addNote("C6i",A,T);
		addRest("s",T);
		addNotes("E5s E6s D#6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
					
		measure(43);
					
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
					
		measure(44);
					
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
					
		measure(45);
					
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s C6s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(46);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("E5s+C6s F5s+C6s E5s+G5s+C6s",T);
		addNotes("A3s E4s A4s Bb4s+C5s A4s+C5s G4s+B4s+C5s",B);
		
		measure(47);
		
		addNotes("C6q F6s. E6t",T);
		addNotes("F4s A4s C5s A4s C5s A4s",B);

		measure(48);
		
		addNotes("E6i D6i Bb6s. A6t",T);
		addNotes("F4s Bb4s D5s Bb4s D5s B4s",B);
		
		measure(49);
		
		addNotes("A6s G6s F6s E6s D6s C6s",T);
		addNotes("F4s E5s F4s+G4s+Bb4s E5s F4s+G4s+Bb4s E5s",B);
		
		measure(50);
		
		addNotes("Bb5i A5i A5t G5t A5t B5t",T);
		addNotes("F4s A4s C5s A4s C5s A4s",B);
		
		measure(51);
		
		addNotes("C6q D6s D#6s",T);
		addNotes("F4s A4s C5s A4s C5s A4s",B);
		
		measure(52);
		
		addNotes("E6i. E6s F6s A5s",T);
		addNotes("E4s A4s C5s A4s D4s+D5s F4s",B);
		
		measure(53);
		
		addNotes("C6q D6s. B5t",T);
		addNotes("G4s E5s G4s E5s G4s F4s",B);
		
		measure(54);
		
		addNotes("C6t G6t G5t G6t A5t G6t B5t G6t C6t G6t D6t G6t",T);
		addNotes("C5i+E5i",B);
		addRest("s",B);
		addNotes("F5s+G5s E5s+G5s D5s+F5s+G5s",B);

		measure(55);
		
		addNotes("E6t G6t C7t B6t A6t G6t F6t E6t D6t G6t F6t D6t",T);
		addNotes("C5i+E5i+G5i F4i+A4i G4i+B4i",B);
		
		measure(56);
		
		addNotes("C6t G6t G5t G6t A5t G6t B5t G6t C6t G6t D6t G6t",T);
		addNote("C5i",A,B);
		addRest("s",B);
		addNotes("F5s+G5s E5s+G5s D5s+F5s+G5s",B);
		
		measure(57);
		
		addNotes("E6t G6t C7t B6t A6t G6t F6t E6t D6t G6t F6t D6t",T);
		addNotes("C5i+E5i+G5i",B);
		addNotes("F4i+A4i G4i+B4i",B);
		
		measure(58);
		
		addNotes("E6t F6t E6t D#6t E6t B5t E6t D6t E6t B5t E6t D6t",T);
		addNotes("G#4i+B4i",B);
		addRest("i",2,B);
		
		measure(59);
		
		addNotes("E6i. B5s E6s D#6s",T);
		addRest("i",B);
		addRest("s",4,B);
		
		measure(60);
		
		addNotes("E6i. B5s E6s D#6s",T);
		addRest("i",B);
		addRest("s",4,B);
		
		measure(61);
		
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
		measure(62);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(63);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s G#5s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(64);
		
		addNote("C6i",A,T);
		addRest("s",T);
		addNotes("E5s E6s D#6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(65);
		
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
		measure(66);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(67);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s C6s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(68);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("B5s C6s D6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(69);
		
		addNotes("E6i. G5s F6s E6s",T);
		addNotes("E4s G4s C5s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(70);
		
		addNotes("D6i. F5s E6s D6s",T);
		addNotes("G3s G4s B4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(71);
		
		addNotes("C6i. E5s D6s C6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);

		measure(72);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s E6s",T);
		addRest("s",T);
		addNotes("E3s E4s E5s",B);
		addRest("s",2,B);
		addNote("E5s",A,B);
		
		measure(73);
		
		addRest("s",T);
		addNotes("E6s E7s",T);
		addRest("s",2,T);
		addNote("D#6s",A,T);
		addNote("E6s",A,B);
		addRest("s",2,B);
		addNotes("D#6s E6s",B);
		addRest("s",B);
		
		measure(74);
		
		addNote("E6s",A,T);
		addRest("s",2,T);
		addNotes("D#6s E6s D6s",T);
		addRest("s",B);
		addNotes("D#6s E6s",B);
		addRest("s",B);
		addRest("i",B);

		measure(75);
		
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
		measure(76);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s C6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(77);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s G#5s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);

		measure(78);
		
		addNote("C6i",A,T);
		addRest("s",T);
		addNotes("E5s E6s D#6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(79);
		
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
		measure(80);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(81);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s C6s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(82);
		
		addNote("A5i",A,T);
		addRest("i",2,T);
		addNotes("A3s A3s A3s A3s A3s A3s",B);
		
		measure(83);
		
		addNotes("E5q.+G5q.+Bb5q.+D#6q.",T);
		addNotes("A3s A3s A3s A3s A3s A3s",B);
		
		measure(84);
		
		addNotes("F5q+A5s+D6q C#6s+E6s D6s+F6s",T);
		addNotes("A3s A3s A3s A3s A3s A3s",B);
				
		measure(85);
		
		addNotes("G#5q+D6q+F6q D5i+D6i+F6i",T);
		addNotes("A3s A3s A3s A3s A3s A3s",B);
		
		measure(86);
		
		addNotes("A5q.+Cn6q.+E6q.",T);
		addNotes("A3s A3s A3s A3s A3s A3s",B);

		measure(87);
		
		addNotes("F5q+D6q E5s+C6s D5s+B5s",T);
		addNotes("D3s+A3s D3s+A3s D3s+A3s D3s+A3s D3s+A3s D3s+A3s",B);
		
		measure(88);
		
		addNotes("C5q+F#5q+A5q C5i+A5i",T);
		addNotes("D#3s+A3s D#3s+A3s D#3s+A3s D#3s+A3s D#3s+A3s D#3s+A3s",B);
		
		measure(89);
		
		addNotes("C5i+A5i E5i+C6i D5i+B5i",T);
		addNotes("E3s+A3s E3s+A3s E3s+A3s E3s+A3s E3s+G#3s E3s+G#3s",B);
		
		measure(90);
		
		addNotes("C5q.+A5q.",T);
		addNotes("A2s+A3s A3s A3s A3s A3s A3s",B);
		
		measure(91);
		
		addNotes("E5q.+G5q.+Bb5q.+C#6q.",T);
		addNotes("A3s A3s A3s A3s A3s A3s",B);
		
		measure(92);
		
		addNotes("F5q+A5q+D6q C#6s+E6s D6s+F6s",T);
		addNotes("A3s A3s A3s A3s A3s A3s",B);
		
		measure(93);
		
		addNotes("D6q+F6q D6i+F6i",T);
		addNotes("A3s A3s A3s A3s A3s A3s",B);
		
		measure(94);
		
		addNotes("D6q.+F6q.",T);
		addNotes("Bb3s Bb3s Bb3s Bb3s Bb3s Bb3s",B);
		
		measure(95);
		
		addNotes("G5q+Eb6q F5s+D6s Eb5s+C6s",T);
		addNotes("Bb3s Bb3s Bb3s Bb3s Bb3s Bb3s",B);
		
		measure(96);
		
		addNotes("D5q+F5q+B5q D5i+F5i+A5i",T);
		addNotes("Bb3s Bb3s Bb3s Bb3s Bb3s Bb3s",B);

		measure(97);
		
		addNotes("D5q+F#5q+G5q D5i+F5i+G5i",T);
		addNotes("Bn3s Bn3s Bn3s Bn3s Bn3s Bn3s",B);
		
		measure(98);
		
		addNotes("C5q+En5q+A5q",T);
		addRest("i",T);
		addNote("C4q",A,B);
		addRest("i",B);
		
		measure(99);
		
		addNotes("F5i+B5i",T);
		addRest("i",2,T);
		addNotes("C4i+G#4i",B);
		addRest("i",2,B);
		
		measure(100);
		
		tripletFactor = 2;
		
		addNotes("A4s C5s F5s",T);
		addNotes("A5s C6s E6s",T);
		addNotes("D6s C6s B5s",T);
		
		tripletFactor = 1;
		
		addNote("A2i",A,B);
		addRest("i",B);
		addNotes("A4i+C5i+E5i",B);
		
		measure(101);
		
		tripletFactor = 2;
		
		addNotes("A5s C6s E6s",T);
		addNotes("A6s C7s E7s",T);
		addNotes("D7s C7s B6s",T);
		
		tripletFactor = 1;
		
		addNotes("A4i+C5i+E5i",B);
		addRest("i",B);
		addNotes("A4i+C5i+E5i",B);
				
		measure(102);
		
		tripletFactor = 2;
		
		addNotes("A5s C6s E6s",T);
		addNotes("A6s C7s E7s",T);
		addNotes("D7s C7s B6s",T);
		
		tripletFactor = 1;
		
		addNotes("A4i+C5i+E5i",B);
		addRest("i",B);
		addNotes("A4i+C5i+E5i",B);
		
		measure(103);
		
		tripletFactor = 2;
		
		addNotes("Bb6s A6s G#6s",T);
		addNotes("Gn6s F#7s Fn7s",T);
		addNotes("E7s D#7s Dn7s",T);
		
		tripletFactor = 1;
		
		addNotes("A4i+C5i+E5i",B);
		addRest("i",2,B);
		
		measure(104);
		
		addNotes("C#7s Cn7s B6s Bb6s A6s G#6s Gn6s F#6s Fn6s",T);
		addRest("s",9,B);
		
		measure(105);
		
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
		measure(106);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(107);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s G#5s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(108);
		
		addNote("C6i",A,T);
		addRest("s",T);
		addNotes("E5s E6s D#6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(109);
		
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
	    measure(110);	
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(111);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s C6s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(112);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("B5s C6s D6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(113);
		
		addNotes("E6i. G5s F6s E6s",T);
		addNotes("C4s G4s C5s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(114);
		
		addNotes("D6i. F5s E6s D6s",T);
		addNotes("G3s G4s B4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(115);
		
		addNotes("C6i. E5s D6s C6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(116);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s E6s",T);
		addRest("s",T);
		addNotes("E3s E4s E5s",B);
		addRest("s",2,B);
		addNote("E5s",A,B);

		measure(117);
		
		addRest("s",T);
		addNotes("E6s E7s",T);
		addRest("s",2,T);
		addNote("D#6s",A,T);
		addNote("E6s",A,B);
		addRest("s",2,B);
		addNotes("D#6s E6s",B);
		addRest("s",B);
		
		measure(118);
		
		addNote("E6s",A,T);
		addRest("s",2,T);
		addNotes("D#6s E6s D#6s",T);
		addRest("s",B);
		addNotes("D#6s E6s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(119);
		
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
		measure(120);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(121);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s G#5s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(122);
		
		addNote("C6i",A,T);
		addRest("s",T);
		addNotes("E5s E6s D#6s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(123);
		
		addNotes("E6s D#6s E6s B5s Dn6s C6s",T);
		addRest("s",6,B);
		
		measure(124);
		
		addNote("A5i",A,T);
		addRest("s",T);
		addNotes("C5s E5s A5s",T);
		addNotes("A3s E4s A4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(125);
		
		addNote("B5i",A,T);
		addRest("s",T);
		addNotes("E5s C6s B5s",T);
		addNotes("E3s E4s G#4s",B);
		addRest("s",B);
		addRest("i",B);
		
		measure(126);
		
		addNote("A5i",A,T);
		addRest("i",T);
		addNotes("A2i+A3i",B);
		addRest("i",B);
	}

}
