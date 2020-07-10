package br.com.softblue.loucademia.application.config;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

//Imports necessários para rodar o JSF no servidor Wildflye

@FacesConfig(version = Version.JSF_2_3)
@ApplicationScoped
public class Config {

//Servidor web Apache -> contéudo estático
//Servidor web Tomcat e Wildfly - contéudo dinâmico 
//JPA -> Integração com o banco de dados
//JSF -> API JavaServer Faces (Web), componente que está dentro do Java EE, responsável por montar as páginas dinamicamentes.
//JDBC -> Comunicação com o banco de dados.
	
}
