package pb.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class StringUtility {

    private StringUtility() {
        throw new IllegalStateException("Utility class");
    }

    public static String truncateStringLogging(String text) throws UnsupportedEncodingException{
        return truncateString(text, 100);
    }

    public static String truncateString(String text, int length) throws UnsupportedEncodingException{
        byte[] byteText = text.getBytes(Charset.forName("UTF-8"));
        if(byteText.length > length) {
            byte[] bytes = Arrays.copyOf(byteText, length);
            return new String(bytes, "UTF-8");
        }
        return text;
    }
    
}