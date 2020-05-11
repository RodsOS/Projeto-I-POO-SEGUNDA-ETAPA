package impressora.elementos;

import impressora.controle.Papel;

public class Bandeja {
	private int quantidade;
	private boolean disponivel; 
	
	// GET/SET---------------
	public int getBandeja_Quantidade() {
		return this.quantidade;
	}
	
	public void setBandeja_Quantidade(int Bquantidade) {
		this.quantidade = Bquantidade;
	}
	
	public boolean getBandeja_Disponivel() {
		return this.disponivel;
	}
	
	public void setBandeja_Disponivel(boolean Bdisponivel) {
		this.disponivel = Bdisponivel;
	}
	
	// METODO_CONSTRUTOR---------------
	public Bandeja() {
		this.disponivel = true;
		this.quantidade = 10;
	}
	
	// METODO_CONSTRUTOR/Sobrecarga---- //O usuario consegue mudar as informações da bandeja, para definir se a mesmsa está disponivel, e caso esteja a quantidade de papel
	public Bandeja(boolean bandejaDisponivel,int bandejaQuantidade) {
		this.disponivel = bandejaDisponivel;
		this.quantidade = bandejaQuantidade;
	}

	// METODOS---------------
	public void statusBandeja() {
		System.out.println("------------------------------------");
		System.out.println("Folhas disponíveis: " +this.disponivel);
		System.out.println("Quantidade de folhas disponíveis: "+this.quantidade);
		System.out.println("------------------------------------");
	}
	
	public void verificarPapel() {
		if(this.quantidade<1) {
			System.out.println("ERRO!!! Sem Papel");
		}else {
			System.out.println("Papel Disponivel!!!");
		} 
	}

}
