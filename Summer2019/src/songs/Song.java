package songs;

import static music.CreatingMusic.player;
import static music.CreatingMusic.track;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;

public abstract class Song {
	
	public abstract void measures();
	
	public void play() {
		try {			
            player = MidiSystem.getSequencer();
			
 		    player.open();
 		   
 		    Sequence sequence = new Sequence(Sequence.PPQ,4);
			
			track = sequence.createTrack();
			
			measures();
			
 		    player.setSequence(sequence);
			
			player.start();
			
			System.out.println(player.isRunning());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
