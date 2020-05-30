public class ArrayRotation {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int n = a.length, k = 2, temp;
		for (int i = 0; i < k; i++) {
			temp = a[0];
			for (int j = 1; j < n; j++) {
				a[j - 1] = a[j];
			}
			a[n - 1] = temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

}
