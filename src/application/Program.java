package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.print("Número: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String holder = sc.nextLine();
		System.out.print("Depósito inicial: ");
		Double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		Double withdrawLimit = sc.nextDouble();
		Account acc = new Account(number, holder, balance, withdrawLimit);
		System.out.println();
		
		System.out.print("Informe uma quantia para sacar: ");
		Double amount = sc.nextDouble();
		
		try {
		acc.withdraw(amount);
		System.out.printf("Novo balanço: %.2f%n", acc.getBalance());
		
		} catch(BusinessException e){
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		sc.close();
	}
}
