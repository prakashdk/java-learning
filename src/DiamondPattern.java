
public class DiamondPattern {

	public static void main(String[] args) {
		int len=31;
		int n=len/2,k=0,d=n/2;
		String s = "";
		for(int i=0;i<len;i++) {
			s="";
			for(int j=0;j<len;j++) {
				if(j==(n-k)||j==(n+k)){
					s+="*";
				}
				
				else {
					s+=" ";
				}
			}
			if(i>n-1&&i<n+d) {
				k--;
			}
			else if(i==n+d) {
				break;
				
				
			}
			else {
				k++;
			}
			
			System.out.println(s);
		}
		//System.out.println("\n");
		s="";
		for(int w=0;w<len;w++) {
			if(w>=(n-k)&&w<=(n+k)&&w%2==0) {
				s+="*";
			}
			else {
				s+=" ";
			}
		}
		System.out.println(s);
	}
}
