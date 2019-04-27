package com.osmarlopez.almacen.core.controller;

import com.osmarlopez.almacen.core.sistema.Principal;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class VentanaPrincipalController implements Initializable {
    private Principal principal;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setPrincipal(Principal principal){
        this.principal = principal;
   
    }
    public void mostrarVentanaProveedores()throws IOException {
        this.principal.mostrarVentanaProveedores();    
    }
}
