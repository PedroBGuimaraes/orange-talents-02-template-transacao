package com.transacao.cartao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Cartao {

    @Id @NotBlank
    private String id;
    @Column(nullable = false)
    @NotBlank @Email
    private String email;

    @Deprecated
    public Cartao() {
    }
    
    public Cartao(@NotBlank String id, @NotBlank @Email String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
