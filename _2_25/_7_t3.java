package _2_25;

public class _7_t3 {
	static int sum=0;
	static public boolean small(Class<o[]> class1,int a,int b) {
		if(class1[a]<class1[b]) return true;
		return false;
	}
	public void swap(int []o,int a ,int b) {
		int temp=o[a];
		o[a]=o[b];
		o[b]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int [] {1,2,3,4,5,6,7,8,9};
		int sum=0;
	}
	public static int pai_lie(int[] o) {
		int a=0;
		for(int i=0;i<9;i++) {
			 a=(int) ((int)o[i]*Math.pow(10, 9-i));
		}
		for( ;a!=987654321 ;) {
			int b=a%100000000;
			int c=( a-b*10000000 )%10000000;
			int d=( a-b*10000000-c*10000000)%1000000;
			int e=( a-b*10000000-c*10000000-d*1000000)%1000;
			int f=( a-b*10000000-c*10000000-d*1000000-e*1000);
			if(
					b*1.0+ c*1.0/d*1.0 +e*1.0/f*1.0==10.0
					) {
				sum ++;
			}
			for(int i=8;i<0;i++) {
			//	if(small(o[],i,i-1)) {
					
				}
			}
		}
		return sum;
	}
}
