import java.util.ArrayList;

public class PascalsTriangle {

	static int ref=1;
	public static void main(String[] args) {
		int len=20;
		int a=1,b=1,pas=0;
		ArrayList s = new ArrayList();
		ArrayList d= new ArrayList();
		for(int j=1;j<len+1;j++) {
			for(int i=0;i<1;i++) {
				s.add(ref);
			}
			for(int k=0;k<s.size();k++) {
				if(k>0&&k<s.size()-1) {
					d.add(String.valueOf(Integer.parseInt(String.valueOf(s.get(k-1)))+Integer.parseInt(String.valueOf(s.get(k)))));
				}
				else {
					d.add(ref);
				}
			}
			for(int i=0;i<d.size();i++) {
				System.out.print(d.get(i));	
			}
			System.out.print("\n");	
			s.clear();
			s=(ArrayList) d.clone();
			//s=String.valueOf(d);
			d.clear();
		}
	}
}
