package discount;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Please Enter the Primiry Price");
        int price = input.nextInt();
        double discount = 0.0;
        double discountAmount = 0.0;
        double finalPrice;

        if (price >= 5000) 
            discount = 0.2;
        else if (price >= 1000) 
            discount = 0.1;
        else 
            discount = 0.05;
        
        discount *= 100;
        discountAmount = price*discount/100;
        finalPrice = price - discountAmount;
        
        System.out.println("the discount = " + discount + "%");
        System.out.println("the final Price = " + finalPrice);
    }

}
