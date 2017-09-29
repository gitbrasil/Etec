/**
 * Exemplo de uso de GridLayout
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.etec.forms;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;

public class ET_08_F03_GridLayout extends JFrame {
    
    public ET_08_F03_GridLayout() {
        GridLayout layout = new GridLayout(2, 3, 10, 10);
        this.setLayout(layout);
        this.add(new JLabel("O rato roeu a roupa do rei de Roma "));
        this.add(new JLabel("5 minutos para daqui a pouco "));
        this.add(new JLabel("Cara caramba cara cara oh "));
        this.add(new JLabel("A"));
        this.add(new JLabel("B"));
    }
    
    public static void main(String[] args) {
        JFrame janela = new ET_08_F03_GridLayout();
        janela.setBounds(250, 50, 600, 170);
        janela.setTitle("GridLayout");
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
