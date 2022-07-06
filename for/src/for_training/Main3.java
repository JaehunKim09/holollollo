package for_training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main3 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int a=Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= a; i++) {
			st=new StringTokenizer(br.readLine()+" ");
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+i+": ");
			bw.write(b+" + "+c+" = ");
			bw.write((b+c)+"\n");
			
		}
		bw.flush(); bw.close(); br.close();
		System.out.println();
	}

}
