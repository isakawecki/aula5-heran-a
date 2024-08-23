package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.Contacorrente;
import entidade.Contapoupanca;

public class Main {

    public static void main(String[] args) {
        List<Conta> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Deseja acessar a Conta corrente ou a Poupança?");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        int opcao = scanner.nextInt();

        Conta conta = null;
        if (opcao == 1) {
            System.out.println("Digite o número da conta: ");
            int numero = scanner.nextInt();
            System.out.println("Digite o saldo inicial: ");
            double saldo = scanner.nextDouble();
            System.out.println("Digite o limite da conta: ");
            double limite = scanner.nextDouble();
            conta = new Contacorrente(nome, numero, saldo, limite);
        } else if (opcao == 2) {
            System.out.println("Digite o número da conta: ");
            int numero = scanner.nextInt();
            System.out.println("Digite o saldo inicial: ");
            double saldo = scanner.nextDouble();
            conta = new Contapoupanca(nome, numero, saldo);
        }

        lista.add(conta);

        while (true) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sair");
            int opcao2 = scanner.nextInt();

            if (opcao2 == 1) {
                System.out.println("Digite o valor do saque: ");
                double saque = scanner.nextDouble();
                conta.sacar(saque);
            } else if (opcao2 == 2) {
                System.out.println("Digite o valor do depósito: ");
                double deposito = scanner.nextDouble();
                conta.depositar(deposito);
            } else if (opcao2 == 3) {
                break;
            }
        }

        System.out.println("Informações da conta:");
        System.out.println(conta.mostrar());

        scanner.close();
    }
}