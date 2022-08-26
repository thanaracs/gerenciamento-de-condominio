package com.thainara.gerenciamentocondominio.model;

import javax.persistence.Entity;
import javax.persistence.Table;


public enum StatusTitulo {
    //CLASSE DE CONFIGURAÇÃO DAS OPÇÕES STATUS
    PENDENTE("Pendente"),
    RECEBIDO("Recebido"),
    CANCELADO("Cancelado");

    private String descricao;
    StatusTitulo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}