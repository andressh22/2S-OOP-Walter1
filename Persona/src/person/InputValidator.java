/*To validate the value type from an input*/
package person;
import java.util.Scanner;

public class InputValidator {
    /*String validation - //empty condition*/
    public static String readStrings(Scanner reader, String message){
        String txt;
        while (true){
           System.out.print(message);
           txt=reader.nextLine().trim();
           if (!txt.isEmpty()){
               return txt;      
           }else{
               System.out.println("There isn't nothing. Try again.");
           }
        }
    } 
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
}
   
    
    

