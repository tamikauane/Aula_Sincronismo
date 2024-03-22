/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula_06;

/**
 *
 * @author Anchieta
 */
public class Aula_06 {
public static void main(String[] args) {
Banheiro banheiro = new Banheiro();
Thread convidado1 = new Thread(new Numero1(banheiro), "Joao");
Thread convidado2 = new Thread(new Numero2(banheiro), "Maria");
Thread convidado3 = new Thread(new Numero1(banheiro), "Ana");
Thread convidado4 = new Thread(new Numero2(banheiro), "Jose");
convidado1.start();
convidado2.start();
convidado3.start();
convidado4.start();
}
}
