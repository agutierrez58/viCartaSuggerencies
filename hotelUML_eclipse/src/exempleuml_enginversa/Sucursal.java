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
public class Sucursal {
    private List<Reserva> reserves;
    private String codi;
    private String nom;
    private String telefon;
    private String ciutat;

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
     * @return the codi
     */
    public String getCodi() {
        return codi;
    }

    /**
     * @param codi the codi to set
     */
    public void setCodi(String codi) {
        this.codi = codi;
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

    /**
     * @return the ciutat
     */
    public String getCiutat() {
        return ciutat;
    }

    /**
     * @param ciutat the ciutat to set
     */
    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    

}
