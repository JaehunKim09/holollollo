package this18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("src/this18/설악산.jpg");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}
			end=System.currentTimeMillis();
			System.out.println("사용하지 않았을때 : "+(end-start)+"ms");
			fis1.close();
			
			FileInputStream fis2 = new FileInputStream("src/this18/설악산.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis2);
			start = System.currentTimeMillis();
			while(bis.read()!= -1) {}
				end = System.currentTimeMillis();
				System.out.println("사용했을때 : "+(end-start)+"ms");
				bis.close();
				fis2.close();
	}
}
