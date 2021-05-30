/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.konverterapp.controller;

import id.konverterapp.model.KonverterCelciusKeReamur;
import id.konverterapp.view.FormKonverter;

/**
 *
 * @author Muhammad Keenan Fathurrahman / 24060119130052
 */
public class KonverterController {
    
    private KonverterCelciusKeReamur model;
    private FormKonverter view;
    
    public KonverterController(KonverterCelciusKeReamur model, FormKonverter view) {
        this.model = model;
        this.view = view;
    }
    
    public void inputCelcius(){
        model.setCelcius(Double.parseDouble(view.getTextMasukanSuhu().getText()));
        view.getLabelSuhu().setText(model.KonvertCelciusKeReamur() + " Reamur");
    }
    
    public void Controller(){
        view.getButtonUbahSuhu().addActionListener(e -> inputCelcius());
    }

}
