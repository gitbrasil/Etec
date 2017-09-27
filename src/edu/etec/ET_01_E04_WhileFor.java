/**
 * Aula 01 - Atividade 04 - 
 * set 25, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */

package edu.etec;

import java.util.Scanner;

public class ET_01_E04_WhileFor {

    public static void main(String[] args) {

        // variables
        int count = 0, num = 0;
        
        // obtain input
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Para sair digite um num. menor que 1: ");
        
        do {
        //    
        // prompt for and read
        System.out.print("Entre com o num. ");
        num = leitor.nextInt();

        } while (num >= 0);
     }

}
