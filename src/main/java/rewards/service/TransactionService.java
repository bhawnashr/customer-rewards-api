package rewards.service;

import rewards.dto.TransactionRewardsDto;

/**
 * An interface which defines method to get transaction rewards for requested customerId
 *
 * @author Bhawna Sharma
 */
public interface TransactionService {

    TransactionRewardsDto getTransactionRewards(String customerId);
}



