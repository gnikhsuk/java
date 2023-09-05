import java.util.Scanner;
public class Msum{
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter Numbers :");
        a=cc.nextInt();
        b=cc.nextInt();
        System.out.println("Sum = "+Sum(a,b));
        cc.close();

    }
    public static int Sum(int a,int b){
        return (a+b);
    }
}