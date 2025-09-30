package mx.edu.uttt.poo;
import  javax.swing.JOptionPane;

public class TestAlumno {
    public static void main(String[] args) {



        Alumno a1 = new Alumno();

      nombre = JOptionPane.showInputDialog("introduce el nombre");
      edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
      sexo = JOptionPane.showInputDialog("introduce el sexo h/m").charAt(0);
      colorPiel = JOptionPane.showInputDialog("Introduce el color de piel");

      a1.setNombre();
      a1.setEdad();
      a1.getSexo();
      a1.getColorPiel();

      string salida = "resultado: \n  " + "Nombre" + a1.getNombre() + "\nedad "
              + a1.getEdad() + "\nsexo" + a1.getSexo() + "\ncolorpiel" + a1.getColorPiel();




    }
}
