package mx.edu.mx.ejercicios;

import javax.swing.*;

//utilizando vectores alamcenar productos que contienen nombre,stock y precio y deben calcular el
// importe cad uno de los productos deben ser almacenaods en el vector deben de solicitar el numero de productos a almecenar

public class ProductosVector {
    private productos[] producto;
    private final int TAMANO = 2;

    public ProductosVector() {
        this.producto = new productos[this.TAMANO];
    }

    public ProductosVector(int tamanio){
        if (tamanio <= 0) {
            this.producto = new productos[this.TAMANO];
        } else {
            this.producto = new productos[tamanio];
        }

    }

    public void LlenarArreglo(productos producto) {
        if (estalleno()) {
            JOptionPane.showMessageDialog(null, "El vector esta lleno");
        } else {
            this.producto[buscarposiscion()] = producto;
        }
    }


    public void borrarp(String nombreborrar) {

        for (int i = 0; i < this.producto.length; i++) {
            if (this.producto[i] != null && nombreborrar.equals(this.producto[i].getNombre())) {

                this.producto[i]=null;

                break;
            }
        }

    }
    public void buscar(String nombrebuscar){
        for (int i = 0; i < this.producto.length; i++) {
            if (nombrebuscar.equals(this.producto[i].getNombre())){
                JOptionPane.showMessageDialog(null, this.producto[i].toString());
            }

        }
    }

    private int buscarposiscion() {
        int posicion = 0;
        for (int i = 0; i < this.producto.length; i++) {
            if (this.producto[i] == null) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public boolean estalleno() {
        boolean lleno = true;
        for (productos valorp : this.producto) {
            if (valorp == null) {
                lleno = false;
                break;
            }
        }
        return lleno;
    }


    public String imprimir() {
        String salida = "Lista de productos : \n";

        for (int i = 0; i < this.producto.length; i++) {
            if (this.producto[i] != null) {
                salida += this.producto[i].toString() + "\nImporte: " + producto[i].getPrecio() * producto[i].getExistencia() + "\n";

            }


        }


        return salida;
    }
    public boolean modificarProducto(String nombreActual,
                                     String nuevoNombre,
                                     Double nuevoPrecio,
                                     Integer nuevaExistencia) {
        for (int i = 0; i < this.producto.length; i++) {
            productos p = this.producto[i];
            if (p != null && p.getNombre() != null &&
                    p.getNombre().equalsIgnoreCase(nombreActual)) {

                if (nuevoNombre != null && !nuevoNombre.isBlank()) {
                    p.setNombre(nuevoNombre);
                }
                if (nuevoPrecio != null) {
                    p.setPrecio(nuevoPrecio);
                }
                if (nuevaExistencia != null) {
                    p.setExistencia  (nuevaExistencia);
                }
                return true;
            }
        }
        return false;
    }



}
