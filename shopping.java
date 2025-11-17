import java.util.Scanner;
interface discount{
    public double apply(double price);
}
class dis1 implements discount{
    public double apply(double price){
        price=price-(price*0.2);
        System.out.println("20% discount applied\nFinal price is:");
        
        return price;
    }
}
class dis2 implements discount{
    public double apply(double price){
        price=price-(price*0.1);
        System.out.println("10% discount applied\nFinal price is:");
        
        return price;
    }
}
class dis3 implements discount{
    
    public double apply(double price){
        price=price-(price*0.3);
        System.out.println("30% disocunt applied\nFinal price is:"+price);
        
        return price;
    }
}

public class shopping {
    public static void display(discount d,double price){
        System.out.println(d.apply(price));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price");
        double price=sc.nextDouble();
        discount d1=new dis1();
        discount d2=new dis2();
        discount d3=new dis3();

        display(d1,price);
        display(d2,price);
        display(d3,price);



    }
    
}
