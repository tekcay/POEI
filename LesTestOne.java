class Atester {
    static public Integer calcul1(int var) {
        return 5 * var;
    }


    static public String presentation(String n) {
        //If input string is empty, returns empty
        if (n.equals("")) return "";

        //takes the first character of the String
        String firstCharacter = Character.toString(n.charAt(0));

        //If the first character can't be transformed to UpperCase,
        //e.g if it is a number, catches the exception and returns the input String
        try {
            return firstCharacter.toUpperCase() + n.substring(1).toLowerCase();
        } catch (Exception e) {
            return n;
        }
    }

    static boolean isBisextile(int annee) {
        return annee % 4 == 0;
    }



} 


public class LesTestOne {
    public static void main(String[] args) {

        if (Atester.calcul1(3) == 15)
            System.out.println("OK");

        if (Atester.calcul1(0) == 0)
            System.out.println("OK");

        if (Atester.calcul1(1) == 5)
            System.out.println("OK");

        /* ******************************* */

        if (Atester.presentation("toto").equals("Toto"))
            System.out.println("OK");
        else
            System.out.println("KO");
 
        if (Atester.presentation("TOTO").equals("Toto"))
            System.out.println("OK");
        else
            System.out.println("KO");
 
        if (Atester.presentation("").equals(""))
            System.out.println("OK");
        else
            System.out.println("KO");
 
        if (Atester.presentation("1234567890").equals("1234567890"))
            System.out.println("OK");
        else
            System.out.println("KO");

        if (Atester.isBisextile(2008)) System.out.println("OK");
        else System.out.println("KO");
    }    
}