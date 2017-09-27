/**
 * Aula 01 - Atividade 03 - Vetor de Notas
 * set 25, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.etec;

import java.util.Scanner;

public class ET_01_E03_Vetor2 {

    public static void main(String[] args) {

        // variable declaration
        float notas[];
        float total = 0, media = 0, notasQtde = 0;
        int igual = 0, maior = 0, menor = 0;

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
        System.out.println("\nMedia: " + media);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == media) {
                igual++;
            } else if (notas[i] > media) {
                maior++;
            } else if (notas[i] < media){
                menor++;
            }
        }

        // display message

        System.out.println("");
        System.out.println("Igual : " + igual);
        System.out.println("Maior : " + maior);
        System.out.println("Menor : " + menor);

        // close resource
        leitor.close();
    }

}
