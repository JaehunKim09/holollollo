package test_ban;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

import jdbc.ConnUtil;

/*
 * 문제] 키보드로 '이름,국어,영어,수학' 이름별 각 점수를 입력받아 디비에
 * 저장하고 합계, 평균을 출력하시오(아래와 같이 sql파일을 생성후 사용하시오)
 * 이름이 0일때까지 반복해서 입력해주세요
 * 이름순 오름차순으로 출력하기(검색문장에 추가 order by name asc/desc)
 * 힌트)
 * "insert into ban values('"+name+"',"+kor+","+eng+")
 * "insert into ban values('홍길동',100,100,100)"
 * 출력형식)
 * 이름:a
 * 국어:100
 * 영어:100
 * 수학:100
 * [1]번 추가되었습니다
 * 
 * 이름:a
 * 국어:100
 * 영어:100
 * 수학:100
 * [2]번 추가되었습니다.
 * 
 * ------출력하기
 * 이름     국어     영어     수학    총점     평균
 * --------------------------------
 * a    100   100  100   300   100
 * */

public class Test_Ban {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/test_ban/ban.properties"));
		PreparedStatement pstmt = null;
		
		String a = sc.next();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(pro.getProperty("ban_insert"));
			while(sc.next().equals("0")) {
				pstmt.setString(1, a);
				pstmt.setInt(2, b);
				pstmt.setInt(3, c);
				pstmt.setInt(4, d);
				int i = pstmt.executeUpdate();
				System.out.println(i + "개 추가");
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				System.out.println(e2.getStackTrace());
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception e2) {
				System.out.println(e2.getStackTrace());
			}
		}
	}
}
