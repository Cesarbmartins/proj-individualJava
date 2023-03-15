/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.indvidual;

/**
 *
 * @author Cesar
 */
public class CondicionaisEsportes {
    
    String aptidaoEsporte(Integer esporteEscolhido,Integer idade,Double altura){
        String frase="";
       switch(esporteEscolhido){
           case 1:
           
            if((idade<15||idade>=15) && altura>=1.5){
               frase= "Você tem apidão para Futebol!";
           } else if(idade<15 && altura<1.5) {
               frase= "Você ainda é novo! Tem tempo para crescer"; 
           } else{
               frase= "Vish, mais de 15 e nem 1.50? Aí não entra nem em parquinho de diversão";
           }
           
            break;
           case 2:
           
               if(idade>=15 && altura>=1.85){
                  frase= "Parabéns, você tem aptidão para o basquete";
              } else if(idade<15 && altura>=1.8){
                  frase= " Você tem total aptidão!!";
              } else if(idade<15 && altura<1.8){
                  frase= "Shii, ainda não tão apto, mas ainda resta esperança!!";
              } else{
                  frase= "Hmmmm, se tivesse comido mais fermento quem sabe!";
              }
           
           break;
           case 3:
               if(idade>=15 && altura>=1.8){
                   frase= "Ihul, você tem aptidão para jogar vôlei";
               } else if(idade>15 && altura >=1.8){
                   frase= "Misericórdia, um monstro, você é mais que apto";
               } else if(idade<15 && altura<1.8){
                   frase= "Fica tranquilo, você ainda vai crescer";
               } else{
                   frase= "Não esquenta, você pode ser um ótimo líbero."
                           + "Mas se quiser ser ponta vai precisar de um salto"
                           + "incrível";
               }
          break;
          
           default: 
               frase= "Ops, você digitou um número inválido";
          }
       return frase;
    }
    
}
