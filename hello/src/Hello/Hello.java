package Hello;

import java.util.Scanner;

public class Hello {
   public static void main(String[] args) {
        System.out.println("hello world!");
        Scanner in = new Scanner(System.in);
        // System.out.println("echo:" + in.nextLine());
        int price = in.nextInt();
        in.close();
        System.out.println("100 + " + price + " = " + (100 + price));
   }
}
