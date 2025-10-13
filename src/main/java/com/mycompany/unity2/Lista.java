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
    
    public Lista (){
        this.incio = null;
        this.fin = null;
        cont = 0;
    }
    public boolean estaVacia(){
        return this.incio == null && this.fin == null;
    }
    public void add (int dato){
        Nodo aux = new Nodo (dato);
        if (estaVacia()) {
            this.incio = aux;
            this.fin = aux;
        }else{
            this.fin.setDir(aux);
            this.fin = aux;
        }
        this.cont++;
    }
    public void imprimir (){
        Nodo aux = this.incio;
        System.out.print("[");
        while (aux != null) {            
            System.out.print(aux.getDato());
            System.out.print(", ");
            aux = aux.getDir();
        }
        System.out.print("]");
    }
    
    public void addFirst (int dato){
        Nodo aux = new Nodo(dato);
        if (estaVacia()) {
            this.incio = aux;
            this.fin = aux;
        }else{
            aux.setDir(this.incio);
            this.incio = aux;
        }
        this.cont++;
    }
    private Nodo moverAlPenultimo (){
        Nodo aux = this.incio;
        while (aux.getDir().getDir()!= null) {            
            aux = aux.getDir();
        }
        return aux;
    }
    //Suponiendo que no hay nodos
    public void deleteLast(){
        Nodo aux = moverAlPenultimo();
        aux.setDir(null);
        this.fin = aux;
        
    }
    
   public void addLast(int dato) {
        Nodo aux = new Nodo(dato);
        if (estaVacia()) {
            this.incio = aux;
            this.fin = aux;
        } else {
            this.fin.setDir(aux);
            this.fin = aux;
        }
        this.cont++;
    }
    
    public void addPos (int dato,int pos){
        if (pos == 1) {
            addFirst(dato);
            return;
        }
        if (pos == cont) {
                addLast(dato);
                return;
            }
        Nodo aux = new Nodo (dato);
        Nodo actual = incio;
        for (int i = 0; i < pos-1; i++) {
            actual = actual.getDir();
        }
        aux.setDir(actual.getDir());
        actual.setDir(aux);
            
            
        }
    }
    
    //add
    //add pos (int dato, posicion) añadir por posicion
    //addLast añadir al ultimo
    //delete eliminar el ultimo
    //deleteFirst eliminar el primero
    //deletePos (int pos)eliminar por posicion
    //delete

