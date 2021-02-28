package _2_24;

import java.util.Random;
import java.util.Scanner;

public class _8_t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		double [] a=new double[30];
		double [] c=new double [29];
		a[0]=0;
		for(int i=1; i<=30;i++ ) { //iÎª²ãÊý
				
				  for(int m=0;m<i;m++) {
					  double b;
					  if(m==0) {
						
					  }else {
						  b=input.nextDouble();						  
					  a[m]=c[m-1]/2+b+c[m]/2;
					  }
					  if(m==0) {
						  c[m]=a[m];
						  a[0]=input.nextDouble()+c[0]/2;
					  }
				  }
			if(i==31) {
				
				}else {
					for(int o=0;o<i;o++) {
						System.out.print(a[o]+"   ");
				}
			}
		}
	}

}
