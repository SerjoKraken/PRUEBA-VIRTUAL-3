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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author cmsan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane root;
    
    @FXML
    private Label label;
     
    @FXML
    private Button bot1;
        
    @FXML
    private Button bot2;
    
    @FXML
    private Button bot3;
        
    @FXML
    private Button bot4;
    
        
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @FXML
    private void enviar(ActionEvent event) {
        SceneHandler.cargarVista(root, getClass().getResource("Enviar.fxml"));  
    } 
    
    @FXML
    private void historial(ActionEvent event) {
        SceneHandler.cargarVista(root, getClass().getResource("FXMLDocument.fxml"));  
    } 
    
    @FXML
    private void responder(ActionEvent event) {
        SceneHandler.cargarVista(root, getClass().getResource("ModificarPlayListGeneral.fxml"));  
    } 
    
    @FXML
    private void horaactual(ActionEvent event) {
        SceneHandler.cargarVista(root, getClass().getResource("ModificarPlayListGeneral.fxml"));  
    } 
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
