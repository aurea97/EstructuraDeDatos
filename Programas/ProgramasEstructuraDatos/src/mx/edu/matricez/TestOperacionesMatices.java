package mx.edu.matricez;

import javax.swing.*;

public class TestOperacionesMatices {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int filas = obtenerTamaño("Ingresa el número de filas:");
        int columnas = obtenerTamaño("Ingresa el número de columnas:");
        OperacionesMatricez oper = new OperacionesMatricez(filas, columnas);

        double[][] m = new double[filas][columnas];
        llenarMatriz(m);
        oper.setM(m);

        int opcion;
        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    oper.imprimir();
                    break;

                case 2:
                    try {
                        JOptionPane.showMessageDialog(null, "Suma de la diagonal principal: " + oper.sumarDiagonal());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        JOptionPane.showMessageDialog(null, "Suma de la diagonal inversa: " + oper.sumarDiagonalInversa());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;

                case 4:
                    double[] sumaFilas = oper.sumarFilas();
                    JOptionPane.showMessageDialog(null, "Suma por filas:\n" + mostrarVector(sumaFilas));
                    break;

                case 5:
                    double[] sumaColumnas = oper.sumarColumnas();
                    JOptionPane.showMessageDialog(null, "Suma por columnas:\n" + mostrarVector(sumaColumnas));
                    break;

                case 6:
                    double[][] otra = crearSegundaMatriz(filas, columnas);
                    double[][] suma = oper.sumarMatrices(otra);
                    mostrarMatriz(suma, "Resultado de la suma:");
                    break;

                case 7:
                    otra = crearSegundaMatriz(filas, columnas);
                    double[][] resta = oper.restarmatrices(otra);
                    mostrarMatriz(resta, "Resultado de la resta:");
                    break;

                case 8:
                    otra = crearSegundaMatriz(filas, columnas);
                    double[][] producto = oper.multiplicar(otra);
                    mostrarMatriz(producto, "Resultado de la multiplicación:");
                    break;

                case 9:
                    oper.convertirBordesEnUno();
                    JOptionPane.showMessageDialog(null, "Matriz con bordes convertidos en 1: ");
                    oper.imprimir();
                    break;
                case 10:
                    double[] sumas = oper.sumarArribaYAbajoDiagonal();
                    JOptionPane.showMessageDialog(null, "Suma arriba de la diagonal: " + sumas[0]);
                    JOptionPane.showMessageDialog(null, "Suma abajo de la diagonal: " + sumas[1]);
                    break;

                case 11:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 11);
    }

    public static int menu() {
        String menu = """
                === MENÚ DE OPERACIONES ===
                1. Mostrar matriz
                2. Sumar diagonal principal
                3. Sumar diagonal inversa
                4. Sumar filas
                5. Sumar columnas
                6. Sumar dos matrices
                7. Restar dos matrices
                8. Multiplicar dos matrices
                9.Convertir bordes en uno
                10.Sumar ariba y abajo la diagonal
                11. Salir
                """;

        int opcion = 0;
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un número válido.");
        }
        return opcion;
    }

    public static int obtenerTamaño(String mensaje) {
        int valor = 0;
        boolean valido = false;
        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                if (valor > 0) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Debe ser mayor que cero.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un número entero válido.");
            }
        } while (!valido);
        return valor;
    }

    public static void llenarMatriz(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                boolean valido = false;
                do {
                    try {
                        matrix[i][j] = Double.parseDouble(JOptionPane.showInputDialog(
                                "Ingresa el valor para [" + i + "][" + j + "]:"));
                        valido = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar un número.");
                    }
                } while (!valido);
            }
        }
    }

    public static String mostrarVector(double[] v) {
        StringBuilder sb = new StringBuilder();
        for (double num : v) {
            sb.append(num).append(" | ");
        }
        return sb.toString();
    }

    public static void mostrarMatriz(double[][] matriz, String titulo) {
        StringBuilder sb = new StringBuilder(titulo + "\n");
        for (double[] fila : matriz) {
            for (double valor : fila) {
                sb.append(valor).append(" | ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public static double[][] crearSegundaMatriz(int filas, int columnas) {
        JOptionPane.showMessageDialog(null, "Ingresa los valores de la segunda matriz:");
        double[][] otra = new double[filas][columnas];
        llenarMatriz(otra);
        return otra;
    }
}
