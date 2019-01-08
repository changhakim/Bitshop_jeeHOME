package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		MemberBean member = null;
		String dir = request.getParameter("dir");
		if(dir == null){
			int a = request.getServletPath().indexOf(".");
			dir = request.getServletPath().substring(1,a);
		}
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null)?"move":cmd;
		String page = request.getParameter("page");
		page = (page == null)?"main":page;
		String dest = request.getParameter("dest");
		switch(cmd) {
		case "login":
			String id = request.getParameter("uid");
			String pass = request.getParameter("upw");
			System.out.println("���̵�="+id+"��й�ȣ="+pass);
			
			if(!(id.equals("test")&&pass.equals("test"))) {
				dir = "";
				page = "index";
			}
			request.setAttribute("name", "test");
			request.setAttribute("compo", "login-success");
				Command.move(request, response,dir,page);
				
			
			
			break;
		case "move":
			
			dest=(dest==null)?"mypage":dest;
			
			request.setAttribute("dest", dest);
			Command.move(request, response,dir,page);
			break;
		case "join":
			 member = new MemberBean();
			dest=(dest==null)?"mypage":dest;
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().joinMember(member);
			
			request.setAttribute("member", member);
			request.setAttribute("dest",dest);
			Command.move(request, response,dir,page);
		
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
