import java.util.Scanner;
interface staff{
    public void perform_duties();
}
class doctor implements staff{
    public void perform_duties(){
        System.out.println("Doctor treating the patient");

    }

}
class nurse implements staff{
    public void perform_duties(){
        System.out.println("Nurse taking care of the patient");
    }
}
class technician implements staff{
    public void perform_duties(){
        System.out.println("Technician checks the equipments");
    }
}

public class work {
    public static void main(String[] args){
        staff[] s1={new doctor(),new nurse(),new technician()};
        for(staff s:s1){
            s.perform_duties();
        }
    }
    
}
