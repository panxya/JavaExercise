package get;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class get {
	public static void main(String[] args) {
		String s = "wo de xiao xiong ne ta bu ke neg nnn ign sss aaa";
		String regex = "\\b\\w{2}\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
	
	}
}
