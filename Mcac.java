import java.util.Scanner;
public class Mcac{
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
        int r;
        System.out.println("Enter radius:");
        r=cc.nextInt();
        Circle(r);
        
        cc.close();
    }
    static void Circle(int r){
        double a,p;
        a=3.14*r*r;
        p=2*3.14*r;
        System.out.println("Area of circle = "+a);
        System.out.println("Circumference = "+p);
    }
}