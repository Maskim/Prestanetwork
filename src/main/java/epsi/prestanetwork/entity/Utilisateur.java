package epsi.prestanetwork.entity;

import com.mysql.jdbc.StringUtils;
import javax.faces.validator.RegexValidator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meidi
 */
public class Utilisateur {
    
    private String prenom;
    private String nom;
    private String email;
    private String motDePasse;
    
    public Utilisateur(String prenom, String nom, String email, String motDePasse)
    {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
    }
    
    public String getPrenom()
    {
        return this.prenom;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public String getEmail()
    {
        String pattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$";
        if(!StringUtils.isNullOrEmpty(this.email) && this.email.matches(pattern))
        {
            return this.email;
        }
        return null;
    }
    
    public String getMotDePasse()
    {
        Md5 pass = new Md5(this.motDePasse);
        return pass.codeGet();
    }

    public boolean peutSeConnecter() {
        if(this.email != null && this.motDePasse != null){
            return true;
        }
        return false;
    }
    

    
}
