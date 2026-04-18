
package planeta;
import java.util.Scanner;


public class InputValidator {
    
    
    /*For a possible empty name*/
    public static String readString(Scanner reader, String message){
        while(true){
            System.out.print(message);
            String txt=reader.nextLine().trim();
            if(!txt.isEmpty()){
                return txt;
            }else{
                System.out.println("There is nothing entered. Try again.");
            }
        }
    }
    
    /*For a possible no String and negative numbers*/
    public static int readInt(Scanner reader, String message){
        while(true){
            String enteredNumber=readString(reader, message);
            try{
                int number=Integer.parseInt(enteredNumber);
                if (number>=0){
                    return number;
                }else{
                    System.out.println("The number must be greater or equal than zero. Try again.");
                }
            }catch(NumberFormatException e){
                System.out.println("That is not a number. Try again.");
            }
        }
    }
    
    
    /*Same as then, but for double*/
    public static double readDouble(Scanner reader, String message){
        while(true){
            String enteredNumber=readString(reader, message);
            try{
                double number=Double.parseDouble(enteredNumber);
                if (number>=0){
                    return number;
                }else{
                    System.out.println("The number must be greater or equal than zero. Try again.");
                }
            }catch(NumberFormatException e){
                System.out.println("That is not a number. Try again.");
            }
        }
    }
    
    
    /*Check if any belongs to an enum*/
    public static Planet.planetTypes readEnum(Scanner reader, String message){
        while(true){
            String enteredPlanetType=readString(reader, message).toLowerCase();
            try{
                Planet.planetTypes planetType=Planet.planetTypes.valueOf(enteredPlanetType);
                return planetType;
            }catch(IllegalArgumentException e){
                System.out.println("It does not belong to any planet type. Try again.");
            }
        }
    }
    
    /*Check for a valid answer*/
    public static boolean readBoolean(Scanner reader, String message, String option1, String option2){
        while(true){
            String answer=readString(reader,message).toLowerCase();
            if(answer.equals(option1)){
                return true;
            }else if (answer.equals(option2)){
              return false;
            }else{
                System.out.println("Please, input a valid option. Try again.");
            }
        }
    }
    
    
}
