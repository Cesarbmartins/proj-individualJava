/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.indvidual;

/**
 *
 * @author Cesar
 */
public class CategoriaBoxeador {
    
     String decidirEExibirCategoria(Double peso){
        
        if(peso<=49.0){
             return "mosca-ligeiro";
        } else if(peso<=52.0){
             return "mosca";
        } else if(peso<=56.0){
             return "galo";
        } else if(peso<=60){
             return "leve";
        } else if(peso<=64){
             return "médio-ligeiro";
        } else if(peso<=69){
             return "meio-médio";
        } else if(peso<=75){
             return "médio";
        } else if(peso<=81){
            return "meio-pesado";
        } else if(peso<=91){
            return "pesado";
        } else{
          return  "superpesado";
        }
        
    }
}
