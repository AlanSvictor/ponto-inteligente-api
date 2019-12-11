package com.victor.pontointeligente.api.services.impl;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.pontointeligente.api.entities.Empresa;
import com.victor.pontointeligente.api.repositories.EmpresaRepository;
import com.victor.pontointeligente.api.services.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		log.info("Buscando uma empresa para o CNPJ {}", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj)); //Optional faz a verificação para não dar null point execption
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo empresa: {}", empresa);
		return this.empresaRepository.save(empresa);
	}

	@Override
	public Optional<Empresa> buscaPorRazaoSocial(String razaoSocial) {
		log.info("Buscando uma empresa para a Razão social {}", razaoSocial);
		return Optional.ofNullable(empresaRepository.findByRazaoSocial(razaoSocial));
	}

}