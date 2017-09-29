/**
 * Exemplo de utilização de JCheckBox
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.etec.forms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ET_08_F09_JCheckBox extends JFrame implements ItemListener {

    JLabel label1;
    JCheckBox c1;

    private void criarComponentesJanela() {
        this.label1 = new JLabel("O rato roeu");
        this.label1.setFont(new Font("Ariel", Font.PLAIN, 20));
        this.c1 = new JCheckBox("Negrito");

    }

    private void setarAtributosJanela() {
        this.setTitle("Usando JCheckBox");
        this.setBounds(250, 50, 300, 70);
        this.getContentPane().setBackground(new Color(190, 190, 190));
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.c1);
    }

    private void adicionarActionListeners() {
        this.c1.addItemListener(this);
    }

    public ET_08_F09_JCheckBox() {
        this.criarComponentesJanela();
        this.setarAtributosJanela();
        this.adicionarActionListeners();
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == this.c1) {
            if (this.c1.isSelected()) {
                this.label1.setFont(new Font("Ariel", Font.BOLD, 20));
            } else {
                this.label1.setFont(new Font("Ariel", Font.PLAIN, 20));
            }
        }
    }

    public static void main(String[] args) {
        JFrame janela = new ET_08_F09_JCheckBox();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
