/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// I should creat all the restrictions following:
// Must be a text colour.
//The size must be a number between 16 and 30.
//If invalid data is entered, output a useful error message.
// I am using your Ideia Professor. Because it is very good and i am just adapting to my problem. 
package Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author derek
 */
public class Input {
    
    
     public static int getUserInt(String prompt, int minValue, int maxValue){
        //i will show the message by prompt
        // I will get the interger by the user. I need to show to the user if they input a wrong input.
        //if not integer - output error and ask again
        
        //restrict input to a range of values so that the input is between maxValue and minValue.
        
           BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
          
           int userInput=0; // i am working with an int input
          
           boolean valid = false; // just choose start with false and change it if the input is right. this way if wrong the loop keep until i get the right input
           
           do{
            
               System.out.println(prompt); //output message from Bikeshop prompt
               System.out.println("You must enter a value between " + minValue + " and " + maxValue );
               
            try{
                userInput = Integer.parseInt(myKB.readLine()); //read input
                valid = true; // if right true and go to next step.
                }
            catch(Exception e)
                {
                
                System.out.println("That is not a number. Please try again");
                // asking again to user and valid = false
                }
            
            }while ( (!valid) || (userInput < minValue) || (userInput > maxValue));
           
          
            return userInput; // send back the right input
           
    }
    
    
    public static String getUser(String prompt){
        //display mesage using prompt
        // get a colour input from user
        //if not text - output error and ask again
      
          BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
           
          String userInput=""; // i am working with a String input
          
         boolean valid = false;
             do{
            
                System.out.println(prompt); //output prompt
                
               
            try{
               userInput =  myKB.readLine(); //read input
               
               if(userInput.matches("[A-Za-z]+")) // make sure it will be a text
               {
                valid = true;
            }else{
                   System.out.println("That is not a colour. Please try again. it should be word.");
                   // show that it wasnt a right inpout
                 }
               
                }
            catch(Exception e)
                {
                
                System.out.println("That is not a colour. Please try again");
                //valid stays false
                }
            
                }while (!valid); // i just need to get i right input. Should be a work. I am working with BufferedReader so i expect to get a string
           
           
           return userInput;      // send back the right input
    }
}

