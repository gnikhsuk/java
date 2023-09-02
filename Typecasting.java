import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        System.out.println("Enter f to convert int to float:");
        System.out.println("Enter i to convert float to int:");
        Scanner cc= new Scanner(System.in);
        char a = cc.next().trim().charAt(0);
        if(a=='f'|| a=='F'){
            System.out.println("Enter number:");
            float n = cc.nextInt();
            System.out.println("Number ="+n);
             
        }
        if(a=='i'||a=='I'){
            System.out.println("Enter number:");
            float n = cc.nextFloat();
            int i = (int)(n);
            System.out.println("Number= "+i);
        }

        cc.close();

    }
    
}
