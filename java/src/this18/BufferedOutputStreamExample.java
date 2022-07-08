package this18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("src/this18/설악산.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("src/this18/설악산복사.jpg");
		start = System.currentTimeMillis();
		while((data = bis.read())!= -1) {
			fos.write(data);//버퍼없는 출력장치
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); bis.close(); fis.close();
		System.out.println("사용하지 않았을때 : "+(end-start)+"ms");
		
		fis = new FileInputStream("src/this18/설악산.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("src/this18/설악산복사.jpg");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read())!= -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); fis.close();
		System.out.println("사용했을 때: "+(end-start)+"ms");

	}

}
