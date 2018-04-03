/*
* Author: Jatinder Singh
*/


import java.util.*;


public class Main {
    public static void main(String[] args) {

        Line teller = new Line();

        for (int i = 0; i < 20; i++) {

            teller.addCustomer(new Customer(i));
            System.out.println("Customer " + i + " joins the line");

        }

        while (!teller.isEmpty()) {
            System.out.println(teller.nextCustomer() + " is being served " + teller.size() + " waiting in queue.");
        }

        System.out.println("Teller waiting");

    }
}
