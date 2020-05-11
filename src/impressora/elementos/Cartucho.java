package impressora.elementos;

public class Cartucho {
	private float carga;
	private String cor;
	private boolean vazio; 
	
	// GET/SET---------------
	public float getCartucho_Carga() {
		return this.carga;
	}
	
	public void setCartucho_Carga(float Ccarga) {
		this.carga = Ccarga;
	}
	
	public String getCartucho_Cor() {
		return this.cor;
	}
	
	public void setCartucho_Cor(String Ccor) {
		this.cor = Ccor;
	}
	
	public boolean getCartucho_Vazio() {
		return this.vazio;
	}
	
	public void setCartucho_Vazio(boolean Cvazio) {
		this.vazio = Cvazio;
	}
	
	// METODO_CONSTRUTOR---------------
	public Cartucho(String inCor) { 
		this.vazio = false;
		this.carga = 100f;
		this.cor = inCor; 
	}
	
	// METODO_CONSTRUTOR/Sobrecarga---- //cor padrão do cartucho é preto, sem nenhuma caraga, no  estado vazio 
	public Cartucho() { 
		this.vazio = true;
		this.carga = 0f;
		this.cor = "PRETO"; 
	
	}
	
	// METODOS---------------
	public void statusCor() {
		System.out.println("------------------------------------");
		System.out.println("Tinta restante para impressão: " +this.carga);
		System.out.println("Cor escolhida: " +this.cor);
		System.out.println("------------------------------------");
	}
	
	public void verificarTinta() {
		if(this.carga<=0) {
			System.out.println("ERRO!!! Sem Tinta");
		}else {
			System.out.println("Tinta Disponivel!!!");
		} 
	}

}
