package co.edu.uniquindio.poo.application;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.model.Contacto;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Contacto cnt1= new Contacto("Brayan", "Pepinillos", "Cra 14 15N - 73", "315643896", "brayanpadilla01@gmail.com");
        JOptionPane.showMessageDialog(null, cnt1, null, 0);
    }
}
