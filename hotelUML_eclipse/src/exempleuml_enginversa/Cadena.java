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
public class Cadena {
    private List<Sucursal> sucursals;
    private List<Hotel> hotels;

    /**
     * @return the sucursals
     */
    public List<Sucursal> getSucursals() {
        return sucursals;
    }

    /**
     * @param sucursals the sucursals to set
     */
    public void setSucursals(List<Sucursal> sucursals) {
        this.sucursals = sucursals;
    }

    /**
     * @return the hotels
     */
    public List<Hotel> getHotels() {
        return hotels;
    }

    /**
     * @param hotels the hotels to set
     */
    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }


}
