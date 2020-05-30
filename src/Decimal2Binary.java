
public class Decimal2Binary {

	public static void main(String[] args) {
		
		int a=156;
		int r,c;
		int arr[]=new int[] {3,4,5};
		
		String ps="",s1="";
		for(int i=0;i<arr.length;i++) {
			ps+=String.valueOf(arr[i]);
		}
		int charge=0;
		int n=ps.length(),len=(int)Math.pow(2,n);
		for(int j=0;j<arr.length;j++) {
			c=0;
			for(int i=1;i<len;i++) {
				String s="";
				a=i;
				while(a!=1) {
					r=a%2;
					a=a/2;
					s+=r;
				}
				s+=1;
				s1="";
				for(int k=s.length()-1;k>=0;k--) {
					if(s.charAt(k)=='1') {
						s1+=arr[k];
					}
				}
				//System.out.println(s1);
				for(int g=0;g<s1.length();g++) {
					if(String.valueOf(s1.charAt(g)).equals(String.valueOf(arr[j]))) {
						c++;
					}
				}
			}
			if(arr[j]>=c) {
				charge+=arr[j];
			}
		}
		System.out.println(charge);
	}

	/*private static String reverse(String s) {

		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str+=s.charAt(i);
		}
		return str;
	}*/
}
