/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import epsi.prestanetwork.entity.Utilisateur;
import java.util.HashMap;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Meidi
 */
public class TestUtilisateur {
    
    private HashMap<String, String> map = new HashMap<String, String>();
    private Utilisateur uti = new Utilisateur("Meidi", "Airouche", "meidi.airouche@gmail.com", "neptune13"); 
    
    @Before
    public void setUp() {
        map.put("Prenom", "Meidi");
        map.put("Nom", "Airouche");
        map.put("Email", "meidi.airouche@gmail.com");
        map.put("MotDePasse", "neptune13");
    }
    
    @Test
    public void utilisateurAUnPrenomMeidi() 
    {
        Assert.assertEquals(this.uti.getPrenom(), map.get("Prenom"));
    }
    
    @Test
    public void utilisateurAUnNom() 
    {
        Assert.assertEquals(this.uti.getNom(), map.get("Nom"));
    }
    
    @Test
    public void utilisateurAUnEmailNonValide() 
    {
        Utilisateur unUser = new Utilisateur("Meidi", "Airouche", "meidi", "Test"); 
        Assert.assertNull(unUser.getEmail());
    }
    
    @Test
    public void utilisateurAUnEmail() 
    {
        Assert.assertEquals(this.uti.getEmail(), map.get("Email"));
    }
    
    @Test
    public void utilisateurAUnMotDePasse() 
    {
        Assert.assertNotSame(this.uti.getMotDePasse(), map.get("MotDePasse"));
    }
    
    @Test
    public void utilisateurPeutSeConnecter() 
    {
        Assert.assertTrue(this.uti.peutSeConnecter());
    }
    
    
}
