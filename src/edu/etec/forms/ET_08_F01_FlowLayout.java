/**
 * Exemplo de uso de FlowLayout
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.etec.forms;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;

public class ET_08_F01_FlowLayout extends JFrame {
    
    public ET_08_F01_FlowLayout() {
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 10, 10);
        this.setLayout(layout);
        this.add(new JLabel("O rato roeu a roupa do rei de Roma "));
        this.add(new JLabel("5 minutos para daqui a pouco "));
        this.add(new JLabel("Cara caramba cara cara oh "));
        this.add(new JLabel("A"));
        this.add(new JLabel("B"));
    }
    
    public static void main(String[] args) {
        
        JFrame janela = new ET_08_F01_FlowLayout();
        janela.setBounds(250, 050, 280, 170);
        janela.setTitle("FlowLayout");
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setVisible(true);
    }
    
}
