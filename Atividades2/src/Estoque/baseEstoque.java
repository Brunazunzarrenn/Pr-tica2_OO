package Estoque;

import Estoque.estoque;

public class baseEstoque {

	public static void main(String[] args) {
		estoque estoque1 = new estoque("Celular",10,10);
		    System.out.println("Estoque inicial : " + estoque1.getQtdAtual());
		    estoque1.darBaixa(6);
		    System.out.println("Estoque atualizado : " + estoque1.getQtdAtual());
		    System.out.println(estoque1.Mostra());
		    System.out.println("Precisa repor: " + estoque1.precisaRepor());
	}

}
