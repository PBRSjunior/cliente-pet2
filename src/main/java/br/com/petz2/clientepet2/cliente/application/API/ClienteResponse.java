package br.com.petz2.clientepet2.cliente.application.API;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClienteResponse {
	
	private UUID idCliente;

}
