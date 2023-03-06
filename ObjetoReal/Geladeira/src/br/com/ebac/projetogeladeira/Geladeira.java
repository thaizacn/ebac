package br.com.ebac.projetogeladeira;

/**
 * 
 * @author thaizacn
 *
 */
public class Geladeira {
	
    private String cor;
    private int Porta;
    private int voltagem;
    private String modelo;
    private String marca;
    private String codigo;

    public Geladeira() {
        cor = "verde-limao";
    }

    public Geladeira(String pCor) {
        this.cor = pCor;
    }

    public Geladeira(String cor, double temperatura, int Porta, int voltagem, String modelo) {
        this.cor = cor;
        this.Porta = Porta;
        this.voltagem = voltagem;
        this.modelo = modelo;
    }
    
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getPorta() {
		return Porta;
	}
	
	public void setPorta(int porta) {
		Porta = porta;
	}
	
	public int getVoltagem() {
		return voltagem;
	}
	
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
