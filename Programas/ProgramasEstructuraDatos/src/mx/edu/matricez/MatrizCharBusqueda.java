package mx.edu.matricez;
import java.util.Scanner;
public class MatrizCharBusqueda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaramos la matriz 3x5 puedes modificar las letras si quieres
        char[][] matriz = {
                {'H', 'O', 'L', 'A', 'S'},
                {'P', 'E', 'R', 'R', 'O'},
                {'C', 'A', 'S', 'A', 'S'}
        };

        // mostramos la matriz para que el usuario la vea
        System.out.println("Matriz 3x5 filas");
        imprimirMatriz(matriz);
        System.out.println();

        // pedimos palabra de hasta 5 letras
        System.out.print("Ingresa una palabra de hasta 5 letras: ");
        String entrada = sc.nextLine().trim().toUpperCase();

        // si el usuario escribio mas de 5 letras tomamos solo las primeras 5
        if (entrada.length() > 5) {
            System.out.println("aviso la palabra tiene mas de 5 letras se tomaran solo las primeras 5");
            entrada = entrada.substring(0, 5);
        }

        // convertimos la palabra a vector de char de tamaño 5
        char[] palabraVector = convertirA5Chars(entrada);

        // mostramos el vector para ver como quedo
        System.out.print("vector de caracteres usado para buscar [");
        for (int i = 0; i < palabraVector.length; i++) {
            System.out.print("'" + palabraVector[i] + "'" + (i < palabraVector.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        // buscamos la palabra en las filas comparacion exacta de los 5 caracteres
        int filaEncontrada = buscarEnFilas(matriz, palabraVector);

        // mostramos resultado
        if (filaEncontrada >= 0) {
            System.out.println("la palabra '" + entrada + "' se encontro en la fila " + (filaEncontrada + 1) + " indice " + filaEncontrada);
        } else {
            System.out.println("la palabra '" + entrada + "' no se encontro en ninguna fila");
        }

        sc.close();
    }

    // metodo que convierte una cadena hasta 5 chars en un vector char de 5
    // si la cadena es mas corta rellena con espacios
    private static char[] convertirA5Chars(String s) {
        char[] v = new char[5];
        for (int i = 0; i < 5; i++) {
            if (i < s.length()) {
                v[i] = s.charAt(i);
            } else {
                v[i] = ' ';
            }
        }
        return v;
    }

    // metodo que busca el vector palabra en las filas de la matriz
    // devuelve el indice de la fila encontrada o -1 si no se encontro
    private static int buscarEnFilas(char[][] matriz, char[] palabra) {
        for (int i = 0; i < matriz.length; i++) {
            boolean coincide = true;
            for (int j = 0; j < palabra.length; j++) {
                if (matriz[i][j] != palabra[j]) {
                    coincide = false;
                    break;
                }
            }
            if (coincide) {
                return i;
            }
        }
        return -1;
    }

    // imprime la matriz en formato legible
    private static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
