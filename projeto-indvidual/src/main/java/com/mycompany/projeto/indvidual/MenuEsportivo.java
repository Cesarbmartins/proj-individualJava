/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.indvidual;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class MenuEsportivo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer opcaoEscolhida = 0;

        Utilitaria util = new Utilitaria();
        CalculoCaloriasEsportes funcEsp = new CalculoCaloriasEsportes();
        CondicionaisEsportes condEsp = new CondicionaisEsportes();
        CategoriaBoxeador catBox = new CategoriaBoxeador();
        QuizEsportivo quizEsp = new QuizEsportivo();

        do {

            System.out.println("Menu esportivo, escolha uma oppção");
            System.out.println("1- Calcular calorias perdidas por esporte\n"
                    + "2- Aptidão para esporte\n"
                    + "3- Descobrir categoria no boxe\n"
                    + "4- Sair\n"
                    + "5- Quiz esportivo");
            opcaoEscolhida = leitor.nextInt();
            util.quebrarLinha();
            util.quebrarLinha();


            switch (opcaoEscolhida) {
                case 1:

                    System.out.println("Escolha o esporte que você costuma praticar\n"
                            + "1- Futebol\n"
                            + "2- Basquete\n"
                            + "3- Vôlei\n"
                            + "4- Natação");
                    Integer opcaoEscolhidaEsporte = leitor.nextInt();

                    System.out.println("Insira quanto tempo(em minutos) costuma "
                            + "gastar praticando esse esporte por dia");
                    Integer minutoDigitado = leitor.nextInt();

                    Double caloriaGasta = funcEsp.calcularERetornarCaloria(opcaoEscolhida, minutoDigitado);

                    System.out.println(funcEsp.exibirCaloriaGasta(caloriaGasta));
                    util.linhas();
                    util.linhas();

                    break;
                case 2:

                    System.out.println("Informe o esporte que quer praticar "
                            + "entre esses três abaixo e veja se tem aptidão para os mesmos");
                    System.out.println("1- Futebol\n"
                            + "2- Basquete\n"
                            + "3- Vôlei");
                    Integer esporteEscolhido = leitor.nextInt();

                    System.out.println("Informe sua idade: ");
                    Integer idade = leitor.nextInt();

                    System.out.println("Informe sua altura: ");
                    Double altura = leitor.nextDouble();

                    System.out.println(condEsp.aptidaoEsporte(esporteEscolhido, idade, altura));
                    util.linhas();
                    util.linhas();

                    break;
                case 3:

                    System.out.println("Descubra qual seria sua categoria caso "
                            + "lutasse boxe!\n"
                            + "Basta informar seu peso\n"
                            + "Peso: ");
                    Double pesoDigitado = leitor.nextDouble();

                    System.out.println("Com peso de " + pesoDigitado + " você "
                            + "pertenceria a categoria "
                            + catBox.decidirEExibirCategoria(pesoDigitado));
                    util.linhas();
                    util.linhas();

                    break;
                case 4:

                    break;
                case 5:
                    
                    for(int i = 0 ; i < 25 ; i++ ) {
                       
                         
                        System.out.println("Pergunta " + " - " + quizEsp.sortearEexibirPergunta(i));
                        System.out.println("Digite sua resposta: ");
                        String respostaDigitada = leitor.nextLine();
                        util.quebrarLinha();
                        System.out.println( quizEsp.validarRespostas(i, respostaDigitada));
                        util.linhas();
                        util.linhas();
                        
                       
                    } 

                    break;

                default:
                    System.out.println("A opção que você escolheu não existe! Tente novamente");
            }
        } while (opcaoEscolhida != 4);

        System.out.println("Obrigado pela atenção!! Até logo! :)");
    }
}
