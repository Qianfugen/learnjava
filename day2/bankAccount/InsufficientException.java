import java.io.*;

public class InsufficientException extends Exception{
    private double amount;
    public InsufficientException(double amount){
        this.amount=amount;
    }

    public double getAmount(){
        return amount;
    }
}
