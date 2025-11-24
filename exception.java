import java.util.Scanner;


public class exception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] arr=new String[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter "+(i+1)+"student name:");
            
            String name=sc.nextLine();
            if(name.isEmpty()){
                arr[i]=null;
            }
            else{
                arr[i]=name;
            }
            

        }
       for(int i=0;i<5;i++){
        try{
            
            System.out.println("Length of"+arr[i]+" is:"+arr[i].length());
        }
        catch(NullPointerException e){
            
            System.out.println("Error:Name is Null");
            
        }
       }

    }
    
}
