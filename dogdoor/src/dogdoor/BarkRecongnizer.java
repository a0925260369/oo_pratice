package dogdoor;

public class BarkRecongnizer {
	private DogDoor door;
	public BarkRecongnizer(DogDoor door) {
		this.door=door;
	}
	public void recognize(String bark) {
		System.out.println("吠聲感測器：聽到'"+bark+"'");
		door.open();
	}
}
