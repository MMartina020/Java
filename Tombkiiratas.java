/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombkiiratas;

/**
 *
 * @author MM
 */
public class Tombkiiratas {
private static void kiir(int[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(String.format("%,3d",tomb[i])+" ");
        }
        System.out.println("");
    }
    private static void feltolt(int[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (int) (Math.random()*200)-100;
        }
    }
    
    public static void main(String[] args) {
         int elemszam = 10;
        int tomb1[] = new int [elemszam];
        int tomb2[] = new int [elemszam];
        int tomb3[] = new int [elemszam];
        
        feltolt(tomb1);
        feltolt(tomb2);
        feltolt(tomb3);
        
   
        System.out.println("Az első tömb elemei: ");
        kiir(tomb1);
        System.out.println("A második tömb elemei: ");
        kiir(tomb2);
        System.out.println("A harmadik tömb elemei: ");
        kiir(tomb3);
        
        
    }
    
}
