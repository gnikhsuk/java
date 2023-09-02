import java.util.Scanner;
public class Fact {

    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
        System.out.print("Enter number:");
        int n= cc.nextInt();
        cc.close(); 
        int f=1,i,fs=0;
        for(i=1;i<=n;i++){
            f=f*i;
            fs=fs+f;
        }
        System.out.println("Factorial= "+f +"\r\nThe sum of factorial= "+fs);
    
     
    }
    
}
