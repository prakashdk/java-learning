import java.util.Scanner;

public class PermuteString {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str="abcde";
		printPermute(str,"");
	}

	private static void printPermute(String str, String string) {
		
		if(str.length()==0) {
			System.out.println(string+" ");
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String ros=str.substring(0, i)+str.substring(i+1);
			printPermute(ros,string+ch);
		}
	}

}
