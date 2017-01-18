/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exempleuml_enginversa;

import java.util.Date;

/**
 *
 * @author armand
 */
class Reserva {
    
    private Client client;
    private Hotel hotel;
    private int quantPlaces;
    private Date dataArribada;
    private Date dataSortida;

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the hotel
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * @param hotel the hotel to set
     */
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    /**
     * @return the quantPlaces
     */
    public int getQuantPlaces() {
        return quantPlaces;
    }

    /**
     * @param quantPlaces the quantPlaces to set
     */
    public void setQuantPlaces(int quantPlaces) {
        this.quantPlaces = quantPlaces;
    }

    /**
     * @return the dataArribada
     */
    public Date getDataArribada() {
        return dataArribada;
    }

    /**
     * @param dataArribada the dataArribada to set
     */
    public void setDataArribada(Date dataArribada) {
        this.dataArribada = dataArribada;
    }

    /**
     * @return the dataSortida
     */
    public Date getDataSortida() {
        return dataSortida;
    }

    /**
     * @param dataSortida the dataSortida to set
     */
    public void setDataSortida(Date dataSortida) {
        this.dataSortida = dataSortida;
    }

    

    

}
