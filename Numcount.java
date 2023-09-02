import java.util.Scanner;
public class Numcount {
    public static void main(String[] args){
        Scanner cc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n= cc.nextInt();
        System.out.print("Enter single integer to count:");
        int f = cc.nextInt();
        int count=0;
        while(n!=0){
                int r=n%10;
                if(r==f){
                    count++;
                }
                n=n/10;
        }
        System.out.println(count);

    cc.close();
    }
    
}
