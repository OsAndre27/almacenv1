package com.osmarlopez.almacen.core.controller;


import com.osmarlopez.almacen.core.sistema.Principal;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

public class ProveedorController implements Initializable {
    private Principal principal;
    @FXML private TableView tblProveedor;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
                        
    }
    public void setPrincipal(Principal Principal){
        this.principal = principal;
    }
    
    public void regresarVentanaPrincipal() throws IOException {
        this.principal.mostrarVentanaPrincipal();
    }
}
