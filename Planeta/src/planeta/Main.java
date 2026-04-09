
package planeta;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        boolean lookable=InputValidator.ReadBoolean(reader, "Is the planet lookable?. Enter yes or not: ", "yes", "not");
        Planet.planetTypes planetType=InputValidator.ReadEnum(reader, "Input the planet type: ");
        String name=InputValidator.ReadString(reader, "Input the planet name: ");
        int numberOfSatellites=InputValidator.ReadInt(reader, "Input the number of planet satellites: ");
        double mass=InputValidator.ReadDouble(reader, "Input the planet mass in kilograms: ");
        double volume=InputValidator.ReadDouble(reader, "Input the planet volume in cubic kilometers: ");
        int diameter=InputValidator.ReadInt(reader, "Input the planet diameter: ");
        int distanceOfSun=InputValidator.ReadInt(reader, "Input the planet distance fo the sun in kilometer millions: ");
        
         
    }
    
}

