package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcEx_pre_select {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuffer sql =new StringBuffer();
		ResultSet rs = null;

		sql.append("select a.name,a.profno,a.position,b.dname ");
		sql.append("from professor a, department b ");
		sql.append("where a.deptno=b.deptno ");// 조인
		sql.append("and a.deptno=? ");// like '%' || ? || '%' ");
		// || => 문자열 결합, 논리연산자 (조건 or 조건) && => 입력 ==> and(자바의 Scanner기능)

		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(1, 203);// 물음표에 값을 채움, 정수값음 setInt
			rs = pstmt.executeQuery();//데이터 읽어오기
			System.out.println("이름 \t 교수 \t 전공학과 \t\t직책");
			System.out.println("====================================");

			while (rs.next()) {
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getInt("profno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.println(rs.getString("position"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류입니다.");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.getStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.getStackTrace();
			}
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.getStackTrace();
			}

		}
	}

}
