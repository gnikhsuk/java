import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner cc = new Scanner(System.in);
        int n= cc.nextInt();
        int r,rev=0;
        for(int i=n;i>0;i=i/10){
            r=i%10;
            rev=rev*10+r;
        }
        
        if(rev==n){
            System.out.println("Palindrome");
        }
        else
        System.out.println("Not Palindrome");
        cc.close();
    }
}
