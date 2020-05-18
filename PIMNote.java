package pimcmd;

public class PIMNote extends PIMEntity {

	String text;
	
	public void fromString(String s) {
		this.text = s;
	}
	public String toString() {
		String str = new String();
		str = "NOTE " + this.Priority + " " + this.text;
		return str;
	}
}
