package _2_4;

import java.util.Scanner;

public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input =new Scanner(System.in);
			int n=input.nextInt();  //行数
			
			int m=input.nextInt();  //列数
			
			int duo;//空出来的
				
			int lie;
			int max=m*n;
			if(n%3==0) {
				duo=n/3;
			}else{
				duo=n/3+1;
			}
				lie=m/6;
				int sum=0;
				sum=max-( (duo*m) + (lie*n) - (duo*lie) );
				System.out.print(sum);
			
	}

}
