import java.util.Scanner;
public class Pnsofdgt {
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
        System.out.print("Enter number:");
        int n=cc.nextInt();
        int p=1,s=0,r,i;
        cc.close();
        for(i=n;i>0;i/=10){
            r=i%10;
            s=s+r;
            p=p*r;
        }
        System.out.println("Difference of Product and sum of Digit "+n+" is "+(p-s));
        
    }
}
