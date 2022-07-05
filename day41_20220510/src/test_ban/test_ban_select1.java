package test_ban;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbc.ConnUtil;

public class test_ban_select1 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		StringBuffer sql=new StringBuffer();
		ResultSet rs=null;
		
		sql.append("select * from ban ");
		
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();//������ �о����
			System.out.println("�̸� \t���� \t���� \t���� \t�հ� \t���");
			System.out.println("====================================");

			while (rs.next()) {
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getInt("kor") + "\t");
				System.out.print(rs.getInt("eng") + "\t");
				System.out.print(rs.getInt("mat") + "\t");
				System.out.print(rs.getInt("sum") + "\t");
				System.out.println(rs.getDouble("avg") + "\t");
			}
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
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
	}
}
