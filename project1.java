package text1;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class project1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList	arl=new ArrayList();
		arl.add(100);
		try {
			Class clazz=Class.forName("java.util.ArrayList");
			Method m=clazz.getMethod("add",Object.class);
			m.invoke(arl, "abc");
			System.out.print(clazz);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
