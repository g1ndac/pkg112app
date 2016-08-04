/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg112app;

/**
 *
 * @author Edy
 */
public class Client {
    
    private String nume;
    private String telefon;
    private String IMEI;
    private Urgenta urgenta;

    public Client() {
    }

    public Client(String nume, String telefon, String IMEI, Urgenta urgenta) {
        this.nume = nume;
        this.telefon = telefon;
        this.IMEI = IMEI;
        this.urgenta = urgenta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public Urgenta getUrgenta() {
        return urgenta;
    }

    public void setUrgenta(Urgenta urgenta) {
        this.urgenta = urgenta;
    }

    @Override
    public String toString() {
        return "Client{" + "nume=" + nume + ", telefon=" + telefon + ", IMEI=" + IMEI + urgenta.toString() + '}';
    }
       
    
}
