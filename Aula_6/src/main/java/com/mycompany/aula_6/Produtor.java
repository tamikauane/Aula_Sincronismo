/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_6;

/**
 *
 * @author Anchieta
 */
public class Produtor extends Thread {
private String nome;
private Estoque umEstoque;
public Produtor(String n, Estoque c) {
nome = n;
umEstoque = c;
}
public void run() {
for (int i = 0; i < 10; i++) {
umEstoque.put(nome, i);
try {
sleep((int)(Math.random() * 100));
} catch (InterruptedException e) { }
}
}
}
