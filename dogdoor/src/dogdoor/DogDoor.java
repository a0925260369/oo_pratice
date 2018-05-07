package dogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
  private boolean open;
  public DogDoor() {
	  this.open=open;
  }
  public void open() {
	  System.out.println("狗門開啟。");
	  open=true;
	  final Timer timer=new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
  }
  public void close() {
	  System.out.println("狗門關閉");
	  open=false;
  }
  public boolean isOpen() {
	  return open;
  }
}
