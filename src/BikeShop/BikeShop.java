/*
                                                Q2 – FOR SUBMISSION !!
                                                - CCT College Dublin-
Course: High Diploma in Science in Computing - Software Development Fundamentals
Professor: Ken Healy MSc.
Student: Derek Bomfim Prates
Date: 20/10/2020

Question: 
Create a new Java Class called “Bicycle”
Add TWO properties following best practice. The properties should be (i) colour – this is text, and (ii)
size - this is an integer
Add a constructor to the class that will create a new bicycle based on a colour and a size passed as
parameters
Add a method called cycleBike() that will output a message saying “I am cycling the <colour here>
bike”
Now create a main class called BikeShop in the same project. Add some code to create 5 bicycles by
asking the user for the colour and the size of the bicycle. The validation rules are:
 The colour must be text (you do not have to check that it is a real colour!)
The size must be a number between 16 and 30
If invalid data is entered, output a useful error message. 
 */


package BikeShop;

import Bicycle.Bicycle;
import Input.Input;

/**
 *
 * @author Derek Prates
 */
public class BikeShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int size; // I will get the size from the user and put in size. 
        String colour; // I will get the colour from the user and put in size.
        int minV= 16;// this is a constant. it is the min size that the user is allowed to input.
        int maxV= 30;// this is a constant. it is the max size that the user is allowed to input.
        
        Bicycle [] bicycleList= new Bicycle[5]; 
        Bicycle [] bicycleSize= new Bicycle[5];
            // I am creating a new 5  bicycles by asking the user for the colour and the size.
        
            // in this loop i will get all the 5 input by the user. if you look at bicycleList.length here i am give the number of bike I will create. and before i have said it will be 5 by bicycleSize= new Bicycle[5]:
            for( int i=0; i< bicycleList.length;i++)
                   {
            
                    colour = Input.getUser("Please enter the colour of your bike"); // here i am just asking the user information.
                    
                    size = Input.getUserInt("Please enter the radius length of your circle", minV, maxV); // here i am just asking the user information.
                    
                    // So, when i use Input.getUserInt I am doing to the input new class java to check all restriction. and I am send the numerber of max and min size allowed.
                    bicycleList[i]=new Bicycle(colour,size); //here i am get this information and send to  new classe Java called Bicycle.
            
          
           //In Bicycler i will do whatever i need with the information that i get by the user.
                    }
            for(Bicycle s:bicycleList) // Just one for to show all the bike that i have created.
                    {
            
            System.out.println("I am cycling the "+s.cycleBike());    
            // i can put the size here but it wanst asked by Professor.
        // i am just showing the data that i got from user and "created" ( System = input by user, transformation by Bicycle, checking but INOUT class and output to user) in my Bicycle.
                    }
           
           
                                                    }            
    
}
