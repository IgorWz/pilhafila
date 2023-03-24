package exercicio3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class pilha {

	public static void main(String[] args) {

		int op;

		Scanner read = new Scanner(System.in);

		Stack<String> cliente = new Stack<String>();

		do {
			System.out.println("***************************************************");
			System.out.println("\n\t1 - Adicionar Livro na pilha");
			System.out.println("\n\t2 - Listar todos os livros");
			System.out.println("\n\t3 - Retirar livro da pilha");
			System.out.println("\n\t0 - Sair");
			System.out.println("\n***************************************************");
			System.out.println("\nDigite uma opção: ");
			System.out.println();
			op = read.nextInt();

			switch (op) {
			case 1:
				read.nextLine();
				System.out.println("\nDigite o nome do livro que deseja: ");
				String nomes = read.nextLine();
				cliente.add(nomes);
				System.out.println("\nLivro adicionado!");
				break;

			case 2:
				read.nextLine();
				System.out.println("\nLista de Livros na Pilha: " + cliente);
				System.out.println();
				break;

			case 3:
				System.out.println();
				if (cliente.isEmpty() == true) {
					System.out.println();
					System.out.println("\nA Pilha está vazia!");

				} else {
					System.out.println("\nRetirar livro da pilha " + cliente.peek());
					cliente.pop();
				}
			
			case 0:
				System.out.println("\nObrigado por utilizar o sistema de Livros!");
				
				default:
					System.out.println();

			}
		} while (op != 0);

	}

}

