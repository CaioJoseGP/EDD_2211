package Atividade_351;

import javax.swing.JOptionPane;

public class ProcuraNomePeloNum {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        for(vrs.L = 0; vrs.L <= 4; vrs.L++) {
            vrs.nomes[vrs.L] = JOptionPane.showInputDialog(null, String.format("Nome %d: ", vrs.L + 1));
        }

        vrs.num = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o número da pessoa: ")));

        while(vrs.num < 1 || vrs.num > 5) {
            JOptionPane.showMessageDialog(null, "Número fora do intervalo!");
            vrs.num = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o número da pessoa: ")));
        }

        JOptionPane.showMessageDialog(null, String.format("%s", vrs.nomes[vrs.num - 1]));
    }
}
