package propertiesEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.ConnUtil;

/*
 * -Transaction
 * Transaction �������� �۾��� �ϳ��� ������ �۾�������
 * �����ִ� ���� ���Ѵ�.
 * �ϳ��� �۾� �������� ��ü �۾����� ��� �ùٸ��� ����ǰų�,
 * �Ǵ� ��ü �۾��� ��� ������� �ʵ��� �Ѵ�.
 * 
 * -Connection �� Transaction���� �޼ҵ�
 * void commit()  : Ʈ��������� ������ ��� �ڿ��� db�� �ݿ��Ѵ�.
 * void rollback() : ���� Ʈ����ǿ� �������� ��� �۾��� �ǵ�����.
 * void rollback(Savepoint s) : Savepoint���������� ��� �۾��� �ǵ���
 * void setSavepoint(String name): ������ Ʈ����ǳ��� Savepoint �� ����
 * void setAutoCommit(boolean value): auto-commit����� �����Ѵ�.
 * */

public class jdbc_pre_Transaction {

	public static void main(String[] args) {
		/*
		 * transaction : ������ �۾�����
		 * insert, delete, update ���� �۾����� �ϳ��� ������ �۾�������
		 * ��� ��������� ��� �۾��� ����ó���� ��쿡 commit��
		 * �����ؼ� db�� �ݿ��ϰ�, ���������� �ϳ��� ����ó����������
		 * ��� rollback �� �����ؼ� �۾��������� ��� �۾��� ����Ѵ�.
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
			//----------transaction����---------------
			//�ϳ��� ������ �۾����� ����
			con=ConnUtil.getConnection();
			//autoCommit��� ��Ȱ��ȭ ��Ų��.
			con.setAutoCommit(false);
			//------1���۾�����------
			pstmt=con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 200);//deptno
			pstmt.setString(2, "�ٸ���");//dname
			pstmt.setInt(3, 400);//college
			pstmt.setString(4, "1ȣ��");//loc
			int i=pstmt.executeUpdate();
			System.out.println(i+"�� �� �߰�");
			//-----1���۾� ����-----
			
			//-----2���۾� ����-----
			pstmt=con.prepareStatement(sql2.toString());
			pstmt.setString(1, "�Ȱ��а�");
			pstmt.setString(2, "7ȣ��");
			pstmt.setInt(3, 200);//deptno
			int j=pstmt.executeUpdate();
			System.out.println(j+"�� �� ����");
			//-----2���۾� ����-----
			//������ ���������� ����� ���db�� �ݿ�
			con.commit();//���� �Ϸ�
			System.out.println("db�� �ݿ���...");
			//-----transaction����------
			
		}catch (SQLException e) {
			try {
				con.rollback();//�������
				System.out.println("db�� �ݿ� ���.....");
				
			}catch (Exception e2) {
				e2.getMessage();
			}
		}finally {
			try { if(pstmt != null)pstmt.close();}catch (Exception e) {}
			try { if(con != null)con.close();}catch (Exception e) {}

		}
	}
}
