package pb.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MetricPublisherConfig { 
	
	/**
	@Bean
	MeterRegistryCustomizer<MeterRegistry> meterRegistryCustomizer(MeterRegistry meterRegistry) {
		return meterReg -> {
			//Gauge.builder(MetricConstant.PROCESSING_TIME_NAME, null, null).description(MetricConstant.PROCESSING_TIME_DESCRIPTION).tags(MetricConstant.SERVICE_TAG, "", MetricConstant.STATUS_CODE_TAG, "", MetricConstant.IS_RESPECT_TAG, "").register(meterRegistry);
			Counter.builder(MetricConstant.TOTAL_REQUEST_NAME).description(MetricConstant.TOTAL_REQUEST_DESCRIPTION).tags(MetricConstant.SERVICE_TAG, "").register(meterRegistry);
			Counter.builder(MetricConstant.TOTAL_TRANS_PER_RESPONSE_CODE_NAME).description(MetricConstant.TOTAL_TRANS_PER_RESPONSE_CODE_DESCRIPTION).tags(MetricConstant.SERVICE_TAG, "", MetricConstant.RESPONSE_CODE_TAG, "").register(meterRegistry);
			//Timer.builder(MetricConstant.PROCESSING_TIME_NAME).tags(MetricConstant.SERVICE_TAG, "").publishPercentileHistogram().sla(Duration.ofSeconds(1)).register(meterRegistry);
			
			//Counter uagTotalTransaction = Counter.build().namespace("acm_alipay_gka_composite").name("total_transaction").labelNames("service", "status_code", "isexpect").help("Total transactions").register(registry);
		};
	}**/

}