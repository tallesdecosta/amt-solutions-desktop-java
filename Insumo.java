package application;

import java.util.Date;

public class Insumo {
	
	private String nome;
	private double valor;
	private String lote;
	private String uniMedida;
	private Date vencimento;
	private Integer quantidade;
	
	public Insumo(String nome, double valor, String lote, String uniMedida, Date vencimento, Integer quantidade) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.lote = lote;
		this.uniMedida = uniMedida;
		this.vencimento = vencimento;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getUniMedida() {
		return uniMedida;
	}

	public void setUniMedida(String uniMedida) {
		this.uniMedida = uniMedida;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public String toString() {
		
		return "Produto: " + nome + ",Valor: "+ valor +",Quantidade: "+ quantidade + uniMedida +",Lote: "+ lote + "Vencimento: "+ vencimento ;
	}
	
	
	
}
