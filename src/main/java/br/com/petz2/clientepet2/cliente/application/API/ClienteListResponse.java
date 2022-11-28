package br.com.petz2.clientepet2.cliente.application.API;

import java.util.List;
import java.util.UUID;

import javax.validation.constraints.NotBlank;

import br.com.petz2.clientepet2.cliente.domain.Cliente;

public class ClienteListResponse {
	
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return null;
	}

}
