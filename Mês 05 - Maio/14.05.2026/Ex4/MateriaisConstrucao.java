import java.util.ArrayList;
import java.util.List;

public class MateriaisConstrucao {

	private List<Produto> listaProdutos;

	public MateriaisConstrucao() {
		listaProdutos = new ArrayList<Produto>();
	}

	public void adicionarProduto(Produto p) {
		listaProdutos.add(p);
	}

	/**
	 * Obtém o produto mais caro de uma determinada marca.
	 *
	 * @param marca Marca a ser pesquisada
	 * @return Produto mais caro da marca informada, ou null caso não exista
	 */
	public Produto obterProdutoMaisCaro(String marca) {
		double maiorPreco = 0;
		Produto pMaiorPreco = null;

		for (Produto p : listaProdutos) {
			if (p.getPreco() > maiorPreco && p.getMarca().equals(marca)) {
				maiorPreco = p.getPreco();
				pMaiorPreco = p;
			}
		}

		return pMaiorPreco;
	}

	/**
	 * Obtém todos os produtos de uma determinada marca cujo preço esteja dentro de
	 * um intervalo.
	 *
	 * @param marca    Marca dos produtos
	 * @param precoMin Preço mínimo do intervalo
	 * @param precoMax Preço máximo do intervalo
	 * @return Lista de produtos encontrados
	 */
	public List<Produto> obterProdutosMarca(String marca, double precoMin, double precoMax) {

		List<Produto> listaPesquisa = new ArrayList<Produto>();

		for (Produto p : listaProdutos) {
			if (p.getMarca().equals(marca) && p.getPreco() > precoMin && p.getPreco() < precoMax) {
				listaPesquisa.add(p);
			}
		}

		return listaPesquisa;

	}

}
