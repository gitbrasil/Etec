/**
 * Uso do switch...case - Figura 1.11
 * 12 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package edu.etec;

import java.util.Scanner;

public class ET_01_F11_Switch_Case {

    public static void main(String[] args) {

        // variable declaration
        int mes = 0;

        // obtain input
        Scanner leitor = new Scanner(System.in);

        // prompt for and read
        System.out.println("Escolha um mes: ");
        System.out.println("1 . Janeiro");
        System.out.println("2 . Fevereiro");
        System.out.println("3 . Marco");
        System.out.println("4 . Abril");
        System.out.println("5 . Maio");
        System.out.println("6 . Junho");
        System.out.println("7 . Julho");
        System.out.println("8 . Agosto");
        System.out.println("9 . Setembro");
        System.out.println("10. Outubro");
        System.out.println("11. Novembro");
        System.out.println("12. Dezembro");
        mes = leitor.nextInt();

        // flow control
        switch (mes) {

            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Mar�o");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Escolha errada, verifique!");
        }

        // close resource
        leitor.close();
    }

}
