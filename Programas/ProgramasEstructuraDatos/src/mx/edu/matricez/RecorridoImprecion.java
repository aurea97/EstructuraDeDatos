package mx.edu.matricez;

import javax.swing.*;

public class RecorridoImprecion {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int[][] matri = new int[solicitarNumeroDeFilas()][solicitarNumeroDeColumnas()];
        llenar(matri);
        imprimir4(matri);
    }

    // Solicita número de filas
    public static int solicitarNumeroDeFilas() {
        boolean sentinel = true;
        int numFilas = 0;
        do {
            try {
                numFilas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de filas"));
                if (numFilas > 0) {
                    sentinel = false;
                } else {
                    JOptionPane.showMessageDialog(null, "El valor debe ser mayor a 0");
                }
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "El valor debe ser entero");
            }
        } while (sentinel);
        return numFilas;
    }

    // Solicita número de columnas
    public static int solicitarNumeroDeColumnas() {
        boolean sentinel = true;
        int numColumnas = 0;
        do {
            try {
                numColumnas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de columnas"));
                if (numColumnas > 0) {
                    sentinel = false;
                } else {
                    JOptionPane.showMessageDialog(null, "El valor debe ser mayor a 0");
                }
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "El valor debe ser entero");
            }
        } while (sentinel);
        return numColumnas;
    }

    // Solicita un valor para llenar la matriz
    public static int solicitarValor() {
        int valor = 0;
        boolean sentinel = true;
        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor"));
                sentinel = false; // Salir del bucle si es válido
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "El valor debe ser un número");
            }
        } while (sentinel);
        return valor;
    }

    // Llena la matriz con valores ingresados por el usuario
    public static void llenar(int[][] ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                ma[i][j] = solicitarValor();
            }
        }
    }

    // Imprime la matriz usando bucles for-each
    public static void imprimir4(int[][] kiss) {
        String salida = "";
        for (int[] fila : kiss) {
            for (int valor : fila) {
                salida += valor + " ";
            }
            salida += "\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
