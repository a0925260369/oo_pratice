package guitar;

public enum Wood {
	MAPLE,CEDAR,INDIAN_ROSEWOOD,SITKA;
	public String toString() {
		switch(this) {
		case MAPLE:return "maple";
		case CEDAR:return "cedar";
		case INDIAN_ROSEWOOD:return "indian_rosewood";
		case SITKA:return "sitka";
		default: return "normal";
		}
	}
}
