
package szemelyekoop;


public class SzemelyekOOP {

    
    public static void main(String[] args) {
         Szemelyek Martina = new Szemelyek();
         Martina.eletkor = 20;
         Martina.hajszin = "barna";
         Martina.hazas_e = false;
         Martina.iq = 120;
         Martina.magassag = 168;
         Martina.nem = "nő";
         Martina.testsuly = 50;
         
         
         Tanulok Elemer = new Tanulok();
         Elemer.eletkor = 20;
         Elemer.nem = "ferfi";
         Elemer.osztondijas_e = true;
         
         
         System.out.println(Martina.eletkor);
         System.out.println(Elemer.osztondijas_e);
    }
    
}
