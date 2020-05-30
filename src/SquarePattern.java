import java.util.*;

public class SquarePattern {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Rows and Columns :");
		int cols=s.nextInt();
		int rows=s.nextInt();
		String str;
		for(int i=0;i<cols;i++) {
			str="";
			for(int j=0;j<rows;j++) {
				if(i==0||j==0||i==(cols-1)||j==(rows-1)){
					str+="* ";
				}
				else {
					str+="  ";
				}
			}
			System.out.println(str);
		}
	}
}
