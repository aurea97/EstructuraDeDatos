package mx.edu.mx.ejercicios;

import javax.swing.*;

public class ProductosVector {
    private productos[] producto;
    private final int TAMANO = 2;

    public ProductosVector() {
        this.producto = new productos[this.TAMANO];
    }

    public ProductosVector(int tamanio) {
        if (tamanio <= 0) {
            this.producto = new productos[this.TAMANO];
        } else {
            this.producto = new productos[tamanio];
        }
    }

    public void LlenarArreglo(productos producto) {
        if (estalleno()) {
            JOptionPane.showMessageDialog(null, "El vector está lleno");
        } else {
            this.producto[buscarposiscion()] = producto;
        }
    }

    public void borrarp(String nombreborrar) {
        boolean encontrado = false;
        for (int i = 0; i < this.producto.length; i++) {
            if (this.producto[i] != null && nombreborrar.equalsIgnoreCase(this.producto[i].getNombre())) {
                this.producto[i] = null;
                JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        }
    }

    public void buscar(String nombrebuscar) {
        boolean encontrado = false;
        for (int i = 0; i < this.producto.length; i++) {
            if (this.producto[i] != null && nombrebuscar.equalsIgnoreCase(this.producto[i].getNombre())) {
                JOptionPane.showMessageDialog(null, this.producto[i].toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        }
    }

    public boolean modificarProducto(String nombreActual,
                                     String nuevoNombre,
                                     Double nuevoPrecio,
                                     Integer nuevaExistencia) {
        for (int i = 0; i < this.producto.length; i++) {
            productos p = this.producto[i];
            if (p != null && p.getNombre().equalsIgnoreCase(nombreActual)) {

                if (nuevoNombre != null && !nuevoNombre.isBlank()) {
                    p.setNombre(nuevoNombre);
                }
                if (nuevoPrecio != null) {
                    p.setPrecio(nuevoPrecio);
                }
                if (nuevaExistencia != null) {
                    p.setExistencia(nuevaExistencia);
                }
                JOptionPane.showMessageDialog(null, "Producto modificado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        return false;
    }

    public String imprimir() {
        String salida = "Lista de productos:\n";
        boolean hayDatos = false;
        for (int i = 0; i < this.producto.length; i++) {
            if (this.producto[i] != null) {
                double importe = producto[i].getPrecio() * producto[i].getExistencia();
                salida += this.producto[i].toString() + "\nImporte: " + importe + "\n\n";
                hayDatos = true;
            }
        }
        if (!hayDatos) {
            salida += "No hay productos registrados.";
        }
        return salida;
    }

    private int buscarposiscion() {
        for (int i = 0; i < this.producto.length; i++) {
            if (this.producto[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean estalleno() {
        for (productos valorp : this.producto) {
            if (valorp == null) {
                return false;
            }
        }
        return true;
    }
}
