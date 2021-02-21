package Package;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your most recent credit card statement: ");
    String str= sc.nextLine();
    System.out.println("Thank you. ");
    String[] arrOfStr = str.split(",");
    HashMap<String, String> transactions = new HashMap<>();

    for(int i = 2; i < arrOfStr.length; i+=3) {
      transactions.put(arrOfStr[i], arrOfStr[i-1]);
    }

    System.out.println("Here is your spending report:");
    System.out.println(transactions);


  }

}
