package org.hocine.catal;


import org.hocine.catal.entities.Produit;
import org.hocine.catal.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class Catal1Application implements CommandLineRunner {
	@Autowired
    private ProduitRepository produitRepository;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(Catal1Application.class, args);
	}
	
		
		@Override
		public void run(String... args) throws Exception {
			restConfiguration.exposeIdsFor(Produit.class);
			produitRepository.save(new Produit(null,"laptop",100.1,101));	
			produitRepository.save(new Produit(null,"laptop",100.1,102));
			produitRepository.save(new Produit(null,"laptop",100.1,103));
			
			produitRepository.findAll().forEach(p->{System.out.println(toString());});
		}
	

}