/**
 * Tipos primitivos - Figura 1.6
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package edu.etec;

public class ET_01_F06_Conversao03 {

    public static void main(String[] args) {

        int i = 200;
        byte c = (byte) i;

        System.out.println("Tipos em Overflow.\n");
        System.out.println("Valor convertido de: int i = 200 em byte c = " + c);

    }

}
