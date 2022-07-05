package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbc_delete {

	public static void main(String[] args) {
		StringBuffer sql=new StringBuffer();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		sql.append("delete from department ");
		sql.append("where dname='또나야' ");
		
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());

			int i= pstmt.executeUpdate();
			System.out.println(i+"삭제완료");

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
