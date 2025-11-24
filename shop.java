import java.util.Scanner;

public class shop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={99,98,95,96,94};
        System.out.println("Enter index of the product whose price you want to check:");
        int i=sc.nextInt();
        try{
            System.out.println("Price of that product is:"+arr[i]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error:Please enter index in the range of 0 to 4");
        }
    }
    
}
