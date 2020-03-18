/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

/**
 *
 * @author SERJO
 */
public class Validador {
    
   public static boolean validarNombre(String nombre){
       
       if (nombre.length() > 10) {
           return false;
       }
       for (int i = 0; i < nombre.length(); i++) {
           if (Character.isDigit(nombre.charAt(i))) {
               return false;
           }
       }
       
       return true;
   }
   public static boolean validarNumero(String numero){
       if (numero.length()!=9) {
           return false;
       }
       for (int i = 0; i < numero.length(); i++) {
           if (Character.isAlphabetic(numero.charAt(i))) {
               return false;
           }
       }
       return true;
   }
   
   public static boolean validarMensaje(String mensaje){
       return mensaje.length() <=50;
   }
   //Se admiten fechas en formato dd/mm/yyyy o dd-mm-yyyy
   public static boolean validarFechaFormato(String fecha){
       if (!fecha.matches("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$")) {
           return false;
       }
       return true;
   }
}
