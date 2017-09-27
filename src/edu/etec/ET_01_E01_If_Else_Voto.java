/**
 * Aula 01 - Atividade 01 - Fluxo para Votar
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package edu.etec;

import java.util.Scanner;

public class ET_01_E01_If_Else_Voto {

    public static void main(String[] args) {

        // variable declaration
        short idade = 0;
        String resposta = "";

        // obtain input
        Scanner leitor = new Scanner(System.in);

        // prompt for and read
        System.out.print("Informe a sua idade: ");
        idade = leitor.nextShort();

        // flow selection
        // if (idade < 0 || idade > 130) {
        // System.out.println("Dado errado, verifique!");
        // } else if (idade < 16) {
        // System.out.println("Na sua idade, a Lei faculta o Voto!");
        // } else if (idade >= 16 && idade < 18 || idade > 65) {
        // System.out.println("Na sua idade, a Lei faculta o Voto!");
        // } else
        // System.out.println("A lei obriga a votar!");
        // ternary operator
        // flow selection 
        resposta = (idade < 0 || idade > 130) ? "Dado errado, verifique!"
                : (idade < 16) ? "A lei o impede de votar!"
                        : (idade >= 16 && idade < 18 || idade > 65) ? "Na sua idade, a Lei faculta o Voto!"
                                : "A lei obriga a votar!.";

        // display message   
        System.out.println(resposta);

        // close resource
        leitor.close();
        
        // exit program
        System.exit(0);
    }

}
