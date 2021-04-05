package com.transacao.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.transacao.cartao.Cartao;
import com.transacao.estabelecimento.Estabelecimento;

@Entity
public class Transacao {

	@Id
	private String id;
	@Column(nullable = false)
	private BigDecimal valor;
	@OneToOne(cascade = CascadeType.MERGE)
	private Estabelecimento estabelecimento;
	@OneToOne(cascade = CascadeType.MERGE)
	private Cartao cartao;
	@Column(nullable = false)
	private LocalDateTime efetivadaEm;
	
	public Transacao(String id, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao,
			LocalDateTime efetivadaEm) {
		this.id = id;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
		this.cartao = cartao;
		this.efetivadaEm = efetivadaEm;
	}

	@Deprecated
	public Transacao() {
	}

	public String getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}

	@Override
	public String toString() {
		return "Transacao{" + "id='" + id + '\'' + ", valor=" + valor + ", estabelecimento=" + estabelecimento
				+ ", cartao=" + cartao + ", efetivadaEm=" + efetivadaEm + '}';
	}
}
