import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestArrayElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Array Size :");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array Elements ");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		Arrays.sort(a);
		// or
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.print(a[n - 2] + " " + a[0]);
	}
}
