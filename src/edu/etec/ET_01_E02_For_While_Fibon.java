/**
 * Aula 01 - Atividade 02 - Fibonacci
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package edu.etec;

public class ET_01_E02_For_While_Fibon {

    public static void main(String[] args) {

        // variable declaration
        long num1 = 1;
        long num2 = 0;

        // flow repetition
        for (int i = 0; i < 20; i++) {
            if (i < 1) {
                System.out.println(num1);
            }
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
    }

}
