package mx.edu.matricez;
import java.util.Random;
import javax.swing.*;

public class MatricesCalificaciones {
    public static void main(String[] args) {
        Iniciar();
    }

    public static void Iniciar() {
        double[][] calif = new double[filas()][columnas()];
        llenarmatriz(calif);
        imprimir(calif);
    }

    public static int filas() {
        int numFilas = 0;
        boolean sentinel = true;
        do {
            try {
                numFilas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de alumnos:"));
                if (numFilas > 0) sentinel = false;
                else JOptionPane.showMessageDialog(null, "El valor debe ser mayor a 0");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor debe ser entero");
            }
        } while (sentinel);
        return numFilas;
    }

    public static int columnas() {
        int numColumnas = 0;
        boolean sentinel = true;
        do {
            try {
                numColumnas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de materias:"));
                if (numColumnas > 0) sentinel = false;
                else JOptionPane.showMessageDialog(null, "El valor debe ser mayor a 0");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor debe ser entero");
            }
        } while (sentinel);
        return numColumnas;
    }

    public static void llenarmatriz(double[][] calif) {
        Random random = new Random();
        double limite = 10;
        for (int i = 0; i < calif.length; i++) {
            for (int j = 0; j < calif[i].length; j++) {
                calif[i][j] = Math.round(random.nextDouble() * limite * 100.0) / 100.0;
            }
        }
    }

    public static void imprimir(double[][] calif) {
        int alumnos = calif.length;
        int materias = calif[0].length;

        double[] promedioPorAlumno = new double[alumnos];
        double[] promedioPorMateria = new double[materias];

        // Calcular promedios por alumno y por materia
        for (int i = 0; i < alumnos; i++) {
            double suma = 0;
            for (int j = 0; j < materias; j++) {
                suma += calif[i][j];
                promedioPorMateria[j] += calif[i][j];
            }
            promedioPorAlumno[i] = (suma / materias) * 100.0 / 100.0;
        }

        for (int j = 0; j < materias; j++) {
            promedioPorMateria[j] = (promedioPorMateria[j] / alumnos) * 100.0/ 100.0;
        }

        // Construir la salida con etiquetas
        String salida = "          ";
        for (int j = 0; j < materias; j++) {
            salida += "M" + (j + 1) + "\t";
        }
        salida += "| Promedio Alumno\n";

        for (int i = 0; i < alumnos; i++) {
            salida += "Alumno " + (i + 1) + "\t";
            for (int j = 0; j < materias; j++) {
                salida += calif[i][j] + "\t";
            }
            salida += "| " + promedioPorAlumno[i] + "\n";
        }

        salida += "Promedio\t";
        for (int j = 0; j < materias; j++) {
            salida += promedioPorMateria[j] + "\t";
        }
        salida += "\n";

        JOptionPane.showMessageDialog(null, new JTextArea(salida));
    }
}
