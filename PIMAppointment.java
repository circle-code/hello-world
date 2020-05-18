package pimcmd;

public class PIMAppointment extends PIMEntity implements PIMdate{

	String date;
	String description;
	
	public void fromString(String s) {
		if(s.charAt(1) == '0' || s.charAt(1) == '1' || s.charAt(1) == '2' || s.charAt(1) == '3') {
			this.date = s;
		}
		else {
			this.description = s;
		}
	}
	public String toString() {
		String str = new String();
		str = "APPIONTMENT " + this.Priority + " " + this.date + " " + this.description;
		return str;
	}
}
