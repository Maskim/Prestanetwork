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
    private boolean estAssignePrestataire;
    private boolean estAssignePorteur;
    private Porteur porteur;
    
    public String getNom(){
       return this.Nom;
    }

    public String getDescription() {
        return this.Description;
    }
    
    public boolean estAssignePorteur()
    {
        return this.estAssignePorteur;
    }
    
    public boolean estAssignePrestataire()
    {
        return this.estAssignePrestataire;
    }
    
    public void assignePrestataire(Prestataire presta)
    {
        estAssignePrestataire = true;
        this.prestataire = presta;
    }
    
    public Prestataire getPrestataire()
    {
        return this.prestataire;
    }

    public void assignePorteur(Porteur porteur) {
        estAssignePorteur = true;
        this.porteur = porteur;
    }

    public Porteur getPorteur() {
        return this.porteur;
    }

    public void setNom(String nouveauNom) {
        this.Nom = nouveauNom;
    }

    public void setDescription(String nouvelleDescription) {
        this.Description = nouvelleDescription;
    }

    public void setPrestataire(Prestataire nouveauPrestataire) {
        this.prestataire = nouveauPrestataire;
    }

    public void setPorteur(Porteur nouveauPorteur) {
        this.porteur = nouveauPorteur;
    }
    
    
}
