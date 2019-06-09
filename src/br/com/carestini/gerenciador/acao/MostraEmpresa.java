package br.com.carestini.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.carestini.gerenciador.modelo.Banco;
import br.com.carestini.gerenciador.modelo.Empresa;

public class MostraEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("mostra empresa");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.buscaEmpresaPeloId(id);
		
		request.setAttribute("empresa", empresa);
		
		return "forward:formAlteraEmpresa.jsp";
	}
	
}
