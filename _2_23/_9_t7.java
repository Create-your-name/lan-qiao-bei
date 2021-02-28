package _2_23;

import java.util.Scanner;

public class _9_t7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int  x ,y;
		x=input.nextInt();
		y=input.nextInt();
		int i=0;
		//for(int a=0,b=0,num=0;a==x&&y==b;) {
			for(int sum=1,a=0,b=0;a!=x||y!=b;sum++) { 
				if(sum%2==1) {
					for(int number=sum;number!=0&&(a!=x||y!=b);number--) {
						if(a!=x||y!=b) {
							a--;
							i++;
						}else {
							break;
						}
						if(a!=x||y!=b) {
						b++;
						i++;
						}else {
							break;
						}
					}
				}else {
					for(int number=sum;number!=0&&(a!=x||y!=b);number--) {
						if(a!=x||y!=b) {
							a++;
							i++;
						}else {
							break;
						}
						if(a!=x||y!=b) {
							b--;
							i++;
						}else {
							break;
						}
						number--;
					}
				}
			}
	//	}
			System.out.print(i);
	}

}
