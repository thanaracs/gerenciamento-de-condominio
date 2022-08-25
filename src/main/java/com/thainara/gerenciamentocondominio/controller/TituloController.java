package com.thainara.gerenciamentocondominio.controller;

import com.thainara.gerenciamentocondominio.model.Titulo;
import com.thainara.gerenciamentocondominio.repository.Titulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/titulos")
public class TituloController {

    @Autowired //instaciar
    private Titulos titulos;

    @RequestMapping("/novo")
    public String novo(){
        return "CadastroTitulo";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String salvar(Titulo titulo){
        //salvar no banco de dados
        System.out.println(">>> " + titulo.getDescricao());
        titulos.save(titulo);
        return "CadastroTitulo";
    }
}
