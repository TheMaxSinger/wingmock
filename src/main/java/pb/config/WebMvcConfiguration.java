package pb.config;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pb.util.DateTimeUtility;

@Configuration
public class WebMvcConfiguration {

    @Value("${wing.json.timezone}")
    private String timeZone;

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jacksonDateTimeCustomization() {
        return mapper -> {
            mapper.timeZone(timeZone);
            mapper.dateFormat(new SimpleDateFormat(DateTimeUtility.WING_DATE_FORMAT));
        };
    }
    
}
