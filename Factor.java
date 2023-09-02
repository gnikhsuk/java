import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
        System.out.print("Enter number:");
        int n= cc.nextInt();
        System.out.println("Factors are:");
        for(int i=2;i<=n;i++){
            int a;
            a= n%i;
            if(a==0){
                System.out.print(" "+i);
            }

        }

        cc.close();
    }
    
}
