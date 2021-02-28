package _2_26;

import java.util.Scanner;

public class _6_t8 {
	static int duo=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int number=0,sum;
		number=input.nextInt();
		sum=son(number);
		System.out.print(sum);
	}
	public static int son(int a) {
		int shen=a%3;
		int number=a-shen;
		if(a<3) {
			return a;
		}
		number+=son(a/3+shen);
		return number;
	}
}
