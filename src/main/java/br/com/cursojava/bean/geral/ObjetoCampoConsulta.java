package br.com.cursojava.bean.geral;

import java.io.Serializable;
import java.util.Comparator;

import lombok.Data;

@Data
public class ObjetoCampoConsulta implements Serializable, Comparator<ObjetoCampoConsulta> {

	private static final long serialVersionUID = 1L;

	private String descricao;
	private String campoBanco;
	private Object tipoClass;
	private Integer principal;

	@Override
	public int compare(ObjetoCampoConsulta o1, ObjetoCampoConsulta o2) {

		return ((ObjetoCampoConsulta) o1).getPrincipal().compareTo(((ObjetoCampoConsulta) o2).getPrincipal());
	}

}
