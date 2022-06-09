package projetomaquinadelavar;

import java.io.*;
import java.lang.Thread;
import java.util.Scanner;

public class maquinadelavar {
	
	static int numero1 = 20;
	static int numero2 = 20;
	static int numero3 = 20;
	static int numero4 = 20;
	static int numero5 = 20;
	
	
	static int lavacaoPesada = 0;
	static int lavacaoNormal = 0;
	static int lavacaoLeve = 0;
	static int enxague = 0;
	static int centrifuga = 0;
	

	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);

		String modelo;
		String nome;
		int voltagem;
		int kilos;
		
		while (true)

		{
			System.out.println("==================================================="
					+ " \n                 MENU SIMULA��O \n" + "==================================================="
					+ " \n 1-Configurar m�quina de lavar " + "\n 2-Simular m�quina de lavar" + " \n 3-Sair"
					+ "\n Selecione uma op��o:");

			int opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("==================================================="
						+ "\n       MENU DE CONFIGURA��O DA M��QUINA DE LAVAR  \n"
						+ "===================================================");

				System.out.println("Modelo:");
				modelo = entrada.nextLine();
				modelo = entrada.nextLine();

				System.out.println("Nome:");
				nome = entrada.next();

				System.out.println("Voltagem:");
				voltagem = entrada.nextInt();

				System.out.println("Quantos kilos?");
				kilos = entrada.nextInt();

				System.out.println("Est�gio1-Lava��o Pesada:");
				lavacaoPesada = entrada.nextInt();

				System.out.println("Est�gio2-Lava��o Normal:");
				lavacaoNormal = entrada.nextInt();

				System.out.println("Est�gio3-Lava��o Leve:");
				lavacaoLeve = entrada.nextInt();

				System.out.println("Est�gio4-Enxague:");
				enxague = entrada.nextInt();

				System.out.println("Est�gio5-Centrifuga:");
				centrifuga = entrada.nextInt();

			}

			if (opcao == 2) {
				System.out.println("==================================================="
						+ "\n       SIMULA��O DA M�QUINA DE LAVAR \n"
						+ "===================================================" + "\n 1-Lava��o Pesada"
						+ "\n 2-Lava��o Normal" + "\n 3-Lava��o Leve" + "\n 4-Enxague" + "\n 5-Centrifugar \n"
						+ "Selecione o est�gio inicial:");

				int opt = entrada.nextInt();
				
				switch (opt) {
				case 1:
					lavacaoPesada();
					System.out.print("\n");

					lavacaoNormal();
					System.out.print("\n");

					lavacaoLeve();
					System.out.print("\n");
		
					enxague();
					System.out.println("\n");
					
					centrifuga();
					System.out.println("\n");
					
					System.out.println("Simula��o finalizada!");
					break;

				case 2:
					
					lavacaoNormal();
					System.out.print("\n");

					lavacaoLeve();
					System.out.print("\n");
		
					enxague();
					System.out.println("\n");
					
					centrifuga();
					System.out.println("\n");
					
					System.out.println("Simula��o finalizada!");
					break;
					
				case 3:
					lavacaoLeve();
					System.out.print("\n");
		
					enxague();
					System.out.println("\n");
					
					centrifuga();
					System.out.println("\n");
					
					System.out.println("Simula��o finalizada!");
					break;
					
				case 4:
					enxague();
					System.out.println("\n");
					
					centrifuga();
					System.out.println("\n");
					
					System.out.println("Simula��o finalizada!");
					break;
					
				case 5:
					centrifuga();
					System.out.println("\n");
					
					break;
				default:
					System.out.println("Simula��o Finalizada\n");
					break;
				}

			}

			if (opcao == 3) {
				System.out.println("Fim");
				return;
			}

		}

	}
	public static void lavacaoPesada () throws InterruptedException {
		int calcestagio1 = (lavacaoPesada*1000) / 5;
		for (int i = 0; i < 5; i++) {
			Thread.sleep(calcestagio1);
			System.out.println("Op��o 1- Lava��o Pesada: " + numero1 + "%");
			numero1 += 20;
		}
		
	} 
	public static void lavacaoNormal () throws InterruptedException  { 
		int calcestagio2 = (lavacaoNormal * 1000) / 5;
		for (int i = 0; i < 5; i++) {
			Thread.sleep(calcestagio2);
			System.out.println("Op��o 2- Lava��o Normal: " + numero2 + "%");
			numero2 += 20;
		}
		
		
	}
	public static void lavacaoLeve() throws InterruptedException {
		int calcestagio3 = (lavacaoLeve * 1000) / 5;
		for (int i = 0; i < 5; i++) {
			Thread.sleep(calcestagio3);
			System.out.println("Op��o 3- Lava��o Leve: " + numero3 + "%");
			numero3 += 20;

		}
	}
	public static void enxague () throws InterruptedException {
		int calcestagio4 = (enxague * 1000) / 5;
		for (int i = 0; i < 5; i++) {
			Thread.sleep(calcestagio4);
			System.out.println("Op��o 4- Enxague: " + numero4 + "%");
			numero4 += 20;

		}
	}
	public static void centrifuga () throws InterruptedException {
		int calcestagio5 = (centrifuga * 1000) / 5;
		for (int i = 0; i < 5; i++) {
			Thread.sleep(calcestagio5);
			System.out.println("Op��o 5- Centrifugar: " + numero5 + "%");
			numero5 += 20;
		}
	}
	
	
	
}
