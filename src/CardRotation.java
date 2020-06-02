
import java.util.*;

public class CardRotation {
	public static void main(String args[]) throws Exception {//2143

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int x = 0; x < t; x++) {
			int n = s.nextInt();
			int m = n;
			int a[] = new int[n];
			a[--m] = n;
			for (int i = n - 1; i > 0; i--) {
				a[--m] = i;
				a = rotate(a, m,i);
				/*
				 * System.out.println("\nAfter Rotation"); for (int k = 0; k < n; k++) {
				 * System.out.print(a[k] + " "); } System.out.println();
				 */
			}
			//System.out.println("Final");
			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}

	static int[] rotate(int[] a, int l,int r) {
		int n = a.length;
		/*
		 * System.out.println("\nPassed"); for (int k = 0; k < n; k++) {
		 * System.out.print(a[k] + " "); }
		 * 
		 * System.out.println("\nIn Rotation");
		 */
		for (int i = 0; i < r; i++) {
			int temp = a[n-1];
			for (int j = n-1; j >l; j--) {
				a[j] = a[j-1];
			}
			a[l] = temp;
			/*
			 * for (int k = 0; k < n; k++) { System.out.print(a[k] + " "); }
			 * System.out.println();
			 */
		}

		return a;
	}
}
