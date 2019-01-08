package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.AccountBean;

public class AccountDAOImpl implements AccountDAO {
	private static AccountDAOImpl instance = new AccountDAOImpl();
	private AccountDAOImpl() {}
	public static AccountDAOImpl getInstance() {return instance;}

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	@Override
	public void openAccount(AccountBean account) {
		System.out.println("다오진입");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("INSERT INTO account(accountNum,money,today)\n"
					+ "VALUES('%s','%d','%s')", account.getAccountNum(),account.getMoney(),account.getToday());
		System.out.println("SQL"+sql);
			if(stmt.executeUpdate(sql)==1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String createAccountNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AccountBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AccountBean> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String findDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deposit(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withDraw(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(String accountNum) {
		// TODO Auto-generated method stub
		
	}
	
}
