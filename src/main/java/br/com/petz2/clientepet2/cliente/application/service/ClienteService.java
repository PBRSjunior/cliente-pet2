package br.com.petz2.clientepet2.cliente.application.service;

import br.com.petz2.clientepet2.cliente.application.API.ClienteRequest;
import br.com.petz2.clientepet2.cliente.application.API.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clienteRequest);

}
