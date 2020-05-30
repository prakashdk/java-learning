import java.util.ArrayList;

public class PowerSet {

	static ArrayList<String> al=new ArrayList<String>();
	static int f=0;
	public static void main(String[] args) {

		char ch[]= {'1','2','3','4','5'};
		String tempch=String.valueOf(ch);
		char temp;
		al.add("0");
		for(int i=0;i<3;i++) {
			temp=ch[0];
			String str=String.valueOf(ch);
			int n=str.length();
			printPower(str,(int)Math.pow(2, n),n);
			for(int j=1;j<3;j++) {
				ch[j-1]=ch[j];
			}
			ch[2]=temp;
		}
		al.add(tempch);
		System.out.println(al);
	}

	private static void printPower(String a, int n, int len) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<len;j++) {
				if(i<=len&&i>j&&!(al.contains(a.substring(j,i)))&&(a.substring(j,i).length()!=len)) {
					al.add(a.substring(j,i));
				}
			}
		}
	}
}
