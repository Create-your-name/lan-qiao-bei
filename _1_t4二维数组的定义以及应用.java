package _2_15;

import java.util.Scanner;

public class ��ά����Ķ����Լ�Ӧ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();//n������ĸ���   m��������� 
		m=input.nextInt();
		//int[][] a=new int[1][] ;//������ӷ·𲻻��ܵ��������ƣ�
		int[][] a=new int[1000][2];//ǰ��1000�����ά������1000��һά����
		//����2����ÿ��һά������2��Ԫ��
		int i=0;
		int number=0;
		for(;i<n;i++) {
			//�������λ��
			//�˴�����    �����int[][] a=new int[1][]ֻ�Ƕ���
			//   ��û�з���ռ� ��Ҫ �������ռ�
			//a[o]=new a[2]  ����Ҫ...
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
		//���������е��������
		}
		
		/*   //��ά�������ʾ
		 * for(int f=0;f<3;f++) {//s.length��ʾ���� System.out.print("{"); for(int
		 * j=0;j<a[f].length;j++) {//s[i].length��ʾ���� System.out.print(a[f][j]+" "); }
		 * System.out.print("}"); System.out.println(); }
		 */
			
		int num,l;
		for(num=n-1;num!=-1;num--) {  //�����㴦��0 0��ŷʽ��������ʱֱ�� ����
			double sum1=Math.sqrt(Math.pow(0-a[num][0],2)+Math.pow(0-a[num][1], 2));
			//System.out.println(sum1);
			if(sum1<=m) {
				a[num][0]=0;
				a[num][1]=0;
				n--;
				
			}
			number++;
		}
		
//		for ѭ�� ��һ��Ϊ��ʼ�� forѭ������  �ڶ�����ִ��forѭ�������� ����ִ�� ����ִ�� �������� ÿѭ��һ��forѭ����ִ����� 
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
