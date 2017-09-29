/**
 * Exemplo de utilização de JComboBox
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.etec.forms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ET_08_F05_JComboBox extends JFrame implements ActionListener, ItemListener {
    
    JLabel label1;
    JTextField tadicionar, t1, t2;
    JComboBox combo;
    JButton novoItem;
    
    private void criarComponentesJanela() {
        this.label1 = new JLabel("Animais");
        this.label1.setForeground(Color.BLUE);
        this.label1.setFont(new Font("Ariel", Font.BOLD, 15));
        this.novoItem = new JButton("Adiciona item ");
        this.t1 = new JTextField();
        this.t2 = new JTextField();
        this.tadicionar = new JTextField();
        String[] animais = {"Leao", "Elefante", "Cobra", "Jaboti"};
        combo = new JComboBox(animais);
    }
    
    public void actionPerformed(ActionEvent e) {
        // adiciona item
        if (e.getSource() == this.novoItem && this.tadicionar.getText().length() != 0) {
            this.combo.addItem(tadicionar.getText());
            this.tadicionar.setText(" ");
        }
    }
    
    public void itemStateChanged(ItemEvent e) {
        this.t1.setText(" O valor selecionado é: " + this.combo.getSelectedItem().toString());
        this.t2.setText("Existem " + String.valueOf(this.combo.getItemCount()) + " itens ");
    }
    
    public void setarAtributosJanela() {
        this.setTitle("Usando JComboBox");
        this.setBounds(50, 50, 400, 170);
        this.getContentPane().setBackground(new Color(190, 190, 190));
        this.getContentPane().setLayout(new GridLayout(3, 2));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.combo);
        this.getContentPane().add(this.novoItem);
        this.getContentPane().add(this.tadicionar);
        this.getContentPane().add(this.t1);
        this.getContentPane().add(this.t2);
    }
    
    private void adicionarListeners() {
        this.novoItem.addActionListener(this);
        this.combo.addItemListener(this);
    }
    
    public ET_08_F05_JComboBox()
    {
        this.criarComponentesJanela();
        this.setarAtributosJanela();
        this.adicionarListeners();
    }
    
    public static void main(String[] args) {
        JFrame janela = new ET_08_F05_JComboBox();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
