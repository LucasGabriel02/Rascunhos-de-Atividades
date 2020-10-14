package br.com;
import javax.servlet.RequestDispatcher;
import  javax.servlet.Filter ;
import  javax.servlet.FilterChain ;


public class AutorizarFilter {
	
	String action = httpRequest.getParameter("action")
	
	if(action.eqauls("list")) {
		HttpSession = httpRequest.getsession();
		Usuario usuario = this.FindBylogin(session.getAttribute("user").toString());
		
	}
	
	if(!Usuario.isAdministrador()) {
		
		RequestDispatcher rd = httpRequest.getRequestDispatcher("idex.jsp");
		httpRequest.setAttribute("permissao", +Usuario.getNome()+"Acesso Negado");
		rd.forward(httprequest, httpResponse);
	}
	
	else {
		
		RequestDispatcher rd = httpRequest.getRequestDispatcher("Usuario.jsp");
		rd.forward(httpRequest, httpResponse);
	}
	
	public void init(FilterConfig) thrws ServlentException{
		
		
	}
	
	public void init(FilterConfig) thows ServletException{
		
	}
	
	
	public void destroy() {
		
	}

}
