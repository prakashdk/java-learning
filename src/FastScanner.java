import java.io.*;

public class FastScanner {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(String.valueOf(br.readLine()));
		System.out.println(Integer.toHexString(a));
	}
}