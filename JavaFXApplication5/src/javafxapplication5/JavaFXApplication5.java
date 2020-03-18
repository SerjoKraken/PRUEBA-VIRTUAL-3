/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author cmsan
 */
public class JavaFXApplication5 extends Application {
    ArrayList<String> companias= new ArrayList<>();
    String pass="pass123";
    /**
     * 
     * 
     *  
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        companias.add("Wom");
        companias.add("Claro");
        companias.add("Movistar");
        companias.add("Entel");
        /**
         * Agregar a la lista de la interfaz y mostrar
         */
        /**
         * cuadrText tendra la informacion recibida por el cuadro de texto y se 
         * comprueba en el metdo siguuiente
         */
        String cuadrText="";
        if (pass==cuadrText){
            /**
             * se apruueba y se envia el texto
             * se muestra un mensaje
             */
            System.out.println("SE aprueba el mensaje");
        }
        else{
            /**
             * Se cancela el envio del mensaje
             * Se envia mensaje de rechazo
             */
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
