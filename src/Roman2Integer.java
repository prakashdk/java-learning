import java.util.Scanner;

public class Roman2Integer {

	public static void main(String[] args) {
		char r[]=new char[] {'I','V','X','L','C','D','M','F'};
		int v[]=new int[] {1,5,10,50,100,500,1000,5000};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		int val=0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<r.length;j++) {
				if(String.valueOf(ch[i]).equalsIgnoreCase(String.valueOf(r[j]))) {
					val+=v[j];
					break;
				}
			}
		}
		for(int i=0;i<ch.length-1;i++) {
			if(String.valueOf(ch[i]).equalsIgnoreCase(String.valueOf("I"))) {
				val-=2;
			}
		}
		System.out.println(val);
	}
}
