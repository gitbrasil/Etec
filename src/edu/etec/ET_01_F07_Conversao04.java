/**
 * Tipos primitivos - Figura 1.7
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package edu.etec;

public class ET_01_F07_Conversao04 {

    public static void main(String[] args) {

        long l = 12;
        int il = 15;
        int i2;

//		i2 = il + l;	// retorna erro
        i2 = il + (int) l;	// compila com casting
//		byte b1 = 0, b2 = 10;

// 		b2 = b1 + (byte)il; // mesmo com casting retorna erro
        System.out.println(i2);
        System.out.println("O Java armazena resultados pelo menos em int");

    }

}
