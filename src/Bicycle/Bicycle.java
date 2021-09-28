/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bicycle;
/**
 *
 * @author Derek Prates
 */
public class Bicycle {
    
     //PROPERTIES
    private String colour; // colour type String
    private int size;// Size type int
    
    //CONSTRUCTORS
    public Bicycle(String colour, int size)
    {
        //create a bike  with a specific colour and size
        this.colour= colour;
        this.size= size;
    }
    
    
    //METHODS
    
    public String cycleBike()
    {
        //returns the colour of bike   
        return colour;      
    }
     public int cycleSize()
     {
        //returns the size of bike
        return size;  
     }
    
}
