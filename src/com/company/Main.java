package com.company;

import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo cruel");

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
    }

}
