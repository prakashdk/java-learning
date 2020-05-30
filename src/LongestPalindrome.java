import java.util.*;
class LongestPalindrome {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int t=Integer.parseInt(s.nextLine());
        for(int x=0;x<t;x++){
            String str=s.nextLine();
            int n=str.length();
            int max=0;
            String s1="";
            for(int i=0;i<n;i++) {
            	for(int j=n;j>i;j--){
            		if(isPalindrome(str.substring(i,j))) {
            			if(max<str.substring(i,j).length()) {
            				max=str.substring(i,j).length();
            				s1=str.substring(i,j);
            			}
            		}
            	}
            }
            System.out.println(s1);
        }
            
    }
    static boolean isPalindrome(String s){
        String rev="";

        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return (s.equals(rev));
    }
}
