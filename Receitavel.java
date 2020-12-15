
public interface Receitavel {
	
	public abstract double totalizarReceita(double [] rendasDoAno);
	public abstract double calculaImposto(double totalReceita);
	public abstract void imprimeReceitaCompleta();

}
