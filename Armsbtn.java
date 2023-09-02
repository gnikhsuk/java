import java.util.Scanner;
public class Armsbtn {
    public static void main(String[] args){
        Scanner cc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int num1= cc.nextInt();
        int num2 = cc.nextInt();
        cc.close();
        int i,j,rem;
        i=num1;
        while(i<=num2){
                int sum=0;
                j=i;
                for(j=i;j>0;j=j/10){
                    rem=j%10;
                    sum=sum+(rem*rem*rem);
                    }
                    //System.out.print(" "+sum);
                if(sum==i){
                    System.out.println(i+" is an armstrong number.");
                }
            //    System.out.print(" "+i);
            i++;
        }

    }
}