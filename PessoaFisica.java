import java.util.Arrays;

public class PessoaFisica extends Pessoa implements Receitavel {


	private String grauDeEscolaridade;
	private double [] contraCheques;
	private int cpf;
	
	public PessoaFisica(String nome, double rendaMensal, String dataDeNascimento, int cpf, String grauDeEscolaridade, double[] contraCheques) {
		super(nome, rendaMensal, dataDeNascimento);
		this.cpf = cpf;
		this.grauDeEscolaridade = grauDeEscolaridade;
		this.contraCheques = contraCheques;
	}

	public int getcpf() {
		return this.cpf;
	}



	public String getgrauDeEscolaridade() {
		return this.grauDeEscolaridade;
	}



	@Override
	public double calculaImposto(double totalReceita) {
		
		if(super.getRendaMensal()<=3500)
			return totalReceita*0.01;
		
		else if (super.getRendaMensal()>3500 && super.getRendaMensal()< 10000)
			return totalReceita*0.05;
		
		else
			return totalReceita*0.12;
		
		
	}

	@Override
	public void imprimeReceitaCompleta() {
	
		
		System.out.println( "---------------------"+ "\nReceita Pessoa Fisica "+ "\n ---------------------"+ "\ncnpj= " + this.getcpf() + ", \nnome= " + super.getNome() + ", \nrendaMensal= " 
		+ super.getRendaMensal() + ", \ndataDeNascimento=" + super.getDataDeNascimento() + ", \ngrauDeEscolaridade= "
		+ grauDeEscolaridade + ", \nvendasDoAno= " + Arrays.toString(this.getTotalcontraCheques()) + ", \ngetRendaMensal()= " + getRendaMensal() 
		+ ", \ngetNome()= " + getNome()+ ", \ncalculaImposto()= " + this.calculaImposto(this.totalizarReceita(this.getTotalcontraCheques())) + "\n---------------------");
	

		
	

	}

	@Override
	public double totalizarReceita(double [] rendasDoAno) {
			
			double contadorDeVendas = 0;
				
				for(int i = 0; i < 12; i++) {
					contadorDeVendas += rendasDoAno[i];
				}
								
				return contadorDeVendas;
		
	}
	
	public double [] getTotalcontraCheques() {
		return this.contraCheques;
	}



}
