package controller;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import entity.Biblioteca;
import view.VistaLogin;

public class StartTest {
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}
		VistaLogin vistaLogin = new VistaLogin();
		Biblioteca biblioteca = new Biblioteca();
		ControllerLogin controller = new ControllerLogin(vistaLogin,biblioteca);
		
		
	}

}
