package service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import rewards.domain.Transaction;
import rewards.dto.TransactionRewardsDto;
import rewards.repository.TransactionRepository;
import rewards.service.impl.TransactionServiceImpl;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class TransactionServiceTest {
    @InjectMocks
    TransactionServiceImpl service;

    @Mock
    TransactionRepository repository  ;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void TransactionRewardsDtoTest() {

        Map<String, Integer> expectedMonthlyRewards = new HashMap<>();
        expectedMonthlyRewards.put("2019-05", 150);
        Integer expectedTotalReward = 150;
        LocalDate localDate = LocalDate.parse("2019-05-16");
        Timestamp timestamp = Timestamp.valueOf(localDate.atStartOfDay());
        Transaction testTransaction1 = new Transaction(1L, 20.50F, timestamp, "customer-1");
        Transaction testTransaction2 = new Transaction(2L, 150F, timestamp, "customer-1");
        List<Transaction> transactions = Arrays.asList(testTransaction1, testTransaction2);

        when(repository.findByCustomerId("customer-1")).thenReturn(transactions);

        TransactionRewardsDto rewardsDto = service.getTransactionRewards("customer-1");

        assertEquals(expectedTotalReward, rewardsDto.getTotalReward());
        assertEquals(expectedMonthlyRewards, rewardsDto.getMonthlyRewards());

    }
}
