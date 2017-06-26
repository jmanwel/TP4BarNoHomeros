package ar.edu.unlam.PB2;

import java.util.Comparator;
import java.util.TreeSet;

public class BarNoHomero {
	
	private Boolean abierto;
	private TreeSet<Cliente> clientes;
	
	
	public BarNoHomero() {
		this.clientes = new TreeSet<Cliente>();
		this.abierto = false;
	}
	
	
	public BarNoHomero(Comparator<Cliente> comparador) {
		this.clientes = new TreeSet<Cliente>(comparador);
		this.abierto = false;
	}
	

	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public TreeSet<Cliente> getClientes() {
		return clientes;
	}
	
	
	public Double getCantClientes() {
		return (double) clientes.size();
	}

	public void cerrar() {
		this.abierto = false;
	}

	public void abrir() {
		this.abierto = true;
	}

	public Boolean abiertoCerrado() {
		return this.abierto;
	}
	
}
