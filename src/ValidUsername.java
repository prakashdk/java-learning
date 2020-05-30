import java.util.Scanner;
import java.util.regex.*;

public class ValidUsername {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		//String str=".Anu.123";
		boolean b=Pattern.compile("[A-Za-z0-9]*.[A-Za-z0-9]*").matcher(str).matches();
		if(str.startsWith(".")) {
			System.out.println(str+" is invalid");
		}
		else if(b) {
			System.out.println(str+" is valid");
		}
		else {
			System.out.println(str+" is invalid");
		}	
	}
}
