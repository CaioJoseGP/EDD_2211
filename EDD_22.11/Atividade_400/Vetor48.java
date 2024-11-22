package Atividade_400;

import javax.swing.JOptionPane;

public class Vetor48 {
    public static void main(String[] args) {
        Variaveis vrs = new Variaveis();

        do {
            vrs.op = Integer.parseInt(JOptionPane.showInputDialog(null, "Hotel Fazenda Sucesso \n" + "\n1. Cadastra quartos" + "\n2. Lista todos os quartos" + "\n3. Lista quartos desocupados" + "\n4. Aluguel / reserva quarto" + "\n5. Entra despesas extras" + "\n6. Calcula despesa do quarto" + "\n7. Sair" + "\nEscolha a opção:\n\n"));

            if(vrs.op == 1) {
                if(vrs.chave == 1) {
                    JOptionPane.showMessageDialog(null, "\nAtenção. Dados já cadastrados.");

                } else {
                    for(vrs.i = 0; vrs.i < 50; vrs.i++) {
                        /*vrs.sit[vrs.i] = "L";
                        vrs.nd[vrs.i] = 0;
                        vrs.despesas[vrs.i] = 0;
                        vrs.din[vrs.i] = "XXXX";
                        vrs.dout[vrs.i] = "XXXX";
                        vrs.nome[vrs.i] = "";
                        vrs.tel[vrs.i] = "";
                        vrs.precos[vrs.i] = 30;
                        vrs.leitos[vrs.i] = 5;*/

                        vrs.leitos[vrs.i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de leitos para o quarto " + (vrs.i + 1)));
                        vrs.precos[vrs.i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do quarto " + (vrs.i + 1)));

                        vrs.sit[vrs.i] = "L";
                        vrs.nd[vrs.i] = 0;
                        vrs.despesas[vrs.i] = 0.0f;
                        vrs.din[vrs.i] = "XXXX";
                        vrs.dout[vrs.i] = "XXXX";
                        vrs.nome[vrs.i] = "";
                        vrs.tel[vrs.i] = "";
                    }

                    vrs.chave = 1;
                }

            } else if(vrs.op == 2) {
                if(vrs.chave == 0) {
                    JOptionPane.showMessageDialog(null, "\nEscolha a opção 1");

                } else {
                    for(vrs.i = 0; vrs.i < 50; vrs.i++) {
                        JOptionPane.showMessageDialog(null, "Número do quarto: " + (vrs.i + 1) + "\nSituação quarto: " + vrs.sit[vrs.i]);

                        if(vrs.sit[vrs.i].equals("A") || vrs.sit[vrs.i].equals("R")) {
                            vrs.respo = JOptionPane.showInputDialog(null, "\nNome: " + vrs.nome[vrs.i] + "\nTelefone: " + vrs.tel[vrs.i] + "\nQuantidade de leitos: " + vrs.leitos[vrs.i] + "\nPreço do quarto: " + vrs.precos[vrs.i] + "\nDespesas: " + vrs.despesas[vrs.i] + "\nData de entrada: " + vrs.din[vrs.i] + "\nData de saída: " + vrs.dout[vrs.i] + "\nNúmero de dias: " + vrs.nd[vrs.i] + "\nPressione ENTER para continuar: ");
                        }
                    }
                }

            } else if(vrs.op == 3) {
                if(vrs.chave == 0) {
                    JOptionPane.showMessageDialog(null, "\nEscolha a opção 1");

                } else {
                    for(vrs.i = 0; vrs.i < 50; vrs.i++) {
                        if(vrs.sit[vrs.i].equals("A")) {
                            vrs.resp = JOptionPane.showInputDialog(null, "\nNúmero do quarto: " + (vrs.i + 1) + "\nDespesas: " + vrs.despesas[vrs.i] + "\nData de entrada: " + vrs.din[vrs.i] + "\nData de saída: " + vrs.dout[vrs.i] + "\nNúmero de dias: " + vrs.nd[vrs.i] + "\nPressione ENTER para continuar: ");
                        }
                    }
                }

            } else if(vrs.op == 4) {
                if(vrs.chave == 0) {
                    JOptionPane.showMessageDialog(null, "\nEscolha a opção 1");

                } else {
                    vrs.resp = JOptionPane.showInputDialog(null, "Digite A (aluguel) ou R (reserva):");

                    while (!vrs.resp.equals("A") && !vrs.resp.equals("a") && !vrs.resp.equals("R") && !vrs.resp.equals("r")) {
                        vrs.resp = JOptionPane.showInputDialog(null, "Resposta inválida. Digite A (aluguel) ou R (reserva):");
                    }

                    if(vrs.resp.equals("A") || vrs.resp.equals("a")) {
                        vrs.resp1 = JOptionPane.showInputDialog(null, "Tinha reserva (S/N)?");

                        if(vrs.resp1.equals("S") || vrs.resp1.equals("s")) {

                            vrs.nomep = JOptionPane.showInputDialog(null, "Entre com o nome:");
                            vrs.i = 0;

                            while(!vrs.nomep.equals(vrs.nome[vrs.i]) && vrs.i < 49) {
                                vrs.i++;
                            }

                            if(vrs.nomep.equals(vrs.nome[vrs.i])) {
                                vrs.quarto = vrs.i;
                                vrs.sit[vrs.i] = "A";
                                vrs.despesas[vrs.i] = 0;
                                vrs.din[vrs.quarto] = JOptionPane.showInputDialog(null, "Data de entrada: ");
                                vrs.dout[vrs.quarto] = JOptionPane.showInputDialog(null, "Data de saída: ");
                                vrs.nd[vrs.quarto] = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de dias: "));

                            } else {
                                JOptionPane.showMessageDialog(null, "Reserva não encontrada");
                                vrs.resp1 = "N";
                            }
                        }

                    } else if(vrs.resp.equals("N") || vrs.resp.equals("n") || vrs.resp.equals("R") || vrs.resp.equals("r")) {
                        for(vrs.i = 0; vrs.i < 50; vrs.i++) {
                            if(vrs.sit[vrs.i].equals("L")) {
                                vrs.respo = JOptionPane.showInputDialog(null, "Número do quarto: " + (vrs.i + 1) + "\nQuantidade de leitos: " + vrs.leitos[vrs.i] + "\nPreço do quarto: " + vrs.precos[vrs.i] + "\nPressione ENTER para continuar: ");
                            }
                        }

                        vrs.quarto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do quarto para aluguel ou reserva:"));

                        while(vrs.quarto < 1 || vrs.quarto > 50) {
                            vrs.quarto = Integer.parseInt(JOptionPane.showInputDialog(null, "Quarto inválido. Entre novamente:"));
                        }

                        while(vrs.sit[vrs.quarto - 1].equals("A")) {
                            vrs.quarto = Integer.parseInt(JOptionPane.showInputDialog(null, "Quarto ocupado. Digite novamente:"));
                        }

                        if(vrs.resp.equals("A") || vrs.resp.equals("a")) {
                            vrs.sit[vrs.quarto - 1] = "A";
                            vrs.despesas[vrs.quarto - 1] = 0.0f;

                        } else {
                            vrs.sit[vrs.quarto - 1] = "R";
                            vrs.nome[vrs.quarto - 1] = JOptionPane.showInputDialog(null, "Digite nome: ");
                            vrs.tel[vrs.quarto - 1] = JOptionPane.showInputDialog(null, "Digite telefone para contato: ");
                            vrs.din[vrs.quarto - 1] = JOptionPane.showInputDialog(null, "Data de entrada: ");
                            vrs.dout[vrs.quarto - 1] = JOptionPane.showInputDialog(null, "Data de saída: ");
                            vrs.nd[vrs.quarto - 1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de dias: "));
                        }
                    }
                }

            } else if(vrs.op == 5) {
                if(vrs.chave == 0) {
                    JOptionPane.showMessageDialog(null, "\nEscolha a opção 1");

                } else {
                    vrs.quarto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do quarto: "));

                    while (vrs.quarto < 1 || vrs.quarto > 50) {
                        vrs.quarto = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o número do quarto: "));
                        vrs.valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Despesas: "));
                        vrs.despesas[vrs.quarto - 1] = vrs.despesas[vrs.quarto - 1] + vrs.valor;
                    }
                }

            } else if(vrs.op == 6) {
                if(vrs.chave == 0) {
                    JOptionPane.showMessageDialog(null, "\nEscolha a opção 1");

                } else {
                    vrs.quarto = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o número do quarto: "));

                    while(vrs.quarto < 1 || vrs.quarto > 50) {
                        vrs.quarto = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o número do quarto: "));
                        vrs.total = vrs.despesas[vrs.quarto - 1] + vrs.precos[vrs.quarto - 1];

                        JOptionPane.showMessageDialog(null, "Total das despesas: R$ " + vrs.total);

                        vrs.sit[vrs.quarto - 1] = "L";
                        vrs.despesas[vrs.quarto - 1] = 0.0f;
                        vrs.din[vrs.quarto - 1] = "XXXX";
                        vrs.dout[vrs.quarto - 1] = "XXXX";
                        vrs.nd[vrs.quarto - 1] = 0;
                        vrs.nome[vrs.quarto - 1] = "";
                    }
                }

            } else if(vrs.op == 7) {
                JOptionPane.showMessageDialog(null, "\nSaindo");

            } else {
                JOptionPane.showMessageDialog(null, "\nOpção não disponível.");
            }

        } while(vrs.op != 7);
    }
}