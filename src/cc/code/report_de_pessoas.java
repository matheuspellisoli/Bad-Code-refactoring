package cc.code;

import java.util.List;
import java.util.Vector;

/**
 * RelatÃ³rio de pessoas
 * 
 * @author Deus
 */
public class report_de_pessoas {

	public static void imprimirRelatorio(Vector<Pessoa> pessoas) {
		for (int i = 0; i < pessoas.size(); i++) {

			Pessoa p = (Pessoa) pessoas.get(i);
			Validacao validador = new Validacao();
			List<String> erro = validador.validaPessoa(p);

			if (!erro.isEmpty()) {
				System.out.println(erro.get(0));
				continue;
			}

			System.out.println(p.toString());
		}
	}

	/**
	 * codigo principal
	 * 
	 * @param args
	 */
		
	public static void main(String[] args) {
		Vector<Pessoa> pessoasList = new Vector<Pessoa>();

		Pessoa p1 = new Pessoa("Olivia Maitê Aparício", "93146386429", 26);
		p1.addTelefoneFixos("277064649");
		p1.addTelefoneCelular("27992523636");
		
		Pessoa p2 = new Pessoa("Leandro Filipe Drumond", "33093358008", 80); // CPF correto = 33095358008
		p2.addTelefoneFixos("61386016930");
		
		Pessoa p3 = new Pessoa("Anthony Manoel Ramos", "57169915308", 78);
		p3.addTelefoneFixos("6126160706");
		
		pessoasList.add(p1);
		pessoasList.add(p2);
		pessoasList.add(p3);
		
		imprimirRelatorio(pessoasList);
	}

}
