package entity;
import java.util.Date;


public class Libro {

private String titulo;
private int codigo;
private String fechaDeIngreso;
private String autor;
private String imagen;
private int cantidad;

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public Libro(String titulo, String autor, String fechaDeIngreso) {
this.titulo = titulo;
this.autor = autor;
this.fechaDeIngreso = fechaDeIngreso;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getFechaDeIngreso() {
	return fechaDeIngreso;
}

public void setFechaDeIngreso(String fechaDeIngreso) {
	this.fechaDeIngreso = fechaDeIngreso;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public String getImagen() {
	return imagen;
}

public void setImagen(String imagen) {
	this.imagen = imagen;
}
	
}
