package guitar;

public enum Builder {
	FENDER,MARTIN,ANY;
	public String toString() {
		switch(this) {
		case FENDER:return "fender";
		case MARTIN:return "martin";
		case ANY:return "any";
		default: return "normal";
		}
	}
}
