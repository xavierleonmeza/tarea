/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta4;

/**
 *
 * @author all
 */
public class Persona {
    
     private String nombre;
     private String direccion;
     private String telefono;
     private String email;

    public Persona(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    
     public Persona() {
      }
             
     public void setNombre(String nombre){
         this.nombre=nombre;
      }
     public String getNombre(){
         return nombre;
      }
    
     public void setDireccion(String direccion){
         this.direccion=direccion;
      }
     public String getDireccion(){
         return direccion;
      }
    
     public void setTelefono(String telefono){
         this.telefono=telefono;
      }
     public String getTelefono(){
         return telefono;
      }
    
     public void setEmail(String email){
         this.email=email;
      }
     public String getEmail(){
         return email;
      }
    
}
