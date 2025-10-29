package mx.edu.listasEnlasadas;

public class NodoLista {
    Object dato;
    NodoLista sigNodo;

    //crear un nodo
    public NodoLista(Object dato){
        this(dato,null);
    }

    public NodoLista(Object dato, NodoLista nodo){
       this.dato=dato;
       this.sigNodo=nodo;
    }

    public Object getDato(){
        return this.dato;
    }

    public NodoLista getSigNodo(){
        return  this.sigNodo;
    }
}
