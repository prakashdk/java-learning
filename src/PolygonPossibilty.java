import java.util.Scanner;

public class PolygonPossibilty {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),l=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(max!=arr[i]) {
				l+=arr[i];
			}
		}
		if(max<l) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
