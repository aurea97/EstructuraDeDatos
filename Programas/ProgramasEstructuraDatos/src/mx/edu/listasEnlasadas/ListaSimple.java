package mx.edu.listasEnlasadas;

public class ListaSimple {
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;
    private  String Nombrelista;

    public ListaSimple(){
        this("Lista Generica");
    }

    public ListaSimple(String nombrelista){
        this.Nombrelista=nombrelista;
        primerNodo=ultimoNodo=null;
    }

    public void insertarAlFrente(Object elementoAinsertar){
        if (estaVacia()){
            ultimoNodo= primerNodo= new NodoLista(elementoAinsertar);
            return;
        }

        primerNodo= new NodoLista(elementoAinsertar,primerNodo);
    }

    public boolean estaVacia(){
        return this.primerNodo == null;
    }

    public void imprimir(){
        if (estaVacia()){
            System.out.println("La lista" + this.Nombrelista + "esta Vacioa");
            return;
        }
        System.out.println(this.Nombrelista);
        NodoLista aux =primerNodo;

        while (aux!=null){
            System.out.println(aux.getDato() + "-->");
            aux=aux.getSigNodo();
        }
        System.out.print("Null");
    }

}
