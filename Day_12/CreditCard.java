
package Day_12;
import Day_11.Single.*;

/**
 * CreditCard
 */
interface FixCreditLimit {

   public void creditlimit10x();
   public void creditlimit20x();
   public void creditlimit30x();
    
}

class CreditCard extends BookPrice implements FixCreditLimit {


    void creditcard_info(){
        System.out.println("HDFC Bank Credit Card - 009012");
    }

    public  void creditlimit10x(){
        System.out.println("100000/-");
    }
    public void creditlimit20x(){

    }
   
    public void creditlimit30x(){

    }

    

}


