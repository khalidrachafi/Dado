/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

/**
 *
 * @author khalid
 */


//constructor parametrizado con el número de tiradas a generar
//toString que devuelva de cada elemento de la lista su posición y su valor
//método para saber el número de veces que ha salido una cara
//método para borrar todas las caras indicadas como parámetro




//Clase LanzarDado, con un atributo lista de enteros.
//EL constructor de del objeto rellena una lista simulando 1000 lanzamientos del dado
//constructor parametrizado con el número de tiradas a generar
//toString que devuelva de cada elemento de la lista su posición y su valor
//método para saber el número de veces que ha salido una cara
//método para borrar todas las caras indicadas
public class Dado {

    public int lanzamientos= 1000;
    public int minCaras= 1;
    public int maxCaras = 6;

    public Dado() {
       ArrayList <Integer> listaEnteros = new ArrayList<>();
        for (int i = 0; i < lanzamientos; i++) {
           Random random = new Random();
          int tiradas= random.nextInt(minCaras, maxCaras + 1);
         listaEnteros.add(i);
        }
        
    }
    
   
    
    
}
