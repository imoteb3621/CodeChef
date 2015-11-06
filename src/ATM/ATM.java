package ATM;

import java.util.Scanner;

/**
 * @author taner on 2015-11-06.
 */
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double withdraw = sc.nextDouble();
        double balance = sc.nextDouble();

        if (withdraw % 5 == 0 && withdraw < (balance - 0.50)) {
            System.out.println(balance - (withdraw + 0.50));
        } else {
            System.out.println(balance);
        }
    }
}
