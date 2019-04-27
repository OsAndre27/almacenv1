package com.osmarlopez.almacen.core.controller;


import com.osmarlopez.almacen.core.model.Proveedor;
import com.osmarlopez.almacen.core.service.ProveedorService;
import com.osmarlopez.almacen.core.service.ProveedorServiceImpl;
import com.osmarlopez.almacen.core.sistema.Principal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

public class ProveedorController implements Initializable {
   private ProveedorService proveedorService = new ProveedorServiceImpl();
   private ObservableList<Proveedor> lista;
            
    private Principal principal;
    
    @FXML private TableView tblProveedor;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.proveedorService.findAllProveedor();
        
        
    }
    
    public void setPrincipal(Principal Principal){
       this.principal = principal;
    }
    
    public void regresarVentanaPrincipal() throws IOException {
       this.principal.mostrarVentanaPrincipal();
    }
}
