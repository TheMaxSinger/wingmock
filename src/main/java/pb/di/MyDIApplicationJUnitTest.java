package pb.di;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import pb.di.app.MyDIApplication;
import pb.di.consumer.Consumer;
import pb.di.injector.MessageServiceInjector;
import pb.di.service.MessageService;

@RunWith(JUnitPlatform.class)
public class MyDIApplicationJUnitTest {

	private MessageServiceInjector injector;
	
	@BeforeEach
	public void setUp() {
		injector = new MessageServiceInjector() { 
			@Override
			public Consumer getConsumer() {
				return new MyDIApplication(new MessageService() {
					@Override
					public void sendMessage(String msg, String rec) {
						System.out.println("Mock Message Service implementation");
						
					}
				});
			}
		};
	}
	
	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
	}
	
	@AfterEach
	public void tear(){
		injector = null;
	}

}