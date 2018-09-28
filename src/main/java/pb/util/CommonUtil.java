package pb.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;

public class CommonUtil {

	private CommonUtil() {
		throw new IllegalStateException("Utility class");
	}
	
	public static String convertToString(LocalDateTime value, DateTimeFormatter format) {
		String str = "";
		if (value != null) {
			str = format.format(value);
		}
		return str;
	}

	public static String convertToString(String value) {
		return convertToString(value, false);
	}
	
	public static String convertToStringCapitalize(String value) {
		return convertToString(WordUtils.capitalize(value), false);
	}

	public static String convertToString(String value, Boolean addDoubleQuote) {
		String str = "";
		if(StringUtils.isNotBlank(value)) {
			if (addDoubleQuote) {
				str = value.replaceAll("\"", "\"\"");
				str = "\"" + str + "\"";
			} else {
				str = value;
			}
		}
		return str;
	}
	
}