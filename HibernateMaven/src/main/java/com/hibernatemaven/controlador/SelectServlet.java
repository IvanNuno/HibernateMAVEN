package com.hibernatemaven.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatemaven.modelo.Paciente;

public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Paciente.class);   //Clase que sera mapeada
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session sesion=factory.openSession();
		Transaction transa=sesion.beginTransaction();
		
		/////////////Manipulacion del POJO//////////////////
		int pacienteId=Integer.parseInt(request.getParameter("txtID"));
		Paciente nvoPaciente = sesion.get(Paciente.class, new Integer(pacienteId));
		if(nvoPaciente!=null) {
			response.getWriter().append("Paciente con Id: "+nvoPaciente.getIdPaciente()+"<br>");
			response.getWriter().append("Nombre del paciente: "+nvoPaciente.getNombrePaciente()+"<br>");
			response.getWriter().append("Nombre del paciente: "+nvoPaciente.getApellidoPaciente()+"<br>");
			response.getWriter().append("Nombre del paciente: "+nvoPaciente.getNumeroCuarto()+"<br>");
		}
		else
			response.getWriter().append("Id especificado no existe");
		////////////////////////////////////////////////////
		transa.commit();
		sesion.close();
	}

}
