package com.traindo.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorPageConfig  {
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
        	 @Override
             public void customize(ConfigurableWebServerFactory factory) {
                 ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/views/404.html");
                 ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/views/500.html");
                 factory.addErrorPages( error404Page, error500Page);
             }
        };
    }
}
