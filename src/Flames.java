import java.util.Scanner;

public class Flames {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (ch1[i] == ch2[j]) {
					ch1[i] = '$';
					ch2[j] = '$';
					break;
				}
			}
		}
		String str = "";
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != '$') {
				str += ch1[i];
			}
		}
		for (int i = 0; i < ch2.length; i++) {
			if (ch2[i] != '$') {
				str += ch2[i];
			}
		}
		System.out.println(relation(str.length()));

	}

	static char relation(int l) {
		String s = "flames";
		int n;
		while (s.length() > 2) {
			n = l;
			while (s.length() < n) {
				n -= s.length();
			}
			s = s.substring(n) + s.substring(0, n - 1);
		}
		return s.charAt(0);
	}
}
