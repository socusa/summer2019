package music;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;

public class MyMetaEventListener implements MetaEventListener {

	@Override
	public void meta(MetaMessage meta) {
		// TODO Auto-generated method stub
		
		System.out.println(meta);
		
	}

}
