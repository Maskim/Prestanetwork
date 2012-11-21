package epsi.prestanetwork.entity;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class Projet {

    private String Nom;
    private String Description;
    private Prestataire prestataire;
    private boolean estAssigne;
    
    public String getNom(){
       return "ProjetTEST";
    }

    public String getDescription() {
        return "blablabla";
    }
    
    public Utilisateur getUtilisateur()
    {
        return null;
        //return new Utilisateur();
    }
    
    public boolean estAssigne()
    {
        return this.estAssigne;
    }
    
    public void assigne(Prestataire presta)
    {
        estAssigne = true;
        this.prestataire = presta;
    }
    
    public Prestataire getPrestataire()
    {
        return new Prestataire();
    }
    
    
}
