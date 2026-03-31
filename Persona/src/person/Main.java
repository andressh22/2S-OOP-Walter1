
package person;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        /*Scanner creation*/
        Scanner reader=new Scanner(System.in);

        
        /*Reading fields using "InputValidator" class*/
        String name=InputValidator.readStrings(reader, "Enter your name: ");
        String surname=InputValidator.readStrings(reader, "Enter your surname: ");
        int id=InputValidator.readIntegers(reader, "Enter an ID: ");
        int birthYear=InputValidator.readIntegers(reader, "Enter your year of birth: ");
        String birthCountry=InputValidator.readStrings(reader, "Enter yout country of birth: ");
        char gender=InputValidator.readGenderChars(reader, "Enter your gender: ");
        
        /*Using constructor class*/
        Person person1=new Person(name, surname, id, birthYear, birthCountry, gender);
        
        String name2=InputValidator.readStrings(reader, "Enter your name: ");
        String surname2=InputValidator.readStrings(reader, "Enter your surname: ");
        int id2=InputValidator.readIntegers(reader, "Enter an ID: ");
        int birthYear2=InputValidator.readIntegers(reader, "Enter your year of birth: ");
        String birthCountry2=InputValidator.readStrings(reader, "Enter yout country of birth: ");
        char gender2=InputValidator.readGenderChars(reader, "Enter your gender: ");
        
        Person person2=new Person(name2, surname2, id2, birthYear2, birthCountry2, gender2);
        
        /*Methods ejectution*/
        person1.showObjectFields();
        person2.showObjectFields();
        
        
    }
    
}
