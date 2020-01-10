package rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import rewards.dto.TransactionRewardsDto;
import rewards.service.TransactionService;

/**
 * Controller class to handle customer reward api requests
 *
 * @author Bhawna Sharma
 */
@RestController
public class RewardsController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/customer-rewards-api/transaction/{customerId}")
    public TransactionRewardsDto getCustomerRewards(@PathVariable(name = "customerId") String customerId) {
        return transactionService.getTransactionRewards(customerId);
    }


}