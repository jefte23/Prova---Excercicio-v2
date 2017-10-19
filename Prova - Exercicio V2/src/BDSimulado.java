import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BDSimulado {

	// Atributos
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Ligacao> ligacoes = new ArrayList<Ligacao>();
	ArrayList<PessoaFisica> fisica = new ArrayList<PessoaFisica>();
	ArrayList<PessoaJuridica> empresa = new ArrayList<PessoaJuridica>();

	public BDSimulado() {

		// Criando Empresas
		this.empresa = new ArrayList<PessoaJuridica>();
		PessoaJuridica e1 = new PessoaJuridica("Capgemini", "59544541", LocalDate.of(1970, 3, 15), "8795452125",
				"Brasilia", "DF", true);
		PessoaJuridica e2 = new PessoaJuridica("CAST", "69958744", LocalDate.of(1990, 2, 14), "996688542",
				"Rio de Janeiro", "DF", true);
		PessoaJuridica e3 = new PessoaJuridica("Junior", "98545745", LocalDate.of(2003, 2, 12), "999885444",
				"São Paulo", "DF", false);
		PessoaJuridica e4 = new PessoaJuridica("CTIS", "9999666654", LocalDate.of(1995, 1, 2), "889999888665",
				"Brasilia", "DF", true);
		PessoaJuridica e5 = new PessoaJuridica("CPMBRAX", "3322145", LocalDate.of(1983, 3, 11), "8998844212", "Franca",
				"SP", false);
		PessoaJuridica e6 = new PessoaJuridica("Zaite", "21241255", LocalDate.of(1999, 3, 2), "9899888545", "Recife",
				"PE", false);

		// Armazenando Empresas
		this.empresa.add(e1);
		this.empresa.add(e2);
		this.empresa.add(e3);
		this.empresa.add(e4);
		this.empresa.add(e5);
		this.empresa.add(e6);

		// Criando Pessoas Fisicas
		this.fisica = new ArrayList<PessoaFisica>();
		PessoaFisica p1 = new PessoaFisica("Evandro da Silva", "987564123-89", LocalDate.of(1940, 9, 16), "1234-56789",
				"Rio de Janeiro", "RJ");
		PessoaFisica p2 = new PessoaFisica("João dos Montes", "457458459-45", LocalDate.of(2000, 1, 15), "1245-7896",
				"Brasilia", "DF");
		PessoaFisica p3 = new PessoaFisica("Maria do Socorro", "235678451-56", LocalDate.of(1988, 2, 26), "4758-6958",
				"Brasilia", "DF");
		PessoaFisica p4 = new PessoaFisica("Otaviano Neves", "895678451-91", LocalDate.of(1974, 4, 12), "2345-8945",
				"São Paulo", "SP");
		PessoaFisica p5 = new PessoaFisica("José das Couves", "111222333-44", LocalDate.of(1991, 9, 29), "2583-6985",
				"Brasilia", "DF");
		PessoaFisica p6 = new PessoaFisica("Regina Maria", "123456789-00", LocalDate.of(1950, 11, 6), "3265-8974",
				"Belo Horizonte", "MG");

		// Armazenando Pessoa fisica
		this.fisica.add(p1);
		this.fisica.add(p2);
		this.fisica.add(p3);
		this.fisica.add(p4);
		this.fisica.add(p5);
		this.fisica.add(p6);

		// Criando Clientes
		this.clientes = new ArrayList<>();
		Cliente c1 = new Cliente(p1, null);
		Cliente c2 = new Cliente(p2, null);
		Cliente c3 = new Cliente(p3, null);
		Cliente c4 = new Cliente(p4, null);
		Cliente c5 = new Cliente(p5, null);
		Cliente c6 = new Cliente(p6, null);
		Cliente c7 = new Cliente(null, e1);
		Cliente c8 = new Cliente(null, e2);
		Cliente c9 = new Cliente(null, e3);
		Cliente c10 = new Cliente(null, e4);
		Cliente c11 = new Cliente(null, e5);
		Cliente c12 = new Cliente(null, e6);

		// Armazenando clientes
		this.clientes.add(c1);
		this.clientes.add(c2);
		this.clientes.add(c3);
		this.clientes.add(c4);
		this.clientes.add(c5);
		this.clientes.add(c6);
		this.clientes.add(c7);
		this.clientes.add(c8);
		this.clientes.add(c9);
		this.clientes.add(c10);
		this.clientes.add(c11);
		this.clientes.add(c12);

		// Criando Ligação
		this.ligacoes = new ArrayList<Ligacao>();
		Ligacao l1 = new Ligacao(1, "3212-8879", LocalDateTime.of(2017, 9, 12, 17, 0),
				LocalDateTime.of(2017, 9, 12, 17, 15), "Brasilia", "DF", c1);
		Ligacao l2 = new Ligacao(2, "3265-8974", LocalDateTime.of(2017, 9, 12, 17, 10),
				LocalDateTime.of(2017, 9, 12, 17, 15), "Rio de Janeiro", "RJ", c2);
		Ligacao l3 = new Ligacao(3, "4758-6958", LocalDateTime.of(2017, 9, 12, 17, 12),
				LocalDateTime.of(2017, 9, 12, 18, 12), "Brasilia", "DF", c3);
		Ligacao l4 = new Ligacao(4, "2345-8945", LocalDateTime.of(2017, 9, 12, 17, 12),
				LocalDateTime.of(2017, 9, 12, 17, 14), "São Paulo", "SP", c4);
		Ligacao l5 = new Ligacao(5, "1245-7896", LocalDateTime.of(2017, 9, 12, 18, 45),
				LocalDateTime.of(2017, 9, 12, 19, 00), "Rio de Janeiro", "RJ", c5);
		Ligacao l6 = new Ligacao(6, "3265-8974", LocalDateTime.of(2017, 9, 12, 19, 21),
				LocalDateTime.of(2017, 9, 12, 19, 30), "São Paulo", "SP", c6);
		Ligacao l7 = new Ligacao(7, "1245-7896", LocalDateTime.of(2017, 9, 12, 19, 55),
				LocalDateTime.of(2017, 9, 12, 20, 30), "Brasilia", "DF", c7);
		Ligacao l8 = new Ligacao(8, "4758-6958", LocalDateTime.of(2017, 9, 12, 20, 0),
				LocalDateTime.of(2017, 9, 12, 20, 22), "Rio de Janeiro", "RJ", c8);
		Ligacao l9 = new Ligacao(9, "3265-8974", LocalDateTime.of(2017, 9, 12, 20, 13),
				LocalDateTime.of(2017, 9, 12, 20, 51), "Rio de Janeiro", "RJ", c9);
		Ligacao l10 = new Ligacao(10, "1245-7896", LocalDateTime.of(2017, 9, 12, 21, 4),
				LocalDateTime.of(2017, 9, 12, 23, 44), "Belo Horizonte", "MG", c10);
		Ligacao l11 = new Ligacao(11, "4758-6958", LocalDateTime.of(2017, 9, 12, 22, 13),
				LocalDateTime.of(2017, 9, 12, 22, 19), "Rio de Janeiro", "RJ", c11);
		Ligacao l12 = new Ligacao(12, "2345-8945", LocalDateTime.of(2017, 9, 13, 9, 25),
				LocalDateTime.of(2017, 9, 13, 10, 15), "São Paulo", "SP", c12);
		Ligacao l13 = new Ligacao(13, "1245-7896", LocalDateTime.of(2017, 9, 13, 14, 36),
				LocalDateTime.of(2017, 9, 13, 15, 55), "São Paulo", "SP", c1);
		Ligacao l14 = new Ligacao(14, "3265-8974", LocalDateTime.of(2017, 9, 13, 20, 01),
				LocalDateTime.of(2017, 9, 13, 22, 12), "São Paulo", "SP", c2);
		Ligacao l15 = new Ligacao(15, "1245-7896", LocalDateTime.of(2017, 9, 13, 21, 14),
				LocalDateTime.of(2017, 9, 13, 21, 56), "Brasilia", "DF", c3);
		Ligacao l16 = new Ligacao(16, "4758-6958", LocalDateTime.of(2017, 9, 14, 12, 0),
				LocalDateTime.of(2017, 9, 14, 12, 55), "Belo Horizonte", "MG", c4);
		Ligacao l17 = new Ligacao(17, "2345-8945", LocalDateTime.of(2017, 9, 14, 16, 32),
				LocalDateTime.of(2017, 9, 14, 17, 21), "Rio de Janeiro", "RJ", c4);
		Ligacao l18 = new Ligacao(18, "1245-7896", LocalDateTime.of(2017, 9, 14, 20, 34),
				LocalDateTime.of(2017, 9, 14, 20, 35), "Rio de Janeiro", "RJ", c5);
		Ligacao l19 = new Ligacao(19, "4758-6958", LocalDateTime.of(2017, 9, 15, 10, 47),
				LocalDateTime.of(2017, 9, 15, 11, 03), "São Paulo", "SP", c11);
		Ligacao l20 = new Ligacao(20, "3265-8974", LocalDateTime.of(2017, 9, 15, 23, 35),
				LocalDateTime.of(2017, 9, 15, 23, 55), "Brasilia", "DF", c12);

		// Armazenando ligação
		this.ligacoes.add(l1);
		this.ligacoes.add(l2);
		this.ligacoes.add(l3);
		this.ligacoes.add(l4);
		this.ligacoes.add(l5);
		this.ligacoes.add(l6);
		this.ligacoes.add(l7);
		this.ligacoes.add(l8);
		this.ligacoes.add(l9);
		this.ligacoes.add(l10);
		this.ligacoes.add(l11);
		this.ligacoes.add(l12);
		this.ligacoes.add(l13);
		this.ligacoes.add(l14);
		this.ligacoes.add(l15);
		this.ligacoes.add(l16);
		this.ligacoes.add(l17);
		this.ligacoes.add(l18);
		this.ligacoes.add(l19);
		this.ligacoes.add(l20);
	}

	// Metodos Get e Sets
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<Ligacao> getLigacoes() {
		return ligacoes;
	}

	public ArrayList<PessoaFisica> getFisica() {
		return fisica;
	}

	public void setFisica(ArrayList<PessoaFisica> fisica) {
		this.fisica = fisica;
	}

	public ArrayList<PessoaJuridica> getEmpresa() {
		return empresa;
	}

	public void setEmpresa(ArrayList<PessoaJuridica> empresa) {
		this.empresa = empresa;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void setLigacoes(ArrayList<Ligacao> ligacoes) {
		this.ligacoes = ligacoes;
	}

	// Teste de inicialização
	public void imprimeClientes() {

		for (int i = 0; i < this.clientes.size(); i++) {
			System.out.println(this.clientes.get(i));
		}
	}

	// Questão 2a : função que retorne todas as informações de um Cliente
	// fornecido o seu nome
	public String getInfoCliente(String nome) {

		String resultado = "";

		for (int i = 0; i < this.clientes.size(); i++) {

			// Teste logico
			// System.out.println(this.clientes.get(i).getFisica().getNome().equals(nome));
			// System.out.println(this.clientes.get(i).getFisica().getNome());

			// Testa se nome é igual ao do cliente
			if (this.clientes.get(i).getFisica().getNome().equals(nome)) {
				resultado = "\n - Nome: " + this.clientes.get(i).getFisica().getNome() + "\n - CPF: "
						+ this.clientes.get(i).getFisica().getCPF() + "\n - Cidade: "
						+ this.clientes.get(i).getFisica().getCidade() + " - "
						+ this.clientes.get(i).getFisica().getUF();
			}
		}
		return resultado;
	}

	// --------------------------------------------------------------
	public Cliente getCliente(String nome) {

		Cliente resultado = null;
		for (int i = 0; i < this.clientes.size(); i++) {
			if (this.clientes.get(i).getFisica().getNome().equals(nome)) {
				resultado = this.clientes.get(i);
			}
		}
		return resultado;
	}
	// --------------------------------------------------------------

	// Questão 2b: lista de todas as Ligações realizadas por um Cliente
	public String ligacoesPorCliente(String nome) {

		String resultado = "";
		for (int i = 0; i < this.ligacoes.size(); i++) {

			// Teste logico
			System.out.println(this.ligacoes.get(i).getClientes().getFisica().getNome().equals(nome));
			System.out.println(this.ligacoes.get(i).getClientes().getFisica().getNome());

			// Testa se nome é igual ao do cliente (Pessoa Fisca)
			if (this.ligacoes.get(i).getClientes().getFisica().getNome().equals(nome)) {
				resultado = " - Nome Cliente: " + this.ligacoes.get(i).getClientes().getFisica().getNome()
						+ "\n - Codigo Ligação: " + this.ligacoes.get(i).getCodigo();

			}
		}
		return resultado;
	}
	// --------------------------------------------------------------

	// Questão 2c: retorne o número de ligações realizadas por todos os Clientes
	// de uma determinada UF
	public int ligacoesPorUF(String UF) {

		int resultado = 0;
		for (int i = 0; i < this.ligacoes.size(); i++) {
			if (this.ligacoes.get(i).getClientes().getFisica().getUF().equals(UF)) {
				resultado++;
			}
		}
		return resultado;
	}
	// --------------------------------------------------------------

	// Questão 2d: todas as Ligações onde a UF de origem seja diferente da UF de
	// destino
	public ArrayList<Integer> ligacoesUFDiferente() {

		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for (int i = 0; i < this.ligacoes.size(); i++) {
			if (this.ligacoes.get(i).getClientes().getFisica().getUF() != this.ligacoes.get(i).getUFDestino()) {
				resultado.add(this.ligacoes.get(i).getCodigo());
			}
		}
		return resultado;
	}

	// ------------- Funções para calculo de itens da Questão 3 -------------

	// -------------- Testa Idade do Cliente ---------------
	public boolean testaIdade(String nomeCliente) {

		boolean resultado = false;
		Cliente cliente = getCliente(nomeCliente);

		int idade = Period.between(cliente.getFisica().getDataDeNascimento(), LocalDate.now()).getYears();

		System.out.println(idade);
		if (idade >= 65) {
			resultado = true;
		}
		return resultado;

	}
	// -----------------------------------------------------

	// ------------- Calcula Tempo de Ligação --------------
	public long TempoDeLigacao(int codLigacao) {

		long resultado = 0;
		for (int j = 0; j < this.ligacoes.size(); j++) {
			if (this.ligacoes.get(j).getCodigo() == codLigacao) {
				resultado = Duration.between(ligacoes.get(j).getDataHoraInicio(), ligacoes.get(j).getDataHoraFim())
						.toMinutes();
			}
		}
		return resultado;
	}
	// -----------------------------------------------------

	// ----- Testa horario para retorna se tem direito a desconto na ligação
	public boolean DescontoNoite(int codLigacao) {

		boolean resultado = false;
		for (int i = 0; i < this.ligacoes.size(); i++) {
			if ((this.ligacoes.get(i).getCodigo() == codLigacao)
					&& this.ligacoes.get(i).getDataHoraInicio().getHour() >= 20) {
				resultado = true;
			}
		}
		return resultado;
	}
	// --------------------------------------------------------------------------

	// --------------------- Montagem da conta - Questões 3
	public String MontaConta(String nomeCliente) {

		String conta = "";
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Cliente cliente = getCliente(nomeCliente);
		double descontoNoturno = 0.02;
		double valorCorrente = 0.05;
		double valorLigacao = 0.0;

		conta = conta + "Nome Cliente: " + cliente.getFisica().getNome() + " - CPF: " + cliente.getFisica().getCPF()
				+ "\n---------------\n";

		for (int i = 0; i < this.ligacoes.size(); i++) {

			if (this.ligacoes.get(i).getClientes().getFisica().getNome().equals(nomeCliente)) {

				// Calculo do valor da ligação
				if (DescontoNoite(this.ligacoes.get(i).getCodigo())) {
					valorLigacao = descontoNoturno * TempoDeLigacao(this.ligacoes.get(i).getCodigo());
				} else {
					valorLigacao = valorCorrente * TempoDeLigacao(this.ligacoes.get(i).getCodigo());
				}

				// Testa de Cliente é idoso e aplica o desconto caso verdadeiro
				if (this.testaIdade(this.ligacoes.get(i).getClientes().getFisica().getNome())) {
					valorLigacao = valorLigacao * 0.85;
				}
				// Adiciona valor final ao ArrayLista Conta
				conta = conta + "Ligacao " + (i + 1) + ": " + ligacoes.get(i).getDataHoraInicio().format(formatador)
						+ " - " + ligacoes.get(i).getTelefoneDestino() + " - " + ligacoes.get(i).getCidadeDestino()
						+ " --- Duração da Ligação: " + TempoDeLigacao(this.ligacoes.get(i).getCodigo()) + " min " + "/"
						+ ligacoes.get(i).getUFDestino() + " - " + " Valor: " + valorLigacao + " R$" + "\n";
			}
		}
		return conta;
	}

	// --------------------------------------------------------------------------
	// --- Questões Bonus ---

	public Cliente getEmpresa(String nomeEmpresa) {

		Cliente resultado = null;
		for (int i = 0; i < this.clientes.size(); i++) {
			if (this.clientes.get(i).getEmpresa().getNome().equals(nomeEmpresa)) {
				resultado = this.clientes.get(i);
			}
		}
		return resultado;
	}

	// - As empresas pagam R$0,08 por minuto de ligação
	// - Se a ligação for entre 12h e 14h a Empresa paga R$ 0,30 por ligação,
	// - Se Empresa Vip ganham um desconto, ligação é de apenas R$0,04.

	public boolean HorarioEspecial(int codLigacao) {

		boolean resultado = false;
		for (int i = 0; i < this.ligacoes.size(); i++) {
			if (this.ligacoes.get(i).getCodigo() == codLigacao) {
				if (this.ligacoes.get(i).getDataHoraInicio().getHour() >= 12
						&& this.ligacoes.get(i).getDataHoraFim().getHour() <= 14) {
					resultado = true;
				}
			}
		}

		return resultado;
	}

	public String MontaContaEmpresa(String nomeEmpresa) {

		String conta = "";
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		double horarioDesconto = 0.30;
		double valorCorrente = 0.08;
		double descontoVIP = 0.04;
		double valorLigacao = 0.0;
		Cliente empresa = getEmpresa(nomeEmpresa);

		conta = conta + "Nome Empresa: " + empresa.getEmpresa().getNome() + " - CPF: " + empresa.getEmpresa().getCNPJ()
				+ "\n---------------\n";

		for (int i = 0; i < this.ligacoes.size(); i++) {

			if (this.ligacoes.get(i).getClientes().getEmpresa().isVIP() == true) {
				valorLigacao = descontoVIP * TempoDeLigacao(this.ligacoes.get(i).getCodigo());
			} else {
				if (HorarioEspecial(this.ligacoes.get(i).getCodigo()) == true) {
					valorLigacao = horarioDesconto;
				} else {
					valorLigacao = valorCorrente * TempoDeLigacao(this.ligacoes.get(i).getCodigo());
				}
			}

			conta = conta + "Ligação: " + (i + 1) + ": " + ligacoes.get(i).getDataHoraInicio().format(formatador)
					+ " - " + ligacoes.get(i).getTelefoneDestino() + " - " + ligacoes.get(i).getCidadeDestino()
					+ "--- Duração da Ligação: " + TempoDeLigacao(this.ligacoes.get(i).getCodigo()) + "Min " + "/"
					+ ligacoes.get(i).getUFDestino() + " - " + "Valor: " + valorLigacao + " R$" + "\n";

		}
		return conta;
	}

}
