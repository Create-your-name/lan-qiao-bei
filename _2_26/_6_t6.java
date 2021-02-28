package _2_26;

public class _6_t6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<46;i++) {
			sum+=i*(i+1);
			for(int a=1;a<49;a++) {
				if(a==i||a==i+1||a==i-1) {
					continue;
				}
				sum=sum+a*(a+1);
				sum+=1225-i*2-a*2-2;
				if(sum==2015) {
					System.out.println(i+" ");
					System.out.println(a+" ");
				}
				sum=i*(i+1);
			}
		}
	}

}
