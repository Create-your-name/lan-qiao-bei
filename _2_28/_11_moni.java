package _2_28;

public class _11_moni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int [6] ;
		int number=0;
		for(int i=0;i<6;i++) {
			a[i]++;
			if(a[i]==2) {
				a[i]--;
				continue;
			}
			for(int i1=0;i1<6;i1++) {
				a[i1]++;
				if(a[i1]==2) {
					a[i1]--;
					continue;
				}
				for(int i2=0;i2<6;i2++) {a[i2]++;
				if(a[i2]==2) {
					a[i2]--;
					continue;
				}
					for(int i3=0;i3<6;i3++) {a[i3]++;
					if(a[i3]==2) {
						a[i3]--;
						continue;
					}
						for(int i4=0;i4<6;i4++) {a[i4]++;
						if(a[i4]==2) {
							a[i4]--;
							continue;
						}
							for(int i5=0;i5<6;i5++) {
								a[i5]++;
							if(a[i5]==2) {
								a[i5]--;
								continue;
							}								
								number++;	
								a[i5]=0;
							}a[i4]=0;
						}a[i3]=0;
					}a[i2]=0;
				}a[i1]=0;
			}a[i]=0;
		}
		System.out.print(number);
	}

}
