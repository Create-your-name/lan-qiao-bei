package _2_4;

import java.util.Scanner;

public class t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();//天数
		int m=1; //用户数
		m+=yonghu(n);
		System.out.print(m);
	}
	public static int yonghu(int n) {
		n=n-7;
		int m=1;
		int sum;
		m=yonghu(n);
		for(;n/3>0&&n>3;n=n-3) {	
			m++;		
		}
		
		return m;
	}

}
