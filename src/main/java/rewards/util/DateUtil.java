package rewards.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A utility class to provide date related helper methods
 *
 * @author Bhawna Sharma
 */
public class DateUtil {
    /***
     * This function extracts month and year from our timestamp object
     * @param tsm timestamp object is provided as a parameter
     * @return A string of format yyyy-MM
     */

    public static String getYearMonth(Timestamp tsm) {
        Date date = new Date(tsm.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        return sdf.format(date);

    }

}
