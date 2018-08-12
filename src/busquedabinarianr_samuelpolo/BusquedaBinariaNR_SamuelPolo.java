/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinarianr_samuelpolo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ColombiaWP
 */
public class BusquedaBinariaNR_SamuelPolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Búsqueda Binaria no recursiva.");
        System.out.println("Digite el tamaño del vector: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tam = Integer.parseInt(br.readLine());
        int a[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Digite el elemento: " + i + " del vector.");
            a[i] = Integer.parseInt(br.readLine());
        }
        InsertSort(a); //Ordenar la lista. 
        System.out.println("Digite el elemento a buscar");
        int elem = Integer.parseInt(br.readLine());
        /*
         for (int i = 0; i < a.length; i++) {
         System.out.println(a[i]);
         }
         */
        //BUSQUEDA BINARIA
        int izq = 0;
        int medio = 0;
        int buscado = 5;
        int der = a.length - 1;
        while (izq <= der && buscado==5) {
            medio = (izq + der) / 2;
            if (a[medio] == elem) {
                buscado = medio;
            } else {
                if (a[medio] > elem) {
                    der = medio - 1;

                } else {
                    izq = medio + 1;
                }
            }
        }
        
        if (buscado == 5) {
            System.out.println("No se encontró el elemento.");
        }else {
            System.out.println("El elemento: "+a[buscado]+" se ha encontrado.");
        }
        //BUSQUEDA BINARIA
    }

    public static void InsertSort(int vec[]) {
        int temp;
        for (int i = 1; i < vec.length; i++) {
            for (int j = i; j > 0; j--) {
                if (vec[j] < vec[j - 1]) {
                    temp = vec[j];
                    vec[j] = vec[j - 1];
                    vec[j - 1] = temp;
                }
            }
        }
    }

}
