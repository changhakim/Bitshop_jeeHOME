package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AccountBean account = null;
		String dir = request.getParameter("dir");
		if(dir == null){
			int a = request.getServletPath().indexOf(".");
			dir = request.getServletPath().substring(1,a);
		}
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null)?"move":cmd;
		String page = request.getParameter("page");
		page = "main";
		String dest = request.getParameter("dest");
		System.out.println("1.dest======"+dest);
		switch(cmd) {
		case "move": 
			System.out.println("==============openform==dest"+dest);
			request.setAttribute("dest", dest);
			Command.move(request, response,dir,page);
			break;
		case "open-account":
			
			account = new AccountBean();
			String money = request.getParameter("money");
			account.setAccountNum(AccountServiceImpl.getInstance().createAccountNum());
			account.setToday(AccountServiceImpl.getInstance().findDate());
			account.setMoney(Integer.parseInt(money));
			AccountServiceImpl.getInstance().openAccount(account);
			
			if(dest==null) {
				dest="open-result";
			}
			
			request.setAttribute("dest", dest);
			request.setAttribute("acc", account);
			
			
			Command.move(request, response, dir, page);
			break;
		}
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
