package Sessões;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSessoes
 */
@WebServlet("/ServletSessoes2")
public class ServletSessoes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSessoes() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static final String NOME = "nome";
    public static final String SOBRENOME = "sobrenome";
    public static final String CPF = "cpf";
    public static final String EMAIL = "email";
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		
		resposta.write("<html><body>");
		
		String Nome = request.getParameter(NOME);
		String Sobrenome = request.getParameter(SOBRENOME);
		String CPF = request.getParameter(CPF);
		String Email = request.getParameter(EMAIL);
		
		
		if (autentica(Nome,Sobrenome,Cpf, Email)) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute(NOME, Nome);
			sessao.setAttribute(SOBRENOME, Sobrenome);
			sessao.setAttribute(CPF, Cpf);
			sessao.setAttribute(EMAIL, Email);
			
			
			resposta.write("Bem vindo " + Nome + Sobrenome + Cpf + Email);
		} else {
			resposta.write("Tudo certo!");
		
					
}
