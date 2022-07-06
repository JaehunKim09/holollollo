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
		sql.append("where dname='�ǳ���' ");
		
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());

			int i= pstmt.executeUpdate();
			System.out.println(i+"�����Ϸ�");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����Դϴ�.");
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
