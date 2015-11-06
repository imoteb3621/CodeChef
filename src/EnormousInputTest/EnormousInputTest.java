package EnormousInputTest;

import java.util.Scanner;

/**
 * @author taner on 2015-11-06.
 */
public class EnormousInputTest {
    public static void main(String[] args) {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0;i<lines;i++){
            int check = sc.nextInt();
            if(check%k == 0){
                total++;
            }
        }
        System.out.println(total);
    }
}
