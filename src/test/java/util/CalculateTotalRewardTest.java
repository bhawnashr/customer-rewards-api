package util;

import org.junit.Test;
import rewards.util.RewardCalculator;

import static org.junit.Assert.assertEquals;

public class CalculateTotalRewardTest {
    /***
     * This function test the calculate reward function for values greater than hundred
     */
    @Test
    public void verifyRewardForAmountGreaterThanHundred() {
        int amount = 120;
        int reword = RewardCalculator.calculateReward(amount);

        int expectedReword = 90;


        assertEquals(expectedReword, reword);
    }

    /***
     * This function test for values between fifty and hundred
     */
    @Test
    public void verifyRewardForAmountFiftyToHundred() {
        int amount = 80;
        int reword = RewardCalculator.calculateReward(amount);

        int expectedReword = 30;

        assertEquals(expectedReword, reword);
    }

    /***
     * This function test for values less than fifty
     */
    @Test
    public void verifyRewardForAmountLessThanFifty() {
        int amount = 40;
        int reword = RewardCalculator.calculateReward(amount);

        int expectedReword = 0;

        assertEquals(expectedReword, reword);
    }

}
