package guitar;

public enum Builder {
	FENDER,MARTIN,ANY,GIBSON,COLLINGS;
	public String toString() {
		switch(this) {
		case FENDER:return "fender";
		case MARTIN:return "martin";
		case GIBSON:return "gibson";
		case ANY:return "any";
		case COLLINGS:return "collings";
		default: return "normal";
		}
	}
}
