package nevezzunk;


public class Metodusok {
     public static String firstUpper(String nev){
    String szoveg = nev;
     
    char[] charArray = szoveg.toCharArray();
    boolean uresHely = true;

    for(int i = 0; i < charArray.length; i++) {

      // if the array element is a letter
      if(Character.isLetter(charArray[i])) {

        // check space is present before the letter
        if(uresHely) {

          // change the letter into uppercase
          charArray[i] = Character.toUpperCase(charArray[i]);
          uresHely = false;
        }
      }

      else {
        // if the new character is not character
        uresHely = true;
      }
    }
      szoveg = String.valueOf(charArray);
      return szoveg;
    }
}
