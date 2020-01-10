package rewards.dto;

import java.util.Map;

/**
 * DTO class to return response to client
 *
 * @author Bhawna Sharma
 */
public class TransactionRewardsDto {

    Map<String, Integer> monthlyRewards;
    Integer TotalReward;

    public TransactionRewardsDto(Map<String, Integer> monthlyRewards, Integer TotalReward) {
        this.monthlyRewards = monthlyRewards;
        this.TotalReward = TotalReward;
    }

    public Map<String, Integer> getMonthlyRewards() {
        return monthlyRewards;
    }

    public Integer getTotalReward() {
        return TotalReward;
    }

}
