package com.example.demo;

import com.example.demo.entities.Empleado;
import com.example.demo.entities.Empresa;
import com.example.demo.entities.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Sprint2Application {

	public static void main(String[] args) {

		//SpringApplication.run(Sprint2Application.class, args);

		// Instancia clase Empresa

		Empresa empresaEnsayo = new Empresa(12548789, "SFYN", "Desarrollo de Software", "Bogotá", "Calle 11 Nro 45-78", "5788963", "sortwareforyourneeds@sfyn.com");

		System.out.println("===========================================");
		System.out.println("Nombre empresa: " + empresaEnsayo.getNombreEmpresa());
		System.out.println("Nit: " + empresaEnsayo.getNitEmpresa());
		System.out.println("Tipo: " + empresaEnsayo.getTipoEmpresa());
		System.out.println("Ciudad: " + empresaEnsayo.getCiudadEmpresa());
		System.out.println("Dirección: " + empresaEnsayo.getDireccionEmpresa());
		System.out.println("Telefono: " + empresaEnsayo.getTelefonoEmpresa());
		System.out.println("Correo: " + empresaEnsayo.getCiudadEmpresa());
		System.out.println("===========================================");

		// Instancia clase Empleado

		String nombreEmpleado = "Pedro Jaramillo";
		String correoEmpleado = "pedro.jaramillo@sfyn.com";
		String rolEmpleado = "Tesorero";
		int idEmpleado = 1837364;

		Empleado empleado = new Empleado(nombreEmpleado, correoEmpleado, rolEmpleado, idEmpleado, empresaEnsayo);

		System.out.println("===========================================");
		System.out.println("Nombre Empleado: " + empleado.getNombreEmpleado());
		System.out.println("Correo: " + empleado.getCorreoEmpleado());
		System.out.println("rol: " + empleado.getRolEmpleado());
		System.out.println("ID: " + empleado.getIdEmpleado());
		System.out.println("Empresa: " + empleado.getEmpresaEmpleado().getNombreEmpresa());
		System.out.println("===========================================");

		// Instancia clase MovimientoDinero

		MovimientoDinero tesoreria = new MovimientoDinero();

		tesoreria.setMontoMovimiento(2589000);
		tesoreria.setMontosPositivos(3475850);
		tesoreria.setMontosNegativos(3459800);
		tesoreria.setConceptoMovimiento("Retiro");
		tesoreria.setUsuarioContabilidad(empleado.getNombreEmpleado());

		System.out.println("===========================================");
		System.out.println("Monto: " + tesoreria.getMontoMovimiento());
		System.out.println("Monto positivo: " + tesoreria.getMontosPositivos());
		System.out.println("Monto negativo: " + tesoreria.getMontosNegativos());
		System.out.println("Concepto del movimiento: " + tesoreria.getConceptoMovimiento());
		System.out.println("Movimiento realizado por: " + tesoreria.getUsuarioContabilidad());
		System.out.println("===========================================");

	}

}
