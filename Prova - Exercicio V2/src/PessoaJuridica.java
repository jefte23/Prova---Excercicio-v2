import java.time.LocalDate;

public class PessoaJuridica {

	private String nome;
	private String CNPJ;
	private LocalDate dataDeFundacao;
	private String telefone;
	private String cidade;
	private String UF;
	private boolean VIP;

	@Override
	public String toString() {
		return "PessoaJuridica [nome=" + nome + ", CNPJ=" + CNPJ + ", dataDeFundacao=" + dataDeFundacao + ", telefone="
				+ telefone + ", cidade=" + cidade + ", UF=" + UF + ", VIP=" + VIP + "]";
	}

	public PessoaJuridica(String nome, String cNPJ, LocalDate dataDeFundacao, String telefone, String cidade, String uF,
			boolean vIP) {
		super();
		this.nome = nome;
		CNPJ = cNPJ;
		this.dataDeFundacao = dataDeFundacao;
		this.telefone = telefone;
		this.cidade = cidade;
		UF = uF;
		VIP = vIP;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public LocalDate getDataDeFundacao() {
		return dataDeFundacao;
	}

	public void setDataDeFundacao(LocalDate dataDeFundacao) {
		this.dataDeFundacao = dataDeFundacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public boolean isVIP() {
		return VIP;
	}

	public void setVIP(boolean vIP) {
		VIP = vIP;
	}

}
