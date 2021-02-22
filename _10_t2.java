package _2_22;

public class _10_t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<=2019;i++) {
			String a;
		
			a=String.valueOf(i);
			if(a.contains("9")) {
				sum++;
			}
		}
	
		System.out.print(sum);
	}

}
