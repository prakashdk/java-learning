
public class PairsSum {

	public static void main(String args[]) {
		
		int arr[]= {3,4,2,0,5,7};
		int a=7,c=0;
		for(int i=0;i<6;i++) {
			for(int j=i+1;j<6;j++) {
				//System.out.print("("+arr[i]+","+arr[j]+")");
				if(arr[i]+arr[j]==a) {
					c++;
					System.out.print("("+arr[i]+","+arr[j]+")");
				}
			}
		}
		System.out.println("\n"+c);
	}
}
