/**
 * Primeiro exemplo de janela Jframe
 * set 27, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.etec.forms;

// interface grafica
import java.awt.Color;
import javax.swing.JFrame;

public class ET_07_F01_PrimeiraJanela extends JFrame {
    
    public ET_07_F01_PrimeiraJanela() {
        // 
        // Titulo da Janela
        this.setTitle("Primeiro aplicativo Swing");
        //
        // Dimensoes da Janela
        this.setSize(1000, 500);
        //
        // Posicao: Canto esquerdo superior da tela
        this.setLocation(150, 50);
        //
        // Impedir que a janela seja redimensionada
        this.setResizable(false);
        //
        // Colocar cor de fundo azul na janela
        this.getContentPane().setBackground(Color.BLACK);
    }
    
    public static void main(String[] args) {
        //
        // Criar uma instancia do tipo 'PrimeiraJanela()'
        ET_07_F01_PrimeiraJanela jan = new ET_07_F01_PrimeiraJanela();
        //
        // Tornar a janela visivel
        jan.setVisible(true);
    }
    
}
