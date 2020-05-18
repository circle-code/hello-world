package pimcmd;

public class PIMContact extends PIMEntity {

	String contact;
	
	public void fromString(String s) {
		this.contact = s;
	}
	public String toString() {
		String str = new String();
		str = "CONTACT " + this.Priority + " " + this.contact;
		return str;
	}
}
