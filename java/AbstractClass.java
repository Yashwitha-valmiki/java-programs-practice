// . Write a Java program using an abstract class Bank with an abstract method
// rateOfInterest(). Create subclasses SBI, HDFC, ICICI to return different interest
// rates.

abstract class Bank{
    abstract double rateofInterest();

}

class SBI extends Bank{
    @Override
    double rateofInterest(){
        return 7.5;
    }
}

class HDFC extends Bank{
    @Override
    double rateofInterest(){
        return 8.0;
    }
}

class ICICI extends Bank{
    @Override
    double rateofInterest(){
        return 8.5;
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();
        System.out.println("Rate of interest for SBI:"+b1.rateofInterest()+"%");
        System.out.println("Rate of interest for HDFC:"+b2.rateofInterest()+"%");
        System.out.println("Rate of interest for ICICI:"+b3.rateofInterest()+"%");
    }
}
