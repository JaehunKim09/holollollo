package test_ban;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

import jdbc.ConnUtil;

/*
 * ����] Ű����� '�̸�,����,����,����' �̸��� �� ������ �Է¹޾� ���
 * �����ϰ� �հ�, ����� ����Ͻÿ�(�Ʒ��� ���� sql������ ������ ����Ͻÿ�)
 * �̸��� 0�϶����� �ݺ��ؼ� �Է����ּ���
 * �̸��� ������������ ����ϱ�(�˻����忡 �߰� order by name asc/desc)
 * ��Ʈ)
 * "insert into ban values('"+name+"',"+kor+","+eng+")
 * "insert into ban values('ȫ�浿',100,100,100)"
 * �������)
 * �̸�:a
 * ����:100
 * ����:100
 * ����:100
 * [1]�� �߰��Ǿ����ϴ�
 * 
 * �̸�:a
 * ����:100
 * ����:100
 * ����:100
 * [2]�� �߰��Ǿ����ϴ�.
 * 
 * ------����ϱ�
 * �̸�     ����     ����     ����    ����     ���
 * --------------------------------
 * a    100   100  100   300   100
 * */

public class Test_Ban {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/test_ban/ban.properties"));
		PreparedStatement pstmt = null;
		
		String a = sc.next();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(pro.getProperty("ban_insert"));
			while(sc.next().equals("0")) {
				pstmt.setString(1, a);
				pstmt.setInt(2, b);
				pstmt.setInt(3, c);
				pstmt.setInt(4, d);
				int i = pstmt.executeUpdate();
				System.out.println(i + "�� �߰�");
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				System.out.println(e2.getStackTrace());
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception e2) {
				System.out.println(e2.getStackTrace());
			}
		}
	}
}
