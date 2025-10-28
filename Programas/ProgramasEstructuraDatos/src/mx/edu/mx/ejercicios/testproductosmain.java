package mx.edu.mx.ejercicios;

import javax.swing.*;

public class testproductosmain {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de productos:"));
        ProductosVector pv = new ProductosVector(tamanio);
        String opcion;
        boolean sentinel = true;

        do {
            opcion = JOptionPane.showInputDialog(menu());

            switch (opcion) {
                case "1": // Agregar
                    if (!pv.estalleno()) {
                        pv.LlenarArreglo(llenarProducto());
                    } else {
                        JOptionPane.showMessageDialog(null, "El vector está lleno.");
                    }
                    break;

                case "2": // Imprimir
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    break;

                case "3": // Buscar
                    String nombreBuscar = JOptionPane.showInputDialog("Introduce el nombre del producto a buscar:");
                    pv.buscar(nombreBuscar);
                    break;

                case "4": // Modificar
                    String nombreAct = JOptionPane.showInputDialog("Introduce el nombre del producto a modificar:");
                    String nuevoNom = JOptionPane.showInputDialog("Nuevo nombre (deja en blanco si no deseas cambiar):");
                    String precioStr = JOptionPane.showInputDialog("Nuevo precio (deja en blanco si no deseas cambiar):");
                    String existenciaStr = JOptionPane.showInputDialog("Nueva existencia (deja en blanco si no deseas cambiar):");

                    Double nuevoPrecio = precioStr.isBlank() ? null : Double.parseDouble(precioStr);
                    Integer nuevaExistencia = existenciaStr.isBlank() ? null : Integer.parseInt(existenciaStr);

                    pv.modificarProducto(nombreAct, nuevoNom, nuevoPrecio, nuevaExistencia);
                    break;

                case "5": // Eliminar
                    String nombreBorrar = JOptionPane.showInputDialog("Introduce el nombre del producto a eliminar:");
                    pv.borrarp(nombreBorrar);
                    break;

                case "6": // Salir
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    sentinel = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (sentinel);
    }

    public static String menu() {
        return """
                Menú Principal
                1) Agregar producto
                2) Imprimir productos
                3) Buscar producto
                4) Modificar producto
                5) Eliminar producto
                6) Salir
                Elegir opción:
                """;
    }

    public static productos llenarProducto() {
        productos producto = new productos();

        String nombre = JOptionPane.showInputDialog("Introduce el nombre del producto:");
        int existencia = Integer.parseInt(JOptionPane.showInputDialog("Introduce la existencia:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio:"));

        producto.setNombre(nombre);
        producto.setExistencia(existencia);
        producto.setPrecio(precio);

        return producto;
    }
}
