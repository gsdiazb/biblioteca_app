package controller;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import entity.Biblioteca;
import view.VistaLogin;
import view.VistaBibliotecaU;
import controller.ControllerLogin;

public class StartTest {
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}
		
		Biblioteca biblioteca = new Biblioteca();
		VistaLogin vistalogin1 = new VistaLogin();
		ControllerLogin controller = new ControllerLogin(vistalogin1,biblioteca);
		VistaBibliotecaU vistaLogin = new VistaBibliotecaU(controller);
	
	}

}
