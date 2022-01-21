import java.util.ArrayList;

public class Banco {

	public static void main(String[] args) {
		ArrayList<Correntista> listaDeClientes = new ArrayList<Correntista>();
		
		CorrentistaFisico c1 = new CorrentistaFisico("João");
		listaDeClientes.add(c1);

		CorrentistaFisico c2 = new CorrentistaFisico("Maria");
		listaDeClientes.add(c2);

		CorrentistaFisico c3 = new CorrentistaFisico("Lucas");
		listaDeClientes.add(c3);

		CorrentistaFisico c4 = new CorrentistaFisico("Ana");
		listaDeClientes.add(c4);
		
		CorrentistaJuridico cJuridico = new CorrentistaJuridico("ACME LLC", "Pedro");
		listaDeClientes.add(cJuridico);
		
		c1.exibeIdentificacao();
		c2.exibeIdentificacao();
		c3.exibeIdentificacao();
		c4.exibeIdentificacao();
		cJuridico.exibeIdentificacao(); 

		
	}

}
