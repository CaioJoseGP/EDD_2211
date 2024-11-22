package Atividade_356;

import javax.swing.JOptionPane;

public class Vetor4 {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        for(vrs.L = 0; vrs.L <= 14; vrs.L++) {
            vrs.nomes[vrs.L] = JOptionPane.showInputDialog(null, String.format("Digite o %d ° nome: ", vrs.L + 1));

            while(vrs.nomes[vrs.L].length() > 30) {
                JOptionPane.showMessageDialog(null, "Nomes com até 30 caracteres", "ERRO", 0);
                vrs.nomes[vrs.L] = JOptionPane.showInputDialog(null, String.format("Digite o %d ° nome: ", vrs.L + 1));
            }

            vrs.t = 30 - vrs.nomes[vrs.L].length();

            for(vrs.c = 0; vrs.c <= vrs.t; vrs.c++) {
                vrs.nomes[vrs.L] += " ";
            }

            vrs.pr1[vrs.L] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 1: "));
            vrs.pr2[vrs.L] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 2: "));

            vrs.media[vrs.L] = (int) Math.round(((vrs.pr1[vrs.L] + vrs.pr2[vrs.L]) / 2 + 0.0001));

            if(vrs.media[vrs.L] >= 5) {
                vrs.sit[vrs.L] = "AP";

            } else {
                vrs.sit[vrs.L] = "RP";
            }
        }

        for(vrs.L = 0; vrs.L <= 14; vrs.L++) {
            JOptionPane.showMessageDialog(null, (vrs.L + 1) + "- " + vrs.nomes[vrs.L] + " \t " + vrs.pr1[vrs.L] + " \t " + vrs.pr2[vrs.L] + " \t " + vrs.media[vrs.L] + " \t " + vrs.sit[vrs.L], "RELAÇÃO FINAL", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
