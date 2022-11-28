package br.com.petz2.clientepet2.cliente.application.service;

import java.util.List;

import br.com.petz2.clientepet2.cliente.application.API.ClienteListResponse;
import br.com.petz2.clientepet2.cliente.application.API.ClienteRequest;
import br.com.petz2.clientepet2.cliente.application.API.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clienteRequest);

	List<ClienteListResponse> buscaTodosClientes();

}
