package com.thainara.gerenciamentocondominio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class GerenciamentoDeCondominioApplication {

    public static void main(String[] args) {
        SpringApplication.run(GerenciamentoDeCondominioApplication.class, args);
    }

    //bloqueio default de linguagem pt-br
    @Bean
    public LocaleResolver localeResolverl(){
        return new FixedLocaleResolver(new Locale("pt", "BR"));
    }
}
