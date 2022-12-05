package br.com.petz2.clientepet2.cliente.application.API;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.petz2.clientepet2.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	private Boolean aceitaTermos;
	private LocalDateTime datahoraDoCadastro;
	
	
//	public ClienteDetalhadoResponse(Cliente cliente) {
//	this.idCliente = cliente.getIdCliente();
//	this.nomeCompleto = cliente.getNomeCompleto();
//	this.cpf = cliente.getCpf();
//	this.email = cliente.getEmail();
//	this.celular = cliente.getCelular();
//	this.telefone = cliente.getTelefone();
//	this.sexo = cliente.getSexo();
//	this.aceitaTermos = cliente.getAceitaTermos();
//	this.datahoraDoCadastro = datahoraDoCadastro;
	
}
