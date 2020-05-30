import java.util.*;

public class Hamiltanion {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int j,min=0;
		for(int i=0;i<n;i++) {
			min=arr[i];
			for(j=i;j<n-1;j++) {
				if(min<arr[j]) {
					min=arr[j];
				}
			}
			if(!(al.contains(min)))
			al.add(min);
		}
		for(int a:al)
		System.out.print(a+" ");
	}
}
