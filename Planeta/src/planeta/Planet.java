
package planeta;


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
    private double orbitalPeriod;
    private double rotationPeriod;
    
    
    /*Constructor method*/
    Planet(String name, int numberOfSatellites, double mass,
            double volume, int diameter, int distanceOfSun,
            planetTypes planetType, boolean lookable, double orbitalPeriod, double rotationPeriod){
        this.name=name;
        this.numberOfSatellites=numberOfSatellites;
        this.mass=mass;
        this.volume=volume;
        this.diameter=diameter;
        this.distanceOfSun=distanceOfSun;
        this.planetType=planetType;
        this.lookable=lookable;
        this.orbitalPeriod=orbitalPeriod;
        this.rotationPeriod=rotationPeriod;
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
    public void setOrbitalPeriod(double orbitalPeriod){
        this.orbitalPeriod=orbitalPeriod;
    }
    public void setRotationPeriod(double rotationPeriod){
        this.rotationPeriod=rotationPeriod;
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
    public double getOrbitalPeriod(){
        return orbitalPeriod;
    }
    public double getRotationPeriod(){
        return rotationPeriod;
    }
    

    /*Showing method*/
    public void showPlanetFields(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Planet name: "+name);
        System.out.println("Number of satellites: "+numberOfSatellites);
        System.out.println("Mass: "+mass+" kg");
        System.out.println("Volume: "+volume+" km3");
        System.out.println("Diameter: "+diameter+" Millions of kilometers");
        System.out.println("Distance of the sun: "+distanceOfSun+" Millions of kilometers");
        System.out.println("Planet type: "+planetType);
        if(lookable==true){
            System.out.println("The planet is lookable");
        }else{
            System.out.println("The planet is not lookable");
        }
        System.out.println("Orbital period: "+orbitalPeriod+" years");
        System.out.println("Rotation period: "+rotationPeriod+" days");
        System.out.println("----------------------------------------------------------------");
    }
    
    
    /*Calculation methods*/
    public void calculateDensity(){
        if(volume==0){
            System.out.println("Density cannot be calculated.");
        }else{
            double density=mass/volume;
            System.out.printf("The density of the planet is: %.2f%n kg/km3", density);
        }
    }
    
    public void isItExterior(){
        if(distanceOfSun>3.4){
            System.out.println("It's an exterior planet");
        }else{
            System.out.println("It's an interior planet");
        }
        
    }
    
}