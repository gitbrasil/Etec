/**
 * Exemplos de utilização da classe JOptionPane
 * set 27, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.etec.forms;

import javax.swing.*;

public class ET_07_F05_JOptionPane {

    public static void main(String[] args) {

        String s = JOptionPane.showInputDialog(null, "Digite seu login", "Login no sistema",
                JOptionPane.QUESTION_MESSAGE);
        if (s == null) {
            return;
        }
        if (JOptionPane.showConfirmDialog(null, "Confirme login ?", "Caixa de confirmação",
                JOptionPane.OK_CANCEL_OPTION) == 0) {
            JOptionPane.showMessageDialog(null, s, "Login confirmado",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, s, "Login não Confirmado",
                    JOptionPane.WARNING_MESSAGE);
            String[] nomes = {"Joao", "Maria", "Pedro", "Janaina"};
            int resp = JOptionPane.showOptionDialog(null, "Escolha um login padrao", "Login no sistema", 0,
                    JOptionPane.INFORMATION_MESSAGE, null, nomes, nomes[1]);
            if (resp == 1) {
                JOptionPane.showMessageDialog(null, "Login " + s + " invalido !!!", "Login confirmado",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}
