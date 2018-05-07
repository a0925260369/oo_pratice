package dogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {
	private DogDoor door;
	public Remote(DogDoor door) {
		this.door=door;
	}
	public void pressButton() {
		System.out.println("按下遙控器按鈕...");
		if(door.isOpen()) {
			door.close();
		}else {
			door.open();
		}
	}
}
