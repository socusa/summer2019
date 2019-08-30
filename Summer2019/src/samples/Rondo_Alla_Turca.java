package samples;

import static music.CreatingMusic.*;
import static music.Util.*;

import javax.sound.midi.Sequence;



public class Rondo_Alla_Turca extends songs.Song {

	@Override
	public void measures() {		
	   player.setTempoInBPM(240);
		
       measure(1);
	
	   addNotes("B5s A5s G#5s A5s",T);
	   addRest("q",B);

       measure(2);
	
	   addNotes("C6i",T);
	   addRest("i",T);
	   addNotes("D6s C6s B5s C6s",T);
	   addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);

       measure(3);
	
	   addNotes("E6i",T);
	   addRest("i",T);
	   addNotes("F6s E6s D#6s E6s",T);
  	   addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);

       measure(4);
	
	   addNotes("B6s A6s G#6s A6s B6s A6s G6s A6s",T);
	   addNotes("A4i C5i+E5i A4i C5i+E5i",B);

       measure(5);
	
	   addNotes("C7q A6i C7i",T);
	   addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);

       measure(6);
	
	   addNotes("B6i F#6i+A6i E6i+G6i F6i+A6i",T);
	   addNotes("E4i B4i+E5i B4i+E5i B4i+E5i",B);
	
       measure(7);

	   addNotes("B6i F#6i+A6i E6i+G6i F6i+A6i",T);
	   addNotes("E4i B4i+E5i B4i+E5i B4i+E5i",B);
	
       measure(8);
	
	   addNotes("B6i F#6i+A6i E6i+G6i D#6i+F#6i",T);
	   addNotes("E4i B4i+E5i B3i B4i",B);

       measure(9);
	
	   addNote("E6q",A,T);
	   addNote("E4q",A,B);
	
       measure(10);
	
	   addNotes("B5s A5s G#5s A5s",T);
	   addRest("q",B);

       measure(11);
				
       addNotes("C6i",T);
       addRest("i",T);
	   addNotes("D6s C6s B5s C6s",T);
   	   addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);

       measure(12);
				
	   addNotes("E6i",T);
	   addRest("i",T);
	   addNotes("F6s E6s D#6s E6s",T);
	   addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);

       measure(13);
				
	   addNotes("B6s A6s G#6s A6s B6s A6s G6s A6s",T);
	   addNotes("A4i C5i+E5i A4i C5i+E5i",B);

       measure(14);
				
	   addNotes("C7q A6i C7i",T);
	   addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);

       measure(15);
				
	   addNotes("B6i F#6i+A6i E6i+G6i F6i+A6i",T);
	   addNotes("E4i B4i+E5i B4i+E5i B4i+E5i",B);
				
       measure(16);

	   addNotes("B6i F#6i+A6i E6i+G6i F6i+A6i",T);
  	   addNotes("E4i B4i+E5i B4i+E5i B4i+E5i",B);
				
       measure(17);
				
	   addNotes("B6i F#6i+A6i E6i+G6i D#6i+F#6i",T);
	   addNotes("E4i B4i+E5i B3i B4i",B);
			
       measure(18);
				
	   addNote("E6q",A,T);
	   addNote("E4q",A,B);
							
       measure(19);
							
	   addNotes("C6i+E6i Dn6i+Fn6i",T);
	   addRest("q",B);
	
       measure(20);
	
	   addNotes("E6i+G6i E6i+G6i A6s G6s F6s E6s",T);
	   addNotes("C4i C5i E4i E5i",B);
	
	   thirdVoiceTime = trebleTime;
	
       measure(21);
	
	   addNotes("B5i G5i C6i+E6i Dn6i+Fn6i",T);
	   addNote("G4q",A,B);
	   addRest("q",B);
	   addNote("D6q",A,T,T);
	
       measure(22);
	
	   addNotes("E6i+G6i E6i+G6i A6s G6s F6s E6s",T);
	   addNotes("C4i C5i E4i E5i",B);
	
       measure(23);
	
	   addNotes("B5q+D6q A5i+C6i B5i+D6i",T);
	   addNote("G4q",A,B);
	   addRest("q",B);
	
       measure(24);
	
	   addNotes("C6i+E6i C6i+E6i F6s E6s D6s C6s",T);
	   addNotes("A3i A4i C4i C5i",B);
	
	   thirdVoiceTime = trebleTime;
	
       measure(24);
	
	   addNotes("G#5i E5i A5i+C6i B5i+D6i",T);
	   addNote("E4q",A,B);
	   addRest("q",B);
	   addNote("B5q",A,T,T);
	
       measure(25);
	
	   addNotes("C6i+E6i C6i+E6i F6s E6s D6s C6s",T);
	   addNotes("A3i A4i C4i C5i",B);
	
       measure(26);
	
	   addNotes("G#5q+B5q B5s A5s G5s A5s",T);
	   addNote("E4q",A,B);
	   addRest("q",B);
	
       measure(27);
	
	   addNote("C6i",A,T);
	   addRest("i",T);
	   addNotes("D6s C6s B5s C6s",T);
	   addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);

       measure(28);
	
	   addNote("E6i",A,T);
	   addRest("i",T);
	   addNotes("F6s E6s D#6s E6s",T);
	   addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
	
       measure(29);
	
	   addNotes("B6s A6s G#6s A6s B6s A6s G6s A6s",T);
	   addNotes("A4i C5i+E5i A4i C5i+E5i",B);
	
       measure(30);
	
	   addNotes("C7q A6i B6i",T);
	   addNotes("F4i A4i+D#5i A4i+D#5i A4i+D#5i",B);
	
       measure(31);
	
	   addNotes("C7i B6i A6i G#6i",T);
	   addNotes("F4i A4i+E5i Dn4i F4i+B4i",B);
	
       measure(32);
	
	   addNotes("A6i E6i F6i D6i",T);
	   addNotes("C4i E4i+A4i D4i F4i+B4i",B);
	
       measure(33);
	
	   addNotes("C6q B5i. A5t B5t",T);
	   addNotes("E4i+A4i E4i+A4i E4i+G#4i E4i+G#4i",B);
	
       measure(34);
	
	   addNote("A5q",A,T);
	   addNotes("A3q+A4q",B);
	
       measure(35);
	
       addNotes("C6i+E6i Dn6i+Fn6i",T);
	   addRest("q",B);
				
       measure(36);
				
	   addNotes("E6i+G6i E6i+G6i A6s G6s F6s E6s",T);
	   addNotes("C4i C5i E4i E5i",B);
				
	   thirdVoiceTime = trebleTime;
				
       measure(37);
				
	   addNotes("B5i G5i C6i+E6i Dn6i+Fn6i",T);
	   addNote("G4q",A,B);
	   addRest("q",B);
	   addNote("D6q",A,T,T);
				
       measure(38);
				
	   addNotes("E6i+G6i E6i+G6i A6s G6s F6s E6s",T);
	   addNotes("C4i C5i E4i E5i",B);
				
       measure(39);
				
	   addNotes("B5q+D6q A5i+C6i B5i+D6i",T);
       addNote("G4q",A,B);
	   addRest("q",B);
				
       measure(40);
				
	   addNotes("C6i+E6i C6i+E6i F6s E6s D6s C6s",T);
	   addNotes("A3i A4i C4i C5i",B);
				
	   thirdVoiceTime = trebleTime;
				
       measure(41);
				
	   addNotes("G#5i E5i A5i+C6i B5i+D6i",T);
	   addNote("E4q",A,B);
	   addRest("q",B);
	   addNote("B5q",A,T,T);
				
       measure(42);
				
	   addNotes("C6i+E6i C6i+E6i F6s E6s D6s C6s",T);
	   addNotes("A3i A4i C4i C5i",B);
				
       measure(43);
				
	   addNotes("G#5q+B5q B5s A5s G5s A5s",T);
	   addNote("E4q",A,B);
	   addRest("q",B);
				
       measure(44);
				
	   addNote("C6i",A,T);
	   addRest("i",T);
	   addNotes("D6s C6s B5s C6s",T);
	   addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);

       measure(45);
				
	   addNote("E6i",A,T);
	   addRest("i",T);
	   addNotes("F6s E6s D#6s E6s",T);
	   addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
				
       measure(46);
				
	   addNotes("B6s A6s G#6s A6s B6s A6s G6s A6s",T);
	   addNotes("A4i C5i+E5i A4i C5i+E5i",B);
				
       measure(47);
				
	   addNotes("C7q A6i B6i",T);
	   addNotes("F4i A4i+D#5i A4i+D#5i A4i+D#5i",B);
				
       measure(48);
				
	   addNotes("C7i B6i A6i G#6i",T);
	   addNotes("F4i A4i+E5i Dn4i F4i+B4i",B);
				
       measure(49);
				
	   addNotes("A6i E6i F6i D6i",T);
	   addNotes("C4i E4i+A4i D4i F4i+B4i",B);
				
       measure(50);
				
	   addNotes("C6q B5i. A5t B5t",T);
	   addNotes("E4i+A4i E4i+A4i E4i+G#4i E4i+G#4i",B);
				
       measure(51);
				
	   addNote("A5q",A,T);
	   addNotes("A3q+A4q",B);
	
       key = "A";
    
       measure(52);
    
       addNotes("A5i+A6i B5i+B6i",T);
       addRest("q",B);
    
       measure(53);
    
       addNotes("C6q+C7q A5i+A6i B5i+B6i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(54);
    
       addNotes("C6i+C7i B5i+B5i A5i+A6i G5i+G6i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(55);
    
       addNotes("F5i+F6i G5i+G6i A5i+A6i B5i+B6i",T);
       addNotes("D4i D4i D#4i D#4i",B);
	
       measure(56);
    
       addNotes("G5i+G6i E5i+E6i A5i+A6i B5i+B6i",T);
       addNotes("E4i E4i E4i E4i",B);
    
       measure(57);
    
       addNotes("C6q+C7q A5i+A6i B5i+B6i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(58);
    
       addNotes("C6i+C7i B5i+B6i A5i+A6i G5i+G6i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(59);
    
       addNotes("F5i+F5i B5i+B6i G5i+G6i E5i+E6i",T);
       addNotes("D4i D4i E4i E4i",B);
    
       measure(60);
    
       addNotes("A5q+A6q",T);
       addNote("A3q",A,B);
    
       measure(61);
	
       addNote("A5q",A,T);
 	   addNotes("A3q+A4q",B);
 			
       key = "A";
             
       measure(62);
             
       addNotes("A5i+A6i B5i+B6i",T);
       addRest("q",B);
             
       measure(63);
             
       addNotes("C6q+C7q A5i+A6i B5i+B6i",T);
       addNotes("A4i A4i A4i A4i",B);
             
       measure(64);
             
       addNotes("C6i+C7i B5i+B5i A5i+A6i G5i+G6i",T);
       addNotes("A4i A4i A4i A4i",B);
             
       measure(65);
             
       addNotes("F5i+F6i G5i+G6i A5i+A6i B5i+B6i",T);
       addNotes("D4i D4i D#4i D#4i",B);
 			
       measure(66);
             
       addNotes("G5i+G6i E5i+E6i A5i+A6i B5i+B6i",T);
       addNotes("E4i E4i E4i E4i",B);
             
       measure(67);
             
       addNotes("C6q+C7q A5i+A6i B5i+B6i",T);
       addNotes("A4i A4i A4i A4i",B);
             
       measure(68);
             
       addNotes("C6i+C7i B5i+B6i A5i+A6i G5i+G6i",T);
       addNotes("A4i A4i A4i A4i",B);
             
       measure(69);
             
       addNotes("F5i+F5i B5i+B6i G5i+G6i E5i+E6i",T);
       addNotes("D4i D4i E4i E4i",B);
             
       measure(70);
             
       addNotes("A5q+A6q",T);
       addNote("A3q",A,B);
    
       measure(71);
    
       addNotes("C7s D7s C7s B6s",T);
       addRest("q",B);
    
       measure(72);
    
       addNotes("A6s B6s A6s G6s F6s A6s G6s F6s",T);
       addNotes("F4i A4i+C5i A4i+C5i A4i+C5i",B);
    
       measure(73);
    
       addNotes("E#6s F6s G6s E6s C6s D#6s E6s C6s",T);
       addNotes("G4i B4i+C5i B4i+C5i B4i+C5i",B);
    
       measure(74);
    
       addNotes("F6s E#6s F6s G6s A6s G6s A6s B6s",T);
       addNotes("F4i A4i+C5i A4i+C5i A4i+C5i",B);
    
       measure(75);
       
       addNotes("C7s B#6s C7s B6s C7s D7s C7s Bn6s",T);
       addNotes("E#4i G4i+C5i G4i+C5i G4i+C5i",B);
    
       measure(76);
    
       addNotes("A6s B6s A6s G6s F6s A6s G6s F6s",T);
       addNotes("F4i A4i+C5i A4i+C5i A4i+C5i",B);
    
       measure(77);
    
       addNotes("En6s F6s G6s E6s C6s D#6s E6s C6s",T);
       addNotes("G4i C5i+En5i C5i+En5i C5i+En5i",B);
    
       measure(78);
    
       addNotes("D#6s E6s F6s D#6s B#5s C6s D#6s B5s",T);
       addNotes("G4i D#5i+F5i D#5i+F5i D#5i+F5i",B);
    
       measure(79);
    
       addNote("C6q",A,T);
       addNotes("C5q+E5q",B);

       measure(80);
    
       addNotes("C7s D7s C7s B6s",T);
       addRest("q",B);
    
       measure(81);
    
       addNotes("A6s B6s A6s G6s F6s A6s G6s F6s",T);
       addNotes("F4i A4i+C5i A4i+C5i A4i+C5i",B);
    
       measure(82);
    
       addNotes("E#6s F6s G6s E6s C6s D#6s E6s C6s",T);
       addNotes("G4i B4i+C5i B4i+C5i B4i+C5i",B);
    
       measure(83);
    
       addNotes("F6s E#6s F6s G6s A6s G6s A6s B6s",T);
       addNotes("F4i A4i+C5i A4i+C5i A4i+C5i",B);
    
       measure(84);
    
       addNotes("C7s B#6s C7s B6s C7s D7s C7s Bn6s",T);
       addNotes("E#4i G4i+C5i G4i+C5i G4i+C5i",B);
    
       measure(85);
    
       addNotes("A6s B6s A6s G6s F6s A6s G6s F6s",T);
       addNotes("F4i A4i+C5i A4i+C5i A4i+C5i",B);
    
       measure(86);
    
       addNotes("En6s F6s G6s E6s C6s D#6s E6s C6s",T);
       addNotes("G4i C5i+En5i C5i+En5i C5i+En5i",B);
    
       measure(87);
    
       addNotes("D#6s E6s F6s D#6s B#5s C6s D#6s B5s",T);
       addNotes("G4i D#5i+F5i D#5i+F5i D#5i+F5i",B);
    
       measure(88);
    
       addNote("C6q",A,T);
       addNotes("C5q+E5q",B);
    
       measure(89);
    
       addNotes("E6s Dn6s C6s Bn5s",T);
       addRest("q",B);
    
       measure(90);
    
       addNotes("A5s B5s C6s D6s E6s F6s G6s A6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(91);
    
       addNotes("A6s G6s F6s E6s E6s D6s C6s B5s",T);
       addNotes("B4i D5i+E5i G4i D5i+E5i",B);
    
       measure(92);
    
       addNotes("A5s B5s C6s D6s E6s F6s G6s A6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(93);
    
       addNotes("A#6i B6i E6s D6s C6s B5s",T);
       addNotes("E4i G4i+D5i G4i+D5i G4i+D5i",B);
    
       measure(94);
    
       addNotes("A5s B5s C6s D6s E6s F6s G6s A6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(95);
    
       addNotes("A6s G6s F6s E6s E6s D6s C6s B5s",T);
       addNotes("B4i D5i+E5i G4i D5i+E5i",B);
    
       measure(96);
    
       addNotes("C6s E6s A5s C6s B5s D6s G5s B5s",T);
       addNotes("A4i F4i D4i E4i",B);
    
       measure(97);
    
       addNotes("A5q C7s D7s C7s B6s",T);
       addNotes("A3i A4i",B);
       addRest("q",B);
    
       measure(98);
    
       addNotes("A6s B6s A6s G6s F6s A6s G6s F6s",T);
       addNotes("F4i A4i+C5i A4i+C5i A4i+C5i",B);
    
       measure(99);
    
       addNotes("E#6s F6s G6s E#6s C6s D#6s E6s C6s",T);
       addNotes("G4i B4i+C5i B4i+C5i B4i+C5i",B);
    
       measure(100);
    
       addNotes("F6s E#6s F6s G6s A6s G6s A6s B6s",T);
       addNotes("F4i A4i+C5i A4i+C5i A4i+C5i",B);
    
       measure(101);
    
       addNotes("C7s B#6s C7s B6s C7s B6s C7s A#6s",T);
       addNotes("C4i G4i+C5i Gn4i+C5i F4i+C5i",B);
    
       measure(102);
    
       addNotes("D7s C7s D7s C7s D7s C7s D7s C7s",T);
       addNotes("B3i F4i+B4i F4i+B4i F4i+B4i",B);
    
       measure(103);
    
       addNotes("D7s C7s B6s A6s G6s A6s B6s G6s",T);
       addNotes("B3i G#4i+B4i G#4i+B4i G#4i+B4i",B);
    
       measure(104);
    
       addNotes("A6s B6s C7s F6s E#6s F6s G6s E6s",T);
       addNotes("C4i F4i+A4i C4i G4i+B4i",B);
    
       measure(105);
    
       addNote("F6q",A,T);
       addNotes("F4q+A4q",B);

       measure(106);
    
       addNotes("E6s Dn6s C6s Bn5s",T);
       addRest("q",B);
    
       measure(107);
    
       addNotes("A5s B5s C6s D6s E6s F6s G6s A6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(108);
    
       addNotes("A6s G6s F6s E6s E6s D6s C6s B5s",T);
       addNotes("B4i D5i+E5i G4i D5i+E5i",B);
    
       measure(109);
    
       addNotes("A5s B5s C6s D6s E6s F6s G6s A6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(110);
    
       addNotes("A#6i B6i E6s D6s C6s B5s",T);
       addNotes("E4i G4i+D5i G4i+D5i G4i+D5i",B);
    
       measure(111);
    
       addNotes("A5s B5s C6s D6s E6s F6s G6s A6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(112);
    
       addNotes("A6s G6s F6s E6s E6s D6s C6s B5s",T);
       addNotes("B4i D5i+E5i G4i D5i+E5i",B);
    
       measure(113);
    
       addNotes("C6s E6s A5s C6s B5s D6s G5s B5s",T);
       addNotes("A4i F4i D4i E4i",B);
    
       measure(114);
    
       addNotes("A5q C7s D7s C7s B6s",T);
       addNotes("A3i A4i",B);
       addRest("q",B);
    
       measure(115);
    
       addNotes("A6s B6s A6s G6s F6s A6s G6s F6s",T);
       addNotes("F4i A4i+C5i A4i+C5i A4i+C5i",B);
    
       measure(116);
    
       addNotes("E#6s F6s G6s E#6s C6s D#6s E6s C6s",T);
       addNotes("G4i B4i+C5i B4i+C5i B4i+C5i",B);
    
       measure(117);
    
       addNotes("F6s E#6s F6s G6s A6s G6s A6s B6s",T);
       addNotes("F4i A4i+C5i A4i+C5i A4i+C5i",B);
    
       measure(118);
    
       addNotes("C7s B#6s C7s B6s C7s B6s C7s A#6s",T);
       addNotes("C4i G4i+C5i Gn4i+C5i F4i+C5i",B);
    
       measure(119);
    
       addNotes("D7s C7s D7s C7s D7s C7s D7s C7s",T);
       addNotes("B3i F4i+B4i F4i+B4i F4i+B4i",B);
    
       measure(120);
    
       addNotes("D7s C7s B6s A6s G6s A6s B6s G6s",T);
       addNotes("B3i G#4i+B4i G#4i+B4i G#4i+B4i",B);
    
       measure(121);
    
       addNotes("A6s B6s C7s F6s E#6s F6s G6s E6s",T);
       addNotes("C4i F4i+A4i C4i G4i+B4i",B);
    
       measure(122);
    
       addNote("F6q",A,T);
       addNotes("F4q+A4q",B);
    
       measure(123);
    
       addNotes("A5i+A6i B5i+B6i",T);
       addRest("q",B);
    
       measure(124);
    
       addNotes("C6q+C7q A5i+A6i B5i+B6i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(125);
    
       addNotes("C6i+C7i B5i+B6i A5i+A6i G5i+G6i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(126);
    
       addNotes("F5i+F6i G5i+G6i A5i+A6i B5i+B6i",T);
       addNotes("D4i D4i D#4i D#4i",B);
    
       measure(127);
    
       addNotes("G5i+G6i E5i+E6i A5i+A6i B5i+B6i",T);
       addNotes("E4i E4i E4i E4i",B);
    
       measure(128);
    
       addNotes("C6q+C7q A5i+A6i B5i+B6i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(129);
    
       addNotes("C6i+C7i B5i+B6i A5i+A6i G5i+G6i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(130);
    
       addNotes("F5i+F6i B5i+B6i G5i+G6i E5i+E6i",T);
       addNotes("D4i D4i E4i E4i",B);
    
       measure(131);
    
       addNotes("A5q+A6q",T);
       addNote("A3q",A,B);
    
       measure(132);
    
       addNotes("A5i+A6i B5i+B6i",T);
       addRest("q",B);
    
       measure(133);
    
       addNotes("C6q+C7q A5i+A6i B5i+B6i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(134);
    
       addNotes("C6i+C7i B5i+B6i A5i+A6i G5i+G6i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(135);
    
       addNotes("F5i+F6i G5i+G6i A5i+A6i B5i+B6i",T);
       addNotes("D4i D4i D#4i D#4i",B);
    
       measure(136);
    
       addNotes("G5i+G6i E5i+E6i A5i+A6i B5i+B6i",T);
       addNotes("E4i E4i E4i E4i",B);
    
       measure(137);
    
       addNotes("C6q+C7q A5i+A6i B5i+B6i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(138);
    
       addNotes("C6i+C7i B5i+B6i A5i+A6i G5i+G6i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(139);
    
       addNotes("F5i+F6i B5i+B6i G5i+G6i E5i+E6i",T);
       addNotes("D4i D4i E4i E4i",B);
    
       measure(140);
    
       addNotes("A5q+A6q",T);
       addNote("A3q",A,B);
    
       key = "C";
    
       measure(141);
    
       addNotes("B5s A5s G#5s A5s",T);
       addRest("q",B);
    
       measure(142);
    
       addNote("C6i",A,T);
       addRest("i",T);
       addNotes("D6s C6s B5s C6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(143);
    
       addNote("E6i",A,T);
       addRest("i",T);
       addNotes("F6s E6s D#6s E6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(144);
    
       addNotes("B6s A6s G#6s A6s B6s A6s G6s A6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(145);
    
       addNotes("C7q A6i C7i",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(146);
    
       addNotes("B6i F#6i+A6i E6i+G6i F6i+A6i",T);
       addNotes("E4i B4i+E5i B4i+E5i B4i+E5i",B);
    
       measure(147);
    
       addNotes("B6i F#6i+A6i E6i+G6i F6i+A6i",T);
       addNotes("E4i B4i+E5i B4i+E5i B4i+E5i",B);
    
       measure(148);
    
       addNotes("B6i F#6i+A6i E6i+G6i D#6i+F6i",T);
       addNotes("E4i B4i+E5i B3i B4i",B);
    
       measure(149);
    
       addNote("E6q",A,T);
       addNote("E4q",A,B);
    
       measure(150);
    
       addNotes("B5s A5s G#5s A5s",T);
       addRest("q",B);
    
       measure(151);
    
       addNote("C6i",A,T);
       addRest("i",T);
       addNotes("D6s C6s B5s C6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(152);
    
       addNote("E6i",A,T);
       addRest("i",T);
       addNotes("F6s E6s D#6s E6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(153);
    
       addNotes("B6s A6s G#6s A6s B6s A6s G6s A6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(154);
    
       addNotes("C7q A6i C7i",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);
    
       measure(155);
    
       addNotes("B6i F#6i+A6i E6i+G6i F6i+A6i",T);
       addNotes("E4i B4i+E5i B4i+E5i B4i+E5i",B);
    
       measure(156);
    
       addNotes("B6i F#6i+A6i E6i+G6i F6i+A6i",T);
       addNotes("E4i B4i+E5i B4i+E5i B4i+E5i",B);
    
       measure(157);
    
       addNotes("B6i F#6i+A6i E6i+G6i D#6i+F6i",T);
       addNotes("E4i B4i+E5i B3i B4i",B);
    
       measure(158);
    
       addNote("E6q",A,T);
       addNote("E4q",A,B);
    
       measure(159);
    
       addNotes("C6i+E6i Dn6i+Fn6i",T);
       addRest("q",B);
    
       measure(160);
    
       addNotes("E6i+G6i E6i+G6i A6s G6s F6s E6s",T);
       addNotes("C4i C5i E4i E5i",B);

       thirdVoiceTime = trebleTime;
    
       measure(161);
    
       addNotes("B5i G5i C6i+E6i Dn6i+Fn6i",T);
       addNote("G4q",A,B);
       addRest("q",B);
       addNote("D6q",A,T,T);
    
       measure(162);
    
       addNotes("E6i+G6i E6i+G6i A6s G6s F6s E6s",T);
       addNotes("C4i C5i E4i E5i",B);
    
       measure(163);
    
       addNotes("B5q+D6q A5i+C6i B5i+D6i",T);
       addNote("G4q",A,B);
       addRest("q",B);
    
       measure(164);
    
       addNotes("C6i+E6i D6i+E6i F6s E6s D6s C6s",T);
       addNotes("A3i A4i C4i C5i",B);
    
       thirdVoiceTime = trebleTime;
    
       measure(165);
    
       addNotes("G#5i E5i A5i+C6i B5i+D6i",T);
       addNote("E4q",A,B);
       addRest("q",B);
       addNote("B5q",A,T,T);
    
       measure(166);
    
       addNotes("C6i+E6i C6i+E6i F6s E6s D6s C6s",T);
       addNotes("A3i A4i C4i C5i",B);
    
       measure(167);
    
       addNotes("G#5q+B5q B5s A5s G5s A5s",T);
       addNote("E4q",A,B);
       addRest("q",B);
    
       measure(168);
    
       addNote("C6i",A,T);
       addRest("i",T);
       addNotes("D6s C6s B5s C6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);

       measure(169);
    
       addNote("E6i",A,T);
       addRest("i",T);
       addNotes("F6s E6s D#6s E6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);

       measure(170);
    
       addNotes("B6s A6s G#6s A6s B6s A6s G6s A6s",T);
       addNotes("A4i C5i+E5i A4i C5i+E5i",B);

       measure(171);
    
       addNotes("C7q A6i B6i",T);
       addNotes("F4i A4i+D#5i A4i+D#5i A4i+D#5i",B);

       measure(172);
    
       addNotes("C7i B6i A6i G#6i",T);
       addNotes("E4i A4i+E5i Dn4i F4i+B4i",B);

       measure(173);
    
       addNotes("A6i E6i F6i D6i",T);
       addNotes("C4i E4i+A4i D4i F4i+B4i",B);

       measure(174);
    
       addNotes("C6q B5i. A5t B5t",T);
       addNotes("E4i+A4i E4i+A4i E4i+G#4i E4i+G#4i",B);

       measure(175);
    
       addNote("A5q",A,T);
       addNotes("A3q+A4q",B);
    
       measure(176);
    
       addNotes("C6i+E6i Dn6i+Fn6i",T);
       addRest("q",B);
    
       measure(177);
    
       addNotes("E6i+G6i E6i+G6i A6s G6s F6s E6s",T);
       addNotes("C4i C5i E4i E5i",B);

       thirdVoiceTime = trebleTime;
    
       measure(178);
    
       addNotes("B5i G5i C6i+E6i Dn6i+Fn6i",T);
       addNote("G4q",A,B);
       addRest("q",B);
       addNote("D6q",A,T,T);
    
       measure(179);
    
       addNotes("E6i+G6i E6i+G6i A6s G6s F6s E6s",T);
       addNotes("C4i C5i E4i E5i",B);
    
       measure(180);
    
       addNotes("B5q+D6q A5i+C6i B5i+D6i",T);
       addNote("G4q",A,B);
       addRest("q",B);
    
       measure(181);
    
       addNotes("C6i+E6i D6i+E6i F6s E6s D6s C6s",T);
       addNotes("A3i A4i C4i C5i",B);
    
       thirdVoiceTime = trebleTime;
    
       measure(182);
    
       addNotes("G#5i E5i A5i+C6i B5i+D6i",T);
       addNote("E4q",A,B);
       addRest("q",B);
       addNote("B5q",A,T,T);
    
       measure(183);
    
       addNotes("C6i+E6i C6i+E6i F6s E6s D6s C6s",T);
       addNotes("A3i A4i C4i C5i",B);
    
       measure(184);
    
       addNotes("G#5q+B5q B5s A5s G5s A5s",T);
       addNote("E4q",A,B);
       addRest("q",B);
    
       measure(185);
    
       addNote("C6i",A,T);
       addRest("i",T);
       addNotes("D6s C6s B5s C6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);

       measure(186);
    
       addNote("E6i",A,T);
       addRest("i",T);
       addNotes("F6s E6s D#6s E6s",T);
       addNotes("A4i C5i+E5i C5i+E5i C5i+E5i",B);

       measure(187);
    
       addNotes("B6s A6s G#6s A6s B6s A6s G6s A6s",T);
       addNotes("A4i C5i+E5i A4i C5i+E5i",B);

       measure(188);
    
       addNotes("C7q A6i B6i",T);
       addNotes("F4i A4i+D#5i A4i+D#5i A4i+D#5i",B);

       measure(189);
    
       addNotes("C7i B6i A6i G#6i",T);
       addNotes("E4i A4i+E5i Dn4i F4i+B4i",B);

       measure(190);
    
       addNotes("A6i E6i F6i D6i",T);
       addNotes("C4i E4i+A4i D4i F4i+B4i",B);

       measure(191);
    
       addNotes("C6q B5i. A5t B5t",T);
       addNotes("E4i+A4i E4i+A4i E4i+G#4i E4i+G#4i",B);

       measure(192);
    
       addNote("A5q",A,T);
       addNotes("A3q+A4q",B);
    
       key = "A";
    
       measure(193);
    
       addNotes("A5s A6s B5s B6s",T);
       addRest("q",B);

       measure(194);
    
       addNotes("C6s C7s",T);
       addRest("i",T);
       addNotes("A5s A6s B5s B6s",T);
       addNotes("A4i A4i A4i A4i",B);

       measure(195);
    
       addNotes("C6s C7s B5s B6s A5s A6s G5s G6s",T);
       addNotes("A4i A4i A4i A4i",B);

       measure(196);
    
       addNotes("F5s F6s G5s G6s A5s A6s B5s B6s",T);
       addNotes("D4i D4i D#4i D#4i",B);

       measure(197);
    
       addNotes("G5s G6s E5s E6s A5s A6s B5s B6s",T);
       addNotes("E4i E4i E4i E4i",B);

       measure(198);
    
       addNotes("C6s C7s",T);
       addRest("i",T);
       addNotes("A5s A6s B5s B6s",T);
       addNotes("A4i A4i A4i A4i",B);

       measure(199);
    
       addNotes("C6s C7s B5s B6s A5s A6s G5s G6s",T);
       addNotes("A4i A4i A4i A4i",B);

       measure(200);
    
       addNotes("F5s F6s B5s B6s G5s G6s E5s E6s",T);
       addNotes("D4i D4i E4i E4i",B);

       measure(201);
    
       addNotes("A5q+A6q",T);
       addNote("A3q",A,B);
    
       measure(202);
    
       addNotes("A5s A6s B5s B6s",T);
       addRest("q",B);

       measure(203);
    
       addNotes("C6s C7s",T);
       addRest("i",T);
       addNotes("A5s A6s B5s B6s",T);
       addNotes("A4i A4i A4i A4i",B);

       measure(204);
    
       addNotes("C6s C7s B5s B6s A5s A6s G5s G6s",T);
       addNotes("A4i A4i A4i A4i",B);

       measure(205);
    
       addNotes("F5s F6s G5s G6s A5s A6s B5s B6s",T);
       addNotes("D4i D4i D#4i D#4i",B);

       measure(206);
    
       addNotes("G5s G6s E5s E6s A5s A6s B5s B6s",T);
       addNotes("E4i E4i E4i E4i",B);

       measure(207);
    
       addNotes("C6s C7s",T);
       addRest("i",T);
       addNotes("A5s A6s B5s B6s",T);
       addNotes("A4i A4i A4i A4i",B);

       measure(208);
    
       addNotes("C6s C7s B5s B6s A5s A6s G5s G6s",T);
       addNotes("A4i A4i A4i A4i",B);

       measure(209);
    
       addNotes("F5s F6s B5s B6s G5s G6s E5s E6s",T);
       addNotes("D4i D4i E4i E4i",B);
    
       thirdVoiceTime = trebleTime;
    
       measure(210);
    
       addNotes("A5q+A6q C7i. C7s",T);
       addNotes("A4i A4i A4i A4i",B);
       addRest("q",T,T);
       addNote("C6q",A,T,T);

       thirdVoiceTime = trebleTime;
    
       measure(211);
    
       addNotes("C6q+E6q+A6q",T);
       addRest("q",T);
       addNotes("A4i A4i A4i A4i",B);
       addNote("C7h",A,T,T);

       thirdVoiceTime = trebleTime;
    
       measure(212);
    
       addNotes("C6q+E6q+A6q",T);
       addRest("q",T);
       addNotes("A4i A4i A4i A4i",B);
       addNote("C7h",A,T,T);

       measure(213);
    
       addNotes("D7s C7s B6s C7s D7s C7s B6s C7s",T);
       addNotes("A4i A4i A4i A4i",B);

       measure(214);
    
       addNotes("F6h+A6h+D7h",T);
       addNotes("D4i D4i D4i D4i",B);

       measure(215);
    
       addNotes("E6i+A6i+C7i E6i+A6i+C7i E6i+A6i+C7i E6i+A6i+C7i",T);
       addNotes("A4i A4i A4i A4i",B);
    
       thirdVoiceTime = trebleTime;
    
       measure(216);
    
       addNotes("B6q. E7i",T);
       addNotes("E4i E4i E4i E4i",B);
       addNotes("E6h+B6h",T,T);

       thirdVoiceTime = trebleTime;
    
       measure(217);
    
       addNotes("C6q+E6q+A6q",T);
       addRest("q",T);
       addNotes("A4i A4i A4i A4i",B);
       addNote("C7h",A,T,T);
	  
       thirdVoiceTime = trebleTime;
    
       measure(218);
    
       addNotes("C6q+E6q+A6q",T);
       addRest("q",T);
       addNotes("A4i A4i A4i A4i",B);
       addNote("C7h",A,T,T);
    
       measure(219);
    
       addNotes("D7s C7s B6s C7s D7s C7s B6s C7s",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(220);
    
       addNotes("F6h+A6h+D7h",T);
       addNotes("D4i D4i D4i D4i",B);
    
       measure(221);
    
       addNotes("E6h+A6h+C7h",T);
       addNotes("A4i A4i A4i A4i",B);
    
       measure(222);
    
       addNotes("E6i+G6i+B6i E6i+G6i+B6i E6i+G6i+B6i E6i+G6i+B6i",T);
       addNotes("E4i E4i E4i E4i",B);
    
       measure(223);
    
       addNotes("A6q C7i. C7s",T);
       addNotes("A4s E5s C5s E5s A4s E5s C5s E5s",B);
    
       measure(224);
    
       addNote("C7h",A,T);
       addNotes("A4s E5s C5s E5s A4s E5s C5s E5s",B);
    
       measure(225);
    
       addNote("C7h",A,T);
       addNotes("A4s E5s C5s E5s A4s E5s C5s E5s",B);
    
       measure(226);
    
       addNotes("D7s C7s B6s C7s D7s C7s B6s C7s",T);
       addNotes("A4s E5s C5s E5s A4s E5s C5s E5s",B);
    
       measure(227);
    
       addNote("D7h",A,T);
       addNotes("A4s F5s D5s F5s A4s F5s D5s F5s",B);
    
       measure(228);
    
       addNotes("C7i C7i C7i C7i",T);
       addNotes("A4s E5s C5s E5s A4s E5s C5s E5s",B);
    
       measure(229);
    
       addNotes("B6q E7i",T);
       addRest("q",T);
       addNotes("E4s E5s G4s E5s E4s E5s G4s E5s",B);
    
       thirdVoiceTime = trebleTime;
    
       measure(230);
    
       addNotes("C6q+E6q+A6q",T);
       addNotes("A4i A4i A4i A4i",B);
       addNote("C7h",A,T,T);
	}

}
