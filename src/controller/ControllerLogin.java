package controller;

import java.awt.event.*;
import java.io.File;

import entity.Biblioteca;
import entity.Usuario;
import view.VistaLogin;
import persistencia.PersistenciaUsuario;

public class ControllerLogin implements ActionListener, MouseListener {

	Biblioteca biblioteca;
	Usuario usuario;
	VistaLogin vistaLogin;
	PersistenciaUsuario opArchivo;

	String obtener = null;

	public ControllerLogin(VistaLogin vistaLogin, Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
		this.vistaLogin = vistaLogin;
		opArchivo = new PersistenciaUsuario();
		actionListener(this);
		mouseListener(this);
	}



	public void actionListener(ActionListener escuchador) {
		this.vistaLogin.login.addActionListener(escuchador);
		this.vistaLogin.olvido.addActionListener(escuchador);
		this.vistaLogin.olvidoUsuario.addActionListener(escuchador);
		this.vistaLogin.cambioContrasena.addActionListener(escuchador);
		this.vistaLogin.crear.addActionListener(escuchador);

	}


	public void mouseListener(MouseListener escuchador) {
		this.vistaLogin.labelOlvido.addMouseListener(escuchador);
		this.vistaLogin.labelNuevo.addMouseListener(escuchador);	
	}




	public void actionPerformed(ActionEvent objEvento) {
		if(this.vistaLogin.login == objEvento.getSource()) {
			String pUsuario = this.vistaLogin.textFieldUsuario.getText();
			String pContrasena = this.vistaLogin.textFieldContrasena.getText();
			if(this.biblioteca.login(pUsuario, pContrasena)) {
				vistaLogin.mostrarMensajes("Logro acceder!!!");
			} else { 
				vistaLogin.mostrarMensajes("Usuario y/o Contrasena incorrectos");	
			}


		} else if (vistaLogin.olvidoUsuario == objEvento.getSource()) {
			obtener = this.vistaLogin.textFieldolvidoUsuario.getText();
			if(biblioteca.obtenerPregunta(obtener) != null) {
				vistaLogin.labelPregunta.setText(biblioteca.obtenerPregunta(obtener));
				vistaLogin.dialog2.setContentPane(vistaLogin.panel2B);
				vistaLogin.dialog2.pack();
			} else {
				vistaLogin.mostrarMensajes("No se encontro el usuario en el sistema");
			}


		} else if (vistaLogin.olvido == objEvento.getSource()) {
			if(biblioteca.verificarPregunta(vistaLogin.labelPregunta.getText(), vistaLogin.textFieldRespuesta.getText())) {
				vistaLogin.dialog2.setContentPane(vistaLogin.panel2C);
				vistaLogin.dialog2.pack();
			} else {
				vistaLogin.dialog2.dispose();
				vistaLogin.dialog2.setContentPane(vistaLogin.panel2A);
				vistaLogin.dialog2.pack();
				vistaLogin.mostrarMensajes("respuesta incorrecta");

			}
		} else if (vistaLogin.cambioContrasena == objEvento.getSource()) {
			biblioteca.cambiarContrasena(obtener, vistaLogin.textFieldcambioContrasena.getText());
			vistaLogin.mostrarMensajes("Se ha cambiado la Contrasena");
			vistaLogin.dialog2.dispose();
			vistaLogin.dialog2.setContentPane(vistaLogin.panel2A);
			vistaLogin.dialog2.pack();

		} else if (vistaLogin.crear == objEvento.getSource()) {
			String pNombre = this.vistaLogin.textFieldNuevoNombre.getText();
			String pApellido = this.vistaLogin.textFieldNuevoApellido.getText();
			String pNombreDeUsuario = this.vistaLogin.textFieldNuevoNombreDeUsuario.getText();
			String pPregunta = this.vistaLogin.textFieldNuevoPregunta.getText();
			String pRespuesta = this.vistaLogin.textFieldNuevoRespuesta.getText();
			String pContrasena = this.vistaLogin.textFieldNuevoContrasena.getText();
			Usuario usuarioTemp = new Usuario(pNombre, pApellido, pNombreDeUsuario,pContrasena, "U", pPregunta, pRespuesta);
			biblioteca.agregarUsuario(usuarioTemp);
			String mensaje = opArchivo.escribirArchivo(new File("ArchivoBiblioteca.txt"), biblioteca.getUsuarios());
			vistaLogin.mostrarMensajes("Bienvenido/a a la biblioteca "+ pNombre);
			vistaLogin.dialog3.dispose();
		}
	}


	public void mouseClicked(MouseEvent e) {

	}
	public void mousePressed(MouseEvent e) {

	}
	public void mouseReleased(MouseEvent objEvento) {
		if(this.vistaLogin.labelOlvido == objEvento.getSource()) {
			vistaLogin.labelPregunta.setText("aqui va la pregunta de seguridad");
			vistaLogin.dialog2.setVisible(true);
		} else if (vistaLogin.labelNuevo == objEvento.getSource()) {
			vistaLogin.dialog3.setVisible(true);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}





}

