package BasicJava.day2;

public class VowelConsonant {
    public static void main(String[] args) {
        String wd = "X";
        VowelConsonant check = new VowelConsonant();
        check.checkChar(wd);

    }
    public void checkChar(String ltr){

        if(ltr == "a" || ltr == "A" || ltr == "e" || ltr == "E" || ltr == "i" || ltr == "I" ||
                ltr == "o" || ltr == "O" || ltr == "u" || ltr == "U" )
            System.out.println("Vowel");


        else if (ltr == "b" || ltr == "B" || ltr == "c" || ltr == "d" || ltr == "f" || ltr == "g" ||
                ltr == "h" || ltr == "j" || ltr == "k" || ltr == "l" || ltr == "m" || ltr == "n" || ltr == "p" || ltr == "q" || ltr == "r" || ltr == "s" ||
                ltr == "t" || ltr == "v" || ltr == "w" || ltr == "x" || ltr == "y" || ltr == "z" || ltr == "C" || ltr == "D" || ltr == "F" || ltr == "G" ||
                ltr == "H" || ltr == "K" || ltr == "L" || ltr == "M" || ltr == "J" || ltr == "N" || ltr == "R" || ltr == "P" || ltr == "Q" || ltr == "S" ||
                ltr == "T" || ltr == "V" || ltr == "W" || ltr == "X" || ltr == "Y" || ltr == "Z") {
            System.out.println("Consonant");


        }

    }
}

