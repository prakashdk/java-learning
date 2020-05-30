
public class HollowDiamond {

	static int len=10;
	static int n=len/2;
	static int k=0;
	public static void main(String[] args) {

		if(len%2!=0) {
			for(int i=0;i<len;i++) {
				if(i<n) {
					System.out.println(makePattern());
					k++;
				}
				else {
					System.out.println(makePattern());
					k--;
				}
			}	
		}
		else {
			len+=1;
			for(int i=0;i<len;i++) {
				if(i<n) {
					System.out.println(makePattern());
					k++;
				}
				else {
					System.out.println(makePattern());
					k--;
				}
			}	
		}
	}
	private static String makePattern() {
        String s="";
		
		for(int i=0;i<len;i++) {
		    if(i==(n-k)||i==(n+k)) {
		    	s+="*";
		    }
		    else {
		    	s+=" ";
		    }
		}
		return s;
	}

}
