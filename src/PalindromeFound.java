
public class PalindromeFound {

	public static void main(String[] args) {
		
		String arr[]= {"abc","def","feg","cba"};
		String rev;
		for(int i=0;i<arr.length;i++) {
			rev="";
			for(int j=arr[i].length()-1;j>=0;j--) {
				rev+=arr[i].charAt(j);
			}
			for(int k=0;k<arr.length;k++) {
				if(rev.equals(arr[k])&&rev!="") {
					System.out.println(arr[k].length()+" "+rev.charAt(arr[k].length()/2));
					arr[k]="";
				}
			}
		}
		
	}

}
