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
		sql.append("where a.deptno=b.deptno ");// ����
		sql.append("and a.deptno=? ");// like '%' || ? || '%' ");
		// || => ���ڿ� ����, �������� (���� or ����) && => �Է� ==> and(�ڹ��� Scanner���)

		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(1, 203);// ����ǥ�� ���� ä��, �������� setInt
			rs = pstmt.executeQuery();//������ �о����
			System.out.println("�̸� \t ���� \t �����а� \t\t��å");
			System.out.println("====================================");

			while (rs.next()) {
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getInt("profno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.println(rs.getString("position"));
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
			} catch (Exception e) {
				e.getStackTrace();
			}

		}
	}

}
