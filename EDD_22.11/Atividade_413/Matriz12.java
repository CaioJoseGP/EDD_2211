package Atividade_413;

import javax.swing.JOptionPane;

public class Matriz12 {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        for(vrs.L = 0; vrs.L < 5; vrs.L++) {
            for(vrs.c = 0; vrs.c < 5; vrs.c++) {
                vrs.n[vrs.L][vrs.c] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite elemento %d %d: ", vrs.L + 1, vrs.c + 1)));
            }
        }

        JOptionPane.showMessageDialog(null, "Toda a matriz");

        StringBuilder matrizTexto = new StringBuilder();

        for(vrs.L = 0; vrs.L < 5; vrs.L++) {
            for(vrs.c = 0; vrs.c < 5; vrs.c++) {
                matrizTexto.append(String.format("%d ", vrs.n[vrs.L][vrs.c]));
            }

            matrizTexto.append("\n");
        }

        JOptionPane.showMessageDialog(null, matrizTexto.toString());

        vrs.soma = 0;

        for(vrs.L = 1; vrs.L < 5; vrs.L++) {
            for(vrs.c = 5 - vrs.L; vrs.c < 5; vrs.c++) {
                if(vrs.n[vrs.L][vrs.c] % 2 == 1) {
                    vrs.soma = vrs.soma + vrs.n[vrs.L][vrs.c] * vrs.n[vrs.L][vrs.c];
                }
            }   
        }

        JOptionPane.showMessageDialog(null, String.format("Raiz quadrada da soma dos quadrados dos numeros impares: %d", Math.sqrt(vrs.soma)));
    }
}
