/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unity2;


public class Nodo {
    
    private int dato;
    private Nodo dir;

    public Nodo(int dato) {
        this.dato = dato;
        this.dir = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getDir() {
        return dir;
    }

    public void setDir(Nodo dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", dir=" + dir + '}';
    }
    
    
}
