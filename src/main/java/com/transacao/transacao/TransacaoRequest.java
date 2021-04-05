package com.transacao.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.transacao.cartao.CartaoRequest;
import com.transacao.estabelecimento.EstabelecimentoRequest;

public class TransacaoRequest {
	private String id;

    private BigDecimal valor;

    private EstabelecimentoRequest estabelecimento;

    private CartaoRequest cartao;

    private LocalDateTime efetivadaEm;

    public Transacao toModel() {
        return new Transacao(id, valor, estabelecimento.toModel(), cartao.toModel(), efetivadaEm);
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoRequest getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoRequest getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
