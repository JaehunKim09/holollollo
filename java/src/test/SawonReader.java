package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *
 *a1,90,90,90,90
 *a2,80,80,80,80
 *a3,70,70,70,70
 * */
public class SawonReader {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("src/test/Sawon.txt");
		BufferedReader br=new BufferedReader(fr);
		
		
		int c=0;
		String line ="";
		while(true) {
			line = br.readLine();
			if(line==null) {
				break;
			}
			System.out.println("-----------");
			System.out.println((++c)+": "+line);
			
		}
//		String line = br.readLine();
//		String line1 = br.readLine();
//		String line2 = br.readLine();
//		System.out.println(line+"\n"+line1+"\n"+line2);
		br.close(); fr.close();
//		
	}

}
