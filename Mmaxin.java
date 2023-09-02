import java.util.Scanner;

public class Mmaxin {
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a,b,c;
        a=cc.nextInt();
        b=cc.nextInt();
        c=cc.nextInt();
        Max(a,b,c);
        Min(a,b,c);

    cc.close();
    }
    static void Max(int a,int b,int c){
        System.out.print("Max:");
       if(a>b && a>c){
           System.out.println(a);
       }
       if(b>a && b>c){
        System.out.println(b);
       }
       if(c>a && c>b){
       System.out.println(c);
       }

    }
    static void Min(int a,int b,int c){
        System.out.print("Min:");
        if(a<b && a<c){
            System.out.print(a);
        }
        if(b<a && b<c){
            System.out.print(b);
        }
        if(c<a && c<b){
        System.out.print(c);
        }
    }
}
