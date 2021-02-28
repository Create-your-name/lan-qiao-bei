
package _2_28;

import java.util.Scanner;

public class _2_28_11moni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		char []a=new char[] {};
		String b=input.nextLine();
		a=b.toCharArray();
		for(int i=0;i<a.length;i++) {
			a[i]+=3;
			
			  if(a[i]>='{') {
			 a[i]-=26;
			 }
			 
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}
