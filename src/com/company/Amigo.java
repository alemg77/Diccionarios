package com.company;

import java.util.ArrayList;
import java.util.List;

public class Amigo {
    private String nombre;
    private ArrayList<String> apodos;

    public Amigo(String nombre) {
        this.nombre = nombre;
        this.apodos = new ArrayList<>();
    }

    public void agregarApodo(String apodo) {
        this.apodos.add(apodo);
    }

    public void mostrarApodos() {
        for (int i = 0; i < this.apodos.size() ; i++) {
            System.out.println(apodos.get(i));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getApodos() {
        return apodos;
    }

    @Override
    public String toString() {
        return "Mi amigo " + this.nombre + ", tiene los apodos: " + apodos ;
    }
}
