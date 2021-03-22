package fajlbeolv;

import java.io.File;
import java.io.*;

public class Fajlbeolv {

    String vNEv;
    String kNev;
    public static void main(String[] args) {
        RandomAccessFile raf;
       
        
        try
        {
          raf = new RandomAccessFile("C:\\Users\\Gyuri\\Desktop\\nevek.txt","r");
       // sor=raf.readLine();
       // System.out.println(sor);  csak egy sort ir ki!
      /*    int db = 19;
            for (int i=0; i<db; i++) {
                raf.readLine();
                if(i==3){
                     System.out.println(raf.readLine());
                }        
            }*///ez az első verzió ha tudjuk hány sorbo láll a szövegfájl
          
        
           String sor;
           int db= Integer.parseInt(raf.readLine());
       
              for (int i = 0; i <db; i++) {
                  sor=raf.readLine();
                  Fajlbeolv asd=new Fajlbeolv();
                  System.out.println(asd.neve(sor));
              }  //ez a második megoldás ha tudjuk hogy hány sor van ezt az első sorbol vettük ki!
           
          /*  
          String[] nevek = null; 
          int db=0;
          for(sor = raf.readLine(); sor != null; sor = raf.readLine())
          {
          db++;
          }
          nevek = new String[db];
          raf.seek(0); // ezzel  visszaugrik az első sorhoz tehát nullázzza magát 
          db = 0;
    
          for( sor = raf.readLine(); sor != null; sor = raf.readLine() )
          {  
          nevek[db] = sor;
            db++;
           
          }
          for (int i = 0; i < db; i++) {
               System.out.println(nevek[i]);
          }
          raf.close();  
          System.out.println("Fájl beolvasva!");*///ez a harmadik megoldás ha nemtudjuk hogy hány sor 
        }
        catch( IOException e )
        {
            System.out.println("HIBA");
        }     
    }
     public String neve(String row){
                String [] mezok=row.split(" ");
                this.vNEv=mezok[0];
                this.kNev=mezok[1];
                String neve="Vezetéknév: "+vNEv+" Keresztnév: "+kNev;  
                return neve;
          }
    //1.létrehozzuk az adat szerkzetet!
    
    //public class Adatok{
     /*   int hour;
        int min;
        int sec;
        int sec2;
        char kar;*/
       
      //  public Adatok(){
            
         
            
        /*  this.hour=Integer.parseInt(mezok[0]);
            this.min=Integer.parseInt(mezok[1]);
            this.sec=Integer.parseInt(mezok[2]);
            this.sec2=Integer.parseInt(mezok[3]);
            this.kar=mezok[4].charAt(0);*/
    }
    

