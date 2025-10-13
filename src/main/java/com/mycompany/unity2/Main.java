/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unity2;

import java.util.LinkedList;

/**
 *
 * @author Lab3
 */
public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
       // LinkedList lista2 = new LinkedList();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.addFirst(5);
        lista.add(40);
      //  lista2.add(30);
       // lista2.add(20);
        
       // System.out.println(lista2);
        lista.imprimir();
    }
}
