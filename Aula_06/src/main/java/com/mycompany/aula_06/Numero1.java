/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_06;

/**
 *
 * @author Anchieta
 */

public class Numero1 implements Runnable {
private Banheiro banheiro;
public Numero1(Banheiro banheiro1) {
super();
this.banheiro = banheiro1;
}
public void run() {
banheiro.fazendoNumero1();
}
}
// Exemplo 7 – Numero1
