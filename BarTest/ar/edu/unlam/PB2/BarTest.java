package ar.edu.unlam.PB2;

import static org.junit.Assert.*;
import java.util.Comparator;
import java.util.TreeSet;
import org.junit.Assert;
import org.junit.Test;

public class BarTest {
	
	@Test
	public void barAbierto() {
		BarNoHomero bar = new BarNoHomero();
		bar.abrir();
		Assert.assertTrue(bar.abiertoCerrado() && bar.getClientes().size() == 0);
	}
	
	@Test
	public void clientesOrdenadosAlfabeticamente() {
		BarNoHomero bar1 = new BarNoHomero();

		bar1.addCliente(new Cliente("Ernesto", 31));
		bar1.addCliente(new Cliente("Dario", 32));
		bar1.addCliente(new Cliente("Sebastian", 33));
		bar1.addCliente(new Cliente("Alberto", 34));
		bar1.addCliente(new Cliente("Sebastian", 45));
				
		Double cantidadObtenida = bar1.getCantClientes();
		Double cantidadEsperada = 4.00;
		
		System.out.println(bar1.getClientes());
		
		Assert.assertTrue(bar1.getClientes().first().getNombre() == "Alberto");
		Assert.assertTrue(bar1.getClientes().last().getNombre() == "Sebastian");
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
		
	}
			
	@Test
	public void clientesOrdenadosXEdad() {
		BarNoHomero bar2 = new BarNoHomero(new ClienteComparador());

		bar2.addCliente(new Cliente("Ernesto", 31));
		bar2.addCliente(new Cliente("Dario", 32));
		bar2.addCliente(new Cliente("Sebastian", 33));
		bar2.addCliente(new Cliente("Alberto", 34));
		bar2.addCliente(new Cliente("Sebastian", 45));

		Assert.assertTrue(bar2.getClientes().first().getNombre() == "Ernesto");
		Assert.assertTrue(bar2.getClientes().last().getNombre() == "Sebastian");
		
	}	

}
