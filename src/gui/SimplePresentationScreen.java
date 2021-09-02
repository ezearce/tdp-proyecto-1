package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lbLU;
	private JTextField tfLU;
	private JTextField tfApellido;
	private JTextField tfNombre;
	private JTextField tfEmail;
	private JTextField tfURL;
	private JLabel lbFecha;
	private JLabel lbImagen;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 287));
		setResizable(false);
		setContentPane(contentPane);
      
        
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 211);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		tabInformation.setLayout(null);
		
		lbLU = new JLabel("LU");
		lbLU.setBounds(10, 15, 26, 14);
		tabInformation.add(lbLU);
		
		JLabel lbApellido = new JLabel("Apellido");
		lbApellido.setBounds(10, 46, 46, 14);
		tabInformation.add(lbApellido);
		
		JLabel lbNombre = new JLabel("Nombre");
		lbNombre.setBounds(10, 84, 46, 14);
		tabInformation.add(lbNombre);
		
		JLabel lbEmail = new JLabel("E-mail");
		lbEmail.setBounds(10, 113, 46, 14);
		tabInformation.add(lbEmail);
		
		JLabel lbURL = new JLabel("Github URL");
		lbURL.setBounds(10, 147, 63, 14);
		tabInformation.add(lbURL);
		
		tfLU = new JTextField();
		tfLU.setText("130667");
		tfLU.setBounds(85, 12, 318, 20);
		tabInformation.add(tfLU);
		tfLU.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.setText("Arce");
		tfApellido.setColumns(10);
		tfApellido.setBounds(85, 43, 318, 20);
		tabInformation.add(tfApellido);
		
		tfNombre = new JTextField();
		tfNombre.setText("Ezequiel Agustin");
		tfNombre.setColumns(10);
		tfNombre.setBounds(85, 78, 318, 20);
		tabInformation.add(tfNombre);
		
		tfEmail = new JTextField();
		tfEmail.setText("ezequiel.arce@hotmail.com");
		tfEmail.setColumns(10);
		tfEmail.setBounds(85, 110, 318, 20);
		tabInformation.add(tfEmail);
		
		tfURL = new JTextField();
		tfURL.setText("https://github.com/ezearce");
		tfURL.setColumns(10);
		tfURL.setBounds(85, 144, 318, 20);
		tabInformation.add(tfURL);
		contentPane.add(tabbedPane);
		
		lbFecha = new JLabel("Esta ventana fue generada el "+LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" a las: "+ LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) );
		lbFecha.setBounds(5, 227, 430, 14);
		contentPane.add(lbFecha);
		
		lbImagen = new JLabel("");
		lbImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lbImagen.setBounds(456, 28, 129, 168);
		
		ImageIcon icon= new ImageIcon(getClass().getResource("/images/foto.jpeg"));
		ImageIcon img= new ImageIcon(icon.getImage().getScaledInstance(lbImagen.getWidth(), lbImagen.getHeight(), Image.SCALE_SMOOTH));
		lbImagen.setIcon(img);

		contentPane.add(lbImagen);
	}
}
