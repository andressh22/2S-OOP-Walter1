
package planeta;
import java.util.Scanner;


public class InputValidator {
    
    
    /*For a possible empty name*/
    public static String ReadName(Scanner reader, String message){
        while(true){
            System.out.print(message);
            String txt=reader.nextLine().trim().toLowerCase();
            if(!txt.isEmpty()){
                return txt;
            }else{
                System.out.println("There is nothing entered. Try again.");
            }
        }
    }
    
    /*For a possible no String and negative numbers*/
    public static int ReadInt(Scanner reader, String message){
        while(true){
            System.out.print(message);
            String inputedNumber=reader.nextLine().trim();
            if(!inputedNumber.isEmpty()){
                try{
                    int number=Integer.parseInt(inputedNumber);
                    if (number>=0){
                        return number;
                    }else{
                        System.out.println("The number must be greater or equal than zero. Try again.");
                    }
                }catch(NumberFormatException e){
                    System.out.println("That is not a number. Try again.");
                }
            }else{
                    System.out.println("There is not nothing entered. Try again.");
                    }
        }
    }
}
