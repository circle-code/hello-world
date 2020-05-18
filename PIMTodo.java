package pimcmd;

public class PIMTodo extends PIMEntity implements PIMdate{

	String date;
	String text;
	
	public void fromString(String s) {
		if(s.charAt(1) == '0' || s.charAt(1) == '1' || s.charAt(1) == '2' || s.charAt(1) == '3') {
			this.date = s;
		}
		else {
			this.text = s;
		}
	}
	public String toString() {
		String str = new String();
		str = "TODO " + this.Priority + " " + this.date + " " + this.text;
		return str;
	}
}
