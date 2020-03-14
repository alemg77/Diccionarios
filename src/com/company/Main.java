package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo cruel");

        /*
        Hashtable<Integer,String> tablaQuiniela = new Hashtable<>();
        tablaQuiniela.put(0,"Huevos");
        tablaQuiniela.put(1,"Agua");
        tablaQuiniela.put(2,"Escopeta");
        tablaQuiniela.put(3,"Caballo");
        tablaQuiniela.put(4,"Dentista");
        tablaQuiniela.put(5,"Llamas");
        System.out.println(tablaQuiniela.get(3));
        for (Integer integer : tablaQuiniela.keySet()) {
            System.out.println(tablaQuiniela.get(integer));
        }
        */

        Amigo unAmigo = new Amigo("Juan");
        unAmigo.agregarApodo("Fisura");
        unAmigo.agregarApodo("Boludo");
        unAmigo.agregarApodo("Juancho");
        
        Amigo otroAmigo= new Amigo("Jose");
        otroAmigo.agregarApodo("Cornudo");
        otroAmigo.agregarApodo("Corneta");
        otroAmigo.agregarApodo("Nabo");
        
        Amigo ultimoAmigo = new Amigo("Miguel");
        ultimoAmigo.agregarApodo("Fastante");
        ultimoAmigo.agregarApodo("Facho");
        ultimoAmigo.agregarApodo("Borracho");

        Map<String, Amigo> diccionarioAmigos = new HashMap<>();
        diccionarioAmigos.put("Uno",unAmigo);
        diccionarioAmigos.put("Dos",otroAmigo);
        diccionarioAmigos.put("Tres",ultimoAmigo);

        for (String s : diccionarioAmigos.keySet()) {
            System.out.println("Con el indice: "+ s);  // Imprime todos los indices

            System.out.print("Nombre del amigo: ");
            System.out.println(diccionarioAmigos.get(s).getNombre());

            diccionarioAmigos.get(s).mostrarApodos();
            // System.out.println("    "+diccionarioAmigos.get(s));
        }





        

        

    }

}
