package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {

	public void createAdmin(String name,String pass,String auth);
	
	public ArrayList<AdminBean> employeeList();
	public ArrayList<AdminBean> findByauth(String auth);
	public AdminBean findByAdminNum(String adminNum);
	public int countAdmin();
	public boolean existbyEmployee();
	
	public void updatePass(String adminNum,String pass,String newpass);
	public void updateAuth(String adminNum, String pass,String newpass);
	
	public void deleteAdmin(String adminNum,String pass);
}
