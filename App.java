import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.print("Enter Name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello,"+ name +"!");
        input.close();

    } 
        
    
}
