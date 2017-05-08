/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta3;

/**
 *
 * @author all
 */
public class Triangulo extends ObjetoGeometrico{
    
     private double lado1=1.0;
    private double lado2=1.0;
    private double lado3=1.0;
    
    
    public Triangulo (){
        
    }
            
    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }
    
    public void setLado1(double lado1){
        this.lado1=lado1;
        
    }
 
    public double getLado1(){
    return lado1;
            }   
    
    public void setLado2(double lado2){
        this.lado2=lado2;
        
    }
 
    public double getLado2(){
    return lado2;
            }   
    
    public void setLado3( double lado3){
        this.lado3=lado3;
        
    }
    public double getLado3(){
    return lado3;
            } 
    
    public double getArea(){
        double area = this.lado1 * this.lado2 * this.lado3;
        return area;
    }
    
    public double getPerimetro(){
        double perimetro = this.lado1 + this.lado2 + this.lado3;
        return perimetro;
    }
    
}

    
    

