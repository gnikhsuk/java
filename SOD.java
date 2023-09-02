import java.util.Scanner;

public class SOD {
    public static void main(String[] args) {
        System.out.print("Enter Number:");
        Scanner cc = new Scanner(System.in);
        int num = cc.nextInt();
        cc.close();
        int r,i,temp=num,s=0;
        for(i=temp;i!=0;i=i/10){
            r=i%10;
            s=s+r;
        }
        System.out.println(s);
    }
}
