package util;

import org.junit.Test;
import rewards.util.DateUtil;

import java.sql.Timestamp;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class DateTestUtil {
    @Test
    public void verifyYearMonth() {

        LocalDate localDate = LocalDate.parse("2019-05-16");
        Timestamp timestamp = Timestamp.valueOf(localDate.atStartOfDay());
        String yearMonth = DateUtil.getYearMonth(timestamp);
        String expectedYearMonth = "2019-05";

        assertEquals(expectedYearMonth, yearMonth);

    }

}
