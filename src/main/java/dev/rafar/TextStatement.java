package dev.rafar;

import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        StringBuilder result = new StringBuilder("Rental Record for " + aCustomer.getName() + "\n");
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            //show figures for this rental
            result.append("\t")
                    .append(each.getMovie().getTitle())
                    .append("\t")
                    .append(each.getCharge())
                    .append("\n");
        }
        //add footer lines
        result.append("Amount owed is ").append(aCustomer.getTotalCharge()).append("\n");
        result.append("You earned ").append(aCustomer.getTotalFrequentRenterPoints()).append(" frequent renter points");
        return result.toString();
    }
}