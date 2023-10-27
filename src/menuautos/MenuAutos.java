/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuautos;

/**
 *
 * @author Daniel
 */
public class MenuAutos {

    private String patente;
    private String marca;
    private String color;
    private int año;
    private String modelo;

    public MenuAutos() {
    }

    public MenuAutos(String patente, String marca, String color, int año, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.año = año;
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
   
}
