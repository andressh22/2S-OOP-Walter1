
package planeta;

import java.util.Scanner;

public class PlanetServices {
    /*Asking for fields and ejectution create method*/
    static Scanner reader=new Scanner(System.in);
    
    public static Planet creatingPlanet(){
        System.out.println("----------------------------------------------------------------");;
        String name=InputValidator.readString(reader, "Input the planet name: ");
        int numberOfSatellites=InputValidator.readInt(reader, "Input the number of planet satellites: ");
        double mass=InputValidator.readDouble(reader, "Input the planet mass in kilograms: ");
        double volume=InputValidator.readDouble(reader, "Input the planet volume in cubic kilometers: ");
        int diameter=InputValidator.readInt(reader, "Input the planet diameter: ");
        int distanceOfSun=InputValidator.readInt(reader, "Input the planet distance of the sun in kilometer millions: ");
        Planet.planetTypes planetType=InputValidator.readEnum(reader, "Input the planet type (giant, gas, dwarf): ");
        boolean lookable=InputValidator.readBoolean(reader, "Is the planet lookable?. Enter yes or not: ", "yes", "not");
        double orbitalPeriod=InputValidator.readDouble(reader, "Enter the planet's orbital period in years: ");
        double rotationPeriod=InputValidator.readDouble(reader, "Input the planet's rotation period in days: ");
        
        return new Planet(name, numberOfSatellites, mass,
               volume, diameter, distanceOfSun, planetType, lookable, orbitalPeriod, rotationPeriod);
    }    
}
