package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import dao.AccountDAOImpl;
import domain.AccountBean;

public class AccountServiceImpl implements AccountService {
	private static AccountServiceImpl instance = new AccountServiceImpl();
	 private AccountServiceImpl() {}
	public static AccountServiceImpl getInstance() {return instance;}













	@Override
	public void openAccount(AccountBean account) {
		System.out.println("°èÁÂ¹øÈ£--"+account.getAccountNum());
		System.out.println("³¯Â¥--"+account.getToday());
		System.out.println("ÀÜ¾×--"+account.getMoney());
		
		AccountDAOImpl.getInstance().openAccount(account);
	}

	
	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		
		/*for(int i =0;i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
				break;
			}
		}*/
		
		return account;
	}
	
	
	@Override
	public String createAccountNum() {
		String a = "";
		Random random = new Random();
		for(int i=0;i<12;i++) {
		a+=(i==3)?"-"+random.nextInt(10):random.nextInt(10);	
		}
		
		return a;
		
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
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-DD-mm hh:mm:ss:aa");
		today = sdf.format(date);
		return today;
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
