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
		
		fis = new FileInputStream("src/this18/���ǻ�.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("src/this18/���ǻ꺹��.jpg");
		start = System.currentTimeMillis();
		while((data = bis.read())!= -1) {
			fos.write(data);//���۾��� �����ġ
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); bis.close(); fis.close();
		System.out.println("������� �ʾ����� : "+(end-start)+"ms");
		
		fis = new FileInputStream("src/this18/���ǻ�.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("src/this18/���ǻ꺹��.jpg");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read())!= -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); fis.close();
		System.out.println("������� ��: "+(end-start)+"ms");

	}

}
