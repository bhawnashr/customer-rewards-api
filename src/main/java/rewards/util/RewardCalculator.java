package rewards.util;

/**
 * A utility class to calculate Rewards
 *
 * @author Bhawna Sharma
 */
public class RewardCalculator {
    /***
     * This function calculates Rewards if we provide it amount of a transaction.
     * A customer receives 2 points for every dollar spent over $100 in each transaction,
     * plus 1 point for every dollar spent over $50 in each transaction.
     * @param transactionAmount amount of a single transaction
     * @return reward
     */
    public static int calculateReward(Integer transactionAmount) {
        if (transactionAmount > 50 && transactionAmount <= 100) {
            return transactionAmount.intValue() - 50;
        } else if (transactionAmount > 100) {
            return 2 * (transactionAmount.intValue() - 100) + 50;
        }
        return 0;
    }
}
