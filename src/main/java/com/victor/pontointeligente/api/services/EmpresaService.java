package com.victor.pontointeligente.api.services;
import java.util.Optional;

import com.victor.pontointeligente.api.entities.Empresa;

public interface EmpresaService {

	/**
	 * Retorna uma empresa dado um CNPJ.
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	
	/**
	 * Cadastra uma nova empresa na base de dados.
	 * 
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);
	

	/**
	 * Retorna uma empresa dado uma razão social
	 * 
	 * @param razaoSocial
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscaPorRazaoSocial(String razaoSocial);
	
	
}