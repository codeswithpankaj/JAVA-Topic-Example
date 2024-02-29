package Day_07;

public class MultiArray {
    
    public static void main(String[] args) {
        

        int data[][] = new int[3][3];
        
        data[0][0] = 21;
        data[1][0] = 22;
        data[2][0] = 23;

        data[0][1] = 24;
        data[1][1] = 25;
        data[2][1] = 26;

        data[0][2] = 27;
        data[1][2] = 28;
        data[2][2] = 29;

        // System.out.println("Data : "+data[1][2]);

        for(int a = 0 ; a < 3 ; a++ ){

            for(int i = 0; i < 3 ; i++){

                System.out.print(" "+data[a][i]);
            }

            System.out.println();
        }

    }

}
