package pb.util;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonUtility { 
	
	private JsonUtility() {
        throw new IllegalStateException("Utility class");
    }
	
	private static ObjectMapper objectMapper = new ObjectMapper()
			.registerModule(new JavaTimeModule())
			.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
			.setSerializationInclusion(JsonInclude.Include.NON_NULL);
	
	public static String getJsonString(Object objectToConvert) throws JsonProcessingException {
		return objectMapper.writeValueAsString(objectToConvert);
	}
	
	public static <T> T getObject(String stringToConvert, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(stringToConvert, clazz);
	}

	public static <T> T getObject(String stringToConvert, TypeReference<T> type) throws IOException {
		return objectMapper.readValue(stringToConvert, type);
	}

}