import java.util.Arrays;

public class PessoaJuridica extends Pessoa implements Receitavel {

	private String nomeFantasia;
	private double [] vendasDoAno;
	private int cnpj;
	
	public PessoaJuridica(String nome, double rendaMensal, String dataDeNascimento, int cnpj, String nomeFantasia) {
		super(nome, rendaMensal, dataDeNascimento);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.vendasDoAno = new double [12];
		for(int i = 0; i<12; i++)
			this.setVendaDoAno(i, super.getRendaMensal());
	}

	public int getCnpj() {
		return this.cnpj;
	}



	public String getNomeFantasia() {
		return this.nomeFantasia;
	}



	@Override
	public double calculaImposto(double totalReceita) {
		
		if(super.getRendaMensal()<=5000)
			return totalReceita*0.05;
		
		else if (super.getRendaMensal()>5000 && super.getRendaMensal()< 15000)
			return totalReceita*0.15;
		
		else
			return totalReceita*0.18;
		
		
	}
	
	public void setVendaDoAno(int mes, double novoValorVendaDoAno){
		this.vendasDoAno[mes] = novoValorVendaDoAno;
	} 

	@Override
	public void imprimeReceitaCompleta() {
	
			System.out.println( "---------------------"+ "\nReceita Pessoa Juridica "+ "\n ---------------------"+ "\ncnpj= " + this.getCnpj() + ", \nnome= " + super.getNome() + ", \nrendaMensal= " 
			+ super.getRendaMensal() + ", \ndataDeNascimento=" + super.getDataDeNascimento() + ", \nnomeFantasia= "
			+ nomeFantasia + ", \nvendasDoAno= " + Arrays.toString(this.getTotalVendasDoAno()) + ", \ngetRendaMensal()= " + getRendaMensal() 
			+ ", \ngetNome()= " + getNome()+ ", \ncalculaImposto()= " + this.calculaImposto(this.totalizarReceita(this.getTotalVendasDoAno())) + "\n---------------------");
		
	

	}

	@Override
	public double totalizarReceita(double [] rendasDoAno) {
			
			double contadorDeVendas = 0;
				
				for(int i = 0; i < 12; i++) {
					contadorDeVendas += rendasDoAno[i];
				}
								
				return contadorDeVendas;
		
	}
	
	public double [] getTotalVendasDoAno() {
		return this.vendasDoAno;
	}



}
