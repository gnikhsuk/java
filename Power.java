import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.print("Enter base & power:");
        int x= cc.nextInt();
        int n= cc.nextInt();
        cc.close();
        int i,y=1;
        
        for(i=1;i<=n;i++){
            y=y*x;
        }
        System.out.print(" "+y);
        

    }
}
