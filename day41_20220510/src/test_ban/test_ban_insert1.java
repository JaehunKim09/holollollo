package test_ban;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.ConnUtil;

public class test_ban_insert1 {

	public static void main(String[] args) throws IOException {
	String name;
	int kor,eng,mat;
	int sum;
	double avg;
	
	//db����
	Connection con=null;
	PreparedStatement pstmt=null;
	
	for (int i = 1;; i++) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸� :\n");
		name = br.readLine();
		if(name.equals("0"))
			break;
		
		System.out.println("���� :");
		kor=Integer.parseInt(br.readLine());
		System.out.println("���� : ");
		eng=Integer.parseInt(br.readLine());
		System.out.println("���� : ");
		mat=Integer.parseInt(br.readLine());
		
		sum=kor+eng+mat;
		
		avg=sum/3.0;
		
		//insert
		StringBuffer sql=new StringBuffer();
		sql.append("insert into ban values(?,?,?,?,?,?) ");
		
		try {
			con=ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, name);
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, mat);
			pstmt.setInt(5, sum);
			pstmt.setDouble(6, avg);
			pstmt.executeUpdate();
			System.out.println("["+i+"] �߰��Ǿ����ϴ�.");
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
}