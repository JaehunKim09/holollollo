package test_ban;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.ConnUtil;

public class test_ban_update1 {

	public static void main(String[] args) throws IOException {
	
	//db연결
	Connection con=null;
	PreparedStatement pstmt=null;

		//delete
		StringBuffer sql=new StringBuffer();
		sql.append("update ban ");
		sql.append("set kor=90 ");
		sql.append("where name='b' ");
		
		try {
			con=ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
		
			
			int i=pstmt.executeUpdate();
			
			System.out.println("["+i+"] 변경되었습니다.");
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
