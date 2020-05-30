import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class BeyBlade {

	public static void main(String[] args) {
		
		int t=1;
		int n=10;
		int team[]= {3,6,7,5,3,5,6,2,9,1};
		int opponent[]= {2,7,0,9,3,6,0,6,2,6};
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(team[i]<team[j]) {
					int temp=team[i];
					team[i]=team[j];
					team[j]=temp;
				}
			}
		}
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(opponent[i]<team[j]) {
					count++;
					team[j]=-1;
					break;
				}
			}
		}
		System.out.println(count);
	}

}


