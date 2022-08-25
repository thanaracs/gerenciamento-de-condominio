package com.thainara.gerenciamentocondominio.model;

import javax.persistence.Entity;
import javax.persistence.Table;


public enum StatusTitulo {
    PENDENTE("Pendente"),
    RECEBIDO("Recebido");

    private String descricao;
    StatusTitulo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}