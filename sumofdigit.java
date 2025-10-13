import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the number");
       int a=input.nextInt();
       int sum=0;
       while(a>0){
        int digit=a%10;
        sum=sum+digit;
        a=a/10;
       }
       System.out.println(sum);

    }
    
}
