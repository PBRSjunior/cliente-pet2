package br.com.petz2.clientepet2.cliente.application.API;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

public class ClienteListResponse {
	
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;

}
