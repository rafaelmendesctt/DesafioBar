package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Sexo: ");
		Bill.gender = scanner.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		Bill.beer = scanner.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		Bill.softDrink = scanner.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		Bill.barbecue = scanner.nextInt();

		System.out.println("\nRELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f\n", Bill.feeding());
		if (Bill.cover() == 0) {
			System.out.printf("Isento de Couvert\n");
		} else {
			System.out.printf("Couvert = R$ %.2f\n", Bill.cover());
		}
		System.out.printf("Ingresso = R$ %.2f\n", Bill.ticket());

		System.out.printf("\nValor a pagar = R$ %.2f", Bill.total());

		scanner.close();
	}
}