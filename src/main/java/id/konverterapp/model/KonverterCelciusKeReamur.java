/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.konverterapp.model;

/**
 *
 * @author Muhammad Keenan Fathurrahman / 24060119130052
 */
public class KonverterCelciusKeReamur {
    
    private double celcius;

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }
    
    public double KonvertCelciusKeReamur() {
        return this.celcius * 0.8;
    }
    
}
