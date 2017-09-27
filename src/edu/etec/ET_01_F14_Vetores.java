/**
 * Uso de Vetores - e do atributo length
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package edu.etec;

import java.util.Scanner;

public class ET_01_F14_Vetores {

    public static void main(String[] args) {

        // variable declaration
        float notas[];

        // prompt for and read 
        System.out.print("Informe a qtde de Notas a serem digitadas: ");
        Scanner leitor = new Scanner(System.in);
        int qtde = leitor.nextInt();

        // vector size
        notas = new float[qtde];

        // prompt for and read 
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno num. " + i + ": ");
            notas[i] = leitor.nextFloat();
        }

        // display message 
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota do aluno num. " + i + " foi: " + notas[i]);
        }

        // close resource
        leitor.close();
    }

}
