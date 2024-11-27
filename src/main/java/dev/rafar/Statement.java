package dev.rafar;

import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = headerString(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += eachRentalString(each);
        }

        result += footerString(aCustomer);
        return result;
    }

    protected abstract String headerString(Customer aCustomer);

    protected abstract String eachRentalString(Rental rental);

    protected abstract String footerString(Customer aCustomer);
}