import java.util.*;

public class BinaryQueries {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.print("Enter size :");
		int n=s.nextInt();
		
		int arr[]=new int[n];
		String str="";
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("Enter X and L and R :");
		int x=s.nextInt();
		int l=s.nextInt();
		int r=s.nextInt();
		
		if(arr[x-1]==0) {
			arr[x-1]=1;
		}
		else {
			arr[x-1]=0;
		}
		for(int i=0;i<n;i++) {
			str+=String.valueOf(arr[i]);
		}
		System.out.println("Type 1 :"+str);
		
		str=str.substring(l-1,r);
		if((Integer.parseInt(str,2))%2==0)
			System.out.print("Type 2 :"+Integer.parseInt(str,2)+" , Even");
		else
			System.out.print("Type 2 :"+Integer.parseInt(str,2)+" , odd");
	}
}
