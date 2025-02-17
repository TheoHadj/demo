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
    
    public LivreService(ArrayList<Livre> livres) {
        this.livres = livres;
    }   

    public Livre addLivre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Titre: ");
        String titre = sc.nextLine();
        System.out.println("Description: ");
        String desc =  sc.nextLine();
        System.out.println("Date de publication: ");
        String datePub = (sc.nextLine());
        Livre livre = new Livre(titre, desc, datePub);
        return livre;
    }

    public Livre getLivre(){

        return new Livre("titre", "description", "datePublication");
    }

    public void addSomeLivres(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de livres voulez-vous ajouter?");
        int j = sc.nextInt();
        for (int i = 0; i < j; i++) {
            System.out.println("Livre " + (i+1));
            livres.add(addLivre());
        }
        
        for (Livre livre : livres) {
            System.out.println(livre);
        }
    }


    
}
