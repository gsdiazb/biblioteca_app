package view;

import java.awt.GridLayout;

import javax.swing.*;


@SuppressWarnings("serial")
public class VistaLogin extends JDialog {
	
	//Attributos
	public JDialog dialog;
	public JDialog dialog2;
	public JDialog dialog3;
	public JLabel fecha;
	public JLabel labelUsuario;
	public JLabel labelContrasena;
	public JLabel labelOlvido;
	public JLabel labelNuevo;
	public JLabel labelNuevoNombre;
	public JLabel labelNuevoApellido;
	public JLabel labelNuevoNombreDeUsuario;
	public JLabel labelNuevoPregunta;
	public JLabel labelNuevoRespuesta;
	public JLabel labelNuevoContrasena;
	public JLabel labelolvidoUsuario;
	public JLabel labelcambioContrasena;
	public JLabel labelEmpty;
	
	public JLabel labelPregunta;
	public JTextField textFieldUsuario;
	public JTextField textFieldolvidoUsuario;
	public JTextField textFieldNuevoNombre;
	public JTextField textFieldNuevoApellido;
	public JTextField textFieldNuevoNombreDeUsuario;
	public JTextField textFieldNuevoPregunta;
	public JTextField textFieldNuevoRespuesta;
	public JPasswordField textFieldNuevoContrasena;
	public JPasswordField textFieldcambioContrasena;
	
	public JPasswordField textFieldContrasena;
	public JTextField textFieldRespuesta;
	public JButton login;
	public JButton olvidoUsuario;
	public JButton olvido;
	public JButton crear;
	public JButton cambioContrasena;
	public JPanel panel;
	public JPanel panel2A;
	public JPanel panel2B;
	public JPanel panel2C;
	public JPanel panel3;
	public JPanel nueva;
	
	
	public VistaLogin() {
		
	//Componentes
	this.dialog = new JDialog();
	this.panel = new JPanel();
	this.dialog2 = new JDialog();
	this.panel2A = new JPanel();
	this.panel2B = new JPanel();
	this.panel2C = new JPanel();
	this.dialog3 = new JDialog();
	this.panel3 = new JPanel();
	this.textFieldcambioContrasena = new JPasswordField(20);
	this.textFieldolvidoUsuario = new JTextField(20);
	this.textFieldUsuario = new JTextField(20);
	this.textFieldContrasena = new JPasswordField(20);
	this.textFieldNuevoContrasena = new JPasswordField(20);
	this.textFieldRespuesta = new JTextField(20);
	this.textFieldNuevoNombre = new JTextField(20);
	this.textFieldNuevoApellido = new JTextField(20);
	this.textFieldNuevoNombreDeUsuario = new JTextField(20);
	this.textFieldNuevoPregunta = new JTextField(20);
	this.textFieldNuevoRespuesta = new JTextField(20);
	this.labelolvidoUsuario = new JLabel("Cual es su Usuario?", SwingConstants.CENTER);
	this.labelOlvido = new JLabel("Olvido su Contrasena?", SwingConstants.CENTER);
	this.labelcambioContrasena = new JLabel("Digite nueva Contrasena", SwingConstants.CENTER);
	this.labelNuevo = new JLabel("Crear nuevo usuario", SwingConstants.CENTER);
	this.labelPregunta = new JLabel("", SwingConstants.CENTER);
	this.labelUsuario = new JLabel("Usuario ", SwingConstants.CENTER);
	this.labelContrasena = new JLabel("Contrasena ", SwingConstants.CENTER);
	this.labelNuevoNombre = new JLabel("Nombre: ", SwingConstants.CENTER);
	this.labelEmpty = new JLabel("");
	this.labelNuevoApellido = new JLabel("Apellido: ", SwingConstants.CENTER);
	this.labelNuevoNombreDeUsuario = new JLabel("Nombre de usuario ", SwingConstants.CENTER);
	this.labelNuevoPregunta = new JLabel("Pregunta de seguridad ", SwingConstants.CENTER);
	this.labelNuevoRespuesta = new JLabel("Respuesta ", SwingConstants.CENTER);
	this.labelNuevoContrasena = new JLabel("Contrasena ", SwingConstants.CENTER);
	this.cambioContrasena = new JButton("Cambiar");
	this.login = new JButton("Acceder");
	this.crear = new JButton("Crear");
	this.olvido = new JButton("Verificar");
	this.olvidoUsuario = new JButton("Buscar");
	
	
	
	//dialog login

	panel.add(labelUsuario);
	panel.add(textFieldUsuario);
	
	panel.add(labelContrasena);
	panel.add(textFieldContrasena);
	panel.add(labelEmpty);
	panel.add(login);
	
	panel.add(labelOlvido);
	panel.add(labelNuevo);
	panel.setLayout(new GridLayout(4, 2));
	dialog.pack();
	dialog.setLocationRelativeTo(null);
	dialog.setTitle("Inicio de Sesion");
	dialog.setContentPane(panel);
	dialog.setVisible(true);
	dialog.pack();
	
	//dialog2 Olvido la clave?
	panel2A.add(labelolvidoUsuario);
	panel2A.add(textFieldolvidoUsuario);
	panel2A.add(olvidoUsuario);
	panel2B.add(labelPregunta);
	panel2B.add(textFieldRespuesta);
	panel2B.add(olvido);
	panel2C.add(labelcambioContrasena);
	panel2C.add(textFieldcambioContrasena);
	panel2C.add(cambioContrasena);
	panel2A.setLayout(new GridLayout(2, 2));
	panel2B.setLayout(new GridLayout(2, 2));
	panel2C.setLayout(new GridLayout(2, 2));
	dialog2.setTitle("Recuperar Contrasena");
	dialog2.setLocationRelativeTo(dialog);
	dialog2.setContentPane(panel2A);
	dialog2.setSize(300, 300);
	dialog2.pack();
	
	
	//dialog3 Crear nuevo usuario
	panel3.setLayout(new GridLayout(4, 4));
	panel3.add(labelNuevoNombre);
	panel3.add(textFieldNuevoNombre);
	panel3.add(labelNuevoApellido);
	panel3.add(textFieldNuevoApellido);
	panel3.add(labelNuevoNombreDeUsuario);
	panel3.add(textFieldNuevoNombreDeUsuario);
	panel3.add(labelNuevoPregunta);
	panel3.add(textFieldNuevoPregunta);
	panel3.add(labelNuevoRespuesta);
	panel3.add(textFieldNuevoRespuesta);
	panel3.add(labelNuevoContrasena);
	panel3.add(textFieldNuevoContrasena);
	panel3.add(crear);
	dialog3.setTitle("Crear usuario");
	dialog3.setLocationRelativeTo(dialog);
	dialog3.setContentPane(panel3);
	dialog3.setSize(300, 300);
	dialog3.pack();
	}
	
	public void mostrarMensajes(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
}
