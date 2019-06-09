package br.com.carestini.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.carestini.gerenciador.acao.AlteraEmpresa;
import br.com.carestini.gerenciador.acao.ListaEmpresas;
import br.com.carestini.gerenciador.acao.MostraEmpresa;
import br.com.carestini.gerenciador.acao.NovaEmpresa;
import br.com.carestini.gerenciador.acao.RemoveEmpresa;


@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
		if(paramAcao.equals("listaEmpresas")){
			
			ListaEmpresas acao = new ListaEmpresas();
			acao.executa(request, response);
			
		} else if(paramAcao.equals("removeEmpresa")){
			
			RemoveEmpresa acao = new RemoveEmpresa();
			acao.remove(request, response);
			
		} else if(paramAcao.equals("mostraEmpresa")){
			
			MostraEmpresa acao = new MostraEmpresa();
			acao.mostra(request, response);
			
		} else if(paramAcao.equals("alteraEmpresa")){
			
			AlteraEmpresa acao = new AlteraEmpresa();
			acao.altera(request, response);
			
		} else if(paramAcao.equals("novaEmpresa")){
			
			NovaEmpresa acao = new NovaEmpresa();
			acao.adiciona(request, response);
			
		}
		
		
		
	}

}
