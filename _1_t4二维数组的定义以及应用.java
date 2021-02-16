package _2_15;

import java.util.Scanner;

public class 二维数组的定义以及应用 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();//n代表鱼的个数   m代表捕鱼距离 
		m=input.nextInt();
		//int[][] a=new int[1][] ;//这个样子仿佛不会受到长度限制？
		int[][] a=new int[1000][2];//前面1000代表二维数组有1000个一维数组
		//后面2代表每个一维数组有2个元素
		int i=0;
		int number=0;
		for(;i<n;i++) {
			//输入鱼的位置
			//此处出错    上面的int[][] a=new int[1][]只是定义
			//   并没有分配空间 需要 下面分配空间
			//a[o]=new a[2]  不需要...
			for(int o=0;o<2;o++) {
				a[i][o]=input.nextInt();
			}
			/*
			 * if(a[o][0]==null) { break; }
			 */
			/*	System.out.print(1);
				if(" ".equals(a[o][0])) {
					break;
				}*/
		//输入了所有的鱼的坐标
		}
		
		/*   //二维数组的显示
		 * for(int f=0;f<3;f++) {//s.length表示行数 System.out.print("{"); for(int
		 * j=0;j<a[f].length;j++) {//s[i].length表示列数 System.out.print(a[f][j]+" "); }
		 * System.out.print("}"); System.out.println(); }
		 */
			
		int num,l;
		for(num=n-1;num!=-1;num--) {  //当有鱼处于0 0的欧式距离网内时直接 收走
			double sum1=Math.sqrt(Math.pow(0-a[num][0],2)+Math.pow(0-a[num][1], 2));
			//System.out.println(sum1);
			if(sum1<=m) {
				a[num][0]=0;
				a[num][1]=0;
				n--;
				
			}
			number++;
		}
		
//		for 循环 第一个为初始化 for循环条件  第二个是执行for循环的条件 对则执行 错则不执行 第三个是 每循环一遍for循环的执行语句 
		for( l=0 ;n>=0;l++) {
			if(a[l][0]!=0&&a[l][1]!=0) {
				int x=a[l][0];
				int y=a[l][1];
				for(int p=i-1;p!=-1;p-- ) {
					double sum=Math.sqrt(Math.pow(x-a[p][0],2)+Math.pow(y-a[p][1], 2));
					if(sum<=m) {
						a[p][0]=0;
						a[p][1]=0;
						n--;
					}
				}
				a[l][0]=0;
				a[l][1]=0;
				n--;
				number++;
				}
			}
		System.out.print(number);
	

}
}
