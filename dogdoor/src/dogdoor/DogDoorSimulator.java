package dogdoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogDoor door=new DogDoor();
		BarkRecongnizer recognizer=new BarkRecongnizer(door);
		Remote remote=new Remote(door);
		System.out.println("狗在叫");
		recognizer.recognize("汪");
		//remote.pressButton();
		System.out.println("狗跑出去了");
		System.out.println("狗事情做完了");
		try {
			Thread.currentThread().sleep(10000);
		}catch (InterruptedException e) {}
			System.out.println("狗依然在外面");
			System.out.println("狗開始叫");
			//System.out.println("所以我拿起了遙控器");
			//remote.pressButton();
			recognizer.recognize("汪");
			System.out.println("狗進來了");
		
	}

}
