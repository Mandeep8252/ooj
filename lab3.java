import java.util.Scanner;
class book{
    String name;
    String author;
    int price;
    int num_pages;  
    public book(String name, String author, int price, int num_pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;

    }
    public String toString(){
       return("name"+name+"\n"+"author"+author+"\n"+"price"+price+"\n"+"num_pages"+num_pages+"\n");
    }
 public void set_name(String name){
    this.name=name;
 }
 public void set_author(String author){
    this.author=author;
 }
 public void set_price(int price){
    this.price=price;
 }
 public void set_num_pages(int num_pages){
    this.num_pages=num_pages;
 }
 public String get_name(){
    return name;
 }
 public String get_author(){
    return author;
 }
 public int get_price(){
   return price;
 }
 public int get_num_pages(){
    return num_pages;
 }
 }
public class lab3 {
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of books:");
        int n=input.nextInt();
        input.nextLine();
        book[] books=new book[n];
        for(int i=0;i<n;i++){
            System.out.println("enter details of book"+(i+1));
            System.out.println("Enter name of book");
            String name=input.nextLine();
            System.out.println("Enter the author");
            String author=input.nextLine();
            System.out.println("Enter the price");
            int price=input.nextInt();
            input.nextLine();
            System.out.println("Enter the no. of pages:");
            int num_pages=input.nextInt();
            input.nextLine();
            books[i]=new book(name,author,price,num_pages);
        }
        System.out.println("---------Book Details--------");
        for(int i=0;i<n;i++){
            System.out.println(books[i]);
        }
        input.close();

    }
    
}
