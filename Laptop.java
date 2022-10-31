/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.Exercise2;

/**
 *
 * @author _thethirdeusedio
 */
public class Laptop extends Technology {
    
    private String OS;
    
    public Laptop(String name, String color, double weight, String OS){
        
        super(name, color, weight);
        this.OS = OS;
    }
    @Override
    public String Greet(){ //Overriding the superclass method
        return "Welcome!";
    }
    public String getOs(){
        return OS;
    }
    public void setOS(String OS){
        this.OS = OS;
    }
}
