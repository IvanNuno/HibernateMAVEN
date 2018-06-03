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

public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre; 
		String apellido;
		int cuarto;
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Paciente.class);   //Clase que sera mapeada
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session sesion=factory.openSession();
		Transaction transa=sesion.beginTransaction();
		
		/////////////Manipulacion del POJO//////////////////
		nombre=request.getParameter("txtNombre");
		apellido=request.getParameter("txtApellido");
		cuarto=Integer.parseInt(request.getParameter("txtCuarto"));
		Paciente nvoPaciente = new Paciente();
		nvoPaciente.setNombrePaciente(nombre);
		nvoPaciente.setApellidoPaciente(apellido);
		nvoPaciente.setNumeroCuarto(cuarto);
		////////////////////////////////////////////////////
		
		sesion.save(nvoPaciente);
		transa.commit();
		sesion.close();
		response.getWriter().append("Registro guardado exitosamente!!!"+"<br>");
	}

}
