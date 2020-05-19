package exerciso_for;

import java.util.Arrays;

public class Exerciso_for {

    static int[] lista = {3,1,2,4,5,8,8,9};

    public static void main(String[] args) {
System.out.println("antes lista "+ Arrays.toString(lista));

       for (int x = 0; x < lista.length - 1; x++) {
            if (lista[x] > lista[x + 1]) {

                int t = lista[x];
                lista[x] = lista[x + 1];
                lista[x + 1] = t;
            }
        }
       
       /*for (int i : lista) {
            System.out.println(i);
        }
        */
        System.out.println("ordenar crecente "+ Arrays.toString(lista));
       
        boolean trocar = false;
        do{
            trocar = false;
         for (int y = 0; y < lista.length - 1; y++) {
            if (lista[y] < lista[y + 1]) {
                int t = lista[y];
                lista[y] = lista[y + 1];
                lista[y + 1] = t;
                trocar = true; 
            }
        } 
        }while (trocar);
      
         System.out.println("ordenar descrecente "+ Arrays.toString(lista));
             
    }
}
