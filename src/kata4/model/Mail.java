/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.model;

/**
 *
 * @author usuario
 */
public class Mail {
    private final String mail;

    public String getMail() {
        return mail;
    }

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain(){
        String[] parts = mail.split("@");
        String usuario = parts[0];
        String dominio = parts[1];
        return dominio;
    }
}
