import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		BDSimulado bds = new BDSimulado();

		// bds.imprimeClientes();

		// -----------------------

		// // Quest�o 2a :
		System.out.println("---------------- Quest�o 2a ----------------");
		System.out.println(bds.getInfoCliente("Evandro da Silva"));

		// Quest�o 2b :
		System.out.println("\n---------------- Quest�o 2b ----------------");
		System.out.println(bds.ligacoesPorCliente("Evandro da Silva"));

		// Quest�o 2c :
		System.out.println("\n---------------- Quest�o 2c ----------------");
		System.out.println("liga��es por UF: " + bds.ligacoesPorUF("DF"));

		System.out.println(bds.testaIdade("Evandro da Silva"));

		// Quest�o 2d :
		System.out.println("\n---------------- Quest�o 2d ----------------");
		ArrayList<Integer> ligacoesUFDiferente = bds.ligacoesUFDiferente();
		for (int i = 0; i < ligacoesUFDiferente.size(); i++) {
			System.out.println(ligacoesUFDiferente.get(i));
		}

		// -----------------------------Quest�es 3-----------------------------

		System.out.println("-----------------------------Quest�es 3-----------------------------");
		System.out.println(bds.MontaConta("Regina Maria"));
		System.out.println(bds.MontaConta("Jos� das Couves"));
		System.out.println(bds.MontaConta("Maria do Socorro"));
	}

}
