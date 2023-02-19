package procesamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class LoaderRestaurante 
{
	
	
		public static Map<String, Integer> cargarMenu() throws IOException, FileNotFoundException
		{
			Map<String, Integer> productos = new HashMap<>();
			File usar = new File("data/menu.txt");
			String path = usar.getAbsolutePath();
			BufferedReader br = new BufferedReader(new FileReader(path));
			String linea = br.readLine();
			System.out.println("Producto -- Precio");
			
					

				while (linea != null) 
				{
					String[] partes = linea.split(";");
					String nombreProducto = partes[0];
					Integer precio = Integer.parseInt(partes[1]);
					
					productos.put(nombreProducto, precio);

					System.out.println(partes[0] + " -- " + partes[1]);
					linea = br.readLine();
					
				}
				

				
			br.close();
			
			Restaurante calculadoraMenu = new Restaurante();
			return productos;
		}
			
			public static Map<String, List<String>> cargarCombos() throws IOException, FileNotFoundException
			{
				Map<String, List<String>> combos = new HashMap<>();
	
				File usar = new File("data/combos.txt");
				String path = usar.getAbsolutePath();
				BufferedReader br = new BufferedReader(new FileReader(path));
				String linea = br.readLine();
				System.out.println("Combo -- Productos");
				
						

					while (linea != null) 
					{
						List<String> listaCombos = new ArrayList<>();
						String[] partes = linea.split(";");
						String nombreProducto = partes[0];
						String descuento = (partes[1]);
						String hamburguesa = (partes[2]);
						String papas = partes[3];
						String gaseosa = partes[4];
						
						System.out.println(partes[0]+ " -- " + partes[2]+ " "+partes[3]+ " "+partes[4]);
						
						
						
						listaCombos.add(descuento);
						listaCombos.add(hamburguesa);
						listaCombos.add(papas);
						listaCombos.add(gaseosa);
						
						combos.put(nombreProducto, listaCombos);
						linea = br.readLine();
						
						
					}
					

					
				br.close();
				
				Restaurante calculadoraCombos = new Restaurante();
				
				return combos;
		
		}

			
			public static Map<String, Integer> cargarIngredientes() throws IOException, FileNotFoundException
			{
				Map<String, Integer> ingredientes = new HashMap<>();
				File usar = new File("data/ingredientes.txt");
				String path = usar.getAbsolutePath();
				BufferedReader br = new BufferedReader(new FileReader(path));
				String linea = br.readLine();
				System.out.println("Ingrediente -- Precio");
	
			

				while (linea != null) 
				{
					String[] partes = linea.split(";");
					String nombreIngrediente = partes[0];
					Integer precio = Integer.parseInt(partes[1]);
					System.out.println(partes[0] + " -- " + partes[1]);
			
					ingredientes.put(nombreIngrediente, precio);
					linea = br.readLine();
					
			
				}
				
				br.close();
				
				Restaurante calculadoraIngredientes = new Restaurante();
				return ingredientes;
		
				

			}
			
			
		
			
//FUNCIONES SIN PRINT PARA USAR 
			
			
			public static Map<String, List<String>> cargarCombos2() throws IOException, FileNotFoundException
			{
				Map<String, List<String>> combos = new HashMap<>();
	
				File usar = new File("data/combos.txt");
				String path = usar.getAbsolutePath();
				BufferedReader br = new BufferedReader(new FileReader(path));
				String linea = br.readLine();
				
						

					while (linea != null) 
					{
						List<String> listaCombos = new ArrayList<>();
						String[] partes = linea.split(";");
						String nombreProducto = partes[0];
						String descuento = (partes[1]);
						String hamburguesa = (partes[2]);
						String papas = partes[3];
						String gaseosa = partes[4];
						
						listaCombos.add(descuento);
						listaCombos.add(hamburguesa);
						listaCombos.add(papas);
						listaCombos.add(gaseosa);
						
						combos.put(nombreProducto, listaCombos);
						linea = br.readLine();
						
						
					}
					

					
				br.close();
				
				Restaurante calculadoraCombos = new Restaurante();
				
				return combos;
			}
			
		public static Map<String, Integer> cargarMenu2() throws IOException, FileNotFoundException
			{
				Map<String, Integer> productos = new HashMap<>();
				File usar = new File("data/menu.txt");
				String path = usar.getAbsolutePath();
				BufferedReader br = new BufferedReader(new FileReader(path));
				String linea = br.readLine();
				
						

					while (linea != null) 
					{
						String[] partes = linea.split(";");
						String nombreProducto = partes[0];
						Integer precio = Integer.parseInt(partes[1]);
						
						productos.put(nombreProducto, precio);
						linea = br.readLine();
						
					}
					

					
				br.close();
				
				Restaurante calculadoraMenu = new Restaurante();
				return productos;
			}

		
		public static Map<String, Integer> cargarIngredientes2() throws IOException, FileNotFoundException
		{
			Map<String, Integer> ingredientes = new HashMap<>();
			File usar = new File("data/ingredientes.txt");
			String path = usar.getAbsolutePath();
			BufferedReader br = new BufferedReader(new FileReader(path));
			String linea = br.readLine();
			

			while (linea != null) 
			{
				String[] partes = linea.split(";");
				String nombreIngrediente = partes[0];
				Integer precio = Integer.parseInt(partes[1]);
				ingredientes.put(nombreIngrediente, precio);
				linea = br.readLine();
				
		
			}
			
			br.close();
			
			Restaurante calculadoraIngredientes = new Restaurante();
			return ingredientes;
	
			

		}
}
		

