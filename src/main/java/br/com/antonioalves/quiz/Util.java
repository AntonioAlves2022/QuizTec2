/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.antonioalves.quiz;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class Util {
    public static void main(String[] args) {
       String mensagem = "";
       boolean estaLogado = false;
       mensagem = estaLogado?"Bem vndo usuario":"Senha ou e-mail incorreto";
        JOptionPane.showMessageDialog(null, mensagem);
               
        
    }
}
