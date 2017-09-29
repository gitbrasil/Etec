/**
 * Exemplo de utilização de JRadioButton
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.etec.forms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ET_08_F12_JRadioButton extends JFrame implements ItemListener {

    JLabel label1, label2;
    JTextField t1, t2, t3;
    JRadioButton radio1, radio2, radio3;
    ButtonGroup radiogroup;

    private void criarComponenetesJanela() {
        this.label1 = new JLabel("Numeros");
        this.label2 = new JLabel("Resultados: ");
        this.t1 = new JTextField(5);
        this.t2 = new JTextField(5);
        this.t3 = new JTextField(5);
        this.t3.setEditable(false);
        this.radio1 = new JRadioButton("+");
        this.radio2 = new JRadioButton("-");
        this.radio3 = new JRadioButton("*");
        this.radiogroup = new ButtonGroup();
    }

    private void setarAtribuitosButtonGroup() {
        this.radiogroup.add(this.radio1);
        this.radiogroup.add(this.radio2);
        this.radiogroup.add(this.radio3);
    }

    private void setarAtributosJanela() {
        this.setTitle("RadioButtons");
        this.setBounds(230, 50, 340, 120);
        this.getContentPane().setLayout(new GridLayout(3, 3));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.t1);
        this.getContentPane().add(this.t2);
        this.getContentPane().add(this.radio1);
        this.getContentPane().add(this.radio2);
        this.getContentPane().add(this.radio3);
        this.getContentPane().add(this.t3);
        this.getContentPane().add(new JPanel());
    }

    private void adicionarItemListeners() {
        this.radio1.addItemListener(this);
        this.radio2.addItemListener(this);
        this.radio3.addItemListener(this);
    }

    public ET_08_F12_JRadioButton() {
        this.criarComponenetesJanela();
        this.setarAtributosJanela();
        this.setarAtribuitosButtonGroup();
        this.adicionarItemListeners();
    }

    public void itemStateChanged(ItemEvent e) {
        try {
            float n1 = Float.parseFloat(t1.getText());
            float n2 = Float.parseFloat(t2.getText());
            float result = 0;
            if (e.getSource() == this.radio1) {
                result = n1 + n2;
            }
            if (e.getSource() == this.radio2) {
                result = n1 - n2;
            }
            if (e.getSource() == this.radio3) {
                result = n1 * n2;
            }
            t3.setText("" + result);
        } catch (NumberFormatException erro) {
            this.t3.setText("Erro");
        }
    }

    public static void main(String[] args) {

        JFrame janela = new ET_08_F12_JRadioButton();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
