package this18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("src/this18/SerializableWriter.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassA cla=new ClassA();
		cla.field1 = 1;
		cla.field2.field1 = 2;
		cla.field3 = 3;
		cla.field4 = 4;
		oos.writeObject(cla);
		oos.flush();oos.close();fos.close();

	}

}
