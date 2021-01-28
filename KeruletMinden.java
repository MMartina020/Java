/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerulet.minden;
import java.util.Scanner;
/**
 *
 * @author MM
 */
public class KeruletMinden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner bemenet = new Scanner(System.in);
    
    System.out.println("\nKerület számító program\n");
    System.out.println("\nKészítette: Mátyás Martina\n");
        
        int aoldal;
        int boldal;
        int coldal;
        int sugar;
        int doldal;
        int eoldal;
        char ujra;
        int a;
        int b;
        int c;
        
        
        char kerdes = 0;
        do{
        int valasz;
        System.out.println("\nVálassza ki, melyik kerület terület számító programot szeretné használni? (1/2/3)");
        System.out.println("1 - Téglalap");
        System.out.println("2 - Kör");
        System.out.println("3 - Háromszög");
        System.out.println("4 - Szabályos ötszög");
        System.out.println("5 - Szabályos hatszög");
        System.out.println("Kérlek írj be egy számot: ");
        valasz=bemenet.nextInt();
        
        
        
        while(!(valasz==1 || valasz==2 || valasz==3 || valasz==4 || valasz==5)){
        System.out.print("Csak az alábbi listából adjon meg számot: 1/2/3/4/5! ");
        System.out.println("Próbáld újra: ");
        valasz=bemenet.nextInt();
        }

       

        if (valasz==1) {
            System.out.println("\nA Téglalap: ");
            System.out.print("Adja meg az a oldalt!: ");
                aoldal = bemenet.nextInt(); 
                System.out.print("Adja meg a b oldalt is!: ");
                boldal = bemenet.nextInt(); 
                int kerulet = (aoldal + boldal) * 2;
                System.out.println("A téglalap kerülete: " + kerulet + "cm."); 
                }

        
        else if(valasz==2) {
            System.out.println("\n A kör");
            System.out.println("Adja meg a kör sugarát: ");
            sugar=bemenet.nextInt();
            System.out.println("A kör kerülete: "+(Math.PI*(sugar*sugar))+"cm");
        }
        
        else if (valasz==3){
                System.out.println("\n A háromszög:");
                System.out.print("Adja meg az a oldalt!: ");
                a = bemenet.nextInt(); //a bekért szám lesz az aoldal változó értéke
                System.out.print("Adja meg a b oldalt is!: ");
                b = bemenet.nextInt(); //a bekért szám lesz a boldal változó értéke
                System.out.print("Adja meg a c oldalt!: ");
                c = bemenet.nextInt();
            while (!(a+b>c && a+c>b && b+c>a)){  
                System.out.println("\nA háromszög nem szerkeszthető, adjon meg más számokat.");
                System.out.print("\nAdja meg a háromszög egyik oldalát: ");
                    a = bemenet.nextInt();
                System.out.print("Adja meg a háromszög második oldalát: ");
                    b = bemenet.nextInt();
                 System.out.print("Adja meg a háromszög harmadik oldalát: ");
                    c = bemenet.nextInt();
                 System.out.println("A háromszög kerülete:"+(a+b+c)+" cm");
                 }   
    }

        if (valasz==4) {
            System.out.println("\n Szabályos ötszög");
            System.out.println("Adja meg az az doldalak hosszát: ");
            doldal = bemenet.nextInt();
            int kerulet = (5 * doldal); 
            System.out.println("A szabályos ötszög kerülete: "+ kerulet +"cm");
    }
        else if (valasz==5) {
            System.out.println("\n Szabályos hatszög");
            System.out.println("Adja meg az eoldalak hosszát: ");
            eoldal=bemenet.nextInt();
            int kerulet = (6* eoldal);
            System.out.println("A szabályos hatszög kerülete: "+kerulet+"cm");
    }
         
          System.out.print("\nSzeretne-e  újabb alakzattal számoltatni? i/n: ");
            kerdes = bemenet.next().charAt(0);
    } while ((kerdes == 'i') || (kerdes == 'I'));  

       
    }
}
        
        
        
    
    

