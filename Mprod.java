import java.util.Scanner;
public class Mprod {
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers");
        a=cc.nextInt();
        b=cc.nextInt();
        System.out.println("Product = "+Product(a,b));
        cc.close();

    }
    static int Product(int a,int b){
        return(a*b);

    }
    
}
