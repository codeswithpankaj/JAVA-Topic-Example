package Day_07;

import java.util.Scanner;

public class MultiArrayUserInput {
    public static void main(String[] args) {
        
        //create a Scanner class object
        Scanner sc = new Scanner(System.in);

        int col,row;

         System.out.println("Enter Row Numbers ");
         row = sc.nextInt();
         System.out.println("Enter Col Numbers ");   
         col = sc.nextInt();
         int data[][] = new int[row][col];

         for(int a = 0 ; a < row ; a++ ){

            for(int i = 0 ; i < col ; i ++){

                System.out.println("Enter Element into Array = "+a+i);
                data[a][i] = sc.nextInt();

            }
            
            System.out.println();

         }

         System.out.println("----------------------output-------------------");

         for(int a = 0 ; a < row ; a++ ){

            for(int i = 0 ; i < col ; i ++){

                System.out.print(" "+data[a][i]);

            }
            
            System.out.println();

         }

    }
}
