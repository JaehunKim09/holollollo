package jdbc;
/*
 * PreparedStatement��ü�� ���� �� ���ε� ������ ���
 * String sql = "insert into department values(?,?,?,?)";
 * PreparedStatement pstmt=con.preparedStatement(sql);
 * -���ε� ������ ������ŭ ������� �ش� ������ ��ü�� ���� �������ش�
 * pstmt.setInt(1,203);
 * pstmt.setString(2,"��ǻ�Ͱ���");
 * pstmt.setInt(3,200);
 * pstmt.setInt(4."4ȣ��");
 * ���ε� ������ �÷����� ���� ��� �� �� ����.
 * 
 * -�⺻Ű (Primary key)
 * ���̺��� �� ���� �ٸ� ��� ������ �ִ� ������ �ϴ� �ʵ�
 * ���ϼ�, �ݵ�� ���� �־�� ��, �ߺ�x
 * ��, not null, unique ���� ������ �����ؾ� �Ѵ�.
 * 
 * -�ܷ�Ű=�ܺ�Ű(Foreign key)
 * �� ���̺��� �⺻Ű�� ���踦 ���� �ΰ��� ���̺����ִ� ��츦 ���� ��.
 * �ܺ�Ű�� ���̺� ���� �� ���� �ʵ��� ���ÿ� �ٸ� ���̺�(�θ�)�� �⺻Ű�� ���� �ʵ带 ���Ѵ�.
 * 
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtil {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
	}
}
