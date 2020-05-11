package impressora;

import java.util.ArrayList;
import java.util.Scanner;

import impressora.controle.Conexão;
import impressora.controle.Impressão;
import impressora.controle.Papel;;

//import impressora.controle.Conexão;
//import impressora.controle.Impressão;
//import impressora.controle.Papel;

public class Main {
	public static void main(String[] args) {
		ArrayList<Impressão>vetorImpressao = new ArrayList<Impressão>();
		Scanner input = new Scanner(System.in);
		System.out.println("Sistema de controle <Impressora>");
		int indiceImpressao = 0;
		while (true) {
			System.out.println("------------------------------------");
			System.out.println("[1] Imprimir");
			System.out.println("[2] Listar impressões");
			System.out.println("------------------------------------");
			int opcaoIni = input.nextInt();
			if (opcaoIni == 1) {
				System.out.println("------------------------------------");
				System.out.println("[1] Configurar para Imprimir");
				System.out.println("[2] Imprimir usando config padrão");
				System.out.println("------------------------------------");
				int opcaoImp = input.nextInt();
				if (opcaoImp == 1) {
					indiceImpressao++;
					
					Conexão conexaoConfig = new Conexão();
					conexaoConfig.configConexao();
					
					Papel papelConfig = new Papel();
					papelConfig.configPapel();
					
					Impressão impressaoConfig = new Impressão();
					impressaoConfig.configImpressao();
					
					System.out.println("Configuração Concluida !!!");
				}
				if (opcaoImp == 2) {
					Impressão impressaoPadrao = new Impressão();
					impressaoPadrao.statusImpressao();
					System.out.println("Configuração Padrão !!!");
				}
			
			}
			if (opcaoIni == 2) {
			//Não funcional
			}
		}
	}
}

