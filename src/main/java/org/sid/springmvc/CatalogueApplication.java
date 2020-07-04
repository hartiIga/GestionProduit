package org.sid.springmvc;

import org.sid.springmvc.dao.ProduitRepository;
import org.sid.springmvc.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CatalogueApplication implements CommandLineRunner {

    @Autowired
    private ProduitRepository produitRepository;

    public static void main(String[] args)

    {
        SpringApplication.run(CatalogueApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        produitRepository.save(new Produit(null, "souris", 223.43));
        produitRepository.save(new Produit(null, "ecran", 654.21));
        produitRepository.save(new Produit(null, "carte graphique", 988.0));
        produitRepository.save(new Produit(null, "clavier", 223.43));
        produitRepository.save(new Produit(null, "memoire", 654.21));
        produitRepository.save(new Produit(null, "carte mere", 988.0));
        produitRepository.save(new Produit(null, "alimentation", 223.43));
        produitRepository.save(new Produit(null, "boitier", 654.21));
        produitRepository.save(new Produit(null, "ventilateur", 988.0));
        produitRepository.save(new Produit(null, "cable", 223.43));
        produitRepository.save(new Produit(null, "carte_wifi", 654.21));
        produitRepository.save(new Produit(null, "processeur", 988.0));
        produitRepository.save(new Produit(null, "souris", 223.43));
        produitRepository.save(new Produit(null, "ecran", 654.21));
        produitRepository.save(new Produit(null, "carte graphique", 988.0));
        produitRepository.save(new Produit(null, "clavier", 223.43));
        produitRepository.save(new Produit(null, "memoire", 654.21));
        produitRepository.save(new Produit(null, "carte mere", 988.0));
        produitRepository.save(new Produit(null, "alimentation", 223.43));
        produitRepository.save(new Produit(null, "boitier", 654.21));
        produitRepository.save(new Produit(null, "ventilateur", 988.0));
        produitRepository.save(new Produit(null, "cable", 223.43));
        produitRepository.save(new Produit(null, "carte_wifi", 654.21));
        produitRepository.save(new Produit(null, "processeur", 988.0));
        produitRepository.save(new Produit(null, "souris", 223.43));
        produitRepository.save(new Produit(null, "ecran", 654.21));
        produitRepository.save(new Produit(null, "carte graphique", 988.0));
        produitRepository.save(new Produit(null, "clavier", 223.43));
        produitRepository.save(new Produit(null, "memoire", 654.21));
        produitRepository.save(new Produit(null, "carte mere", 988.0));
        produitRepository.save(new Produit(null, "alimentation", 223.43));
        produitRepository.save(new Produit(null, "boitier", 654.21));
        produitRepository.save(new Produit(null, "ventilateur", 988.0));
        produitRepository.save(new Produit(null, "cable", 223.43));
        produitRepository.save(new Produit(null, "carte_wifi", 654.21));
        produitRepository.save(new Produit(null, "processeur", 988.0));
        produitRepository.save(new Produit(null, "souris", 223.43));
        produitRepository.save(new Produit(null, "ecran3", 654.21));
        produitRepository.save(new Produit(null, "ecran2", 988.0));
        produitRepository.save(new Produit(null, "clavier", 223.43));
        produitRepository.save(new Produit(null, "clavier1", 654.21));
        produitRepository.save(new Produit(null, "processuer4", 988.0));
        produitRepository.save(new Produit(null, "alimentation", 223.43));
        produitRepository.save(new Produit(null, "processuer4", 654.21));
        produitRepository.save(new Produit(null, "clavier3", 988.0));
        produitRepository.save(new Produit(null, "processeur3", 223.43));
        produitRepository.save(new Produit(null, "processeur2", 654.21));
        produitRepository.save(new Produit(null, "processeur", 988.0));

        produitRepository.findAll().forEach(p->{
            System.out.println(p.getName());
        });
    }
}
