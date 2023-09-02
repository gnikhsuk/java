import java.util.Scanner;
public class Rev {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner cc = new Scanner(System.in);
        int n = cc.nextInt();
        int f=0,d;
        for(int i=n;i>0;i=i/10){
                d=i%10;
                f=f*10+d;
        }
        System.out.println("rev:"+f);
   
   cc.close(); }
    
}
