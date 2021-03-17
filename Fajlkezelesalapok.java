package fajlkezelesalapok;
import java.io.*;
public class Fajlkezelesalapok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
    String sor;
    String[] nevek = new String[19];
 
    try
    {
      raf = new RandomAccessFile("C:\\Users\\Gyuri\\Desktop\\nevek.txt","r");
      
      int db = 0;
      sor = raf.readLine();
 
      while( sor != null )
      {
        nevek[db] = sor;
        db++;
        sor = raf.readLine();
      }
      
      raf.close();
    }
    catch( IOException e )
    {
      System.err.println("HIBA");
    }
    for( String str : nevek )
    {
      System.out.println(str);
    }
  }
}