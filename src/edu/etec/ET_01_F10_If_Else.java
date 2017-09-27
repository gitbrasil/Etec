/**
 * Fluxo de escolha - if...else - Figura 1.10
 * 12 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package edu.etec;

import java.util.Scanner;

public class ET_01_F10_If_Else {

    public static void main(String[] args) {

        // variable declaration
        double nota = 0;

        // obtain input
        Scanner leitor = new Scanner(System.in);

        // prompt for and read
        System.out.print("Entre com a nota: ");
        nota = leitor.nextDouble();

        // flow selection
        if (nota <= 100 && nota >= 0) {
            System.out.println("Nota = " + nota + " (valor dentro do intervalo!)");
        } else {
            System.out.println("Nota = " + nota + " (valor fora do intervalo!)");
        }

        // close resource
        leitor.close();
    }

}
