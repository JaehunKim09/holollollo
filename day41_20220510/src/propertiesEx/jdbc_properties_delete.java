package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import jdbc.ConnUtil;

public class jdbc_properties_delete {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro=new Properties();
		pro.load(new FileInputStream("src/propertiesEx/department.properties"));
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=ConnUtil.getConnection();
			pstmt=con.prepareStatement(pro.getProperty("department_delete"));
			pstmt.setInt(1, 200);
			int i=pstmt.executeUpdate();
			System.out.println(i+"∞≥ ªË¡¶");
		}catch (Exception e) {
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
