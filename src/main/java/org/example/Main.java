package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Números Complexos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 1000,  400);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 6));

        JTextField inputField1 = new JTextField();
        JTextField inputField2 = new JTextField();
        JTextField inputField3 = new JTextField();
        JTextField inputField4 = new JTextField();
        JTextField outputField = new JTextField();
        JTextField outputField2 = new JTextField();
        JTextField outputField3 = new JTextField();
        outputField.setEditable(false);
        outputField2.setEditable(false);
        outputField2.setBorder(null);
        outputField3.setEditable(false);

        inputField1.setFont((new Font("Arial", Font.PLAIN, 15)));
        inputField2.setFont((new Font("Arial", Font.PLAIN, 15)));
        inputField3.setFont((new Font("Arial", Font.PLAIN, 15)));
        inputField4.setFont((new Font("Arial", Font.PLAIN, 15)));
        outputField.setFont((new Font("Arial", Font.PLAIN, 15)));

        JLabel label1 = new JLabel("Número complexo 1:");
        label1.setFont((new Font("Arial", Font.BOLD, 20)));
        JLabel label2 = new JLabel("Número complexo 2:");
        label2.setFont((new Font("Arial", Font.BOLD, 20)));
        JLabel label3 = new JLabel("Resultado:");
        label3.setFont((new Font("Arial", Font.BOLD, 20)));

        JLabel label4 = new JLabel("+");
        label4.setFont((new Font("Arial", Font.BOLD, 30)));
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel label5 = new JLabel("+");
        label5.setFont((new Font("Arial", Font.BOLD, 30)));
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel label6 = new JLabel("i");
        label6.setFont((new Font("Arial", Font.PLAIN, 20)));
        JLabel label7 = new JLabel("i");
        label7.setFont((new Font("Arial", Font.PLAIN, 20)));
        JLabel label8 = new JLabel();


        panel.add(label1);
        panel.add(inputField1);
        panel.add(label4);
        panel.add(inputField2);
        panel.add(label6);
        panel.add(label2);
        panel.add(inputField3);
        panel.add(label5);
        panel.add(inputField4);
        panel.add(label7);
        panel.add(label3);
        panel.add(outputField);
        panel.add(outputField2);
        panel.add(outputField3);
        panel.add(label8);

        String[] buttonLabels = {"Somar", "Subtrair", "Módulo"};

        for(String label: buttonLabels){
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 30));
            panel.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Complexo complexo = new Complexo();
                    double num1N, num2N,num1C, num2C, result1=0, result2=0;
                    try{
                        num1N = Double.parseDouble(inputField1.getText());
                        num2N = Double.parseDouble(inputField3.getText());
                        num1C = Double.parseDouble(inputField2.getText());
                        num2C = Double.parseDouble(inputField4.getText());

                        if (label.equals("Somar")){
                            result1 = complexo.somaN(num1N, num2N);
                            result2 = complexo.somaC(num1C, num2C);
                        }
                        else if (label.equals("Subtrair")){
                            result1 = complexo.subtracaoN(num1N, num2N);
                            result2 = complexo.subtracaoC(num1C, num2C);
                        }
                        else if (label.equals("Módulo")){
                                result1 = complexo.modulo(num1N,num1C);
                        }
                        outputField.setText(Double.toString(result1));
                        outputField3.setText(result2 + "i");
                    }
                    catch (NumberFormatException ex){
                        outputField.setText("Erro: Entrada inválida");
                    }
                }
            });
        }
        frame.add(panel);
        frame.setVisible(true);
    }
}

/*
O teste de caixa branca é o teste que se observa o código fonte da aplicação, ou seja, é testada
a estrutura interna. Sendo utilizados casos de teste que irão cobrir as funcionalidades dos componentes do software.

O teste de caixa preta é o teste que utiliza de um resultado esperado, ou seja, os dados necessários para rodar o
código são fornecidos e o resultado obtido é comparado com o resultado esperado, sem ser observado o código fonte.
*/
