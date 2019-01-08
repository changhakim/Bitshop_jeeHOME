package service;

import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{

	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {}
	
	public static MemberServiceImpl getInstance() {return instance;}
	
	@Override
	public void joinMember(MemberBean member) {
		System.out.println("아이디"+member.getId());
		System.out.println("이름"+member.getName());
		System.out.println("비번"+member.getPass());
		System.out.println("주번"+member.getSsn());
		MemberDAOImpl.getInstance().joinMember(member);
		
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
