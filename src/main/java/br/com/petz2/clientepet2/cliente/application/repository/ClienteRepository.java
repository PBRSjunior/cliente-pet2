package br.com.petz2.clientepet2.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.petz2.clientepet2.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesId(UUID idCliente);

}
