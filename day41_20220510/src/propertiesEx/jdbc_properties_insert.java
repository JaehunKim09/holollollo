/*
 * - Properties �� �̿��� sql ���� �غ���
 * sql���� ������ properties ���Ͽ� �����ϰ�
 * properties�� �̿��ؼ�properties������
 * �оgetProperty(String key)�� Ȱ���ؼ�
 * ������ SQL���� �������ִ�.
 * department.properties�� ������
 * */
package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import jdbc.ConnUtil;

public class jdbc_properties_insert {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/propertiesEx/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnUtil.getConnection();
			// department.properties�� ���ǵ�
			// sql�� �����ͼ� preparedStatement�����
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));

			// parameter(���ε������� �� �Ҵ��ϱ�) �����ϱ�
			pstmt.setInt(1, 106);
			pstmt.setString(2, "������а�");
			pstmt.setInt(3, 105);
			pstmt.setString(4, "5ȣ��");
			int i = pstmt.executeUpdate();
			System.out.println(i + "���� ���� �߰��Ǿ����ϴ�.");
		} catch (Exception e) {
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
