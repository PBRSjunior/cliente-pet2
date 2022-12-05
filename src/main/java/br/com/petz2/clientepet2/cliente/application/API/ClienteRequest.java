package br.com.petz2.clientepet2.cliente.application.API;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.petz2.clientepet2.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteRequest {
	
	@NotBlank
	private String nomeCompleto;
	@NotNull
	@Email
	private String email;
	@NotNull
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	@CPF
	private String cpf;
	@NotNull
	private Boolean aceitaTermos;
//	public @NotNull boolean getAceitaTermos() {
//		return true;
	
}


