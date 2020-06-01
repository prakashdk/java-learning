import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		if(str1.length()!=str2.length()) {
			System.out.println("No ,it is not Anagram");
		}
		else {
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			for(int i=0;i<ch1.length;i++) {
				for(int j=0;j<ch1.length;j++) {
					if(ch1[i]==ch1[j]) {
						ch1[i]='\0';
						ch2[j]='\0';
						break;
					}
				}
			}
			String res=(String.valueOf(ch1)+String.valueOf(ch2)).trim();
			if(res.isEmpty()) {
				System.out.println("Yes ,it is Anagram");
			}
			else {
				System.out.println("No ,it is not Anagram");
			}
		}
		
	}

}
