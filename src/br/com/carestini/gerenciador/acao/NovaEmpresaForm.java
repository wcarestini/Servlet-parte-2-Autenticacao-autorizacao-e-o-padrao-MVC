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

public class NovaEmpresaForm implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		return "forward:formNovaEmpresa.jsp";
	}
	
}
