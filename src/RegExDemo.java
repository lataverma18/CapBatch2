import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		String str="test@gmail.com";
		
		Pattern pattern=Pattern.compile("^[\\S&&[^@.]]{3,}@[\\S&&[^@.]]{5}.com{1}$");
		Matcher matcher=pattern.matcher(str);
		System.out.println(matcher.matches());
		
	}
}
