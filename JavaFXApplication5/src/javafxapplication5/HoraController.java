/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author jralb
 */
public class HoraController implements Initializable {

    @FXML
    private AnchorPane root;
    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button bot4;
    /**
     * Initializes the controller class.
     */
    
    @FXML
    private void volver(ActionEvent event) {
        SceneHandler.cargarVista(root, getClass().getResource("FXMLDocument.fxml"));  
    } 
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
