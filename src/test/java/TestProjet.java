/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    @Before
    public void setUp() {
        mapProjet.put("Nom", "ProjetTEST");
        mapProjet.put("Description", "blablabla");
        mapProjet.put("Prestataire", "meidi");
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
        //Assert.assertNotNull(this.pro.getPrestataire());
    }
    
    @Test
    public void projetAssigneAUnPrestataire() 
    {
       //Assert.assertEquals(this.pro.assigne(new Prestataire()));
    }
}
