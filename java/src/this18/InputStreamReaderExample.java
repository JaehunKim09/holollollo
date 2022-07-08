package this18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader re = new InputStreamReader(is);
		
		int readCharNo;
		char cubf[] = new char[100];
		
		while((readCharNo = re.read(cubf))!= -1) {
			String data = new String(cubf,0,readCharNo);
			System.out.println(data);
		}
		re.close();
	}
}
