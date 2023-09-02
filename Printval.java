import java.util.Scanner;
public class Printval {
    // public static void main(String[] args) {
    //     Scanner cc = new Scanner(System.in);
    //     int a = cc.nextInt();
    //     cc.close();
    //     System.out.println(a);

    // }
    // 
     public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = cc.nextInt();
        int[] arr = new int[100];
        for(int i=0;i<n;i++){
            
            arr[i]= cc.nextInt();
            
        }
        int sum=0;
        for(int i=0;i<n;i++){
            
            // System.out.print(arr[i]);
            
            sum=sum+arr[i];
            
        }
        System.out.println("Sum is"+sum);
        cc.close();
        

    }
    // public static void main(int args) {
    //     Scanner cc = new Scanner(System.in);
    //     System.out.print("Enter size of row:");
    //     int n = cc.nextInt();

    //     System.out.print("Enter size of column:");
         
         
    //      int m= cc.nextInt();
    //     int[][] arr = new int[10][10];
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //         arr[i][j]= cc.nextInt();
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //         System.out.print(arr[i][j]);
    //         }
    //         System.out.println();
    //     }
    

    }

    

