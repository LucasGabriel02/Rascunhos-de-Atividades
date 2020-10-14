package br.com;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControllerUsuario")
public class ControllerUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ControllerUsuario() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		if(email.equals("lucas@gmail.com") && senha.equals("123")) {
			request.setAttribute("Bem Vindo", email);
			
			RequestDispatcher rd = request.getRequestDispatcher("http://localhost:8080/agenda-acme/admin/dashboard/");
			rd.forward(request, response);
		}else {
			request.setAttribute("mensagem", "Email ou Senha Incorreto!");
			RequestDispatcher rd = request.getRequestDispatcher("http://localhost:8080/agenda-acme/admin/dashboard/");
			rd.forward(request, response);
		}
		

		if(email.equals("") && senha.equals("")) {
			request.setAttribute("Erro! Preencha os campos", email);
			
		}
		
		else {
			request.setAttribute("Erro! Tente Novamente!", senha);
			RequestDispatcher rd = request.getRequestDispatcher("http://localhost:8080/agenda-acme/admin/dashboard/");
			rd.forward(request, response);
		
		
		
	}
	}
}
