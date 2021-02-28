package _2_28;

import java.util.Scanner;

public class _2_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n,a,b,c,sum=0;
		n=input.nextInt();
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%a==0) {
				sum++;
			}else
			if(i%b==0) {
				sum++;
			}else
			if(i%c==0) {
				sum++;
			}
		}
		System.out.print(n-sum);
	}

}
