package br.com.cursojava.acessos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public enum Permissao {

	ADMIN("ADMIN", "Administrador"), 
	USER("USER", "Usuário Padrão"), 
	CADASTRO_ACESSAR("CADASTRO_ACESSAR","Cadastro - Acessar"), 
	FINANCEIRO_ACESSAR("FINANCEIRO_ACESSAR","Financeiro - Acessar"), 
	MENSAGEM_ACESSAR("MENSAGEM_ACESSAR", "Mensagem recebida - Acessar"),

	BAIRRO_ACESSAR("BAIRRO_ACESSAR", "Bairro - Acessar"), 
	BAIRRO_NOVO("BAIRRO_NOVO", "Bairro - Novo"), 
	BAIRRO_EDITAR("BAIRRO_EDITAR", "Bairro - Editar"), 
	BAIRRO_EXCLUIR("BAIRRO_EXCLUIR", "Bairro - Excluir");

	@Getter
	@Setter
	private String valor = "";

	@Getter
	@Setter
	private String descricao = "";

	public static List<Permissao> getListPermissao() {
		List<Permissao> permissoes = new ArrayList<>();
		for (Permissao permissao : Permissao.values()) {
			permissoes.add(permissao);

		}
		Collections.sort(permissoes, new Comparator<Permissao>() {

			@Override
			public int compare(Permissao o1, Permissao o2) {

				return new Integer(o1.ordinal()).compareTo(new Integer(o2.ordinal()));
			}

		});

		return permissoes;

	}

}
