package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;   //null�������
		ResultSet rs = null;	//null�� �����	

	try {
		Class.forName("oracle.jdbc.OracleDriver");//����̹�ȣ��(Ŭ����)
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM member");
		String name = "";
		while(rs.next()) {
			name = rs.getString("name");
		}//rs�� ���� ������ true
		System.out.println("ȸ���� �̸���"+name);
	}catch(Exception e) {
		
		e.printStackTrace();
		
	}finally {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}

}
