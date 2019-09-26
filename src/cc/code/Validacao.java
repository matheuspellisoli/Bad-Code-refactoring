package cc.code;

import java.util.ArrayList;
import java.util.List;

public class Validacao {

	protected List<String> validaPessoa(Pessoa pessoa) {

		List<String> constraints = new ArrayList<String>();

		if (pessoa == null) {
			constraints.add("Erro - passe uma pessoa");
			return constraints;
		}

		if (pessoa.getName() == null)
			constraints.add("Erro - Nome invalido");

		if (pessoa.getCpf() == null || !CPF.Validar(pessoa.getCpf())) {
			constraints.add("Erro - CPF invalido");
			return constraints;
		}

		if (pessoa.getTelefonesFixos() == null || pessoa.getTelefonesFixos().size() <= 0) {
			constraints.add("Erro - Telefone invalido");
			return constraints;
		}

		for (String telefone : pessoa.getTelefonesFixos()) {
			if (telefone.isEmpty() || telefone.length() < 10) {
				constraints.add("Erro - Telefone invalido");
				continue;
			}
		}

		return constraints;
	}
}