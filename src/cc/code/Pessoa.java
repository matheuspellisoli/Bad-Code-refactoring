package cc.code;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String name;
	private String cpf;
	private int idade;
	private List<String> telefonesFixos;
	private List<String> telefonesCelulares;

	public Pessoa() {
	}

	public Pessoa(String name, String cpf, int idade) {
		this.name = name;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<String> getTelefonesFixos() {
		return telefonesFixos;
	}

	public void addTelefoneFixos(String telefoneFixo) {
		this.telefonesFixos = this.telefonesFixos == null ? new ArrayList<String>() : this.telefonesFixos;
		this.telefonesFixos.add(telefoneFixo);
	}

	public List<String> getTelefonesCelulares() {
		return telefonesCelulares;
	}

	public void addTelefoneCelular(String telefoneCelular) {
		this.telefonesCelulares =  this.telefonesCelulares == null ? new ArrayList<String>() : this.telefonesCelulares;
		this.telefonesCelulares.add(telefoneCelular);
	}
	@Override
	
	public String toString() {
		return "name: " + this.getName() + "\nCPF: " + this.getCpf() + "\nFone: " + this.getTelefonesFixos().get(0);
	}
	
}
