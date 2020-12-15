
public class Main {

	public static void main(String[] args) {
		PessoaJuridica pj = new PessoaJuridica("Luar Joias e Bijuterias Industrias LTDA", 32345.00, "12/12/2012", 033033033, "Luar Joias e Bijuterias");
		pj.imprimeReceitaCompleta();
		
		
		PessoaFisica pf = new PessoaFisica("Manoel Carlos", 4302.34, "11/11/1911", 044044044, "Graduacao Completa");
		pf.imprimeReceitaCompleta();

	}

}
