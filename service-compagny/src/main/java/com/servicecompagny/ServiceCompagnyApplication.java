package com.servicecompagny;

import java.util.stream.Stream;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.servicecompagny.dao.ISocieteReposity;
import com.servicecompagny.entities.Societe;

@EnableEurekaClient
@SpringBootApplication
public class ServiceCompagnyApplication implements CommandLineRunner {

	@Autowired
	ISocieteReposity societeReposity;

	public static void main(String[] args) {

		SpringApplication.run(ServiceCompagnyApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Stream.of("Aalberts", "AB Science", "ABC Arbitrage", "Abéo", "Accor", "Actia Group", "AdUX", "Aegon",
				"AEX index", "Ageas", "Agfa-Gevaert", "Agta Record", "Air Guyane Express", "Air liquide",
				"Airbus (groupe)", "Akka Technologies", "AkzoNobel", "Albioma", "Alstom", "Altarea Cogedim", "Alten",
				"Altice Europe", "Altran", "Amundi", "Anheuser-Busch InBev", "Aperam", "April (entreprise)", "Arcadis",
				"Arcelor", "ArcelorMittal", "Arkema", "ASML", "Atari", "Atari SA", "Ateme", "Atos",
				"Aures Technologies", "Axa", "Banco Comercial Português", "Barco", "Bastide Le Confort Médical",
				"Bekaert (entreprise)", "BEL20", "Bic (entreprise)", "Binckbank", "BioMérieux", "BNP Paribas",
				"Bolloré", "Bourse Direct", "Bouygues", "Bpost", "Brookfield Asset Management", "Bureau Veritas",
				"Utilisateur:CA SAfr/Brouillon", "Capgemini", "Carmat", "CGG (entreprise)",
				"Projet:Charte graphique/Apparence des Infobox/Archive", "Christian Dior (entreprise)", "Cnova",
				"CNP Assurances", "Cofinimmo", "Compagnie des Alpes", "Corporate Express", "Covivio", "Crédit agricole",
				"Crédit agricole Brie Picardie", "D2L Group", "Danone", "Dassault Aviation", "Dassault Systèmes",
				"Dexia", "Diagnostic Medical Systems", "ECA Group", "Econocom", "Utilisateur:Ecrivain3333/Brouillon",
				"Edenred", "Eiffage", "Électricité de France", "Elior Group", "Elis (entreprise)", "Engie", "Eramet",
				"EssilorLuxottica", "Eurazeo", "Eurofins Scientific", "Euronext", "Modèle:Euronext",
				"Modèle:Euronext/Documentation", "Europcar Mobility Group", "Eutelsat", "EVS (entreprise)", "Faurecia",
				"Utilisateur:Ferra Dura/Brouillon", "Fleetcor", "Fluxys", "Fnac Darty", "Gecina", "Getlink",
				"Greenyard Foods", "Grontmij", "Groupe ADP", "Groupe Beneteau", "Groupe Carrefour", "Groupe Casino",
				"Groupe Gorgé", "Groupe Latécoère", "Groupe LDLC", "Groupe M6", "Groupe Proximus", "Groupe PSA",
				"Groupe SEB", "Groupe SMCP", "Groupe TF1", "GTT (entreprise)", "Hagemeyer", "Harvest (entreprise)",
				"Haulotte Group", "Heineken", "Hermès International", "HSBC", "Icade", "Iliad", "Imerys", "Ingenico",
				"Utilisateur:InnovativeChemistry/Brouillon", "Interparfums", "Ipsos", "Itesoft", "JCDecaux",
				"Kaufman & Broad", "KBC (groupe financier)", "Kering", "Kinepolis Group", "Klépierre",
				"Kohlberg Kravis Roberts & Co.", "Korian", "KPN", "Utilisateur:Kristo211345/Brouillon", "L'Oréal",
				"Laboratoires Boiron", "LafargeHolcim", "Lagardère (entreprise)", "Legrand (entreprise)",
				"Lisi (entreprise)", "Maisons du Monde", "Manitou Group", "Utilisateur:Marionvp/Brouillon",
				"Mauna Kea Technologies", "Maurel & Prom", "Mediawan", "Mercialys", "Michelin", "Mittal Steel Company",
				"Natixis", "Naturex", "Nexans", "Nexity", "Nokia", "Numico", "NYSE Euronext", "OL Groupe",
				"Orange (entreprise)", "Orange Belgique", "Orpea", "Oxurion", "Pernod Ricard", "Philips",
				"Plastic Omnium", "Utilisateur:PogosianK/Brouillon", "Utilisateur:Polaert/Danone",
				"Prologue (entreprise)", "PSI 20", "Publicis Groupe", "Quadient", "Redes Energéticas Nacionais",
				"Rémy Cointreau", "Renault", "Renault Sport", "Rexel", "Robertet", "Rothschild & Co",
				"Roularta Media Group", "Rubis (entreprise)", "Safran (entreprise)", "Saint-Gobain", "Sanofi",
				"SAP (entreprise)", "Sapmer", "Sartorius Stedim Biotech", "SBM Offshore", "Schlumberger (entreprise)",
				"Schneider Electric", "Scor", "Séché Environnement", "SES (entreprise)", "Shell (entreprise)",
				"Shurgard", "Signaux Girod", "Signify").forEach(societe -> societeReposity.save(new Societe(societe)));

		societeReposity.findAll().forEach(societe -> System.out.println(societe.getNomSociete()));

	}

}
