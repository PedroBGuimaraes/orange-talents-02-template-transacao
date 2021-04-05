package com.transacao.transacao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transacao.cartao.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, String>{
	
}
