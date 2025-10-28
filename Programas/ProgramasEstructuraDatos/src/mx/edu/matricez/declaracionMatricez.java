package mx.edu.matricez;

public class declaracionMatricez {
    public static void main(String[] args) {
//        // sintaxi
//        //tipodedato[][] nombre matriz
//        //tipodedato nombreMatriz[][]
//
//        //declarando matrices
//        double [][] calificaciones;
//        double promedios[][];
//        char[][] califLetras;
//
//
//        int [][] nomAlumnos = new int[3][3];
//
//        calificaciones=new double[4][4];
//        promedios= new double[3][2];
//        califLetras =new  char[5][3];
//
//        //instanciar las matrices
//
//        //asignar valores iniciales a una mtriz
//        String []nombresvector ={"Juan Moroni," +
//                "Pablo Guerrero","Arzin bravo",
//                "Kimberly Perez hernandez"};
//        String nombre [][] = {{"Luis Hernandez","jorge campos","Luis Garcia"},
//        {"Roberto baggio","Ronaldo Nazario"}};
//
//        double [][ ] alturas={
//                {2.3,4.5,5.6},
//                {10.2,8.5,4.6}
//
//                            };
//        //Acceder a los elementos de la matriz
//
//        int i=0, j=0;
//        double valor= alturas[0][j];
//        valor= alturas[i][j];
//        valor= alturas[alturas.length-1][j]; //me da la ultima fila columna j
//        //la ultima fila y columna
//        valor= alturas[alturas.length-1][alturas[alturas.length-1].length-1];
//
//        valor=alturas.length;//el numero de filas
//        valor=alturas[i].length;//numero de columnas

        Auto sedan1 = new Auto("BMW",0,0.0);
        Auto sedan2 = new Auto("BMW",100,15.0);
        Auto sedan3 = new Auto("Toyota",0,0.0);
        Auto sportcar = new Auto("Ferrari",0,0.0);
        Auto rv1 = new Auto("Jeep",0,0.0);
        Auto rv2= new Auto("Ford",200,30.0);

        Auto [][] cars = {{sedan1,sedan2,sedan3},
        {sportcar,new Auto(),rv1},
        {new Auto("vocho",150,30.5),  new Auto()}};



    }
}
