package _2_22;

import java.util.Scanner;

public class _10_t3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int a,sum=0;
		String b;
		a=input.nextInt();
		
		char [] c=new char[] {};
 	
		for(int i=0;a!=0;a--) {
			b=String.valueOf(a);
			c=b.toCharArray();
			if(a>=10) {
				if(c[i]<=c[i+1]) {
				sum++;
				}
				}
			if(i+1==c.length) {
				a=0;
			}
		}
		System.out.print(sum);
		
	}

}
