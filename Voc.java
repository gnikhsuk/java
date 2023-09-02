import java.util.Scanner;
public class Voc {
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
        System.out.print("Enter letter:");
        String letter=cc.next();
        String ss=letter;
        // switch (letter){
        //     case "a":
        //     case "e":
        //     case "i":
        //     case "o":
        //     case "u":
        //     System.out.println("It's Vowel");
        //     break;
        //     default:
        //     System.out.println("It's Consonant");
        // }
    //Simple form of above statement:
        switch (letter){
            case "a","e","i","o","u" -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
        if(letter.equals(ss)){
            System.out.println("yes");
        }

    cc.close();    
    }
}
