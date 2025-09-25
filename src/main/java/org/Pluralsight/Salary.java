package org.Pluralsight;


import java.time.Duration;

public class Salary {
    public static void main(String[] args) {
        double bob_salary = 100000;
        double gary_salary = 90000;
        double highest_salary = (Math.max(gary_salary , bob_salary));
        System.out.println(highest_salary);

        double carPrice = 60000.0;
         double truckPrice =70000.0;
         System.out.println(carPrice + truckPrice);

         double radius = 7.25;
         double  area = Math.PI * Math.pow(radius, 2);
         System.out.println("The area of the circle is " + area + radius);

         double num1 = 5.0;
         double sqrtNum1 = Math.sqrt(num1);
        System.out.println("The square root of " + num1 + sqrtNum1 );

        System.out.println(Math.hypot(5, 10) +(85 + 10));

        System.out.println(Math.abs(-3.8));

        int minuteIntoHour = 60;

        double minuteIntoDay = Math.multiplyExact(24, minuteIntoHour);
        System.out.println(minuteIntoDay + minuteIntoHour);


    }
}
