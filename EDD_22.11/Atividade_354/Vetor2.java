package Atividade_354;

import javax.swing.JOptionPane;

public class Vetor2 {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        for(vrs.L = 0; vrs.L <= 4; vrs.L++) {
            vrs.num[vrs.L] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o %d ° número: ", vrs.L + 1)));
        }

        JOptionPane.showMessageDialog(null, "RELAÇÃO DOS NÚMEROS");

        for(vrs.L = 0; vrs.L <= 4; vrs.L++) {
            if(vrs.num[vrs.L] % 2 == 0) {
                vrs.n = "é PAR";

            } else {
                vrs.n = "é ÍMPAR";
            }

            JOptionPane.showMessageDialog(null, String.format("\n%d - %d %s", vrs.L + 1, vrs.num[vrs.L], vrs.n));
        }
    }
}
