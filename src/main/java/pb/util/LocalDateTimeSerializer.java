package pb.util;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class LocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {

	static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DateTimeUtility.WING_DATE_FORMAT);

	@Override
	public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider provider) { 
		try {
			if (gen == null) {
				throw new IOException("Invalid generator");
			}
			gen.writeString(value.format(DATE_FORMATTER));
		} catch (Exception e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

}