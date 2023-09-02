import java.util.Scanner;
public class Avganynum {
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
        System.out.println("Enter numbers and enter zero to get average:");
        float s=0.0f,i=0.0f;
        while(true){
            int n= cc.nextInt();
            s=s+n;
            i++;
            if(n==0)
            break;
        }
        cc.close();
       float a = s/(i-1);
       System.out.println("Average of numbers = "+a);


    }
}
