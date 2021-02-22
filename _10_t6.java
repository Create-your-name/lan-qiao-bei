package _2_22;

import java.util.Scanner;

public class _10_t6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		String n;
		int a;
		a=input.nextInt();
		//n=String.valueOf(a);  //数字转化为字符串
		int sum=0;
		for(int i=1;i<=a;i++) {
			n=String.valueOf(i); 
			//b=n.toCharArray();//转化成字符数组
			
			// &&  或   || 且
			if(n.contains("1")||n.contains("2")||n.contains("9")||n.contains("0")) {
				sum=sum+i;
			}
		}
		System.out.print(sum);
	}

}
