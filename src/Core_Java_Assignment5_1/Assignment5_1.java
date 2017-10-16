package Core_Java_Assignment5_1;

abstract class Bank  
{
    // Abstract Method
    public abstract float RateOfInterest();
}


class Sbi extends Bank 
{
    
	//Implementation of Abstract Method 
	
    public float RateOfInterest()
    {
        return 8.35f;
    }
}

class Pnb extends Bank 
{
    //Implementation of Abstract Method
    public float RateOfInterest()
    {
        return 8.65f;
    }
}

public class Assignment5_1 
{

    public static void main(String[] args) // main method starts
    {
        // TODO Auto-generated method stub
        
        
        Bank sbi =new Sbi(); 
        Bank hdfc =new Pnb(); 
        
        
        System.out.println("Home Loan Interest rate for SBI Bank is : "+sbi.RateOfInterest()+"%"); // accessing the implementation of abstract method using Sbi class
        
        System.out.println("Home Loan Interest rate for PNB Bank is : "+hdfc.RateOfInterest()+"%"); // accessing the implementation of abstract method using hdfc class

    }

}