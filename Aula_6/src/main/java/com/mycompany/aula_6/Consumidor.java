/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_6;

/**
 *
 * @author Anchieta
 */
public class Consumidor extends Thread {
private String nome;
private Estoque umEstoque;
public Consumidor(String n, Estoque c) {
nome = n;
umEstoque = c;
}
public void run() {
for (int i = 0; i < 10; i++) {
umEstoque.get(nome);
}
}
}
