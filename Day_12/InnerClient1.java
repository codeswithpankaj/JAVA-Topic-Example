package Day_12;

abstract class Client1 {
    
    abstract void getinfo();
    
    void get_data(){
        System.out.println("Client Data");
    }

}

/**
 * InnerClient1
 */
public class InnerClient1 extends Client1{

    
    void getinfo() {
        
    }

    
}
