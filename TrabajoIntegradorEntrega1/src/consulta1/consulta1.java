package consulta1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

	public class consulta1 {
	    
	    public static void main(String[] args) {
	        
	        String nombreArchivo = "C:\\Users\\drumd\\Downloads\\Java UTN\\pronosticoCSV.csv"; //Ruta de acceso al excel a leer
	        Path ruta = Paths.get(nombreArchivo);
	        
	        try {
	            List<String> lineas = Files.readAllLines(ruta, StandardCharsets.UTF_8);
	            
	            for (String linea : lineas) {
	              
	                System.out.print(linea.replace(';', '|'));
	                
	                
	                System.out.println();
	            }
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	   }
	}
