import java.util.Arrays;

public class PartitionInArray {

	public static void main(String[] args) {
		
		int n=5;
		int a[][]= {{2,1,4,5,6},{2,1,4,5,6},{2,1,4,5,6},{2,1,4,5,6}};
		int k=3;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
