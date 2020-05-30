
public class NeutralisingCharges {

	static String s="aaacccbbbccccd",str;
	static int c=1,n;
	static char arr[]=s.toCharArray();;
	public static void main(String[] args) {

		
		str="";
		n=s.length();
		
		
		fun();
		
		System.out.print(s);
	}
	private static void fun() {

		c=0;
		n=s.length();
		arr=s.toCharArray();
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]&&arr[i]!='#') {
				arr[i]='#';
				arr[i+1]='#';
				c++;
			}
		}
		c=0;//Brake
		s=String.valueOf(arr);
		for(int k=0;k<s.length();k++) {
			if(s.charAt(k)!='#') {
				str+=s.charAt(k);
			}
		}
		s=str;
		if(c!=0) {
			fun();
		}
	}
}
