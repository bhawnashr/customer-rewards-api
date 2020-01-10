package rewards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rewards.domain.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Transaction Repository to fetch Transactions for requested customerId
 *
 * @author Bhawna Sharma
 */

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByCustomerId(String customerId);
}
