
public class EquilibriumPoint {

	public static void main(String[] args) {
		int a[]= {8,9,23,12,8,15,7};
		int min=10000;
		for(int i=0;i<a.length;i++) {
			int sum1=0;
			for(int j=i;j>=0;j--) {
				sum1+=a[j];
			}
			int sum2=0;
			for(int j=i+1;j<a.length;j++) {
				sum2+=a[j];
			}
			//System.out.println(min);
			int d=Math.abs(sum1-sum2);
			//System.out.println("d"+d);
			if(min>d) {
				min=d;
				
			}
		}
		
		//System.out.println(min);
		for(int i=0;i<a.length;i++) {
			int sum1=0;
			for(int j=i;j>=0;j--) {
				sum1+=a[j];
			}
			int sum2=0;
			for(int j=i+1;j<a.length;j++) {
				sum2+=a[j];
			}
			int d=Math.abs(sum1-sum2);
			if(d==min) {
				System.out.print(i);
			}
		}
	}

}
