/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta2;

import java.util.Date;
public class Cuenta {
    private int id;
    private double saldo;
    private double interesAnual;
    private Date  fechaInicial;
    
    public Cuenta(){
   
    }

    public Cuenta(int id,double saldo ){
        this.id=id;
        this.saldo=saldo;   
    }
    public void setId(int id){
        this.id=id;    
    }
 
    public int getId(){
    return id;
            }   
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
        
    }
 
    public double getSaldo(){
    return saldo;
            }  
    public void setDate( Date fechaInicial){
        this.fechaInicial=fechaInicial;
        
    }
    public Date getfechaInicial(){
    return fechaInicial;
            }   
    public void setInteresAnual(double interesAnual){
        this.interesAnual=interesAnual;     
    }
    public double getinteresAnual(){
    return interesAnual;
            }   
    public void deposito(double deposito){
        this.saldo=this.saldo+deposito;
        
    }
      public void retiro(double retiro){
        if(saldo<retiro){
            System.out.println("Saldo insuficiente");
        }else 
        this.saldo=this.saldo-retiro;
    }
}
    

