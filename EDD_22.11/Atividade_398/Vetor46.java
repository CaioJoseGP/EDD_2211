package Atividade_398;

import javax.swing.JOptionPane;

public class Vetor46 {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        vrs.codi = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto ou 0 para acabar:"));

        while (vrs.k < 50 && vrs.codi != 0) {
            vrs.cod[vrs.k] = vrs.codi;
            vrs.quant[vrs.k] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade do produto:"));
            vrs.preco[vrs.k] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do produto:"));
            vrs.k++;

            vrs.codi = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto ou 0 para acabar:"));
        }

        JOptionPane.showMessageDialog(null, "Início das vendas");

        while (true) {
            vrs.codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto a ser vendido (0 para encerrar a venda):"));

            if (vrs.codigo == 0) {
                break;
            }

            boolean encontrado = false;
            for (int i = 0; i < vrs.k; i++) {
                if (vrs.cod[i] == vrs.codigo) {
                    encontrado = true;
                    vrs.quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade a ser vendida:"));

                    if (vrs.quant[i] >= vrs.quantidade) {
                        vrs.quant[i] -= vrs.quantidade;
                        vrs.venda = vrs.preco[i] * vrs.quantidade;
                        vrs.geral += vrs.venda;
                        JOptionPane.showMessageDialog(null, "Venda realizada. Total da venda: " + vrs.venda);
                    } else {
                        JOptionPane.showMessageDialog(null, "Estoque Insuficiente");
                    }
                    break;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Produto Não-Cadastrado");
            }
        }

        JOptionPane.showMessageDialog(null, "Total de vendas do dia: " + vrs.geral);
        JOptionPane.showMessageDialog(null, "Relatório de estoque (ordem decrescente de quantidades disponíveis):");

        for (int i = 0; i < vrs.k - 1; i++) {
            for (int t = i + 1; t < vrs.k; t++) {
                if (vrs.quant[i] < vrs.quant[t]) {
                    vrs.aux = vrs.quant[i];
                    vrs.quant[i] = vrs.quant[t];
                    vrs.quant[t] = vrs.aux;

                    vrs.auxp = vrs.preco[i];
                    vrs.preco[i] = vrs.preco[t];
                    vrs.preco[t] = vrs.auxp;

                    vrs.aux = vrs.cod[i];
                    vrs.cod[i] = vrs.cod[t];
                    vrs.cod[t] = vrs.aux;
                }
            }
        }

        StringBuilder estoque = new StringBuilder();
        for (int i = 0; i < vrs.k; i++) {
            estoque.append("Produto ").append(vrs.cod[i]).append(" - Quantidade: ").append(vrs.quant[i]).append(" - Preço: ").append(vrs.preco[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, estoque.toString());
    }
}