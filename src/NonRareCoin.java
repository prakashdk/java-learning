
public class NonRareCoin {

	public static void main(String args[]) {
		
		int arr[]= {1,2,3};
		int temp,count=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			temp=arr[i];
			count=0;
			for(int j=0;j<arr.length;j++) {
				
				if(temp==arr[j]&&arr[j]!=-10) {
					count++;
					arr[j]=-10;
				}
			}
			if(count>1) {
				sum=sum+temp;
			}
		}
		System.out.println(sum);
		
	}
}
