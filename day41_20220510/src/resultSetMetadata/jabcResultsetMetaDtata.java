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
 * Metadata는 데이터의 구성요소를 나타낸다. ResultSetMetaData는
 * ResultSetMetaData을 구성하는 모든 요소를 알아낼수있는 메소드를 제공한다.
 * */
public class jabcResultsetMetaDtata {
	// 실행 select * from professor
	public static void main(String[] args) throws IOException, SQLException{
		// 키보드로 실행할 sql문자를 입력받는 입력장치
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("sql입력 : ");
		String sql = br.readLine();
		Connection conn = ConnUtil.getConnection();

		PreparedStatement ptmt = conn.prepareStatement(sql);
		ResultSet rs = ptmt.executeQuery();

		// 쿼리 수행 결과 집합의 부가정보를 가지고 있는 resultSetMetadata 얻기
		ResultSetMetaData rsmd = rs.getMetaData();

		System.out.println(rsmd.getColumnType(6));
		System.out.print("칼럼의 갯수 : " + rsmd.getColumnCount());
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		System.out.println("\n---------------------------------------------------------------------------------------------");
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnTypeName(i) + "\t");
		}
		System.out.println();
		int 칼럼갯수 = rsmd.getColumnCount();
		while (rs.next()) {
			for (int 칼럼번호 = 1; 칼럼번호 <= 칼럼갯수; 칼럼번호++) {
				int 칼럼타입 = rsmd.getColumnType(칼럼번호);
				switch (칼럼타입) {
				case 2:
					System.out.print(rs.getInt(칼럼번호));
					break;
				case Types.VARCHAR:
					System.out.print(rs.getString(칼럼번호) + "\t");
					break;
				case Types.TIMESTAMP:// 93
					System.out.print(rs.getDate(칼럼번호) + "\t");

				default:
					break;
				}//switch
			}//for
			System.out.println();
		}//while

	}//main

}//class
