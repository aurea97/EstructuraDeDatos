package mx.edu.mx.ejercicios;

import javax.swing.*;
import java.util.Random;

public class CalificacionesExm {
    public static void main(String[] args) {
        iniciar();

    }
public static void iniciar(){
        double  [][] cal= new double[filas()][5];
        llenarmatriz(cal);
        imprimir(cal);

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

    public static void llenarmatriz(double[][] calif) {
        Random random = new Random();
        double limite = 10;
        for (int i = 0; i < calif.length; i++) {
            for (int j = 0; j < calif[i].length; j++) {
                calif[i][j] = Math.round(random.nextDouble() * limite * 100.0) / 100.0;
            }
        }
    }

    public static void MejorCalExamen3(double[][]cal){
        for (int i = 0; i < cal.length; i++) {

                


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
            salida += "EX" + (j + 1) + "\t";
        }
        salida += "| Promedio Alumno\n";

        for (int i = 0; i < alumnos; i++) {
            salida += "Alumno " + (i + 1) + "\t";
            for (int j = 0; j < materias; j++) {
                salida += calif[i][j] + "\t";
            }
            salida += "| " + promedioPorAlumno[i] + "\n";
        }

        salida += "\n";

        JOptionPane.showMessageDialog(null, new JTextArea(salida));
    }

}
