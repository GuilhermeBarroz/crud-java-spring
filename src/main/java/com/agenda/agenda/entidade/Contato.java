package com.agenda.agenda.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;    
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String profissao;
    @Column(nullable = false)
    private String urlAvatar;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData_nascimento() {
        return email;
    }
    public void setData_nascimento(String data_nascimento) {
        this.email = data_nascimento;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getUrlAvatar() {
        return urlAvatar;
    }
    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }
}
