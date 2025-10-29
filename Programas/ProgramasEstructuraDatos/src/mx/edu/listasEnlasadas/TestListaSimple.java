package mx.edu.listasEnlasadas;

public class TestListaSimple {
    public static void main(String[] args) {
        ListaSimple lista1=new ListaSimple("Mi primera Lista");
        lista1.insertarAlFrente(9);
        lista1.insertarAlFrente(8);
        lista1.insertarAlFrente(7);

        lista1.imprimir();

    }
}
