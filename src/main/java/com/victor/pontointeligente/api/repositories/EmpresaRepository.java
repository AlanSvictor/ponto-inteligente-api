package com.victor.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import com.victor.pontointeligente.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	@Transactional(readOnly = true) //Por se tratar de um método apenas de consulta não trava o banco, isso melhora performance
	Empresa findByCnpj(String cnpj);
	
	@Transactional(readOnly = true)
	Empresa findByRazaoSocial(String razaoSocial);
}