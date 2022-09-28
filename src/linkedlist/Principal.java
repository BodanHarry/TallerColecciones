/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;
import java.util.*;
/**
 *
 * @author hebod
 */
public class Principal {

    public static void main(String[] args) {
        LinkedList<String> paises = new LinkedList<String>();
        LinkedList<String> capitales = new LinkedList<String>();
       
        System.out.println("Paises");
        paises.add("Espania");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");
        
        for (String pais: paises){
            System.out.println("-" + pais);
        }
        
        System.out.println("Capitales");
        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("DF");
        capitales.add("Lima");
        
        for (String capi: capitales){
            System.out.println("-" + capi);
        }
        
        ListIterator<String> itA = paises.listIterator();
        ListIterator<String> itB = capitales.listIterator();
        
        //Añadir las capitales debajo de sus países respectivos
        System.out.println("Anadir las capitales debajo de sus paises respectivos");
        while(itB.hasNext()){
            if(itA.hasNext()){
                itA.next();
            }
            itA.add(itB.next());
        }
        
        System.out.println("--" + paises);
        
        itB = capitales.listIterator();
        
        //Eliminar capitales en posiciones pares
        System.out.println("Eliminar capitales en posiciones pares");
        while(itB.hasNext()){
            itB.next();
            if(itB.hasNext()){
                itB.next();
                itB.remove();
            }
        }
        
        System.out.println("---" +capitales);
        
        //Eliminar capitales de la lista países
        System.out.println("Eliminar capitales de la lista paises");
        paises.removeAll(capitales);
        System.out.println("----" + paises);
        
        paises.remove("Bogota");
        paises.remove("Lima");
        System.out.println("-----" + paises);
    }
}
