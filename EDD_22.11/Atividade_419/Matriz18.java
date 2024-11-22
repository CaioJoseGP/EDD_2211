package Atividade_419;

import javax.swing.JOptionPane;

public class Matriz18 {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        for(vrs.L = 0; vrs.L < 5; vrs.L++) {
            for(vrs.c = 0; vrs.c < 5; vrs.c++) {
                vrs.A[vrs.L][vrs.c] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite elemento de A %d %d: ", vrs.L + 1, vrs.c + 1)));
            }
        }

        for(vrs.L = 0; vrs.L < 5; vrs.L++) {
            for(vrs.c = 0; vrs.c < 5; vrs.c++) {
                vrs.B[vrs.L][vrs.c] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite elemento de B %d %d: ", vrs.L + 1, vrs.c + 1)));
                vrs.DIF[vrs.L][vrs.c] = vrs.A[vrs.L][vrs.c] - vrs.B[vrs.L][vrs.c];
            }
        }

        JOptionPane.showMessageDialog(null, "MATRIZ DIFERENÇA");

        StringBuilder matrizTexto = new StringBuilder();

        for(vrs.L = 0; vrs.L < 5; vrs.L++) {
            for(vrs.c = 0; vrs.c < 5; vrs.c++) {
                matrizTexto.append(String.format("%d ", vrs.DIF[vrs.L][vrs.c]));
            }

            matrizTexto.append("\n");
        }

        JOptionPane.showMessageDialog(null, matrizTexto.toString());
    }
}
