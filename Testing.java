import java.util.*;
public class Testing {
  
  public static void main(String[] args)
  {
    //Hello World Output
    System.out.println("Hello World!");
    
    //Change Maker
    int total = 10;
    int billGiven = 50;
    int changeDue = billGiven - total;
    System.out.println(changeDue);
    
    //Better Change Maker
    double total2 = 10.23;
    double amountGiven = 50.00;
    double changeDue2 = (amountGiven - total2);
    System.out.printf("Change due: %.2f%n", changeDue2);
    
    //Even Better Change Maker
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter Total:");
    double total3 = scan.nextDouble();
    
    System.out.println("Enter Amount Given:");
    double amountGiven3 = scan.nextDouble();
    
    double changeDue3 = amountGiven3 - total3;
    System.out.printf("Change due: %.2f%n", changeDue3);
    
    //Simple Array Configuration
    int arr[] = {1, 2, 3, 4, 5};
    System.out.println(arr[3]);
    
    
  }
  
}
