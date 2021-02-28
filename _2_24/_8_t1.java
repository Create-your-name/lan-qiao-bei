package _2_24;

import java.util.Scanner;

public class _8_t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		double a;
		double b;
		double sum=0;
		for(;;) {
		a=input.nextDouble();
		b=input.nextDouble();
		b=b*0.01;
		sum= sum+b*a;
		if(a==0) {
			break;
		}else{ }
		}
		System.out.print(sum);
	}

}
