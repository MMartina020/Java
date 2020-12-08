
package osszetettfeladat;
import java.util.Scanner;

/**
 *
 * @author MM
 */
public class Osszetettfeladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("\n ÖSSZETETT FELADAT");
      System.out.println("\nKészítette: Mátyás Martina\n");
      
     
        Scanner bemenet = new Scanner(System.in);
        char valasz = 0;
        do{
         //2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között.
            int darabszam = (int) (Math.random() * 10) + 20;
        //1. Hozz létre két tömböt: szamok1, szamok2 néven!    
        int szamok1[] = new int[darabszam];
        int szamok2[] = new int[darabszam];
        //3. Az elemek a -50 és +50 értéktartományba essenek.
        for (int i = 0; i < darabszam; i++) {
            szamok1[i] = (int) (Math.random() * 100) -50;
            szamok2[i] = (int) (Math.random() * 100) - 50;
        }
        //4. Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
        System.out.println("\nA szamok1 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok1[i]) + " ");
        }
        System.out.println("\nA szamok2 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok2[i]) + " ");
        }
            System.out.println("");
        //5. Helyezd át a két tömb öttel osztható páros számait egy ujTomb nevű tömbbe, majd írasd ki sorbarendezve.
        int ujTomb[] = new int[darabszam];
        int ujTombdb = 0;
        for (int i = 0; i < darabszam; i++) {
            if ((szamok1[i] % 5 == 0) && (szamok1[i]%2==0)) {
                ujTomb[ujTombdb++] = szamok1[i];
            }
            if ((szamok2[i] % 5 == 0) && (szamok2[i]%2==0)) {
                ujTomb[ujTombdb++] = szamok2[i];
            }
        }
         for (int i = 0; i < ujTombdb-1; i++) {
            for(int j = 0; j < ujTombdb-i-1; j++) {
                if (ujTomb[j]>ujTomb[j+1]) {
                    int temp=ujTomb[j];
                    ujTomb[j]=ujTomb[j+1];
                    ujTomb[j+1]=temp;
                }
            }
        }
        System.out.println("\nAz ujTomb elemei: ");
        for (int i = 0; i < ujTombdb; i++) {
            System.out.print(String.format("%,4d", ujTomb[i]) + " ");
        }
            System.out.println("");
        //6. Írasd ki a legkisebb és legnagyobb számot az ujTomb-ből.
        System.out.println("\nA legkisebb szám az ujTomb-ben: "+ujTomb[0]);
        System.out.println("A legnagyobb szám az ujTomb-ben: "+ujTomb[ujTombdb-1]);
        //7. Írasd ki, többszöröse-e a legnagyobb szám a legkisebbnek?
        if ( ujTomb[ujTombdb-1]%ujTomb[0] == 0) {
            System.out.println("\nAz ujTomb legnagyobb eleme a legkisebb elemének a többszöröse");
        }
        else {
            System.out.println("\nAz ujTomb legnagyobb eleme nem többszöröse a legkisebbnek elemének");
        }
        //8. Írasd ki, hogy 0-át tartalmaz-e az ujTomb?
        for (int i = 0; i < ujTombdb; i++) {
            if (ujTomb[i] == 0) {
                System.out.println("Az ujTomb 0-t tartalmaz");
            }
        }   
        //9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...
            System.out.print("\nSzeretné újra lefuttatni a programot? i/n: ");
            valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I'));  
}
}
