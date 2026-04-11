
package planeta;
import java.util.Scanner;

public class Planet {
    
    
    /*Fields*/
    String name=null;
    int numberOfSatellites=0;
    double mass=0;
    double volume=0;
    int diameter=0;
    int distanceOfSun=0;
    enum planetTypes{
        gas,
        terrestrial,
        dwarf
    }
    planetTypes planetType;
    boolean lookable=false;
    
    
    /*Constructor method*/
    Planet(String name, int numberOfSatellites, double mass,
            double volume, int diameter, int distanceOfSun,
            planetTypes planetType, boolean lookable){
        this.name=name;
        this.numberOfSatellites=numberOfSatellites;
        this.mass=mass;
        this.volume=volume;
        this.diameter=diameter;
        this.distanceOfSun=distanceOfSun;
        this.planetType=planetType;
        this.lookable=lookable;
    }
    
    /*Showing method*/
    public void ShowPlanetFields(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Planet name: "+name);
        System.out.println("Number of satellites: "+numberOfSatellites);
        System.out.println("Mass: "+mass+"kg");
        System.out.println("Volume: "+volume+"km3");
        System.out.println("Diameter: "+diameter+" Millions of kilometers");
        System.out.println("Distance of the sun: "+distanceOfSun+" Million of kilometers");
        System.out.println("Type: "+planetType+" planet");
        if(lookable==true){
            System.out.println("The planet is lookable");
        }else{
            System.out.println("The planet is not lookable");
        }
        System.out.println("----------------------------------------------------------------");
    }
    
}