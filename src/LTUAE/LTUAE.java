package LTUAE;

import java.util.Scanner;

/**
 * @author taner on 2015-11-06.
 */
public class LTUAE {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int userInput = sc.nextInt();
            if(userInput != 42){
                System.out.println(userInput);
            }else{
                System.exit(0);
            }

        }
    }
}
