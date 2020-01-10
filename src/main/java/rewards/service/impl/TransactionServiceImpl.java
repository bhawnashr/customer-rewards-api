package rewards.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rewards.domain.Transaction;
import rewards.dto.TransactionRewardsDto;
import rewards.repository.TransactionRepository;
import rewards.service.TransactionService;

import static rewards.util.DateUtil.getYearMonth;
import static rewards.util.RewardCalculator.calculateReward;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * An Implementation of TransactionService, provides method to get transaction rewards for requested customerId
 *
 * @author Bhawna Sharma
 */
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    /***
     * returns dto object which contains rewards for each month and total rewards of a given customer
     * @param customerId Id of the customer whose reward information we want see.
     * @return TransactionRewardsDto
     */
    public TransactionRewardsDto getTransactionRewards(String customerId) {
        List<Transaction> transactions = transactionRepository.findByCustomerId(customerId);
        Map<String, Integer> monthlyRewardsMap = transactions.stream().collect(Collectors.groupingBy(transaction -> getYearMonth(transaction.getTransactionTimestamp()),
                Collectors.summingInt(transaction -> calculateReward(transaction.getAmount().intValue()))));
        Integer totalRewards = monthlyRewardsMap.values().stream().mapToInt(p -> p.intValue()).sum();
        return new TransactionRewardsDto(monthlyRewardsMap, totalRewards);
    }
}
