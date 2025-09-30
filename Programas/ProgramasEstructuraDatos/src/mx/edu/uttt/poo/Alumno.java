//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package mx.edu.uttt.poo;

public class Alumno {
    private String nombre;
    private int edad;
    private char sexo;
    private String colorPiel;

    public Alumno() {
        this.setNombre("Sin nombre");
        this.setEdad(17);
        this.setSexo('I');
        this.setColorPiel("Neutro");
    }

    public Alumno(String nombre, int edad, char sexo, String ColorPiel) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.setColorPiel(this.colorPiel);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad > 17 ? edad : 17;
    }

    public String getColorPiel() {
        return this.colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        switch (colorPiel.toUpperCase()) {
            case "BLANCO":
            case "WHITE":
                this.colorPiel = colorPiel;
                break;
            case "NEGRO":
            case "BLACK":
                this.colorPiel = colorPiel;
                break;
            default:
                this.colorPiel = "NEUTRO";
        }

    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo != 'h' && sexo != 'H' && sexo != 'm' && sexo != 'M' ? 73 : sexo;
    }

    public String toString() {
        return "Alumno{nombre='" + this.nombre + "', edad=" + this.edad + ", sexo=" + this.sexo + ", colorPiel='" + this.colorPiel + "'}";
    }
}
