package mx.edu.matricez;

import javax.swing.*;

public class OperacionesMatricez {

    private double[][] m;

    public OperacionesMatricez(int numFilas, int numColumnas) {
        if (validarTamanio(numFilas) && validarTamanio(numColumnas)) {
            m = new double[numFilas][numColumnas];
        } else {
            m = new double[2][2];
        }
    }

    private boolean validarTamanio(int tamanio) {
        return tamanio > 0;
    }

    public double[][] getM() {
        return this.m;
    }

    public void setM(double[][] m) {
        if (!(m.length == this.m.length && m[0].length == this.m[0].length))
            return;
        for (int i = 0; i < this.m.length; i++) {
            for (int j = 0; j < this.m[i].length; j++) {
                this.m[i][j] = m[i][j];
            }
        }
    }

    private boolean validarCuadrada() {
        return this.m.length == this.m[0].length;
    }

    public double sumarDiagonal() throws Exception {
        if (!validarCuadrada())
            throw new Exception("La matriz no es cuadrada");

        double suma = 0.0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][i];
        }
        return suma;
    }

    public double sumarDiagonalInversa() throws Exception {
        if (!validarCuadrada())
            throw new Exception("La matriz no es cuadrada");
        double suma = 0.0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][m.length - 1 - i];
        }
        return suma;
    }

    public double[] sumarFilas() {
        double[] sumaFilas = new double[m.length];
        for (int i = 0; i < m.length; i++) {
            double suma = 0.0;
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }
            sumaFilas[i] = suma;
        }
        return sumaFilas;
    }

    public double[] sumarColumnas() {
        double[] sumaCols = new double[m[0].length];
        for (int j = 0; j < m[0].length; j++) {
            double suma = 0.0;
            for (int i = 0; i < m.length; i++) {
                suma += m[i][j];
            }
            sumaCols[j] = suma;
        }
        return sumaCols;
    }

    public double[][] sumarMatrices(double[][] otra) {
        if (m.length != otra.length || m[0].length != otra[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }
        double[][] resultado = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                resultado[i][j] = m[i][j] + otra[i][j];
            }
        }
        return resultado;
    }

    public double[][] restarmatrices(double[][]otra){
        if (m.length != otra.length || m[0].length != otra[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }
        double[][] resultado = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                resultado[i][j] = m[i][j] - otra[i][j];
            }
        }
        return resultado;

    }

    public double[][] multiplicar(double[][]otra) {
        if (m.length != otra.length || m[0].length != otra[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }

        int m = this.m.length;
        int n = this.m[0].length;
        int p = otra[0].length;

        double[][] resultado = new double[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += this.m[i][k] * otra[k][j];
                }
            }
        }

        return resultado;
    }

    public double[] sumarArribaYAbajoDiagonal() {
        double sumaArriba = 0.0;
        double sumaAbajo = 0.0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i < j) {
                    sumaArriba += m[i][j];
                } else if (i > j) {
                    sumaAbajo += m[i][j];
                }
            }
        }

        return new double[]{sumaArriba, sumaAbajo};
    }


    public void convertirBordesEnUno() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == 0 || j == 0 || i == m.length - 1 || j == m[i].length - 1) {
                    m[i][j] = 1;
                }
            }
        }
    }





    public void imprimir() {
        StringBuilder salida = new StringBuilder();
        for (double[] fila : this.m) {
            for (double valor : fila) {
                salida.append(valor).append(" | ");
            }
            salida.append("\n");
        }
        JOptionPane.showMessageDialog(null, salida.toString());
    }
}
