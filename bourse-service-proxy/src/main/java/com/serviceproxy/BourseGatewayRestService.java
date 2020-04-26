package com.serviceproxy;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.client.Traverson;
import org.springframework.hateoas.server.core.TypeReferences.CollectionModelType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.serviceproxy.entities.Societe;

@RestController
public class BourseGatewayRestService {

	//@Autowired
	//private RestTemplate restTemplate;
	
	private String REMOTE_SERVICE_ROOT_URI = "http://societe-service/societes";
			 
	@GetMapping("/names")
	public CollectionModel<EntityModel<Societe>> listSocietes() throws URISyntaxException{
		

         //ParameterizedTypeReference<EntityModel<Societe>> responseType = new ParameterizedTypeReference<EntityModel<Societe>>(){};		
	
         // joue le role passeeelle. Recoi une requete et la renvoie.
		/*return restTemplate.exchange("http://societe-service/societes",org.springframework.http.HttpMethod.GET,null,responseType).getBody() ;
		
		Traverson client = new Traverson(new URI(REMOTE_SERVICE_ROOT_URI), MediaTypes.HAL_JSON);
		CollectionModel<EntityModel<Societe>> employees = client.follow("employees")
			.toObject(new ResourcesType<EntityModel<Employee>>(){});
		*/
		
		Traverson traversonSociete = new Traverson(new URI(REMOTE_SERVICE_ROOT_URI), MediaTypes.HAL_JSON);

		 CollectionModel<EntityModel<Societe>> societes = traversonSociete //
				.follow("societes") //
				.toObject(new CollectionModelType<EntityModel<Societe>>() {});

		return societes ;
		
		
	}
	


}