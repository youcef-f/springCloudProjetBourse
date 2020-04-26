package com.servicecompagny.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // demande de relire les variables dans application.properties
@RestController
public class BourseRestService {

	@Value("${youcef}")
	private String message;
	
	@GetMapping ("/message")
	public Map<String, Object> tellMe() {
		System.out.println("-------------------------");
		System.out.println("C'est moi qui répond");
		System.out.println("-------------------------");
		
		Map<String,Object> params = new HashMap<>();
		
		params.put("prenom:" , message);
		params.put("theradName:" , Thread.currentThread().getName());
		
		return params ; 
		
	}
	
 }
