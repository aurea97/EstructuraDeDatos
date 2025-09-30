package mx.edu.mx.ejercicios;

import javax.swing.*;

public class testproductosmain {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){
        int tamanio =Integer.parseInt(JOptionPane.showInputDialog("Intrdicuce el numero de productos:"));
        ProductosVector pv=  new ProductosVector(tamanio);
        String opcion = "";
        boolean sentinel = true;
        do {
            opcion=JOptionPane.showInputDialog(menu());

            switch (opcion){
                case "1":
                    if (!pv.estalleno())
                        pv.LlenarArreglo(llenarProducto());
                    else
                        JOptionPane.showMessageDialog
                                (null,"El vector esta lleno");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null,pv.imprimir());
                    break;
                case "3"://eliminar un producto
                    JOptionPane.showMessageDialog(null,"Gracias por todo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion");
            }
        }while (sentinel);

    }

    public static String menu(){
        return "Menu Principal \n 1)Agregar productos\n " +
                "2)Imprimir Productos\n" +
                "3)Eliminar \n"+
                "4)Salir\nElegir Opcion";
    }

    public static productos llenarProducto(){
        productos productos = new productos();
        //solicita los valores de las variables de instancia
        String nombre =JOptionPane.showInputDialog
                ("introduce el nombre del producto");
        productos.setNombre(nombre);
        int existencia= Integer.parseInt(JOptionPane.showInputDialog
                ("Introduce la existencia"));
        double precio= Double.parseDouble(JOptionPane.showInputDialog
                ("Introduce el precio"));
        //Asignar los valores a las variables de instancia del
        //objeto producto
        productos.setNombre(nombre);
        productos.setPrecio(precio);
        productos.setPrecio(precio);

        return productos;

    }

}
