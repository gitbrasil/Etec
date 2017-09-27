/**
 * Uzo da classe Scanner para entrada de dados - Figura 1.9
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package edu.etec;

import java.util.Scanner;

public class ET_01_F09_EntradaDados {

    public static void main(String[] args) {

        // variable declaration	
        int num1 = 0, num2 = 0;

        // obtain input
        Scanner leitor = new Scanner(System.in);

        /// prompt for and read
        System.out.print("Informe o 1o num.: ");
        num1 = leitor.nextInt();

        System.out.print("Informe o 2o num.: ");
        num2 = leitor.nextInt();

        // display message
        System.out.print(num2 + num1);

        // close resource 
        leitor.close();

    }

}
