package _2_22;

public class _10Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m=new int[1514]  ;
		int o=0;
		for(int k=1;k<2019;k++) {
			if(k%2==0&&k%4==0) {
				
			}else {
				m[o]=k;
				o++;
			}
		}
		int h=0,sum=0;
		for(int i=m[h];h<673;) {
			h++;//1510
			int g=h;
			for(int a=m[g];g<1512;) {
					g++;//1511
					int j=g;
				for(int b=m[j];j<1514;j++) {
//1512
					if(2019==a+i+b) {
						sum++;
					}
				}
			}
		}
		System.out.print(sum);
	}

}
