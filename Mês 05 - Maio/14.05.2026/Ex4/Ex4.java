
public class Ex4 {

	public static void main(String[] args) {

		Produto p1 = new Produto("Votorantim", "Cimento 50kg", 80, 10);
		Produto p2 = new Produto("3M", "Capacete", 80, 10);
		Produto p3 = new Produto("MSA", "Martelo", 20, 10);
		Produto p4 = new Produto("Vonder", "Trena", 25, 10);
		Produto p5 = new Produto("Vonder", "Régua", 18, 10);

		MateriaisConstrucao m1 = new MateriaisConstrucao();
		m1.adicionarProduto(p1);
		m1.adicionarProduto(p2);
		m1.adicionarProduto(p3);
		m1.adicionarProduto(p4);
		m1.adicionarProduto(p5);

		System.out.println(m1.obterProdutoMaisCaro("MSA"));

		System.out.println(m1.obterProdutosMarca("Vonder", 29, 30));

	}

}
