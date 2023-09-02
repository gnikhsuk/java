import java.util.Scanner;
public class Sumonn {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter n numbers:");
        int s=0;
        while(true){
            int n= cc.nextInt();
            s=s+n;
            if(n==0)
            break;

        }
        System.out.println("Sum = "+s);
        cc.close();

    }
}
