package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import procesamiento.LoaderRestaurante;

public class Combos {
	
	public double descuento;
	public String nombreCombo;
	
	
	private Combos (double descuento, String nombreCombo) {
		this.descuento = descuento;
		this.nombreCombo = nombreCombo;
	}
		
		
	private double darDescuento() {
			return descuento;
	}
		
	private String darNombreCombo() {
			return nombreCombo;
		}
	
		
	public static Map<String,Integer> CalcularPrecioCombos() throws FileNotFoundException, IOException{
		Map<String,Integer> precioFinalC = new HashMap<>();
		Map<String, List<String>> mapa = LoaderRestaurante.cargarCombos2();
		Map<String, Integer> mapaProds = LoaderRestaurante.cargarMenu2();
		
		for (Entry<String, List<String>> entry : mapa.entrySet()) {
			int precioCombosinD = 0;
			List<String> listaprods = entry.getValue();
			for (int i = 1; i <= listaprods.size()-1; i++) {
				String comida = listaprods.get(i);
				int precioComida = mapaProds.get(comida);
				precioCombosinD = precioCombosinD + precioComida;
				
				String descuento = listaprods.get(0);
				String[] numeroUsar = descuento.split("%");
				float numeroFinal = 1-(Float.parseFloat(numeroUsar[0]))/100;
				Integer precioCombo = (int) (precioCombosinD * numeroFinal);
						
				
				precioFinalC.put(entry.getKey(), precioCombo);
				
				
			}
				
				
			
		} 
		
		
		return precioFinalC;
		
		
		
	}
	
}



