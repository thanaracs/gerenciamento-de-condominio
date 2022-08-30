package com.thainara.gerenciamentocondominio.controller;

import com.thainara.gerenciamentocondominio.model.StatusTitulo;
import com.thainara.gerenciamentocondominio.model.Titulo;
import com.thainara.gerenciamentocondominio.repository.Titulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/titulos")
public class TituloController {

    @Autowired //instaciar repository no controller
    private Titulos titulos;

    @RequestMapping("/novo")
    public ModelAndView novo(){
        ModelAndView mv = new ModelAndView("CadastroTitulo");
        mv.addObject("todosStatusTitulo", StatusTitulo.values());
        mv.addObject(new Titulo()); //criando objeto titulo para ser validado no método salvar
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView salvar(@Validated Titulo titulo, Errors errors){
        ModelAndView mv = new ModelAndView("CadastroTitulo");
        //se der erro de validação, volta para a pagina cadastroTitulo
        if (errors.hasErrors()){
            return mv;
        }
        //salvar no banco de dados
        titulos.save(titulo);
        //adicionando mensagem de alert
        mv.addObject("mensagem", "Título salvo com sucesso!");
        return mv;
    }

    @ModelAttribute ("todosStatusTitulo")
    public List<StatusTitulo> todosStatusTitulo(){
        return Arrays.asList(StatusTitulo.values());
    }

    //Controller de pesquisa de titulos
    @RequestMapping
    public ModelAndView pesquisar(){
        List<Titulo> todosTitulos = titulos.findAll(); //retorna todos os titulos
        ModelAndView mv = new ModelAndView("PesquisaTitulos");
        mv.addObject("titulos", todosTitulos);
        return mv;
    }
}
