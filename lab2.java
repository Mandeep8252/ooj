import java.util.Scanner;

class Student{
    String usn;
    String name;
    int[] marks=new int[5];
    int[] credits=new int [5];
    
    void acceptdetails(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter USN:");
        usn=sc.nextLine();
        System.out.println("enter name:");
        name=sc.nextLine();
        System.out.println("Enter credits:");
        for(int i=0;i<5;i++){
            credits[i]=sc.nextInt();
        }
        System.out.println("Enter marks:");
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
    }
    void display(){
        System.out.println("the details of the student are:");
        System.out.println("usn is:"+usn);
        System.out.println("name is:"+name);
        System.out.println("Credits are:");
        for(int i=0;i<5;i++){
            System.out.println("Credit" +(i+1)+"is" +credits[i]);
        }
        System.out.println("Marks are:");
        for (int i=0;i<5;i++){
            System.out.println("Marks of" +(i+1)+" Subject is" +marks[i]);

        }

    }
    double calculatesgpa(){
        int sum=0;
        int creditsum=0;
        for(int i=0;i<5;i++){
            sum+=credits[i]*gradepoint(marks[i]);
            creditsum+=credits[i];
        }
        double sgpa=(sum)/creditsum;
        return sgpa;
        
    }
    int gradepoint(int marks){
        if(marks>=90) return 10;
        else if(marks>=80) return 9;
        else if(marks>=70) return 8;
        else if(marks>=60) return 7;
        else if(marks>=50) return 6;
        else if(marks>=40) return 5;
        else{
            return 0;
        }





    }

}
public class lab2{
    public static void main(String[] args){
        Student s=new Student();
        s.acceptdetails();
        s.display();
        double sgpa=s.calculatesgpa();
        System.out.println("SGPA is:" +sgpa);


    }
}
