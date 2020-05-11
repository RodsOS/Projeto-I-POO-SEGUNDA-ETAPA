package impressora.controle;
import java.util.Scanner;


public class Conexão {
	private String tipo;
	private int intensidade;
	private boolean conectado;
	
	// GET/SET---------------
	public String getConexao_Tipo() {
		return this.tipo;
	}
	
	public void setConexao_Tipo(String Ctipo) {
		this.tipo = Ctipo;
	}
	
	public int getConexao_Intensidade() {
		return this.intensidade;
	}
	
	public void setConexao_Intensidade(int Cintensidade) {
		this.intensidade = Cintensidade;
	}
	
	public boolean getConexao_Conectado() {
		return this.conectado;
	}
	
	public void setConexao_Conectado(boolean Cconectado) {
		this.conectado = Cconectado;
	}
	
	// METODO_CONSTRUTOR---------------
	public Conexão (){
		this.tipo = "DESCONECTADO";
		this.intensidade = 0;
		this.conectado = false;
	}
	// METODO_CONSTRUTOR/Sobrecarga---- //Caso o usuario decida mudar apenas o tipo de Conexao, e tambem conseguindo colocar a conexao em "ESPERA"
	public Conexão (String conexaoTipo){
		this.tipo = conexaoTipo;
		this.intensidade = 0;
		this.conectado = true;
	}
	
	// METODOS---------------
	public void statusConexao() {
		System.out.println("------------------------------------");
		System.out.println("Tipo de Conexão: " +this.tipo);
		System.out.println("Intensidade do Sinal: " +this.intensidade);
		System.out.println("Conectado: : "+this.conectado);
		System.out.println("------------------------------------");
	}
	
	public void configConexao() {
		Conexão conexaoImpressao = new Conexão();
		Scanner input = new Scanner(System.in);
		int conexaoT;
		System.out.println("------------------------------------");
		System.out.println("Configurar Conexão");
		System.out.println("------  Tipo de Conexão  ------");
		System.out.println("[1] Ethernet");
		System.out.println("[2] Wi-Fi");
		System.out.println("[3] USB");
		conexaoT = input.nextInt();
		if(conexaoT == 1) {
			conexaoImpressao.tipo = "Ethernet";
			conexaoImpressao.intensidade = 100;
			conexaoImpressao.conectado = true;
			System.out.println("CONECTADO [Ethernet] ");
		}
		if(conexaoT == 2) {
			conexaoImpressao.tipo = "Wi-Fi";
			conexaoImpressao.intensidade = 80;
			conexaoImpressao.conectado = true;
			System.out.println("CONECTADO [Wi-Fi] ");
		}
		
		if(conexaoT == 3) {
			conexaoImpressao.tipo = "USB";
			conexaoImpressao.intensidade = 100;
			conexaoImpressao.conectado = true;
			System.out.println("CONECTADO [USB] ");
		}
	}
	
	public void aumentarintensidade() {
		if(intensidade < 10) {
			intensidade++;
		}
			
	}
	
	public void diminuirIntensidade() {
		if(intensidade > 0) {
			intensidade--;
		}
	}
	
	public void conectar() {
			conectado = true;
	}
	
	public void desconectar() {
			conectado = false;
	}	
	
}
