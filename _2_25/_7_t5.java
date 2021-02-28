package _2_25;

public class _7_t5 {
								//	0		5      " "
	public static void f(int[] a, int k, int n, String s)
	{
		
		String s2 = s; //s2=" "
		for(int i=0; i<=a[k]; i++){
			//for(;;){} ;   //Ìî¿ÕÎ»ÖÃ
			s2 += (char)(k+'A');
		}
	}
	
	public static void main(String[] args)
	{
		int[] a = {4,2,2,1,1,3};
		
		f(a,0,5,"");
	}

}
