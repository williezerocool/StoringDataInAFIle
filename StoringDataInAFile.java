/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storingdatainafile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
class car{

    String make, model, year, license;
   
}
public class StoringDataInAFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Scanner keyboard = new Scanner(System.in);
        
        String input;
        int count = 1;
        car[] newCar = new car[5];
        
        for(int i=0; i<5; i++){
        
            System.out.println("Car " + count);
            
            newCar[i] = new car();
            System.out.print("\t Make: ");
            newCar[i].make = keyboard.next();
            System.out.print("\t Model: ");
            newCar[i].model = keyboard.next();
            System.out.print("\t Year: ");
            newCar[i].year = keyboard.next();
            System.out.print("\t License: ");
            newCar[i].license = keyboard.next();
            count++;
            
            
        }
        
        System.out.print(" To which file do you want to save this information? ");
        input = keyboard.next();
        PrintWriter file = new PrintWriter(new FileWriter(input));
        int newCount = 1;
        for(int j=0; j<5; j++){
        
            file.println("Car " + newCount);
            file.println("\t Make: " + newCar[j].make);
            file.println("\t Model: " + newCar[j].model);
            file.println("\t Year: " + newCar[j].year);
            file.println("\t License: " + newCar[j].license);
            newCount++;
        }
        file.close();
        System.out.println("Data saved");
    }
    
}
