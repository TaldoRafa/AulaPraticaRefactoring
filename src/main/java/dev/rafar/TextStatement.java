package dev.rafar;

public class TextStatement extends Statement {
    @Override
    protected String headerString(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    @Override
    protected String eachRentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() +
                "\t" + rental.getCharge() + "\n";
    }

    @Override
    protected String footerString(Customer aCustomer) {
        return "Amount owed is " + aCustomer.getTotalCharge() + "\n" +
                "You earned " + aCustomer.getTotalFrequentRenterPoints() + " frequent renter points";
    }
}