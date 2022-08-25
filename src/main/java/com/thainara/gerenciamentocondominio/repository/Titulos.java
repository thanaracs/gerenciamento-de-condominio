package com.thainara.gerenciamentocondominio.repository;

import com.thainara.gerenciamentocondominio.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Titulos extends JpaRepository<Titulo, Long> {

}
