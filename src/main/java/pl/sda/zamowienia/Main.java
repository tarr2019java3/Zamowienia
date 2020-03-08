package pl.sda.zamowienia;

import pl.sda.zamowienia.exceptions.price.AgeException;
import pl.sda.zamowienia.exceptions.price.CustomerNameException;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("TOMASZ", "BOGDAN", 18, "TOMASZ@BOGDAN.PL");
        try {
            customer1.setAge(15);
        } catch (AgeException e) {
            e.printStackTrace();
        }
        System.out.println("Lecimy");

        try {
            customer1.setName("tomek");
        } catch (CustomerNameException e) {
        e.printStackTrace();
        }
        System.out.println("lecimy dalej");
    }
}
