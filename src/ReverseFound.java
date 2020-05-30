import java.util.*;

public class ReverseFound {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.print("No of Strings :");
		int n=s.nextInt();
		String str ,temp;
		int count = 0;
		for(int i=0;i<n;i++) {
			al.add(s.next());
		}
		for(int i=0;i<al.size();i++) {
			temp=(String) al.get(i);
			str=reverse(temp);
			if(al.contains(str)) {
				System.out.println(temp+" :"+temp.length()+temp.charAt(temp.length()/2));
				count=0;
				break;
			}
			else {
			    count = 1;
			}
		}
		if(count==1) {
			System.out.println("Not Found");
		}
	}
	private static String reverse(String str) {
		String s="";
		for(int i=str.length()-1;i>=0;i--) {
			s+=str.charAt(i);
		}
		return s;
	}
}
