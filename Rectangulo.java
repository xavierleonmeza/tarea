/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta1;

/**
 *
 * @author all
 */
public class Rectangulo {
     private double altura=1;
    private double anchura=1;
    
    public Rectangulo(){
           
    }
    
    public Rectangulo(double altura, double anchura){
           this.altura=altura;
           this.anchura=anchura;
    }
    
    public double getArea(){
        double area = this.altura * this.anchura;
        return area;
        // otro metodo = return this.altura * this.anchura;   
    }
    public double getPerimetro(){
       return (this.altura+this.anchura)*2; 
            
    }
    
}
