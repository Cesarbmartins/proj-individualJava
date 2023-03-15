/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.indvidual;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Cesar
 */
public class QuizEsportivo {

    
    String sortearEexibirPergunta(Integer i) {

        String perguntaSorteada = "";
        
        
        switch (i) {
            case 1:

                perguntaSorteada = "Quem é o maior goleador do futebol "
                        + "em jogos oficiais?";

                break;
            case 2:

                perguntaSorteada = "Quantas copas do mundo Pelé ganhou ao "
                        + "longo de sua carreira?";

                break;
            case 3:

                perguntaSorteada = "Quem é o maior pontuador na NBA, "
                        + "em temporadas regulares?";

                break;
            case 4:

                perguntaSorteada = "Quem é o jogador com mais gols num mesmo ano "
                        + "na história do futebol?";

                break;
            case 5:

                perguntaSorteada = "Em que ano Neymar ganhou a Champions League?";

                break;
            case 6:

                perguntaSorteada = "Qual o nome do jogador que fez "
                        + "100 pontos em uma partida da NBA?";

                break;
            case 7:

                perguntaSorteada = "Qual o nome do jogador conhecido como o"
                        + " maior da história do basquete?";

                break;
            case 8:

                perguntaSorteada = "Quem é o maior artilheiro da Neo Quimica arena?";

                break;
            case 9:

                perguntaSorteada = "Em quais times brasileiros Ronaldo Fenômeno jogou";

                break;
            case 10:

                perguntaSorteada = "Quem fez o gol do Corinthians no 1 a 1 "
                        + "contra o Santos na libertadores de 2012?";

                break;
            case 11:

                perguntaSorteada = "Em qual fase da libertadores 2012 o "
                        + "Cássio fez a icônica defesa contra o Vasco?";

                break;
            case 12:

                perguntaSorteada = "Quem fez o gol do título do"
                        + " Real Madrid na Champions 2021/2022?";

                break;
            case 13:

                perguntaSorteada = "Quem é o verdadeiro CR7?";

                break;
            case 14:

                perguntaSorteada = "Qual o nome do jogador conhecido "
                        + "como el tranquilo?";

                break;
            case 15:

                perguntaSorteada = "Quantos mundiais o Palmeiras tem?";

                break;
            case 16:

                perguntaSorteada = "Quantos gols Tevez fez contra o "
                        + "Santos no 7 a 1  em 2005?";

                break;
            case 17:

                perguntaSorteada = "Contra qual time"
                        + " Ronaldo Fenômeno fez seu primeiro gol "
                        + "pelo Corinthians?";

                break;
            case 18:

                perguntaSorteada = "Qual o nome do goleiro que levou o gol"
                        + " de cobertura do Fenômeno no Paulista 2009?";

                break;
            case 19:

                perguntaSorteada = "Quem é o melhor Leo do futebol? Leo Messi ou "
                        + "Léo Gamalho?";

                break;
            case 20:

                perguntaSorteada = "Qual o time que Michael Jordan passou maior "
                        + "parte de sua carreira no basquete?";

                break;
            case 21:

                perguntaSorteada = "Quando foi o último título de NBA dos Lakers";

                break;
            case 22:

                perguntaSorteada = "Quando Michael Jordan ganhou seu último título"
                        + " de NBA?";

                break;
            case 23:

                perguntaSorteada = "Em qual time LeBron ganhou "
                        + "mais títulos de NBA?";

                break;
            case 24:

                perguntaSorteada = "Quem tem mais gols na Champions,"
                        + " Hazard ou Jadson?";

                break;
                
            default:
                perguntaSorteada = "Início";
        }

        return perguntaSorteada;
    }

    Integer pontos = 0;

    String validarRespostas(Integer i, String respostaUsuario) {

        String respostaCorreta = "";

        switch ( i) {
            case 1:

                respostaCorreta = "Cristiano Ronaldo";

                break;
            case 2:

                respostaCorreta = "3";

                break;
            case 3:

                respostaCorreta = "Lebron James";

                break;
            case 4:

                respostaCorreta = "Messi";

                break;
            case 5:

                respostaCorreta = "2015";

                break;
            case 6:

                respostaCorreta = "Wilt Chamberlain";

                break;
            case 7:

                respostaCorreta = "Michael Jordan";

                break;
            case 8:

                respostaCorreta = "Jô";

                break;
            case 9:

                respostaCorreta = "Cruzeiro e Corinthians";

                break;
            case 10:

                respostaCorreta = "Danilo";

                break;
            case 11:

                respostaCorreta = "Quartas de final";

                break;
            case 12:

                respostaCorreta = "Vinicius Jr";

                break;
            case 13:

                respostaCorreta = "Flavio caça-rato";

                break;
            case 14:

                respostaCorreta = "Roni";

                break;
            case 15:

                respostaCorreta = "0";

                break;
            case 16:

                respostaCorreta = "2 gols";

                break;
            case 17:

                respostaCorreta = "Palmeiras";

                break;
            case 18:

                respostaCorreta = "Fabio Costa";

                break;
            case 19:

                respostaCorreta = "Léo Gamalho";

                break;
            case 20:

                respostaCorreta = "Chigago Bulls";

                break;
            case 21:

                respostaCorreta = "2020";

                break;
            case 22:

                respostaCorreta = "1998";

                break;
            case 23:

                respostaCorreta = "Miami Heat";

                break;
            case 24:

                respostaCorreta = "Jadson";

                break;
                
            default:
                respostaCorreta= "Resposta default";
        }

        if (respostaUsuario.equals(respostaCorreta)) {
            pontos += 100;
        }

        return String.format("Pontuação %d", pontos);

    }

 
}
