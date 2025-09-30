package mx.edu.mx.ejercicios;

public class productos {

    //Atributos
    private String nombre;
    private int existencia;
    private double precio;

    public productos() {
        this.nombre = "sin nombre";
    }

    public productos (String nombre, int existencia, double precio){
        this.setNombre(nombre);
        this.setExistencia(existencia);
        this.setPrecio(precio);
    }

//metod acceso get


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "Nombre producto" + getNombre() +
                "\nExistencia" + getExistencia() +
                "\nPrecio" + getPrecio();
    }


}
