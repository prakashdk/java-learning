import java.util.*;
public class PowerPuffGirls {
   public static void main(String args[] ) throws Exception {

      Scanner s=new Scanner(System.in);
      int n=4;
      int ingredient_amount_per[]= {2,5,6,3};
      int ingredient_amount_present[]= {20,40,90,50};
      
      /*int n=s.nextInt();
      int ingredient_amount_per[]=new int[n];
      int ingredient_amount_present[]=new int[n];
      
      for(int i=0;i<n;i++){
         ingredient_amount_per[i]=s.nextInt();
      }
      for(int i=0;i<n;i++){
         ingredient_amount_present[i]=s.nextInt();
      }*/
      int power_puff_girls=0;
      
      while(enoughIngredientAmount(n,ingredient_amount_per,ingredient_amount_present)){
    	  power_puff_girls++;
    	  for(int i=0;i<n;i++) {
    		  ingredient_amount_present[i]=ingredient_amount_present[i]-ingredient_amount_per[i];
    	  }
      }
      System.out.println(power_puff_girls);
     
   }
   static boolean enoughIngredientAmount(int n,int[] arr1,int[] arr2){
	   int count=0;
         for(int i=0;i<n;i++){
            if(arr1[i]<=arr2[i]) {
            	count++;
            }
         } 
         if(count==n) {
        	 return true;
         }
         else {
        	 return false;
         }
      }
}