package mx.edu.uttt.poo;

import javax.swing.JOptionPane;

public class TestAlumno {
    public static void main(String[] args) {

        Alumno a1 = new Alumno();

        // Solicitar datos
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
        char sexo = JOptionPane.showInputDialog("Introduce el sexo h/m").charAt(0);
        String colorPiel = JOptionPane.showInputDialog("Introduce el color de piel");

        // Asignar valores al objeto
        a1.setNombre(nombre);
        a1.setEdad(edad);
        a1.setSexo(sexo);
        a1.setColorPiel(colorPiel);

        // Construir salida
        String salida = "Resultado: \n" +
                "Nombre: " + a1.getNombre() +
                "\nEdad: " + a1.getEdad() +
                "\nSexo: " + a1.getSexo() +
                "\nColor de piel: " + a1.getColorPiel();

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, salida);
    }
}
