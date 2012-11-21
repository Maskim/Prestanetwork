/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import epsi.prestanetwork.entity.Utilisateur;
import java.util.HashMap;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Meidi
 */
public class TestUser {
    
    private HashMap<String, String> map = new HashMap<String, String>();
    
    @Before
    public void setUp() {
        map.put("Prenom", "Meidi");
    }
    
    @Test
    public void utilisateurAUnPrenomMeidi() 
    {
        Utilisateur uti = new Utilisateur();
        Assert.assertEquals(uti.getPrenom(), map.get("Prenom"));
    }
    
}
