package semana14.exercicios.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta(1, "Alfredo"));
        contas.add(new Conta(2, "Marcela"));
        contas.add(new Conta(3, "Junior"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da conta: ");
        int codigo = scanner.nextInt();

        Conta conta = null;
        for (Conta c : contas) {
            if (c.getCodigo() == codigo) {
                conta = c;
                break;
            }
        }

        if (conta == null) {
            System.out.println("Conta não encontrada. Programa encerrado.");
            System.exit(0);
        }

        System.out.println("Bem-vindo de volta, " + conta.getCorrentista() + "!");

        boolean sair = false;
        while (!sair) {
            System.out.println("--------- MENU ---------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Ver Extrato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;

                case 3:
                    System.out.println("Digite o valor a ser transferido: ");
                    double transferencia = scanner.nextDouble();
                    System.out.println("Digite o código da conta de destino: ");
                    int codigo2 = scanner.nextInt();

                    Conta destino = null;
                    for (Conta c : contas) {
                        if (c.getCodigo() == codigo2) {
                            destino = c;
                            break;
                        }
                    }

                    if (destino == null) {
                        System.out.println("Conta de destino não encontrada.");
                        break;
                    }

                    conta.transferir(transferencia, destino);
                    break;

                case 4:
                    conta.verSaldo();
                    break;

                case 0:
                    sair = true;
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
