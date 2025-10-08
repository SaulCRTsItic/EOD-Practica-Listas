/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unity2;

/**
 *
 * @author Lab3
 */
public class Lista {
    
    private Nodo incio;
    private Nodo fin;
    private int cont;
    
    
    public boolean estaVacia(){
        return this.incio == null && this.fin == null;
    }
    public void add (int dato){
        Nodo aux = new Nodo (dato);
    }
}
