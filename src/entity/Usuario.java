package entity;

public class Usuario {

private String nombre;
private String apellido;
private String nombreDeUsuario;
private String tipo;
private String contrasena;
private String pregunta;
private String respuesta;

//constructor
public Usuario(String nombre, String apellido, String nombreDeUsuario,String contrasena, String tipo,String pregunta,String respuesta) {
this.nombre = nombre;
this.apellido = apellido;
this.nombreDeUsuario = nombreDeUsuario;
this.tipo = tipo;
this.pregunta = pregunta;
this.respuesta = respuesta;
this.contrasena = contrasena;
}







//set y gets
public String getNombre() {
	return nombre;
}
public String getPregunta() {
	return pregunta;
}

public String getContrasena() {
	return contrasena;
}



public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}


public void setPregunta(String pregunta) {
	this.pregunta = pregunta;
}

public String getRespuesta() {
	return respuesta;
}

public void setRespuesta(String respuesta) {
	this.respuesta = respuesta;
}

public String getNombreDeUsuario() {
	return nombreDeUsuario;
}

public void setNombreDeUsuario(String nombreDeUsuario) {
	this.nombreDeUsuario = nombreDeUsuario;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}


}
