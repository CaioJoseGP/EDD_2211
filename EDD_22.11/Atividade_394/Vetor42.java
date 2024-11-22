package Atividade_394;

import javax.swing.JOptionPane;

public class Vetor42 {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        do {
            vrs.op = JOptionPane.showInputDialog(null, "\t MENU \t\n" + "1 - ENTRAR NOMES\n" + "2 - ENTRAR NOTA 1\n" + "3 - ENTRAR NOTA 2\n" + "4 - CALCULAR MEDIA\n" + "5 - LISTAR NO DISPLAY\n" + "6 - SAIR\n" + "\t OPÇÃO \t");

            if(vrs.op.equals("1")) {
                vrs.flag = 1;

                for(vrs.L = 0; vrs.L <= 49; vrs.L++) {
                    vrs.nomes[vrs.L] = JOptionPane.showInputDialog(null, String.format("Digite %d nome (com até 30 caracteres e todas as letras maiúscula)", vrs.L + 1));

                    while(vrs.nomes[vrs.L].length() > 30) {
                        vrs.nomes[vrs.L] = JOptionPane.showInputDialog(null, String.format("NOME COM APENAS 30 CARACTERES! Digite %d nome (todas as letras maiúscula)", vrs.L + 1));
                    }

                    vrs.tam = vrs.nomes[vrs.L].length();

                    if(vrs.tam < 30) {
                        for(vrs.c = 0; vrs.c <= 30 - vrs.tam; vrs.c++) {
                            vrs.nomes[vrs.L] += " "; 
                        }
                    }
                }

            } else if(vrs.op.equals("2")) {
                if(vrs.flag == 0) {
                    JOptionPane.showMessageDialog(null, "NÃO TEM NOME CADASTRADO");

                } else {
                    for(vrs.L = 0; vrs.L <= 49; vrs.L++) {
                        vrs.nota1[vrs.L] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Nota 1:"));
                    }

                    vrs.flag1 = 1;
                }

            } else if(vrs.op.equals( "3")) {
                if(vrs.flag == 0) {
                    JOptionPane.showMessageDialog(null, "NÃO TEM NOME CADASTRADO");

                } else {
                    for(vrs.L = 0; vrs.L <= 49; vrs.L++) {
                        vrs.nota2[vrs.L] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Nota 2:"));
                    }

                    vrs.flag2 = 1;
                }

            } else if(vrs.op.equals("4")) {
                if(vrs.flag == 0 || vrs.flag1 == 0 || vrs.flag2 == 0) {
                    JOptionPane.showMessageDialog(null, "NEM TODOS OS DADOS ESTÃO CADASTRADOS");

                } else {
                    for(vrs.L = 0; vrs.L <= 49; vrs.L++) {
                        vrs.media[vrs.L] = ((vrs.nota1[vrs.L] * 3) + (vrs.nota2[vrs.L]) * 7) / 10;
                    }
                }

            } else if(vrs.op.equals("5")) {
                if(vrs.flag == 0 || vrs.flag1 == 0 || vrs.flag2 == 0) {
                    JOptionPane.showMessageDialog(null, "NEM TODOS OS DADOS ESTÃO CADASTRADOS");

                } else {
                    for(vrs.L = 0; vrs.L <= 49; vrs.L++) {
                        JOptionPane.showMessageDialog(null, String.format("Nome: %s \nNota 1: %.2f \nNota 2: %.2f \nMédia: %.2f", vrs.nomes[vrs.L], vrs.nota1[vrs.L], vrs.nota2[vrs.L], vrs.media[vrs.L]));
                    }
                }

            } else if(vrs.op.equals("6")) {
                break;
                
            } else {
                JOptionPane.showMessageDialog(null, "OPÇÃO NÃO DISPONÍVEL");
            }

        } while(!vrs.op.equals("6"));
    }
}
