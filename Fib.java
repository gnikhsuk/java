import java.util.Scanner;
public class Fib{
public static void main(String[] args) {
    System.out.print("Enter number of terms:");
    Scanner input = new Scanner(System.in);
    int n= input.nextInt();
    int a,b=-1,c=1;
    for(int i=0;i<n;i++){

      a=b+c;
      b=c;
      c=a;

        System.out.println(a);
}
input.close();
}
}