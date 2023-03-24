package exercicio3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {

	public static void main(String[] args) {

		int op;

		Scanner read = new Scanner(System.in);

		Queue<String> cliente = new LinkedList<String>();

		do {
			System.out.println("***************************************************");
			System.out.println("\n\t1 - Adicionar Cliente na Fila");
			System.out.println("\n\t2 - Listar todos os clientes");
			System.out.println("\n\t3 - Retirar cliente da fila");
			System.out.println("\n\t0 - Sair");
			System.out.println("\n***************************************************");
			System.out.println("\nDigite uma opção: ");
			System.out.println();
			op = read.nextInt();

			switch (op) {
			case 1:
				read.nextLine();
				System.out.println("\nDigite o nome do cliente que deseja adicionar: ");
				String nomes = read.nextLine();
				cliente.add(nomes);
				System.out.println("\nNome adicionado!");
				break;

			case 2:
				read.nextLine();
				System.out.println("\nLista de clientes na Fila:" + cliente);
				System.out.println();
				break;

			case 3:
				System.out.println();
				if (cliente.isEmpty() == true) {
					System.out.println();
					System.out.println("\nA fila está vazia!");

				} else {
					System.out.println("\nRetirar cliente da fila " + cliente.poll());

				}
			
			case 0:
				System.out.println("\nObrigado por utilizar o sistema de Filas!");
				
				default:
					System.out.println();

			}
		} while (op != 0);

	}

}
