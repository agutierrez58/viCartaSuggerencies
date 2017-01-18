/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exempleuml_enginversa;

import java.util.List;

/**
 *
 * @author armand
 */
class Client {
    private List<Reserva> reserves;
    private String dni;
    private String nom;
    private String cognom;
    private String telefon;

    /**
     * @return the reserves
     */
    public List<Reserva> getReserves() {
        return reserves;
    }

    /**
     * @param reserves the reserves to set
     */
    public void setReserves(List<Reserva> reserves) {
        this.reserves = reserves;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the cognom
     */
    public String getCognom() {
        return cognom;
    }

    /**
     * @param cognom the cognom to set
     */
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

 

}
