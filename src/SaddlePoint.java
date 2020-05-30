
public class SaddlePoint {//min in row,max in col

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int t=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				int v=arr[i][j];
				if(isMinInRow(v,i,arr)) {
					if(isMaxInCol(v,j,arr)) {
						t=1;
						System.out.println("The saddle point is ("+i+","+j+") \nThe element is :"+v);
						break;
					}
					else {
						t=0;
					}
				}
				else {
					t=0;
				}
			}
			if(t==1) {
				break;
			}
		}
		if(t==0) {
			System.out.println("No");
		}
		
	}
	static boolean isMinInRow(int v,int r,int a[][]) {
		
		boolean b = false;
		for(int i=0;i<a.length;i++) {
			if(v<=a[r][i]) {
				b=true;
			}
			else {
				b=false;
				break;
			}
		}
		return b;
		
	}
	static boolean isMaxInCol(int v,int c,int a[][]) {
		
		boolean b = false;
		for(int i=0;i<a.length;i++) {
			if(v>=a[i][c]) {
				b=true;
			}
			else {
				b=false;
				break;
			}
		}
		return b;
		
	}
}
