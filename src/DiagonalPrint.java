
public class DiagonalPrint {

	public static void main(String[] args) {
		
		String s="PROGRAM",str="";
		for(int i=0;i<s.length();i++) {
			str="";
			for(int j=0;j<s.length();j++) {
				if(j==i||j==(s.length()-1)-i) {
					str=str+s.charAt(j);
				}
				else {
					str+=" ";
				}
			}
			System.out.println(str);
		}
	}
}
