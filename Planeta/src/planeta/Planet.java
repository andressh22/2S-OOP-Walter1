
package planeta;
import java.util.Scanner;

public class Planet {
    
    
    /*Fields*/
    private String name=null;
    private int numberOfSatellites=0;
    private double mass=0;
    private double volume=0;
    private int diameter=0;
    private int distanceOfSun=0;
    public enum planetTypes{
        gas,
        terrestrial,
        dwarf
    }
    private planetTypes planetType;
    private boolean lookable=false;
    
    
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
/* Set methods */
public void setName(String name){
    this.name = name;
}

public void setNumberOfSatellites(int numberOfSatellites){
    this.numberOfSatellites = numberOfSatellites;
}

public void setMass(double mass){
    this.mass = mass;
}

public void setVolume(double volume){
    this.volume = volume;
}

public void setDiameter(int diameter){
    this.diameter = diameter;
}

public void setDistanceOfSun(int distanceOfSun){
    this.distanceOfSun = distanceOfSun;
}

public void setPlanetType(planetTypes planetType){
    this.planetType = planetType;
}

public void setLookable(boolean lookable){
    this.lookable = lookable;
}

/* Get methods */
public String getName(){
    return name;
}

public int getNumberOfSatellites(){
    return numberOfSatellites;
}

public double getMass(){
    return mass;
}

public double getVolume(){
    return volume;
}

public int getDiameter(){
    return diameter;
}

public int getDistanceOfSun(){
    return distanceOfSun;
}

public planetTypes getPlanetType(){
    return planetType;
}

public boolean getLookable(){
    return lookable;
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
    
    
    /*Calculation methods*/
    public String CalculateDensity(){
        double density=mass/volume;
        return "The density of the planet is: "+density;
    }
    
}