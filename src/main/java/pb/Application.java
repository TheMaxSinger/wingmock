package pb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;

@PropertySource(value = {"classpath:/appInfo.properties"}, ignoreResourceNotFound = true)
@SpringBootApplication
@EnableSpringBootMetricsCollector
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}