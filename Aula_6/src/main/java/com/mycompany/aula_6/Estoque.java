/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_6;

/**
 *
 * @author Anchieta
 */
public class Estoque {
private int conteudo;
private boolean disponivel = false;
public synchronized void get(String cons) {
while (!disponivel) {
try {
wait();
} catch (InterruptedException e) { }
}
disponivel = false;
System.out.format("%s consumiu: %d%n", cons, conteudo);
notifyAll();
}

public synchronized void put(String prod, int valor) {
while (disponivel) {
try {
wait();
} catch (InterruptedException e) { }
}
conteudo = valor;
disponivel = true;
System.out.format("%s produziu: %d%n", prod, conteudo);
notifyAll();
}
}

