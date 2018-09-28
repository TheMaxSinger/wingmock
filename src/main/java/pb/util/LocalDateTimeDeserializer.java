package pb.util;

import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {

	@Override
	public LocalDateTime deserialize(JsonParser p, DeserializationContext ctx) {
		try {
			String str = p.getText();
			return LocalDateTime.parse(str, LocalDateTimeSerializer.DATE_FORMATTER);
		} catch (Exception e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}
	
}