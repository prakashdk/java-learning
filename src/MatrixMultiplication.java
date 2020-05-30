
public class MatrixMultiplication {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},
					{1,2,3},
					{1,2,3}};
		int b[][]= {{3,2,1},
					{3,2,1},
					{3,2,1}};
		int r[][]=new int[3][3];
		int n1=a.length;
		int n2=a.length;
		if(n1==n2) {
			for(int i=0;i<n1;i++) {
				int s;
				for(int j=0;j<n1;j++) {
					s=0;
					for(int k=0;k<n1;k++) {
						s+=((a[i][k])*(b[k][j]));
					}
					r[i][j]=s;
				}	
			}
			for(int i=0;i<n1;i++) {
				for(int j=0;j<n1;j++) {
					System.out.print(r[i][j]+" ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Not possible");
		}
	}

}
