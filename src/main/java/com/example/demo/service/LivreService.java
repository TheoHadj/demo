package com.example.demo.service;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.example.demo.model.Livre;

@Component
public class LivreService {
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
    


    
}
