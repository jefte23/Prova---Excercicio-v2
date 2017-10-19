
public class Cliente {

	private PessoaFisica fisica;
	private PessoaJuridica empresa;

	@Override
	public String toString() {
		return "Cliente [fisica=" + fisica + ", empresa=" + empresa + "]";
	}

	public Cliente(PessoaFisica fisica, PessoaJuridica empresa) {
		super();
		this.fisica = fisica;
		this.empresa = empresa;
	}

	public PessoaFisica getFisica() {
		return fisica;
	}

	public void setFisica(PessoaFisica fisica) {
		this.fisica = fisica;
	}

	public PessoaJuridica getEmpresa() {
		return empresa;
	}

	public void setEmpresa(PessoaJuridica empresa) {
		this.empresa = empresa;
	}

}
