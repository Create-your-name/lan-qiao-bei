package _2_26;

import java.util.Vector;

public class _6_t4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(11,13);
	}
	public static int f(double n, double m)
	{
		
		n = n % m;	
		Vector v = new Vector();
		
		for(;;)
		{
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
			if(v.indexOf(n)>=0) return v.size()-v.indexOf(n);  //���
		}
	}
}
