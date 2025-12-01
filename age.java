class WrongAgeException extends Exception{
    public WrongAgeException(String message){
        super(message);
    }
}
class Father{
    int fatherage;
    public Father(int fatherage) throws WrongAgeException{
        if(fatherage<0){
            throw new WrongAgeException("Age can't be less than O\n");
        }
        this.fatherage=fatherage;
    }
}
class son extends Father{
    int sonage;
    public son(int fatherage,int sonage) throws WrongAgeException{
        super(fatherage);
        if(sonage<0){
            throw new WrongAgeException("Son age can't be less than 0\n");
        }
        if(sonage>=fatherage){
            throw new WrongAgeException("Son age can't be greater than or equal to father age\n");
        }
        this.sonage=sonage;
    }
}

public class age {
    public static void main(String[] args){
        try{
            
            son s1=new son(50,45);
            System.out.println("Son age is:"+s1.sonage);
            Father f1=new Father(50);
            System.out.println("Father age is:"+f1.fatherage);
            son s2=new son(45,50);
            System.out.println("son age is:"+s2.sonage);

        }
        catch(WrongAgeException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
    
}
