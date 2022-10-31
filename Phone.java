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
public class Phone extends Technology {
    
    private int RAM;
    
    public Phone(String name, String color, double weight, int RAM){
        super(name, color, weight);
        this.RAM  = RAM;
    }
    @Override
    public String Greet(){
        return "Hello";
    }
    public int getRAM(){
        return RAM;
    }
    public void setRAM(int RAM){
        this.RAM = RAM;
    }
}
