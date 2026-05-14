
public class Produto {

	private String marca;
	private String modelo;
	private double preco;
	private int qtd;

	public Produto(String marca, String modelo, double preco, int qtd) {
		setMarca(marca);
		setModelo(modelo);
		setPreco(preco);
		setQtd(qtd);
	}

	public void adicionarUnidades(int valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Quantidade a ser adicionada inválida");
		}
		qtd += valor;
	}

	public void venderProduto(int valor) {

		if (valor <= 0) {
			throw new IllegalArgumentException("Quantidade a ser vendida inválida");
		}

		if (valor > qtd) {
			throw new IllegalArgumentException("Quantidade a ser vendida ultrapassa a quantidade em estoque");
		}

		qtd -= valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isBlank()) {
			throw new IllegalArgumentException("Marca inválida");
		}
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo inválido");
		}
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("Preço inválido");

		}
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		if (qtd < 0) {
			throw new IllegalArgumentException("Quantidade inválida");
		}
		this.qtd = qtd;
	}

	@Override
	public String toString() {
		return "Produto [marca=" + marca + ", modelo=" + modelo + ", preco=" + preco + ", qtd=" + qtd + "]";
	}

}
