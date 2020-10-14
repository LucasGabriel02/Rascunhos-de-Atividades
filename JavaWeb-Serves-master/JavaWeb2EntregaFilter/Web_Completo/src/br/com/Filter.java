package br.com;

import javax.servlet.FilterChain;
import  javax.servlet.Filter ;
import  javax.servlet.FilterChain ;


public class Filter {
	
	public Filter() {
		
	}
	
	public void destroy() {
		
	}
	public void doFilter(ServlentRequest request, ServlentResponse,FilterChain chain) throws IOException, ServletException{
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig fConfig) throws ServletException{
		
		
		 HttpServletRequest rq = (HttpServletRequest)request;
	     HttpServletResponse rp = (HttpServletResponse)response;
	        
		System.out.println("Acesso no Filter");
		String Email = request.getParameter("email");
		String Senha = request.getParameter("senha");
		
		if(Senha.equals("SenhaAcesso")&& Email.equals("LoginAcesso")) {
			rp.sendRedirect(rq.getContextPath()+"SejaBemVindo.jsp");
		}else {
			chain.doFilter(request, response);
		}

	}
	
	<script>
	function lerStorage(){
		
		for (var k = 0; k < localStorage.length; k++) {
			
			var armazenamento = localStorage.getItem("Banco Salvo da Pasta FILTER"+k);
			
			document.write(armazenamento);
			
		}
		
	}
	
	
</script>
	

}
