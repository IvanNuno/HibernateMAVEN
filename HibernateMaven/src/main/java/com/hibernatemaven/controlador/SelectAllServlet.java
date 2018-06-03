package com.hibernatemaven.controlador;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import javax.management.Query;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernatemaven.modelo.Paciente;

public class SelectAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Paciente.class);   //Clase que sera mapeada
		cfg.configure("hibernate.cfg.xml");	
		SessionFactory factory=cfg.buildSessionFactory();
		Session sesion=factory.openSession();
		
		/////////////////////////////////////////////////////////////////////////
		//Query query=(Query) sesion.createQuery("select p from " + Paciente.class.getName() + " p");
		//List<Paciente> pacientes = query.getResultList();
		Stream<Paciente> pacientes = sesion.createQuery("select p from " + Paciente.class.getName() + " p").stream();
		Object[] a=pacientes.toArray();
		for(int i=0; i<a.length;i++) {
			response.getWriter().append(((Paciente) a[i]).getIdPaciente()+"</br>");
			response.getWriter().append(((Paciente) a[i]).getNombrePaciente()+"</br>");
			response.getWriter().append(((Paciente) a[i]).getApellidoPaciente()+"</br>");
			response.getWriter().append(((Paciente) a[i]).getNumeroCuarto()+"</br>");
			response.getWriter().append("-------------------------------------------</br>");
		}
		/////////////////////////////////////////////////////////////////////////
		sesion.close();
		
	}

}
