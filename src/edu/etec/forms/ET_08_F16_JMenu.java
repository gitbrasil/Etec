/**
 * Exemplo de criação de janela com barra de menu
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.etec.forms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ET_08_F16_JMenu extends JFrame implements ActionListener {

    // componentes
    JMenuBar menuBar;
    JTextField t1;
    JMenu menuArquivo, menuCliente;
    JMenuItem miAjuda, miClienteEspecial, miClienteComum, miFornecedor, miSair;

    // eventos
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miClienteEspecial) {
            t1.setText("Escolhido o item Cliente Especial");
        } else if (e.getSource() == miClienteComum) {
            t1.setText("Escolhido o item Cliente Comum");
        } else if (e.getSource() == miFornecedor) {
            t1.setText("Escolhido o item Fornecedor");
        } else if (e.getSource() == miAjuda) {
            t1.setText("Escolhido o menu Ajuda");
        } else if (e.getSource() == miSair) {
            System.exit(0);
        } else {
            t1.setText("Item escolhido inválido");

        }
    }

    // montagem visual
    public ET_08_F16_JMenu() {
        this.setBounds(150, 50, 480, 280);
        this.setTitle("Usando o JMenu");
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        this.t1 = new JTextField(30);
        this.getContentPane().add(t1);
        this.menuBar = new JMenuBar();
        this.setJMenuBar(this.menuBar);
        this.menuArquivo = new JMenu("Arquivo");
        this.menuCliente = new JMenu("Cliente");
        this.miClienteComum = new JMenuItem("Cliente Comum");
        this.miClienteEspecial = new JMenuItem("Cliente Especial");
        this.menuArquivo.add(menuCliente);
        this.menuCliente.add(miClienteComum);
        this.menuCliente.add(miClienteEspecial);
        this.miFornecedor = new JMenuItem("Fornecedor");
        this.menuArquivo.add(this.miFornecedor);
        this.miSair = new JMenuItem("Sair");
        this.menuArquivo.add(this.miSair);
        this.miAjuda = new JMenuItem("Ajuda");
        this.menuBar.add(this.menuArquivo);
        this.menuBar.add(this.miAjuda);
        this.miAjuda.addActionListener(this);
        this.miClienteComum.addActionListener(this);
        this.miClienteEspecial.addActionListener(this);
        this.miFornecedor.addActionListener(this);
        this.miSair.addActionListener(this);

    }

    // instanciar e interagir
    public static void main(String[] args) {
        JFrame janela = new ET_08_F16_JMenu();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
