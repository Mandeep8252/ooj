class calgrade{
    int marks;
    int percentage;
    void calculategrade(int marks){
        if(marks>=90){
            System.out.println("grade is A");
        }
        else if(marks>=80){
            System.out.println("grade is B");

        }
        else if(marks>=70){
            System.out.println("grade is C");
        }
        else if(marks>60){
             System.out.println("grade is D");

        }
        else if(marks>=50){
             System.out.println("grade is E");
        }
        else{
             System.out.println("Sorry You Failed");
        }
    }
    void calculategrade(int marks1,int marks2,int marks3){
        double avg=(marks1+marks2+marks3)/3;
        System.out.println("avg is:"+avg);
        if(avg>=90){
            System.out.println("grade is A");

        }
        else if(avg>=80){
            System.out.println("grade is B");
        }
        else if(avg>=70){
            System.out.println("grade is C");
        }
        else if(avg>=60){
            System.out.println("grade is D");
        }
        else if(avg>=50){
            System.out.println("grade is E");
        }
        else{
            System.out.println("Sorry you failed");
        }
    }
        void calculategrade(double per){
            if (per>=90){
                System.out.println("grade is A");
            }
            else if(per>=80){
                System.out.println("grade is B");
            }
            else if(per>=70){
                System.out.println("grade is C");
            }
            else if(per>=60){
                System.out.println("grade is D");
            }
            else if(per>=50){
                System.out.println("grade is E");
            }
            else{
                System.out.println("Sorry you failed");
            }
        }
    }








public class grade {
    public static void main(String[] args){
        calgrade c=new calgrade();
        c.calculategrade(95);
        c.calculategrade(95,96,97);
        c.calculategrade(93);
    }
    
}
