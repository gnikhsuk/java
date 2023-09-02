import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        System.out.print("Enter numbers:");
        Scanner cc = new Scanner(System.in);
        Integer num1 = cc.nextInt();
        int num2 = cc.nextInt();
        cc.close();
        System.out.println(num1+num2);
        System.out.println(num1*num2);
    }
}
