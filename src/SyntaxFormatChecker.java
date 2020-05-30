import java.util.Scanner;

public class SyntaxFormatChecker {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int t=Integer.parseInt(scan.nextLine());
        String arr[]=new String[t];
        for(int i=0;i<t;i++){
            arr[i]=scan.nextLine();
        }
        for(int q=0;q<t;q++){
            int sbc=0,cbc=0,bc=0;
            String s=arr[q];
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='['){
                    sbc++;
                }
                else if(s.charAt(i)==']'){
                    if(sbc>0) {
                    	sbc--;
                    }
                    else {
                    	sbc=1;
                    	break;
                    }
                }
                else if(s.charAt(i)=='{'){
                    cbc++;
                }
                else if(s.charAt(i)=='}'){
                	if(cbc>0) {
                    	cbc--;
                    }
                	else {
                		cbc=1;
                		break;
                	}
                }
                else if(s.charAt(i)=='('){
                    bc++;
                }
                else if(s.charAt(i)==')'){
                	if(bc>0) {
                    	bc--;
                    }
                	else {
                		bc=1;
                		break;
                	}
                }
                
            }
            //System.out.println(s+sbc+cbc+bc);
            System.out.println((sbc==0&&cbc==0&&bc==0)?"Valid":"Invalid");
        }
    }
}
