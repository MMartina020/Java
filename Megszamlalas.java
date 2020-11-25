/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megszamlalas;

/**
 *
 * @author MM
 */
public class Megszamlalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("\n\tMegszamlálás\n");
            System.out.println("\nKészítette: Mátyás Martina\n");
       
            int tomb[] = new int[5];
            int db=0;
            for (int i = 0;i < 3; i++) {
                tomb[i]=(int)(Math.random() * 99) + 1;
                db++;
            }
            int i=0;
            System.out.println("A tomb elemei: ");
            for (; i < 3; i++) {
                System.out.print(i+" ");
                System.out.print(String.format("%,2d",tomb[i])+" \n");
            }
            System.out.println("");
            System.out.println(db);
            System.out.println(i);
}
}
