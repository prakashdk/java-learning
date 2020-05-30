import java.util.Scanner;

public class NextHappyNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		for (int x = 0; x < tc; x++) {
			int n = scan.nextInt();
			int r = ++n;
			while (r != 1) {
				int t = 0;
				String s = String.valueOf(r);
				for (int j = 0; j < s.length(); j++) {
					t += (s.charAt(j) - 48) * ((s.charAt(j) - 48));
				}
				r = t;
				if (r == 4) {
					r = ++n;
				}
			}
			if (r <= 1) {
				System.out.println(n);
			}
		}
	}
}
