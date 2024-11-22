package Atividade_360;

import javax.swing.JOptionPane;

public class Vetor8 {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        for(vrs.i = 0; vrs.i < 12; vrs.i++) {
            vrs.signo[vrs.i] = JOptionPane.showInputDialog(null, "Digite o Signo: ");
            vrs.ultdia[vrs.i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o último dia: "));
        }

        vrs.data = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a data no formato ddmm ou 9999 para terminar: "));

        while(vrs.data != 9999) {
            vrs.dia = Math.round(vrs.data / 100);
            vrs.mes = vrs.data % 100;
            vrs.mes--;

            if(vrs.dia > vrs.ultdia[vrs.mes]) {
                vrs.mes = (vrs.mes + 1) % 12;
            }

            JOptionPane.showMessageDialog(null, "Signo: " + vrs.signo[vrs.mes]);
            vrs.data = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a data no formato ddmm ou 9999 para terminar: "));
        }
    }
}