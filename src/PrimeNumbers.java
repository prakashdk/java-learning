
public class PrimeNumbers {

	public static void main(String[] args) {
		
		int n=100,c=0;
		for(int j=0;j<n;j++) {
			for(int i=2;i<j;i++) {
				if(j%i==0) {
					c=1;
					break;
				}
				else {
					c=0;
				}
			}
			if(c!=1) {
				System.out.println(j);
			}
		}
	}
}
