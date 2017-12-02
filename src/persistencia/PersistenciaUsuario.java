package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import entity.Usuario;

public class PersistenciaUsuario {
	/* persistencia
	
	public String escribirArchivo(File fArchivo, ArrayList<Estudiante> listaEstudiante) {
		try {
			// Si el archivo NO existe se crea.
			if (!fArchivo.exists()) {
				fArchivo.createNewFile();
			}
			// el atributo <true> significa que si existe el archivo, se añaden
			// más registros sin borrar el archivo
			BufferedWriter fEscribir = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(fArchivo, true), "utf-8"));

			for (Estudiante estudiante : listaEstudiante) {
				// escribe los datos en el archivo
				fEscribir.write(estudiante.getApellido() + "," + estudiante.getGenero() + "," + estudiante.getNombre()
						+ "," + estudiante.getEdad() + "\n");
			}

			// Cierra el flujo de escritura
			fEscribir.close();
			return "Resultado exitoso";
		} catch (Exception ex) {
			// Captura un posible error
			System.out.println(ex.getMessage());
			return "Se presentó un error";
		}
	}
	
	*/

}
