import java.util.Scanner;

class employee{
    String name;
    double salary;
    public employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    employee comparesalary(employee e){
        if(this.salary>e.salary){
            return this;
        }
        else{
            return e;
        }
        
}
void display(){
    System.out.println("name:"+name+"\n"+"salary:"+salary);

}
}
public class naukar {
    public static void main(String[] args){
        employee e1= new employee("Mandeep",5200000);
        employee e2=new employee("Kushagra",6000);
        employee e=e1.comparesalary(e2);
        e.display();

    }
    
}
