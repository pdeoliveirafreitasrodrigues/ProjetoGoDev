package executa;

import java.util.Scanner;

import cadastros.Cafe;
import cadastros.Pessoa;
import cadastros.Sala;
import listas.Lista;

public class Sistema {
	
	
	static Lista listaSala = new Lista();
	static Lista listaCafe = new Lista();
	static Lista listaPessoa = new Lista();

	static Scanner sc = new Scanner(System.in);
	private static  int escolha;
	private static  String nome = null;
	private static  String sobrenome = null;
	private static  int lotacao = 0;
	
	
	public static void menu() {
		
		System.out.println("------------------------");
		System.out.println("           MENU         ");
		System.out.println("------------------------");
		
		System.out.println("01 - Pessoas"
				+ "\n02 - Salas"
				+ "\n03 - Café");
		
		escolha = sc.nextInt();
		
		switch(escolha) {
		case 01:
			pessoa();
			escolha = 0;
			menu();
			
		case 02:
			salas();
			escolha = 0;
			menu();
		
		case 03:
			cafe();
			escolha = 0;
			menu();
		}
		

	}
	
	public static void salas() {
			
			int num;
			
			System.out.println("01 - Cadastrar"
					+ "\n02 - Listar"
					+ "\n03 - Excluir Primeiro Item");
			
			num = sc.nextInt();
			
			
			if (num == 1) {
				String resp;
				
				do {
				System.out.println("Nome Sala: ");
				nome = sc.next();
				System.out.println("Lotação: ");
				lotacao = sc.nextInt();
			
				Sala sala = new Sala(nome, lotacao);
				listaSala.inserirFinalLista(sala.getNome(), sala.getLotacao());
				
				System.out.println("Deseja mais um cadastro?");
				
				resp = sc.next();
				
				}while(resp.equalsIgnoreCase("Sim"));
				
				escolha = 0;
				
				
			}else if(num == 2) {
				listaSala.mostrar();
				
			
			}else if(num == 3) {
				listaSala.removerInicioLista();
				
			}else {
				System.out.println("Número inválido.");
				num = 0;
				menu();
			}
		
	}
	
	public static void cafe() {
		
		int num;
		
		System.out.println("01 - Cadastrar"
				+ "\n02 - Listar"
				+ "\n03 - Excluir Primeiro Item");
		
		num = sc.nextInt();
		
		
		if (num == 1) {
			String resp;
			
			do {
			System.out.println("Nome Sala de café: ");
			nome = sc.next();
			System.out.println("Lotação: ");
			lotacao = sc.nextInt();
		
			Cafe cafe = new Cafe(nome, lotacao);
			listaCafe.inserirFinalLista(cafe.getNome(), cafe.getLotacao());
			
			System.out.println("Deseja mais um cadastro?");
			
			resp = sc.next();
			
			}while(resp.equalsIgnoreCase("Sim"));
			
			escolha = 0;
			
			
		}else if(num == 2) {
			listaCafe.mostrar();
			
		
		}else if(num == 3) {
			listaCafe.removerInicioLista();
			
		}else {
			System.out.println("Número inválido.");
			num = 0;
			menu();
		}
	
}
	
	public static void pessoa() {
		
		int num;
		
		System.out.println("01 - Cadastrar"
				+ "\n02 - Listar"
				+ "\n03 - Excluir Primeira pessoa");
		
		num = sc.nextInt();
		
		
		if (num == 1) {
			String resp;
			
			do {
			System.out.println("Nome da pessoa: ");
			nome = sc.next();
			System.out.println("Sobrenome: ");
			sobrenome = sc.next();
		
			Pessoa pessoa = new Pessoa(nome, sobrenome);
			listaPessoa.inserirFinalLista(pessoa.getNome(), pessoa.getSobrenome());
			
			System.out.println("Deseja mais um cadastro?");
			
			resp = sc.next();
			
			}while(resp.equalsIgnoreCase("Sim"));
			
			escolha = 0;
			
			
		}else if(num == 2) {
			listaPessoa.mostrar();
			
		
		}else if(num == 3) {
			listaPessoa.removerInicioLista();
			
		}else {
			System.out.println("Número inválido.");
			num = 0;
			menu();
		}
	
}
	
	
	public static void main(String[] args) {
		
		
		
		//Cafe cafe = new Cafe(nome, lotacao);
		//Pessoa pessoa = new Pessoa(nome, sobrenome);
		
		menu();
		

		
	}
	}	
	
