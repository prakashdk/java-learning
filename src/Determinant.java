public class Determinant {
	public static void main(String[] args) {
		int a[][]= {{6,1,1},
					{4,-2,5},
					{2,8,7}};
		int r=a[0].length;
		int c=a.length;
		System.out.println(det(a,r));
	}
	static int det(int a[][]) {
		return (a[0][0]*a[1][1])-(a[0][1]*a[1][0]);
	}
	static int det(int a[][],int r) {
		int s=0;
		for(int i=0;i<r;i++) {
			int p[][]=frameArray(a,r,i);
			if(i%2==0) {
				s+=a[0][i]*det(p);
			}
			else {
				s-=a[0][i]*det(p);
			}
		}
		return s;
	}
	static int[][] frameArray(int a[][],int r,int i){
		int p[][]=new int[r-1][r-1];		
		int m=0;
		for(int j=0;j<r;j++) {
			int n=0;
			for(int k=0;k<r;k++) {
				if(j!=0&&k!=i) {
					p[m][n]=a[j][k];
					n++;
				}
			}
			if(j!=0) {
				m++;
			}
		}
		return p;
	}
	
}