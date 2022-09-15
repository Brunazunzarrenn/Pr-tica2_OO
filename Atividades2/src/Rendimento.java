package br.com.atividade2;

public class Rendimento {
  private double investInicial;
  private double taxaRendimento;
  private int numMes;
  
public Rendimento(double investInicial, double taxaRendimento, int numMes) {
	super();
	this.investInicial = investInicial;
	this.taxaRendimento = taxaRendimento;
	this.numMes = numMes;
}

public double getInvestInicial() {
	return investInicial;
}

public void setInvestInicial(double investInicial) {
	this.investInicial = investInicial;
}

public double getTaxaRendimento() {
	return taxaRendimento;
}

public void setTaxaRendimento(double taxaRendimento) {
	this.taxaRendimento = taxaRendimento;
}

public int getNumMes() {
	return numMes;
}

public void setNumMes(int numMes) {
	this.numMes = numMes;
}
  public void calcularRendimento () {
	  double rendimentoMes;
	  rendimentoMes = getInvestInicial();
	  for (int i=0;i<getNumMes();i++)
	  {
		  rendimentoMes=rendimentoMes*getTaxaRendimento()/100+rendimentoMes;
				  System.out.println("Mes " + (i+1) + " : " + rendimentoMes);
	  }
  }
}
