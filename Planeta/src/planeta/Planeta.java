
package planeta;


public class Planeta {
    
    
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
    Planeta(String name, int numberOfSatellites, double mass,
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
}