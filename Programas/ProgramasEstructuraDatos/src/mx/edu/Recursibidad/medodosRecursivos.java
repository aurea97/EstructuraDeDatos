package mx.edu.Recursibidad;

import javax.swing.*;

public class medodosRecursivos {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce n"));
            JOptionPane.showMessageDialog(null,"El factorial de" + n + "es" + fact(n));
        }catch (IllegalArgumentException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }


    }
    public static long fact(int n) throws IllegalArgumentException {
        if (n<0)
            throw  new IllegalArgumentException("El valor no puede ser negativo");
        //caso base
        if (n == 1){
            return 1;
        }

        if (n==0){
            return 0;
        }
        //caso general
        return n * fact(n-1);
    }
}
