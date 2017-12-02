package entity;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Usuario> usuarios;
	
	public Biblioteca(){
		this.usuarios = new ArrayList<Usuario>();
	}
	
	
	public void agregarUsuario(Usuario pUsuarios) {
		this.usuarios.add(pUsuarios);
	}
	
	public boolean login(String pUsuario,String pContrasena) {
		for(int a = 0; a < usuarios.size(); a++) {
				if(usuarios.get(a).getNombreDeUsuario().equals(pUsuario) && usuarios.get(a).getContrasena().equals(pContrasena)) {
					return true;
				}
		}
			return false;
	}
	
	
	public String obtenerPregunta(String pUsuario) {
		for(int a = 0; a < usuarios.size(); a++) {
				if(usuarios.get(a).getNombreDeUsuario().equals(pUsuario)) {
					return usuarios.get(a).getPregunta();
				}
		}
			return null;
	}
	
	public boolean verificarPregunta(String pPregunta,String pRespuesta) {
		for(int a = 0; a < usuarios.size(); a++) {
				if(usuarios.get(a).getPregunta().equals(pPregunta) && usuarios.get(a).getRespuesta().equals(pRespuesta)) {
					return true;
				}
		}
			return false;
	}
	
	public void cambiarContrasena(String usuario, String nueva) {
		for(int a = 0; a < usuarios.size(); a++) {
				if(usuarios.get(a).getNombreDeUsuario().equals(usuario)) {
					usuarios.get(a).setContrasena(nueva);
				}
		}
	}

	
	
	
	
	
}