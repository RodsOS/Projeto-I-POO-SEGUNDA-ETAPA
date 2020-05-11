package impressora.controle;

import java.util.Scanner;

public class Impressão {
	private String dimensao; //a4 a3 //a2 // a1
	private String formato; //colorido //Preto&Branco
	private	String orientacao; //retrato//paisagem
	private boolean economico; //true imprimir com menos tinta //false imprimir com mais tintaz\''																																													A					 
	private int quantidade;
	
	// GET/SET---------------
	public String getImpressao_Dimensao() {
		return this.dimensao;
	}
	
	public void setImpressao_Dimensao(String Idimensao) {
		this.dimensao = Idimensao;
	}
	
	public String getImpressao_Formato() {
		return this.formato;
	}
	
	public void setImpressao_Formato(String Iformato) {
		this.formato = Iformato;
	}
	
	public String getImpressao_Orientacao() {
		return this.orientacao;
	}
	
	public void setImpressao_Orientacao(String Iorientacao) {
		this.orientacao = Iorientacao; 
	}
	
	public int getImpressao_quantidade() {
		return this.quantidade;
	}
	
	public void setImpressao_quantidade(int Iquantidade) {
		this.quantidade = Iquantidade;
	}
	
	// METODO_CONSTRUTOR---------------
	public Impressão() {
		this.dimensao = "A4";
		this.formato = "Preto&Branco";
		this.orientacao = "Retrato";
		this.economico = false;
		this.quantidade = 1;
	}
	
	// METODO_CONSTRUTOR/Sobrecarga---- //Caso o usuario decida usar uma dimensão diferente da "A4",quantidade de copias e a orientação da impressão
		public Impressão (String impressaoDimensao,String impressaoFormato,String impressaoOrientacao){
			this.dimensao = impressaoDimensao;
			this.formato = impressaoFormato;
			this.orientacao = impressaoOrientacao;
			this.economico = false;
			this.quantidade = 1;
		}
		
	// METODOS---------------
	public void statusImpressao() {
		System.out.println("Dimensão:"+this.dimensao);
		System.out.println("Formto:"+this.formato);
		System.out.println("Orientação:"+this.orientacao);
		System.out.println("Quantidade:"+this.quantidade);
	}
	
	public void configImpressao() {
		Impressão impressaoImpressao = new Impressão();
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("Configurar Geral");
		System.out.println("------  Formato de Impressão  ------");
		System.out.println("[1] Colorido");
		System.out.println("[2] Preto&Branco");
		int impressaoG;
		impressaoG = input.nextInt();
		System.out.println("------  Orientação de Impressão  ------");
		System.out.println("[1] Retrato");
		System.out.println("[2] Paisagem");
		int impressaoO;
		impressaoO = input.nextInt();
		if ((impressaoG == 1) && (impressaoO == 1) ) {
			impressaoImpressao.formato = "Colorido";
			impressaoImpressao.orientacao = "Retrato";
			System.out.println("COLORIDO & RETRATO");
		}
		
		if ((impressaoG == 1) && (impressaoO == 2) ) {
			impressaoImpressao.formato = "Colorido";
			impressaoImpressao.orientacao = "Paisagem";
			System.out.println("COLORIDO & PAISAGEM");
		}
		
		if ((impressaoG == 2) && (impressaoO == 2) ) {
			impressaoImpressao.formato = "Preto&Branco";
			impressaoImpressao.orientacao = "Paisagem";
			System.out.println("PRETO/BRANCO & PAISAGEM");
		}
		
		if ((impressaoG == 2) && (impressaoO == 1) ) {
			impressaoImpressao.formato = "Preto&Branco";
			impressaoImpressao.orientacao = "Retrato";
			System.out.println("PRETO/BRANCO & RETRATO");
		}
		
		System.out.println("------  Quantidade de Folhas  ------");
		System.out.println("Insira a quantidade de copias: ");
		int impressaoQ;
		impressaoQ = input.nextInt();
		impressaoImpressao.quantidade = impressaoQ;
		System.out.println("Quantidade de Copias: "+impressaoQ);
	}
	
	public void modoEconomicoON(){
		economico = true;	
	}
	
	public void modoEconomicoOFF() {
		economico = false;	
	}
}
