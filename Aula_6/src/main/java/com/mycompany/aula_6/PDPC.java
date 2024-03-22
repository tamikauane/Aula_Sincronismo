/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_6;

/**
 *
 * @author Anchieta
 */
public class PDPC {
    public static void main(String[] args) {
       Estoque umEstoque = new Estoque();
       Produtor umProdut = new Produtor("PROD", umEstoque);
       Consumidor umConsum = new Consumidor("CONS", umEstoque);
       umConsum.start();
       umProdut.start();
   }   
}
