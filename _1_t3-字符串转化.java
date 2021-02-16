package _2_14;

import java.util.Arrays;
import java.util.Scanner;

public class 字符串转化 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		//方法一....失败
		
		//定义两个存储碱基对的数组
		//char[] a=new char[] ;//定义数组
		//char[] b=new char[] ; 
		//由于数组定义必须指定长度 所以可以使用集合类Arrylist
//		或者  String[] a=new String[]{};  //规定一个0长度的数组
		//for(int i = 0;;i++) {
		//	a[i]=input.toString();
		//	if(a[i].trim().isEmpty()) {//如果数组输入空格
		//		break;
		//	}
		//	System.out.print(a);
		//	
		//}
		//*** String 为字符串      char为字符***
		
		
		
		//方法2.....失败
		/*
		 * char[] a=new char[] {}; 
		 * char[] b=new char[] {}; 
		 * String
		 * str1,str2;//目前我所知应该将字符串转换成数组 然后数组对比？ 
		 * str1=input.nextLine();//接受字符串
		 *  for(int i = 0;i<str1.length();i++) { 
		 *  a[i]=str1.charAt(i); 
		 *  } 
		 *  str2=input.nextLine();
		 * for(int n = 0;n<str2.length();n++) {
		 *  b[n]=str2.charAt(n); //返回char指定索引处的值
		 *  }
		 * System.out.print(Arrays.toString(a));
		 * System.out.print(Arrays.toString(b));
		 */
		
		//方法三......
		String str1,str2;
		char[] a=new char[] {};
		char[] b=new char[] {};		
		str1=input.nextLine();
		str2=input.nextLine();
		a=str1.toCharArray();//将字符穿转换成字符数组
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
			//System.out.println("到了第"+o+"轮");
			
		}
		
		
	}

}
