package br.com.softblue.loucademia.application.config;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

//Imports necess�rios para rodar o JSF no servidor Wildflye

@FacesConfig(version = Version.JSF_2_3)
@ApplicationScoped
public class Config {

//Servidor web Apache -> cont�udo est�tico
//Servidor web Tomcat e Wildfly - cont�udo din�mico 
//JPA -> Integra��o com o banco de dados
//JSF -> API JavaServer Faces (Web), componente que est� dentro do Java EE, respons�vel por montar as p�ginas dinamicamentes.
//JDBC -> Comunica��o com o banco de dados.
	
}
