/**
 * Tipos primitivos - Figura 1.5
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package edu.etec;

public class ET_01_F05_Conversao02 {

    public static void main(String[] args) {

        double p = 23.3;
        int i, j;

        i = (int) p;
        j = (int) 2.3;

        System.out.println("Conversão correta. \n");
        System.out.println("Valor convertido double 23.3 de i (int): \t" + i);
        System.out.println("Valor convertido double 2.3  de j (int): \t" + j);

    }

}
