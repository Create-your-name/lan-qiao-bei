package _2_25;

public class _7_t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<95;i++) {
			for(int n=i,number=0;n<=100;n++) {
				number=number+n;
				if(number==236) {
					System.out.print(i);
					break;
				}
			}
		}
	}

}
