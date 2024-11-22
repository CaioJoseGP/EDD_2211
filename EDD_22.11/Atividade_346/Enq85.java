package Atividade_346;

import javax.swing.JOptionPane;

public class Enq85 {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        do {
            vrs.op = Integer.parseInt(JOptionPane.showInputDialog(null, "\t MENU \t\n" + 
                "1 - Imprime o comprimento da frase\n" + 
                "2 - Imprime os dois primeiros e os dois ultimos caracteres da frase 1\n" + 
                "3 - Imprime a frase espelhada\n" + 
                "4 - Termina o algoritmo\n" + 
                "\t OPÇÃO \t"));

            if(vrs.op == 1) {
                vrs.frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");

                JOptionPane.showMessageDialog(null, "Número de caracteres da frase: " + vrs.frase.length());

            } else if(vrs.op == 2) {
                vrs.frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
                vrs.tam = vrs.frase.length() - 2;

                JOptionPane.showMessageDialog(null, "Dois primeiros caracteres: " + vrs.frase.substring(0, 2));
                JOptionPane.showMessageDialog(null, "Dois últimos caracteres: " + vrs.frase.substring(vrs.tam));

            } else if(vrs.op == 3) {
                vrs.frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");

                StringBuilder fraseCompleta = new StringBuilder();

                for(vrs.x = vrs.frase.length() - 1; vrs.x >= 0; vrs.x--) {
                    fraseCompleta.append(vrs.frase.charAt(vrs.x));
                }

                JOptionPane.showMessageDialog(null, fraseCompleta.toString());

            } else if(vrs.op == 4) {
                JOptionPane.showMessageDialog(null, "Fim do algoritmo");

            } else {
                JOptionPane.showMessageDialog(null, "Opção não disponível");
            }

        } while(vrs.op != 4);
    }
}