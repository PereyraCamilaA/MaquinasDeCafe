package ar.unlam.edu.src;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<MaquinaDeCafe>maquinasDeCafe;
	private String nombre;
	
	public Empresa(String nombre) {
		this.maquinasDeCafe = new  ArrayList<MaquinaDeCafe>();
		this.nombre = nombre;
	}

	public ArrayList<MaquinaDeCafe> getMaquinasDeCafe() {
		return maquinasDeCafe;
	}

	public void setMaquinasDeCafe(ArrayList<MaquinaDeCafe> maquinasDeCafe) {
		this.maquinasDeCafe = maquinasDeCafe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarMaquinaDeCafe(MaquinaDeCafe maquina) {
		this.maquinasDeCafe.add(maquina);
	}
	
	public Double obtenerRecaudacionTotal() {
		Double totalDineroRecaudado = 0.0;
		
		for (MaquinaDeCafe maquinaDeCafe : maquinasDeCafe) {
			totalDineroRecaudado += maquinaDeCafe.obtenerDineroRecaudado();
		}
		return totalDineroRecaudado;
	}
	
}
