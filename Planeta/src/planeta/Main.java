
package planeta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String name=InputValidator.ReadName(reader, "Input the planet name: ");
        int numberOfSatellites=InputValidator.ReadInt(reader, "Input the number of planet satellites: ");
        
    }
    
}

