import java.util.*;
public class EncryptionProgram {

    private Scanner scanner;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private String line;
    private char[] letters;
    private char[] secretLetters;

    EncryptionProgram() {
        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList();
        shuffledList = new ArrayList();
        character = ' ';


        newKey();
        askQuestion();
    }

    private void askQuestion(){
        while (true) {
            System.out.println("************************************************");
            System.out.println("whatcha doing");
            System.out.println("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (Q)uit");
            char res = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch (res) {
                case 'N' -> newKey();
                case 'G' -> getKey();
                case 'E' -> encrypt();
                case 'D' -> decrypt();
                case 'Q' -> quit();
                default -> System.out.println("Not a valid answer");
            }
        }
    }

    private void newKey() {

    }

    private void getKey() {

    }

    private void encrypt() {

    }

    private void decrypt() {

    }

    private void quit() {

    }
}
