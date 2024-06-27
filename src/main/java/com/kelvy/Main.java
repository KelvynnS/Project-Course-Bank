package com.kelvy;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        account account = new account();
        System.out.println("-Bem vindo ao MiniBank-");

        System.out.print("Insira o número da conta: ");
        account.setId(sc.nextInt());

        System.out.print("Insira o nome do titular: ");
        account.setName(sc.next());

        System.out.print("Gostaria de fazer um depósito inticial (y/n)? ");
        String total = sc.next();

        if (total.equals("y")){
            System.out.println("Entre com o valor inicial: ");
            account.setBalance(sc.nextDouble());
        }
        System.out.println("-Dados da conta-");
        System.out.println("Conta: " + account.getId() + " Titular: " + account.getName() + " Saldo: " + account.getBalance());

        System.out.println("Insira o valor do depósito: ");
        account.deposito(sc.nextDouble());

        System.out.println("Saldo atualizado: " + account.getBalance() + " Conta: " + account.getId() + " Titular: " + account.getName());
        
        System.out.println("Insira o valor que deseja sacar: ");
        account.saque(sc.nextDouble());
        
        System.out.println("Saldo atualizado: " + account.getBalance() + " Conta: " + account.getId() + " Titular: " + account.getName());

        sc.close();
    }

}