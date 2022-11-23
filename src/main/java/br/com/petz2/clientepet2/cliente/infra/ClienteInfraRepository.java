package br.com.petz2.clientepet2.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.petz2.clientepet2.cliente.application.repository.ClienteRepository;
import br.com.petz2.clientepet2.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		clienteSpringDataJPARepository.save(cliente);
		log.info("finaliza] ClienteInfraRepository - salva");
		return cliente;
	}

}
