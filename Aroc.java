import java.util.Scanner;
public class Aroc {
    public static void main(String[] args){
        Scanner cc = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        float r=cc.nextInt();
        System.out.println("Area of circle="+r*3.14*3.14);
        cc.close();
    }
}
