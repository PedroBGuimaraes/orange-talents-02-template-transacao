package com.transacao.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.transacao.transacao.TransacaoRequest;

@Component
public class ListenerDeTransacao {
	@KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacaoRequest eventoDeTransacao) {
        System.out.println(eventoDeTransacao);
    }
}
