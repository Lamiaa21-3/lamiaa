
package javaapplication;

import javax.xml.crypto.Data;

public class Account
{
   private double annuaInterestRate; 
     private double id;
 private double balance; 
    
   
    public Account()
    {
        balance = 0;
        annuaInterestRate = 0;
          id =0 ;
        
    }

    public Account( double id ,double amount ,double rate )
    {
       this.id = id; balance = amount;
        annuaInterestRate = rate  ;

       
    }
 public void setid(int newid)
    {
     id=new id ;
     }
 public double getInterestRate()
    {
        return annuaInterestRate;
    }

    public double getBalance()
    {
        return balance;
    }
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

     public void setInterest(double rate)
    {
        balance = balance + balance * rate;
   
    }
      public void getMonthlyInterestRate( )
    {
       
  annuaInterestRate= annuaInterestRate *100 / 12;
    }
         public double getid()
    {
        return id;
    }
   

  
}

package javaapplication;


public class JavaApplication {

    public static void main(String[] args)
    {
        Account acc1 = new Account(222333,55500,5.6);
       
         acc1.withdraw(5550);
         acc1.deposit(70000);
         acc1.getBalance();
         acc1.getInterestRate();
  acc1.getMonthlyInterestRate();
        

    }

}
