import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
        System.out.println("Enter number:");
        float n=cc.nextInt();
        cc.close();
        float i,s=0.0f;
        float a=1.0f;
        for(i=1;i<=n;i++){
            s=s+i;
            
        }
        a=s/n;
        System.out.println("Average = "+a);
    
    }
    
}
