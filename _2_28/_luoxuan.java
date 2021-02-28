package _2_28;

import java.util.Scanner;

public class _luoxuan {
	static int sum=1;
	static int [][]a=new int[][] {};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int n,m,num=0;
		n=input.nextInt();
		m=input.nextInt();
		int [][]a=new int[n][m];
		int i, l,l2,i2,chen=0;
		while(true) {
			if( bianli(a) ) {
				break;
			}
			for(i=chen;i<m-chen;i++) {
				if( bianli(a) ) {
					break;
				}
				a[chen][i]=sum;
			sum++;
			num++;
			}
			i--;
			if(chen>=1) {
				l=chen;
				l++;
			}else {
				l=chen;
			}
			for(;l<n-chen;l++) {
				if( bianli(a) ) {
					break;
				}
				a[l][i]=sum;
				sum++;
				num++;
			}
			l--;
			for(i2=i-1;i2>=0;i2--) {
				if( bianli(a) ) {
					break;
				}
			
				a[l][i2]=sum;
				sum++;
				num++;
			}
			i2++;
			for(l2=l-1;l2>=chen;l2--) {
				
			if( bianli(a) ) {
				break;
			}
				if(l2!=chen) {
				a[l2][i2]=sum;
				sum++;
				num++;
				}
			}
			chen++;
		}
	}
	
	  public static boolean bianli(int [][] a) { 

		  for(int i3=0;i3<a.length;i3++) {
				for(int h=0;h<a.length;h++) {
					if(a[i3][h]==0) {
					return	false;
					}
				}
		  }
		  return true;
	  
	  
	 
	  }
}
