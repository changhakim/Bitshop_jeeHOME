package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDAO {

	public void openAccount(AccountBean account);
	public String createAccountNum();
	
	public AccountBean findByAccountNum(String accountNum);
	public ArrayList<AccountBean> list();
	public ArrayList<AccountBean> findall();
	
	public int count();
	public String findDate();
	
	public void deposit(String accountNum,int money);
	public void withDraw(String accountNum,int money);
	
	public void deleteAccount(String accountNum);
}
