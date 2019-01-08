package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;

public class MemberDAOImpl implements MemberDAO{
	private static MemberDAOImpl instance = new MemberDAOImpl();
	private MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {return instance;}

	

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	


	@Override
	public void joinMember(MemberBean member) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("INSERT INTO member(id,name,pass,ssn) \n"
					+ "VALUES('%s','%s','%s','%s')", member.getId(),member.getName(),member.getPass(),member.getSsn());
			//rs =stmt.executeQuery(sql);//조회
			System.out.println("sql::"+sql);
			if(stmt.executeUpdate(sql)==1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<MemberBean> listMember(String id, String name, String pass, String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberBean> findByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findByid(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findSomeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existMember(String id, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePass(String id, String pass, String newpass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteId(String id, String pass) {
		// TODO Auto-generated method stub
		
	}

}
