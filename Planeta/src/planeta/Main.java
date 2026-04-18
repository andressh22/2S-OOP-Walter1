
package planeta;

public class Main {

    public static void main(String[] args) {
        
        
        /*Methods ejecution*/
        Planet planet1=PlanetServices.creatingPlanet();
        planet1.showPlanetFields();
        planet1.calculateDensity();
        planet1.isItExterior();
        
        Planet planet2=PlanetServices.creatingPlanet();
        planet2.showPlanetFields();
        planet2.calculateDensity();
        planet2.isItExterior();
        
        
    }
    
}

