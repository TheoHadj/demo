package com.example.demo.service;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.example.demo.model.Livre;

@Component
public class LivreService {
    private ArrayList<Livre> livres = new ArrayList<>();
    public LivreService() {
    }

    public void addLivre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Titre: ");
        String titre = sc.nextLine();
        System.out.println("Description: ");
        String desc =  sc.nextLine();
        System.out.println("Date de publication: ");
        String datePub = (sc.nextLine());
        Livre livre = new Livre(titre, desc, datePub);

    }

    public Livre getLivre(){

        return new Livre("titre", "description", "datePublication");
    }

    public void addSomeLivres(){
        livres.add(new Livre("titre1", "description1", "datePublication1"));
        livres.add(new Livre("titre2", "description2", "datePublication2"));
        livres.add(new Livre("titre3", "description3", "datePublication3"));
        for (Livre livre : livres) {
            System.out.println(livre.toString());
        }
    }


    
}
