package rewards.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Entity class for Transaction table
 *
 * @author Bhawna Sharma
 */

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    private Long transactionId;
    private String customerId;
    private Float transactionAmount;
    private Timestamp transactionTimestamp;

    public Transaction(Long transactionId, Float amount, Timestamp transactionTimestamp, String customerId) {
        this.transactionId = transactionId;
        this.transactionAmount = amount;
        this.transactionTimestamp = transactionTimestamp;
        this.customerId = customerId;
    }

    public Transaction() {
    }

    public Long getId() {
        return transactionId;
    }

    public Float getAmount() {
        return transactionAmount;
    }

    public Timestamp getTransactionTimestamp() {
        return transactionTimestamp;
    }

    public String getCustomerId() {
        return customerId;
    }
}
