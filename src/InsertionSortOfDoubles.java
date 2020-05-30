import java.text.*;
import java.util.*;

public class InsertionSortOfDoubles {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = Integer.parseInt(s.nextLine());
		// int arr[]= {5,2,4,6,1,3};
		String arr[] = new String[m];
		for (int i = 0; i < m; i++) {
			arr[i] = s.nextLine();
		}
		for (int i = 1; i < arr.length; i++) {

			int key = i;
			for (int j = i - 1; j >= 0; j--) {

				if ((Double.parseDouble(arr[j])) > (Double.parseDouble(arr[key]))) {

					String temp = arr[key];
					arr[key] = arr[j];
					arr[j] = temp;
					key--;
				}
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

}
