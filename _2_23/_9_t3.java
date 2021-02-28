package _2_23;

import java.util.Scanner;

public class _9_t3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a,b;
		a=2;
		b=3;
		for(int i=1;i<123456;i++ ) {
			long c=a;
			long d=b;
			a=c*2-d*3;
			b=c*3+d*2;
		}
		System.out.println(a);
		System.out.println(b);
	}

}
