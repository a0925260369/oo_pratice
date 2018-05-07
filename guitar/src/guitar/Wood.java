package guitar;

public enum Wood {
	MAPLE,CEDAR;
	public String toString() {
		switch(this) {
		case MAPLE:return "maple";
		case CEDAR:return "cedar";
		default: return "normal";
		}
	}
}
