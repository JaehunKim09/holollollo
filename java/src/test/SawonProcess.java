package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;

/*
 * sawon
 * */
public class SawonProcess {

	public static void main(String[] args) {
		//sawon.txt파일 읽어오기
		String filename="src/test/sawon.txt";
		//sawonResult.txt 저장하기
		String filename2 = "src/test/sawonResult.txt";

		try {
			//1. 파일에서 읽어오기(문자를 읽어오는 파일객체생성)
			FileReader fr = new FileReader(filename);
			//2. 버퍼에서 읽기
			BufferedReader br=new BufferedReader(fr);
			
			//3. 출력하기
			FileWriter fw=new FileWriter(filename2);
			
			//4.PrintWriter 객체 생성
			PrintWriter pw=new PrintWriter(fw);
			//5. Calendar객체 얻어오기
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);//년
			int month = cal.get(Calendar.MONTH);//월
			int day = cal.get(Calendar.DAY_OF_MONTH);//일
			
			String line="";//sawonResult.txt 파일 읽어와서 담을 변수
			//타이틀만 sawonResult.txt 파일에 저장
			pw.printf("%s년 신입사원 평가점수\n",year);
			pw.println("---------------------------");
			pw.println("평가일 : "+year+"년"+(month+1)+"월"+day+"일");
			pw.println("이름 java jquery html5 css3 total avg");
			pw.println("---------------------------");
			
			//화면에 타이틀만 출력
			System.out.printf("%s년 신입사원 평가점수\n",year);
			System.out.println("---------------------------");
			System.out.println("평가일 : "+year+"년"+(month+1)+"월"+day+"일");
			System.out.println("이름 java jquery html5 css3 total avg\n");
			System.out.println("---------------------------");
			
			while(true) {
				line = br.readLine();
				if(line==null)break;
			
				
				/* String str[]=line.split(",");
				 //-----------화면에출력
				 System.out.print(str[0]+"");//이름
				 System.out.print(str[1]+"");//java
				 System.out.print(str[2]+"");//jquery
				 System.out.print(str[3]+"");//html5
				 System.out.print(str[4]+"");//css3
				 System.out.println();
				 //-------------------------파일에출력
				 pw.print(str[0]+"");
				 pw.print(str[1]+"");
				 pw.print(str[2]+"");
				 pw.print(str[3]+"");
				 pw.print(str[4]+"");
				 System.out.println();
				 //------------------이 부분을 정수로 변환한 후 변수에 담고
				 String name = str[0];
				 int java = Integer.parseInt(str[1]);
				 int jquery = Integer.parseInt(str[2]);
				 int html5 = Integer.parseInt(str[3]);
				 int css3 = Integer.parseInt(str[4]);
				 int total = java+jquery+html5+css3;
				 double avg = total/4;*/
				
				String str[] = line.split(",");
				String c = "";
				int total=0;
				String name =str[0];
				
				for (int i = 1; i < str.length; i++) {
					total += Integer.parseInt(str[i]);
					c+=str[i]+" ";
				}
				double avg = total/4;
				//sawonResult.txt에 저장
				pw.print(name+" "+c+total+" "+avg+"\n");
				
				//화면에 출력
				System.out.println(name+" "+c+total+" "+avg);
				System.out.println("------------------------");
				 
			}
			pw.flush();
			//자원반환
			br.close(); fr.close(); pw.close(); fw.close();
			
			//2021 신입사원 평가점수
			//-----------------------------------------
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
