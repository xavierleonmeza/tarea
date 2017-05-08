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
public class Estudiante extends Persona {
    private enum Status{
        Primero,
        Segundo,
        Tercero,
        Cuarto,
        
    }
     private Status status;

    public Estudiante(){  
    }

     
     
    public Estudiante(Status status, String nombre, String direccion, String telefono, String email) {
        super(nombre, direccion, telefono, email);
        this.status = status;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
}
