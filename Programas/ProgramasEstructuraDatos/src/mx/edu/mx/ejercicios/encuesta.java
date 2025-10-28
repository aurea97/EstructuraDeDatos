package mx.edu.mx.ejercicios;

import javax.swing.*;
import java.util.Random;

public class encuesta {
    public static void main(String[] args) {
        iniciar();

    }

    public static void iniciar(){
        int enc[][] = new int[10][3];
        llenarmatriz(enc);
        imprimirM(enc);
        PorcentajeHombres(enc);
    }

    public static void llenarmatriz(int[][] enc) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // Sexo: 1 = masculino, 2 = femenino
            enc[i][0] = random.nextInt(2) + 1;

            // Trabaja: 1 = sí, 2 = no
            enc[i][1] = random.nextInt(2) + 1;

            // Sueldo: si trabaja (1), entre 600 y 2000; si no, 0
            if (enc[i][1] == 1) {
                enc[i][2] = random.nextInt(1401) + 600; // 600 a 2000
            } else {
                enc[i][2] = 0;
            }
        }
    }

    public static double PorcentajeHombres(int [][] enc){
        int hombres = 0;
        double porcentajeH;

        for (int i = 0; i < enc.length; i++) {
            if (enc[i][0] == 1) {
                hombres++;
            }
        }
         porcentajeH = (hombres * 100.0) / enc.length;
        return porcentajeH;

    }

    public static void PorcentajeMujeres(int [][]enc){
        int mujeres=0;
        for (int i = 0; i < enc.length; i++) {
            if (enc[i][0] ==2){
                mujeres++;
            }
            double porcentajeM=(mujeres+100.0)/enc.length;
        }
    }
    public static void MujeresTrabajo(int [][]enc){
       int tM =0;
        for (int i = 0; i < enc.length; i++) {
            if (enc[i][0] ==2){
                if (enc[i][1]==1){
                    tM++;
                }
            }
            double trabajom=(tM*100.0)/enc.length;

        }


    }

    public static void PromedioSueldoHombrez(int[][]enc){
        for (int i = 0; i <enc.length ; i++) {
            if (enc[i][0] == 1) {
                if (enc[i][1]==1){

                }
            }

        }
    }
    public static void PromedioSueldoMujeres(int[][]enc){
        for (int i = 0; i < enc.length; i++) {
            if (enc[i][0] == 2) {
                if (enc[i][1] == 1) {

                }
            }
        }
    }

    public static void HombresTrabajo(int [][]enc){
        int tH=0;
        for (int i = 0; i < enc.length; i++) {
            if (enc[i][0] == 1) {
                if (enc[i][1]==1){
                    tH++;
                }
            }
            double trabajoh=(tH*100.0)/enc.length;

        }

    }

    public static void imprimirM(int[][] enc) {
        StringBuilder salida = new StringBuilder();
        for (int[] fila : enc) {
            for (int valor : fila) {
                salida.append(valor).append(" | ");
            }
            salida.append("\n");
        }
        JOptionPane.showMessageDialog(null, salida.toString());
    }



}
