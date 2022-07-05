package propertiesEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.ConnUtil;

/*
 * -Transaction
 * Transaction 여래거의 작업을 하나의 논리적인 작업단위로
 * 묶어주는 것을 말한다.
 * 하나의 작업 단위내의 전체 작업들이 모두 올바르게 수행되거나,
 * 또는 전체 작업이 모두 수행되지 않도록 한다.
 * 
 * -Connection 의 Transaction관련 메소드
 * void commit()  : 트랜잭션으로 설정된 모든 자원을 db에 반영한다.
 * void rollback() : 현재 트랜잭션에 설정내의 모든 작업을 되돌린다.
 * void rollback(Savepoint s) : Savepoint설정이후의 모든 작업을 되돌림
 * void setSavepoint(String name): 현재의 트랜잭션내의 Savepoint 를 설정
 * void setAutoCommit(boolean value): auto-commit기능을 설정한다.
 * */

public class jdbc_pre_Transaction {

	public static void main(String[] args) {
		/*
		 * transaction : 논리적인 작업단위
		 * insert, delete, update 등의 작업들을 하나의 논리적인 작업단위로
		 * 묶어서 쿼리실행시 모든 작업이 정상처리된 경우에 commit을
		 * 실행해서 db에 반영하고, 쿼리실행중 하나라도 정상처리되지않은
		 * 경우 rollback 을 실행해서 작업단위내의 모든 작업을 취소한다.
		 * 
		 * */
		StringBuffer sql1=new StringBuffer();
		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?)");
		
		StringBuffer sql2=new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname=?,loc=? ");
		sql2.append("where deptno=?");
		
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			//----------transaction시작---------------
			//하나의 논리적인 작업단위 시작
			con=ConnUtil.getConnection();
			//autoCommit기능 비활성화 시킨다.
			con.setAutoCommit(false);
			//------1번작업시작------
			pstmt=con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 200);//deptno
			pstmt.setString(2, "다른애");//dname
			pstmt.setInt(3, 400);//college
			pstmt.setString(4, "1호관");//loc
			int i=pstmt.executeUpdate();
			System.out.println(i+"개 행 추가");
			//-----1번작업 종료-----
			
			//-----2번작업 시작-----
			pstmt=con.prepareStatement(sql2.toString());
			pstmt.setString(1, "안경학과");
			pstmt.setString(2, "7호관");
			pstmt.setInt(3, 200);//deptno
			int j=pstmt.executeUpdate();
			System.out.println(j+"개 행 업뎃");
			//-----2번작업 종료-----
			//쿼리가 정상적으로 실행된 경우db에 반영
			con.commit();//실행 완료
			System.out.println("db에 반영됨...");
			//-----transaction종료------
			
		}catch (SQLException e) {
			try {
				con.rollback();//실행취소
				System.out.println("db에 반영 취소.....");
				
			}catch (Exception e2) {
				e2.getMessage();
			}
		}finally {
			try { if(pstmt != null)pstmt.close();}catch (Exception e) {}
			try { if(con != null)con.close();}catch (Exception e) {}

		}
	}
}
