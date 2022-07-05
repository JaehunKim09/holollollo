package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import jdbc.ConnUtil;

public class jdbc_properties_select {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro=new Properties();
		pro.load(new FileInputStream("src/propertiesEx/department.properties"));
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=ConnUtil.getConnection();
			pstmt=con.prepareStatement(pro.getProperty("department_select"));
			
			pstmt.setInt(1, 105);
			
			System.out.println("deptno  dname \tcollege loc");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.print(rs.getInt("college")+"\t");
				System.out.println(rs.getString("loc"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {if (pstmt != null)pstmt.close();} catch (Exception e2) {e2.getMessage();}
			try {if (con != null)con.close();} catch (Exception e2) {e2.getMessage();}
			try {if (rs != null)rs.close();} catch (Exception e2) {e2.getMessage();}
		}
	}
}
