package impressora.controle;

import java.util.Scanner;

public class Papel {
	private String tipo; //Papel sulfite //Papel reciclado //Papel high glossy etc...
	private String dimensao; //
	
	// GET/SET---------------
	public String getPapel_Tipo() {
		return this.tipo;
	}
	
	public void setPapel_Tipo(String Ptipo) {
		this.tipo = Ptipo;
		
	}
	
	public String getPapel_Dimensao() {
		return this.dimensao;
	}
	
	public void setPapel_Dimensao(String Pdimensao) {
		this.dimensao = Pdimensao;
		
	}
	
	// METODO_CONSTRUTOR---------------
	public Papel () {
		this.tipo = "Sulfite";
		this.dimensao ="A4";
	}
	
	// METODO_CONSTRUTOR/Sobrecarga---- //O usuario consegue definir o tipo do papael e a dimensçao, caso nao queira usar "sulfite" e "a4"
	public Papel (String papelTipo,String papelDimensao) {
		this.tipo = papelTipo;
		this.dimensao = papelDimensao;
	}	
	// METODOS---------------
	public void configPapel() {
		Papel papelImpressao = new Papel();
		Scanner input = new Scanner(System.in);
		int papelT;
		System.out.println("------------------------------------");
		System.out.println("Configurar Papel");
		System.out.println("------  Tipo de Papel  ------");
		System.out.println("[1] Sulfite");
		System.out.println("[2] Reciclado");
		papelT = input.nextInt();
		if (papelT == 1) {
			papelImpressao.tipo = "Sulfite";
			papelImpressao.dimensao = "A4";
			System.out.println("SELECIONADO [Sulfite] ");
		}
		
		if (papelT == 2) {
			papelImpressao.tipo = "Reciclado";
			papelImpressao.dimensao = "A3";
			System.out.println("SELECIONADO [Reciclado] ");
		}
		
	}
	
	public void usarSulfite() {
		tipo = "Sulfite";
	}
	
	public void usarReciclado() {
		tipo = "Reciclado";
	}

}
