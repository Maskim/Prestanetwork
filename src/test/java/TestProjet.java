/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import epsi.prestanetwork.entity.Porteur;
import epsi.prestanetwork.entity.Prestataire;
import epsi.prestanetwork.entity.Projet;
import epsi.prestanetwork.entity.Utilisateur;
import java.util.HashMap;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


/**
 *
 * @author Brian
 */
public class TestProjet {
    
    private HashMap<String, String> mapProjet = new HashMap<String, String>();
    private Projet pro = new Projet();
    private Prestataire prestataire = new Prestataire("prenom","nom","email@email.fr","mdp");
    private Porteur porteur = new Porteur("laurine","jacquet","email@emaillaurine.fr","mdplaurine");
    
    @Before
    public void setUp() {
        mapProjet.put("Nom", "ProjetTEST");
        mapProjet.put("Description", "blablabla");
        this.pro.setPrestataire(prestataire);
        this.pro.setPorteur(porteur);
    }
    
    @Test
    public void projetAUnNom() 
    {
        Assert.assertEquals(this.pro.getNom(), mapProjet.get("Nom"));
    }
    
    @Test
    public void projetAUneDescription() 
    {
        Assert.assertEquals(this.pro.getDescription(), mapProjet.get("Description"));
    }
    
    @Test
    public void projetAUnPrestataire() 
    {
        Assert.assertNotNull(this.pro.getPrestataire());
    }
    
    @Test
    public void projetAssigneAUnPrestataire() 
    {
        this.pro.assignePrestataire(prestataire);
       Assert.assertNotNull(this.pro.getPrestataire());
    }
    
    @Test
    public void projetAUnPorteur() 
    {
        this.pro.assignePorteur(porteur);
       Assert.assertNotNull(this.pro.getPorteur());
    }
    
    @Test
    public void projetModificationNom()
    {
        this.pro.setNom("NouveauNom");
        Assert.assertEquals(this.pro.getNom(), mapProjet.get("Nom"));
    }
    
    @Test
    public void projetModificationDescription()
    {
        this.pro.setDescription("NouvelleDescription");
        Assert.assertEquals(this.pro.getDescription(), mapProjet.get("Description"));
    }
    
    @Test
    public void projetModificationPrestataire()
    {
        Prestataire presta2 = new Prestataire("brian","teyssier","email@brian.fr","mdpbrian");
        this.pro.setPrestataire(presta2);
        Assert.assertEquals(this.pro.getPrestataire().getNom(), "teyssier");
        Assert.assertEquals(this.pro.getPrestataire().getPrenom(), "brian");
        Assert.assertEquals(this.pro.getPrestataire().getEmail(), "email@brian.fr");
    }
    
    @Test
    public void projetModificationPorteur()
    {
        Porteur porteur2 = new Porteur("brian","teyssier","email@brian.fr","mdpbrian");
        this.pro.setPorteur(porteur2);
        Assert.assertEquals(this.pro.getPorteur().getNom(), "teyssier");
        Assert.assertEquals(this.pro.getPorteur().getPrenom(), "brian");
        Assert.assertEquals(this.pro.getPorteur().getEmail(), "email@brian.fr");
    }
}
