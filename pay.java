import java.util.Scanner;
interface payment{
    public boolean process(double amount);
}
class creditcard implements payment{
    public boolean process(double amount){
        if(amount>50000){
            System.out.println("Amount is above the allowed limit\n");
            return false;

        }
        else{
            System.out.println("Payment done\n");
            return true;
        }
    }
}
class upi implements payment{
    public boolean process(double amount){
        if(amount<=100000){
            System.out.println("Payment Done\n");
            return true;
        }
        else{
            System.out.println("Sorry the amount exceeds your daily limit\n");
            return false;
        }
    }
}
public class pay {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        payment p1;
        p1=new creditcard();
        System.out.println("Enter the amount you want to pay with credic card:");
        double amt=sc.nextDouble();
        p1.process(amt);
        p1=new upi();
        System.out.println("Enter the amount you want to pay with upi:");
        double amnt=sc.nextDouble();
        p1.process(amnt);
    }
    
}
