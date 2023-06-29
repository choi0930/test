package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/mServlet")
public class memberServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		doHandle(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		doHandle(request, response);
	}
	private void doHandle(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		String id= request.getParameter("id");
		String pwd =request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String select = request.getParameter("emailSelect");
		String tel = request.getParameter("tel");
		String tel2 = request.getParameter("tel2");
		String address = request.getParameter("address");
		String address2 = request.getParameter("address2");
		
		
		String total_address = address+address2;
		
		MemDAO dao = new MemDAO();
		Member vo = new Member();
		
		vo.setId(id);
		vo.setPwd(pwd);
		vo.setName(name);
		
		if(select.equals("직접입력")) {
			vo.setEmail(email);
		}else {
			String total_email = email+select;
			vo.setEmail(total_email);
		}
		
		
		if(tel.contains("-")) {
			String home_tel = "";
			String[] _tel = tel.split("-");
			for(int i =0; i<_tel.length; i++) {
				home_tel += _tel[i];	
			}
			vo.setTel(home_tel);
		}else {
			vo.setTel(tel);
		}
		
		if(tel2.contains("-")) {
			String self_tel = "";
			String[] _tel2 = tel2.split("-");
			for(int i =0; i<_tel2.length; i++) {
				self_tel += _tel2[i];
			}
			vo.setTel2(self_tel);
		}else {
			vo.setTel2(tel2);
		}
		
		vo.setAddress(total_address);
		
		dao.addMember(vo);
		
	}
}
