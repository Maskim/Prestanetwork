/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meidi
 */
package epsi.prestanetwork.entity;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 
{
	private String code;

	public Md5(String md5) {
		crypte(md5);
	}

	public void crypte(String pass){
		byte[] passBytes = pass.getBytes();
		try {
			MessageDigest algorithm = MessageDigest.getInstance("MD5");
			algorithm.reset();
			algorithm.update(passBytes);
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(passBytes);
			BigInteger number = new BigInteger(1, messageDigest);
			this.code= number.toString(16);
			} catch (NoSuchAlgorithmException e) {
				throw new Error("invalid JRE: have not 'MD5' impl.", e);
		}
	}
        
	public String codeGet(){
		return code;
	}


}