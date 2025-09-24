package org.Pluralsight;

public class Reciept {
    public static void main(String[] args) {
        String item = " 3 apples for $";
        double price = 7.10;
        System.out.println("You bought " + item + String.format("%.2f", price));
    }
}
