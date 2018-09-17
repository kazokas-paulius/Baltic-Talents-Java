package lt.baltictalents._7nd.Fourth_and_FifthND.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {
    private LocalDate date;
    private String customer;
    private BigDecimal amount;

    public Invoice(LocalDate date, String customer, BigDecimal amount) {
        this.date = date;
        this.customer = customer;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCustomer() {
        return customer;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
