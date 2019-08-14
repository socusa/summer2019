package music;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;

import static music.CreatingMusic.measureMonitor;

public class MyMetaEventListener implements MetaEventListener {

	@Override
	public void meta(MetaMessage meta) {
		// TODO Auto-generated method stub
		
		if (meta.getType() == 1) {
			byte[] bytes = meta.getData();
			
			System.out.println("Measure " + bytes[0]);
			
			measureMonitor.setMessage("Measure " + bytes[0]);
		}
	}

}
