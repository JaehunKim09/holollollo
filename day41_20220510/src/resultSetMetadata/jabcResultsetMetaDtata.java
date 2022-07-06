package resultSetMetadata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

import jdbc.ConnUtil;

/*
 * resultSetMetadata:
 * java.sql.ResultSetMetaData/java.sql.Types
 * Metadata�� �������� ������Ҹ� ��Ÿ����. ResultSetMetaData��
 * ResultSetMetaData�� �����ϴ� ��� ��Ҹ� �˾Ƴ����ִ� �޼ҵ带 �����Ѵ�.
 * */
public class jabcResultsetMetaDtata {
	// ���� select * from professor
	public static void main(String[] args) throws IOException, SQLException{
		// Ű����� ������ sql���ڸ� �Է¹޴� �Է���ġ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("sql�Է� : ");
		String sql = br.readLine();
		Connection conn = ConnUtil.getConnection();

		PreparedStatement ptmt = conn.prepareStatement(sql);
		ResultSet rs = ptmt.executeQuery();

		// ���� ���� ��� ������ �ΰ������� ������ �ִ� resultSetMetadata ���
		ResultSetMetaData rsmd = rs.getMetaData();

		System.out.println(rsmd.getColumnType(6));
		System.out.print("Į���� ���� : " + rsmd.getColumnCount());
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		System.out.println("\n---------------------------------------------------------------------------------------------");
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnTypeName(i) + "\t");
		}
		System.out.println();
		int Į������ = rsmd.getColumnCount();
		while (rs.next()) {
			for (int Į����ȣ = 1; Į����ȣ <= Į������; Į����ȣ++) {
				int Į��Ÿ�� = rsmd.getColumnType(Į����ȣ);
				switch (Į��Ÿ��) {
				case 2:
					System.out.print(rs.getInt(Į����ȣ));
					break;
				case Types.VARCHAR:
					System.out.print(rs.getString(Į����ȣ) + "\t");
					break;
				case Types.TIMESTAMP:// 93
					System.out.print(rs.getDate(Į����ȣ) + "\t");

				default:
					break;
				}//switch
			}//for
			System.out.println();
		}//while

	}//main

}//class
