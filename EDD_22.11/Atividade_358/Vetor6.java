package Atividade_358;

import javax.swing.JOptionPane;

public class Vetor6 {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        for(vrs.A = 0; vrs.A < 99; vrs.A++) {
            vrs.precocompra[vrs.A] = Float.parseFloat(JOptionPane.showInputDialog(null, "Preço de Compra: "));
            vrs.precovenda[vrs.A] = Float.parseFloat(JOptionPane.showInputDialog(null, "Preço de Venda: "));

            vrs.lucro = vrs.precovenda[vrs.A] - vrs.precocompra[vrs.A];

            if(vrs.lucro < 10) {
                vrs.totlucromenor10++;

            } else {
                if(vrs.lucro <= 20) {
                    vrs.totlucromenor20++;

                } else {
                    vrs.totlucromaior20++;
                }
            }
        }

        JOptionPane.showMessageDialog(null, String.format("Total de Mercadorias com Lucro < 10%%: %d \nTotal de Mercadorias com 10%% <= Lucro <= 20%%: %d \nTotal de Mercadorias com Lucro > 20%%: %d", vrs.totlucromenor10, vrs.totlucromenor20, vrs.totlucromaior20));
    }
}
