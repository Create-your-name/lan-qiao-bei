package _2_14;

import java.util.Arrays;
import java.util.Scanner;

public class �ַ���ת�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		//����һ....ʧ��
		
		//���������洢����Ե�����
		//char[] a=new char[] ;//��������
		//char[] b=new char[] ; 
		//�������鶨�����ָ������ ���Կ���ʹ�ü�����Arrylist
//		����  String[] a=new String[]{};  //�涨һ��0���ȵ�����
		//for(int i = 0;;i++) {
		//	a[i]=input.toString();
		//	if(a[i].trim().isEmpty()) {//�����������ո�
		//		break;
		//	}
		//	System.out.print(a);
		//	
		//}
		//*** String Ϊ�ַ���      charΪ�ַ�***
		
		
		
		//����2.....ʧ��
		/*
		 * char[] a=new char[] {}; 
		 * char[] b=new char[] {}; 
		 * String
		 * str1,str2;//Ŀǰ����֪Ӧ�ý��ַ���ת�������� Ȼ������Աȣ� 
		 * str1=input.nextLine();//�����ַ���
		 *  for(int i = 0;i<str1.length();i++) { 
		 *  a[i]=str1.charAt(i); 
		 *  } 
		 *  str2=input.nextLine();
		 * for(int n = 0;n<str2.length();n++) {
		 *  b[n]=str2.charAt(n); //����charָ����������ֵ
		 *  }
		 * System.out.print(Arrays.toString(a));
		 * System.out.print(Arrays.toString(b));
		 */
		
		//������......
		String str1,str2;
		char[] a=new char[] {};
		char[] b=new char[] {};		
		str1=input.nextLine();
		str2=input.nextLine();
		a=str1.toCharArray();//���ַ���ת�����ַ�����
		b=str2.toCharArray();
		int m=0;
		int o=0;
		for(int i=0;i<str1.length();i++) {
			o++;
			for(int n=0;n<str2.length();n++){

				if(a[i] == (int)b[n]+19 || a[i] == (int)b[n]-19 ||
						a[i] == (int)b[n]+4 || a[i] == (int)b[n]-4) {
					i++;
					//System.out.println("AB"+i);
					//System.out.println("B"+n);
					if(n==(i-o)&&(i-o)!=0) {
						System.out.println(o-1);
						return ;
					}
				}else {
					i=i-n;
					break;
				}

			}
			//System.out.println("A"+i);
			//System.out.println("���˵�"+o+"��");
			
		}
		
		
	}

}
