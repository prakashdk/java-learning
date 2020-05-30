
public class SumOfWeights {

	public static void main(String[] args) {
		
		int arr[]= {10,36,54,89,12};
		int n=arr.length,sum=0;
		String s="";
		for(int i=0;i<n;i++) {
			if(Math.sqrt(arr[i])-Math.floor(Math.sqrt(arr[i]))==0) {
				sum+=5;
				s+="<"+arr[i]+","+"5>"+",";
			}
			else if(arr[i]%4==0&&arr[i]%6==0) {
				sum+=4;
				s+="<"+arr[i]+","+"4>"+",";
			}
			else if(arr[i]%2==0) {
				sum+=3;
				s+="<"+arr[i]+","+"3>"+",";
			}
		}
		System.out.println(sum+"\n"+s.substring(0,s.length()-1));
	}
}
