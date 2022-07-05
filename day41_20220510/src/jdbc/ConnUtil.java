package jdbc;
/*
 * PreparedStatement객체의 생성 및 바인딩 변수의 사용
 * String sql = "insert into department values(?,?,?,?)";
 * PreparedStatement pstmt=con.preparedStatement(sql);
 * -바인딩 변수의 개수만큼 순서대로 해당 변수와 대체될 값을 지정해준다
 * pstmt.setInt(1,203);
 * pstmt.setString(2,"컴퓨터공학");
 * pstmt.setInt(3,200);
 * pstmt.setInt(4."4호관");
 * 바인딩 변수는 컬럼명에는 절대 사용 할 수 없다.
 * 
 * -기본키 (Primary key)
 * 테이블의 각 행을 다른 행과 구분해 주는 역할을 하는 필드
 * 유일성, 반드시 값이 있어야 함, 중복x
 * 즉, not null, unique 제약 조건을 포함해야 한다.
 * 
 * -외래키=외부키(Foreign key)
 * 한 테이블의 기본키에 관계를 갖는 두개의 테이블이있는 경우를 위한 것.
 * 외부키는 테이블 내의 한 열의 필드인 동시에 다른 테이블(부모)의 기본키인 열의 필드를 말한다.
 * 
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtil {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
	}
}
