package _2_26;

public class _6_t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String l;
		int number=0;
		for(int i=1,sum=0;i<10000;i++) {
			int a=i*i*i;
			for(int c=12;c>=0;c--) {
				sum=(int) (sum+a/Math.pow(10, c));
				a=(int) (a%Math.pow(10, c));
			}
			if(sum==i) {
				number++;
			}
			sum=0;
		}
		System.out.print(number);
	}

}
