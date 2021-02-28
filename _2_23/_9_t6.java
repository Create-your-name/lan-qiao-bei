package _2_23;

import java.util.Scanner;

public class _9_t6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int a,sum = 0;
		a=input.nextInt();
		int[] b=new int [a] ;
		int[] c=new int [a] ;
		int[] d=new int [a] ;
		for(int i=0;i<a;i++) {
			 b[i]=input.nextInt();
		 }
	
			for(int l=0;l<a;l++) {
				 c[l]=input.nextInt();
			 }
		
		for(int o=0;o<a;o++) {
			 d[o]=input.nextInt();
		}
		for(int h=0;h<a;h++) {
			for(int r=0;r<a;r++) {
				for(int u=0 ;u<a ;u++) {
					if( b[h] <c[r] &&c[r]<d[u]) {
						sum++;
					}
				}
			}
		}
		System.out.print(sum);
		/*
		 * for(int h=0;h<a;h++) { System.out.print( b[h] +" "); }
		 */
}
}
