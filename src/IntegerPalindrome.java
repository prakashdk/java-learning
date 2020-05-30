import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int arrLen=s.nextInt();
		int a[]=new int[arrLen];
		for(int i=0;i<arrLen;i++) {
			a[i]=s.nextInt();
		}
		for(int j=0;j<arrLen;j++) {
			String str=String.valueOf(a[j]);
			String strRev="";
			int len;
			for(int i=str.length()-1;i>=0;i--) {
				strRev+=str.charAt(i);
			}
			if(strRev.equals(str)) {
				len=str.length();
				if(len%2==0) {
					System.out.println(str+":YES Even");
				}
				else {
					System.out.println(str+":YES Odd");
				}
			}
			else {
				System.out.println(str+" :NO");
			}
		}
	}
}
