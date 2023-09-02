import java.util.Scanner;

public class Arot {
    public static void main(String[] args){
     Scanner cc= new Scanner(System.in);
     System.out.print("Enter Sides of triangle:");
     int a=cc.nextInt();
     int b=cc.nextInt();
     int c=cc.nextInt();
     float s=(a+b+c)/2;
     float ar = s*(s-a)*(s-b)*(s-c);
     System.out.println("Area of triangle="+Math.pow(ar,0.5));
    cc.close();
    }
}
