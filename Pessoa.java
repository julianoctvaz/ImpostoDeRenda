
public abstract class Pessoa {
	
	//atributos
	
	private String nome;
	private double rendaMensal;
	private String dataDeNascimento;
	
	//construtor
	
	public Pessoa(String nome, double rendaMensal, String dataDeNascimento) {
	// super(); java lang object mother
		this.nome = nome;
		this.rendaMensal = rendaMensal;
		this.dataDeNascimento = dataDeNascimento;
	}

	//funcoes/comportamentos
	
	public double getRendaMensal() {
		return this.rendaMensal;
	}
	public void setRendaMensal(double novaRendaMensal) {
		this.rendaMensal = novaRendaMensal;
	}
	public String getNome() {
		return this.nome;
	}
	public String getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
	
	

}
