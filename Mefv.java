import java.util.Scanner;

public class Mefv {
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
        System.out.print("Enter age:");
        int age=cc.nextInt();
        Vote(age);

        cc.close();
    }
    static void Vote(int a){
        if(a>=18){
            System.out.print("Eligible to vote :)");
        }
        else
        System.out.print("Not eligible to vote!");
    }

}
