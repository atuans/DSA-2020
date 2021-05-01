package Lab3;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Minh Thinh
 */
public class TimeUtils {

    public static long now() {
        Calendar cal = Calendar.getInstance();
        Date currentDate = cal.getTime();
        return currentDate.getTime();
    }
}