/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombmuv;
import java.util.Scanner;
/**
 *
 * @author MM
 */
public class Tombmuv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("MŰVELETEK TÖMBÖKKEL \n");
        System.out.println("\nKészítette: Mátyás Martina\n");
        
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        int osszeg1=0;
        int osszeg2=0;
        int sorOsszeg=0;
        int szam;
        
        System.out.println("\tTÖMBŰVELETEK\n");
        System.out.println("Készítette: Mátyás Martina 113c");
        
        System.out.print("Hány eleműek legyenek a tömbök?");
            szam = bemenet.nextInt();
        System.out.println("");
        int tomb1[] = new int [szam]; 
        int tomb2[] = new int [szam]; 
        
        for (int i = 0; i < szam; i++) {
            tomb1[i] = (int) (Math.random()*999)+1;
            osszeg1=osszeg1+tomb1[i];
            tomb2[i] = (int) (Math.random()*999)+1;
            osszeg2=osszeg2+tomb2[i];
        }
        
         for (int i = 0; i < szam; i++) {
            sorOsszeg = tomb1[i]+tomb2[i];
            System.out.print("A tömbök "+(i+1) + ". elemei: " + (String.format("%,3d", tomb1[i])+" + "));
            System.out.print(String.format("%,3d", tomb2[i])+" = ");
            System.out.println(String.format("%,5d",sorOsszeg));
        }
         
        System.out.println("\nAz első tömb elemeinek összege: "+String.format("%,5d",osszeg2));
        System.out.println("A második tömb elemeinek összege: "+String.format("%,5d",osszeg1));
        
        
    bemenet.close();
    }
}
    
    

