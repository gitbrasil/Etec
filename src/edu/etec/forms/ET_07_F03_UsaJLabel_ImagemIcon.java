/**
 * Exemplo de utilização de JLabel e ImageIcon
 * set 27, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.etec.forms;
//
// interface grafica

import java.awt.*;
import javax.swing.*;

public class ET_07_F03_UsaJLabel_ImagemIcon extends JFrame {

    private JLabel label1, label2;

    private ImageIcon icone = new ImageIcon("D:/NBProjects/IFSP/src/edu/ifsp/forms/AppInstalled.gif");

    public ET_07_F03_UsaJLabel_ImagemIcon() {
        this.setTitle("Labels");
        this.setSize(350, 120);
        this.setLocation(50, 50);
        this.getContentPane().setBackground(new Color(220, 220, 0));
        //
        this.label1 = new JLabel(" Esquerda ", icone, JLabel.LEFT);
        this.label2 = new JLabel(" Direita ", JLabel.RIGHT);
        //
        this.getContentPane().setLayout(new GridLayout(2, 1));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.label2);
    }

    public static void main(String[] args) {
        JFrame janela = new ET_07_F03_UsaJLabel_ImagemIcon();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
