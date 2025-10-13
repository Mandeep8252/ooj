import java.util.Scanner;
public class sumofseries {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter upto which you want sum:");
        int n=input.nextInt();
        double i;
        double sum=0.0;
        for (i=1;i<=n;i++){
            double m=1/(i*i);
            sum=sum+m;
            
           


        }
        System.out.println("The sum is:"+sum);

    }
    
}
