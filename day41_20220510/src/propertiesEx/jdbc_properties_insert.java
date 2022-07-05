/*
 * - Properties 를 이용한 sql 문을 해보자
 * sql문을 별도의 properties 파일에 정의하고
 * properties를 이용해서properties파일을
 * 읽어서getProperty(String key)를 활용해서
 * 각각의 SQL문을 얻을수있다.
 * department.properties를 만들자
 * */
package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import jdbc.ConnUtil;

public class jdbc_properties_insert {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/propertiesEx/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnUtil.getConnection();
			// department.properties에 정의된
			// sql를 가져와서 preparedStatement만들기
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));

			// parameter(바인딩변수에 값 할당하기) 셋팅하기
			pstmt.setInt(1, 106);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 105);
			pstmt.setString(4, "5호관");
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 추가되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null)pstmt.close();
					
			} catch (Exception e2) {
				System.out.println(e2.getStackTrace());
			}
			try {
				if (con != null)con.close();
					
			} catch (Exception e2) {
				System.out.println(e2.getStackTrace());
			}
		}
	}
}
