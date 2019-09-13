package samples;

import songs.Song;

import static music.CreatingMusic.*;
import static music.Util.*;

public class ChopinNocturneOpus9Number2 extends Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		
		player.setTempoInBPM(320);
		
		key = "Eb";
		
		measure(1);
		
		addNote("B5i",A,T);
		addRest("i",B);
		
		measure(2);
		
		tie(A,T,"G6q.","G6i");
		addNotes("F6i G6i F6q. E6q B5i",T);
		addNotes("E3i G4i+E5i B4i+Ci+Ei E4i A4i+D5i Cb5i+D5i+A5i E3i G4i+E5i B4i+E5i+G5i E3i G4i+E5i B4i+E5i+G5i",B);
		
		

	}

}
