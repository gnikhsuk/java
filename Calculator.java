import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner cc = new Scanner(System.in);
        System.out.print("Choose Operation:"+"\r\n"+"* to multiply:"+"\r\n"+"+ to add"+"\r\n"+"- to subtract:"+"\r\n"+"% to divide:");
        char a= cc.next().trim().charAt(0);
        
        int b=0;
        while(b<1){
        System.out.println("Enter two numbers:");
        int num1,num2;
        float result=0;
        num1 = cc.nextInt();
        num2 = cc.nextInt();
            if(a=='*'){
                result=num1*num2;
            }
            if(a=='+'){
                result=num1+num2;
            }
            if(a=='-'){
                result=num1-num2;
            }
            if(a=='/'){
                result=num1/num2;
            }
            if(a!='+'&&a!='-'&&a!='/'&&a!='*'){
            System.out.println("Invalid Input!");
            }
            System.out.println(result);
            // b++;
        }
      cc.close();  
    
    }
}
