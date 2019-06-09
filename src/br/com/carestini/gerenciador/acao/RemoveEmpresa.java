package br.com.carestini.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.carestini.gerenciador.modelo.Banco;

public class RemoveEmpresa {
	
	public void remove(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		response.sendRedirect("entrada?acao=listaEmpresas");
	}
	
}
