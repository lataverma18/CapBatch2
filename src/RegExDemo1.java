import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {

	public static void main(String[] args) {
		String input = "Ex"; 
	//Checks for string that start with upper case alphabet and ends with digit.(No space in between and no digit) 
		Pattern p = Pattern.compile("^\\S{3,}$");
		Matcher m = p.matcher(input); 
		if (!m.find()) {
		 System.err.println("Enter  code which  start with upper case alphabet and end with a digit");
		}
	}
}
