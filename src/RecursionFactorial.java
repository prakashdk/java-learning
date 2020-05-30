
public class RecursionFactorial {

	static int n;
	RecursionFactorial(int a){
		n=a;
		
	}
	static int fact(int a) {
		if(n!=0) {	
			return fact(a*(n--));	
		}
		else {
			return a;
		}
	}
	public static void main(String[] args) {
		RecursionFactorial f=new RecursionFactorial(5);
		System.out.println(fact(1));
	}

}
