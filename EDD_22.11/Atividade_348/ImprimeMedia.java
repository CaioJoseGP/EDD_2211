package Atividade_348;

import javax.swing.JOptionPane;

public class ImprimeMedia {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        for(vrs.L = 0; vrs.L <= 4; vrs.L++) {
            vrs.nomes[vrs.L] = JOptionPane.showInputDialog(null, String.format("Digite o %d ° nome: ", vrs.L + 1));
            vrs.pr1[vrs.L] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 1: "));
            vrs.pr2[vrs.L] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 2: "));

            vrs.media[vrs.L] = (vrs.pr1[vrs.L] + vrs.pr2[vrs.L]) / 2;
        }

        JOptionPane.showMessageDialog(null, "RELAÇÃO FINAL");

        for(vrs.L = 0; vrs.L <= 4; vrs.L++) {
            JOptionPane.showMessageDialog(null, String.format("Nome: %s \nNota 1: %.2f \nNota 2: %.2f \nMedia: %.2f", vrs.nomes[vrs.L], vrs.pr1[vrs.L], vrs.pr2[vrs.L], vrs.media[vrs.L]));
        }
    }
}