/*To validate the value type from an input*/
package person;
import java.util.Scanner;

public class InputValidator {
    
    
    /*String validation - //empty condition*/
    public static String readStrings(Scanner reader, String message){
        while (true){
           System.out.print(message);
           String txt=reader.nextLine().trim();
           if (!txt.isEmpty()){
               return txt;      
           }else{
               System.out.println("There isn't nothing. Try again.");
           }
        }
    } 
    
    
    /*Integers validation*/
    public static int readIntegers(Scanner reader, String message){
        while(true){
            try{
                System.out.print(message);
                return Integer.parseInt(reader.nextLine());
            }catch(NumberFormatException e){
                System.out.println("It's not a valid ID. Try again.");
            }
        }
    }
    
    /*Enum validations - Wheter it really belongs*/
    public static char readGenderChars(Scanner reader, String message){
        while(true){
            String gotGender=readStrings(reader, message);/*Avoiding empties*/
            char gender=gotGender.toLowerCase().charAt(0);
            if(gender=='m' || gender=='f'){
                return gender;
            }else{
                System.out.println("No valid data. Try again.");
            }
        }
    }
}
   
    
    



    /*Gender Validation*/
    /*public static String readGender(Scanner reader, String message){
        String gender;
        while(true){
            gender=reader.nextLine().toLowerCase();
            if()
            
            
        }
    }*/
