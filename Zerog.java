import java.util.Scanner;
public class Zerog {
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
        int s=0;
       while(true){
            System.out.println("Enter number:");
            int i=cc.nextInt();
            s=s+i;
            if(i==0){
                
                System.out.println("GAME OVER!"+"\r\n"+"Your Score:"+s);
            break;
        }
        }
    cc.close(); 
    }
    
}
