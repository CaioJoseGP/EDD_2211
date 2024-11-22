package Atividade_362;

import javax.swing.JOptionPane;

public class Vetor10 {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        JOptionPane.showMessageDialog(null, "Entrada de dados do Vetor 1 (10 elementos)");

        for(vrs.i = 0; vrs.i <= 9; vrs.i++) {
            vrs.vet1[vrs.i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Entre com %d elemento", vrs.i + 1)));
        }

        JOptionPane.showMessageDialog(null, "Entrada de dados do Vetor 2 (20 elementos)");

        for(vrs.i = 0; vrs.i <= 19; vrs.i++) {
            vrs.vet2[vrs.i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Entre com %d elemento", vrs.i + 1)));
        }

        for(vrs.i = 0; vrs.i <= 9; vrs.i++) {
            vrs.vetc[vrs.i] = -999999999;
        }

        for(vrs.i = 0; vrs.i <= 9; vrs.i++) {
            vrs.c = 0;

            while(vrs.vet1[vrs.i] != vrs.vet2[vrs.c] && vrs.c < 19) {
                vrs.c++;
            }

            if(vrs.vet1[vrs.i] == vrs.vet2[vrs.c]) {
                vrs.d = 0;

                while(vrs.vet1[vrs.i] != vrs.vetc[vrs.d] && vrs.d < vrs.L) {
                    vrs.d++;
                }

                if(vrs.d == vrs.L) {
                    vrs.vetc[vrs.d] = vrs.vet1[vrs.i];
                    vrs.L++;
                }
            }
        }

        if(vrs.L != 0) {
            JOptionPane.showMessageDialog(null, "Elementos Comuns");

            for(vrs.i = 0; vrs.i <= vrs.L - 1; vrs.i++) {
                JOptionPane.showMessageDialog(null, vrs.vetc[vrs.i]);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Não existem Elementos Comuns");
        }
    }
}
