/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.indvidual;

/**
 *
 * @author Cesar
 */
public class CalculoCaloriasEsportes {
    
    Double calcularERetornarCaloria(Integer opcaoEscolhida, Integer minutos){
        
        Double kcalGasta=0.0;
        
        switch(opcaoEscolhida){
            case 1:
                kcalGasta=minutos*9.0;
                
            case 2:
                kcalGasta=minutos*10.0;
                
            case 3:
                kcalGasta=minutos*6.0;
                
            case 4:
                kcalGasta=minutos*9.0;
        }
        
        return kcalGasta;
        
    }
    
    String exibirCaloriaGasta(Double kcalGasta){
        return String.format("Você gasta %.1f calorias por dia praticando esse esporte",kcalGasta);
    }
}
