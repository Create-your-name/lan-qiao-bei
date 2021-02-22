package _2_22;

public class _10_t4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = new double[20190323];
		a[0] = 3;
		a[1] = 5;
		a[2] = 9;
		for (int i = 3; i < 20190323; i++) {
			a[i] = a[i - 1] + a[i - 2] + a[i - 3];
			a[i] = a[i] % 10000; // 超过范围- -只要一千位数就好了呀
		}
		System.out.print(a[20190320]);
	}

}
