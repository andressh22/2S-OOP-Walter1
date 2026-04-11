
package planeta;

import java.util.Scanner;

/**
 *
 * @author an221
 */
public class PlanetServices {
    /*Asking for fields*/
    static Scanner reader=new Scanner(System.in);
    
    public static Planet CreatingPlanet(){
        String name=InputValidator.ReadString(reader, "Input the planet name: ");
        int numberOfSatellites=InputValidator.ReadInt(reader, "Input the number of planet satellites: ");
        double mass=InputValidator.ReadDouble(reader, "Input the planet mass in kilograms: ");
        double volume=InputValidator.ReadDouble(reader, "Input the planet volume in cubic kilometers: ");
        int diameter=InputValidator.ReadInt(reader, "Input the planet diameter: ");
        int distanceOfSun=InputValidator.ReadInt(reader, "Input the planet distance of the sun in kilometer millions: ");
        Planet.planetTypes planetType=InputValidator.ReadEnum(reader, "Input the planet type: ");
        boolean lookable=InputValidator.ReadBoolean(reader, "Is the planet lookable?. Enter yes or not: ", "yes", "not");
        
        return new Planet(name, numberOfSatellites, mass,
               volume, diameter, distanceOfSun, planetType, lookable);
    }    
}
