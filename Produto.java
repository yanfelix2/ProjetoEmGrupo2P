

public class Produto {
	
	 public String nome;
	 public String nomeCategoria; 
	 public float precoVenda;
	 public float precoCusto; 
	 protected int codigo; 
	 protected String codigoBarra; 
	 protected int quantidadeEstoque; 
	 protected String id;
	 

	 
	 public Produto() {} 
	 
	 
	 
	 
	 public Produto(String nome, String nomeCategoria, float precoVenda, float precoCusto, int codigo, String codigoBarra, int quantidadeEstoque, String id) {
		 this.nome = nome; 
		 this.nomeCategoria= nomeCategoria; 
		 this.precoVenda = precoVenda;
		 this.precoCusto= precoCusto; 
		 this.codigo= codigo; 
		 this.codigoBarra= codigoBarra; 
		 this.quantidadeEstoque= quantidadeEstoque;
		 this.id= id;
		 
	 }
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	
	public float getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	
	public float getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigobarra) {
		this.codigoBarra = codigobarra;
	}
	
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	 
	 
	 
	 
	 
	 
	 
 }