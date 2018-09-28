package pb.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtility {

    public static final String WING_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String S3_DATE_FORMAT = "yyyyMMdd";

    private DateTimeUtility() {
        throw new IllegalStateException("Utility class");
    }
    
    public static String toS3DateString(LocalDateTime targetDate) {
        return targetDate.format(DateTimeFormatter.ofPattern(S3_DATE_FORMAT));
    }

}