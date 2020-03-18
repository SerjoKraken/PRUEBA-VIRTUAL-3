/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Kriss
 */
public class FechayHora {

    public void mostrarFecha() {
        java.util.Date fecha = new Date();
        System.out.println(fecha);
    }

    public void mostrarHora() {
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        System.out.println(hora + ":" + minutos + ":" + segundos);

    }

    public void mostrarAmbas() {
        mostrarFecha();
        mostrarHora();
    }
    
    public void actualizar(){
        for (int i = 0; i < 100; i++) {
            mostrarAmbas();
        }

    }

}
