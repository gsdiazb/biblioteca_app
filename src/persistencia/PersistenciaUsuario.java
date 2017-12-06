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
	//persistencia
	// lalalalaalaa
	public String escribirArchivo(File fArchivo, ArrayList<Usuario> listaUsuarios) {
		try {
			// Si el archivo NO existe se crea. 
			if (!fArchivo.exists()) {
				fArchivo.createNewFile();
			}
			// el atributo <true> significa que si existe el archivo, se a�aden
			// m�s registros sin borrar el archivo
			BufferedWriter fEscribir = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(fArchivo, true), "utf-8"));

			for (Usuario usuario : listaUsuarios) {
				// escribe los datos en el archivo
				fEscribir.write(usuario.getNombre() + "," + usuario.getApellido() + "," + usuario.getNombreDeUsuario()
						+ "," + usuario.getTipo() + "," + usuario.getPregunta() + "," + usuario.getRespuesta() + "," + usuario.getContrasena() + "\n");
			}

			// Cierra el flujo de escritura
			fEscribir.close();
			return "Resultado exitoso";
		} catch (Exception ex) {
			// Captura un posible error
			System.out.println(ex.getMessage());
			return "Se present� un error";
		}
	}

}
