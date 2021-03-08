package nevezzunk;
import java.util.Scanner;

public class Nevezzunk {

    public static void main(String[] args) {
        Scanner bemenet =new Scanner(System.in);
        System.out.print("Írd be a teljes neved: ");
        String tNev = bemenet.nextLine();
        
        
        System.out.println("Nagybetűs: " + tNev.toUpperCase());
        System.out.println("Szókezdők nagybetűsek: "+Metodusok.firstUpper(tNev));
        System.out.println("Kisbetűs: " + tNev.toLowerCase());
        System.out.println("Ennyi karakterből áll a neved:" + tNev.length());
        int szokozindex1 = tNev.indexOf(' ');
        System.out.println("A névben az 1.  szóköz helye: " + szokozindex1);
        int szokozindex2 = tNev.lastIndexOf(' ');
        System.out.println("A névben a 2. szóköz helye:" + szokozindex2);
        
        String[] reszek = tNev.split(" ");
        String vNev = reszek[0];
        String kNev = reszek[1];
        System.out.println("1. keresztnév kezdő pozíciója:" );
        System.out.println("2. keresztnév kezdő pozíciója:");
        System.out.println("Vezetéknév: " + vNev);
        System.out.println("Keresztnév: " + kNev);
        System.out.println("Vezetéknév hossza: " + vNev.length());
        System.out.println("Keresztnév hossza: " + kNev.length());
        System.out.println("Névegyesítés: "+vNev+" "+kNev);
        System.out.println("Új név: ");
    }
    
}
