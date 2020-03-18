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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author jralb
 */
public class EnviarController implements Initializable {
    
    @FXML
    private AnchorPane root;
    @FXML
    private TextField name;
    @FXML
    private TextField mensaje;
    @FXML
    private TextField num;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getName(ActionEvent event) {
    }

    @FXML
    private void getmsj(ActionEvent event) {
    }

    @FXML
    private void getNum(ActionEvent event) {
    }
    
}
