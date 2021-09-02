package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
		
	       Student estudiante= new Student(130667,"Arce","Ezequiel","ezequiel.arce@hotmail.com","https://github.com/ezearce","images/foto.jpeg");
	       
			SimplePresentationScreen window = new SimplePresentationScreen(estudiante);
			
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	try {
						window.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
	            }
	        });
		}
}