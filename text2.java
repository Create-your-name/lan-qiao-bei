package text1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;
import java.lang.reflect.*;

public class text2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		p.load(new FileInputStream("F:/project.properties"));
		String cname=p.getProperty("Property");
		char []a=new char []{};
		try {
			Class classType= Class.forName(cname);
			Constructor ct=classType.getConstructor();
			Object obj =ct.newInstance();
			Method mt =classType.getMethod("run");
			mt.invoke(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
