/**
 * Aula 01 - Atividade 03 - Vetor de Notas
 * set 25, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.etec;

import java.util.Scanner;

public class ET_01_E03_Vetor {

    public static void main(String[] args) {

        // variable declaration
        float notas[];
        float total = 0, media = 0;

        // obtain input
        Scanner leitor = new Scanner(System.in);

        // prompt for and read
        System.out.print("Informe a qtde de Notas a serem digitadas: ");
        int qtde = leitor.nextInt();

        // vector size
        notas = new float[qtde];

        // prompt for and read
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno num.: " + i + ": ");
            notas[i] = leitor.nextFloat();
            total += notas[i];
            media = total / qtde;
        }

        System.out.println("\nMedia : " + media + "\n");

        // display message
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == media) {
                System.out.println("Nota do aluno num.: " + i + " foi: " + notas[i] + ", dentro média geral!");
            } else if (notas[i] < media) {
                System.out.println("Nota do aluno num.: " + i + " foi: " + notas[i] + ", abaixo da média geral!");
            } else {
                System.out.println("Nota do aluno num.: " + i + " foi: " + notas[i] + ", acima da média geral!");
            }
        }

        // close resource
        leitor.close();
    }

}
