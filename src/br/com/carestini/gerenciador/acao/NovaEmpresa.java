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

public class NovaEmpresa {
	
	public void adiciona(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String nomeDaEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		
		Date dataAbertura = null;
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e){
			throw new ServletException(e);
		}
		
		
		new Banco().adiciona(new Empresa(nomeDaEmpresa));
		
		response.sendRedirect("entrada?acao=listaEmpresas");
	}
	
}
