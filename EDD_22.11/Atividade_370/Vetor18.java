package Atividade_370;

import javax.swing.JOptionPane;

public class Vetor18 {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        vrs.nv = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o número de voos: "));

        for(vrs.i = 0; vrs.i < vrs.nv; vrs.i++) {
            vrs.nome[vrs.i] = JOptionPane.showInputDialog(null, String.format("Entre com a identificação de voo %d: ", vrs.i + 1));
            vrs.voos[vrs.i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Entre com a quantidade de lugares disponíveis no voo %s: ", vrs.nome[vrs.i])));
        }

        vrs.nvd = JOptionPane.showInputDialog(null, "Entre com o número desejado de voo ou 0 para terminar: ");

        while(!vrs.nvd.equals("0")) {
            vrs.i = 0;

            while(!vrs.nvd.equals(vrs.nome[vrs.i]) && vrs.i < vrs.nv - 1) {
                vrs.i++;
            }

            if(vrs.nome[vrs.i].equals(vrs.nvd)) {
                if(vrs.voos[vrs.i] > 0) {
                    vrs.voos[vrs.i]--;

                    vrs.id = JOptionPane.showInputDialog(null, "Qual o número da identidade do cliente? ");
                    JOptionPane.showMessageDialog(null, String.format("Identidade: %s \nVoo: %s", vrs.id, vrs.nvd));

                } else {
                    JOptionPane.showMessageDialog(null, "Não existem mais lugares nesse voo");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Não existe este voo");
            } 

            vrs.nvd = JOptionPane.showInputDialog(null, "Entre com o número desejado de voo ou 0 para terminar: ");
        }
    }
}
