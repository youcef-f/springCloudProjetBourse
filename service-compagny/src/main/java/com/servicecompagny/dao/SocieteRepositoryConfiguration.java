package com.servicecompagny.dao;


import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;


import com.servicecompagny.entities.Societe;





@Component
class SocieteRepositoryConfiguration extends RepositoryRestConfigurerAdapter { 

    @Override 
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) { 
     config.setReturnBodyOnCreate(true);
     config.setReturnBodyOnCreate(true);
     config.setReturnBodyForPutAndPost(true);
     config.exposeIdsFor(Societe.class); // n'expose que ces classes
    	config.getCorsRegistry() 
        .addMapping("/**") 
        .allowedOrigins("*") 
        .allowedHeaders("*") 
        .allowedMethods("OPTIONS", "HEAD", "GET", "PUT", "POST", "DELETE", "PATCH"); 
    } 

} 