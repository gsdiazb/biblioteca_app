package view;

import javax.swing.*;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import entity.Biblioteca;
import view.VistaLogin;
import controller.ControllerLogin;

public class VistaBibliotecaU extends JFrame implements ActionListener {

	ControllerLogin controlador;
	
	public JLabel labelImagen;
	public JLabel txtBienvenida;
	public JButton ingreso;
	public JButton registro;
	public JPanel panel;
	
	public VistaBibliotecaU() {
		
	
	}
	
	public VistaBibliotecaU(ControllerLogin inControlador) {
		super("Biblioteca Tu Bosque");
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		this.controlador = inControlador;
		
		this.panel = new JPanel();
		this.txtBienvenida = new JLabel("Bienvenido", SwingConstants.CENTER);
		
		panel.add(txtBienvenida);
		panel.add(txtBienvenida);
		panel.setLayout(new GridLayout(2, 1));
		this.setContentPane(panel);
		
	}
	
	public void actionListener(ActionListener escuchador) {
		this.ingreso.addActionListener(escuchador);
		this.registro.addActionListener(escuchador);
	}

	public void actionPerformed(ActionEvent evento) {

		if (evento.getActionCommand().equalsIgnoreCase("MOSTRAR")) {

//			String mensaje = controlador.mostrarInformacion();
//			JOptionPane.showMessageDialog(null, mensaje);

		} 

	}

}
