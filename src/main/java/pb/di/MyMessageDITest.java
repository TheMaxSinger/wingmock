package pb.di;

import pb.di.consumer.Consumer;
import pb.di.injector.EmailServiceInjector;
import pb.di.injector.MessageServiceInjector;
import pb.di.injector.SMSServiceInjector;

public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hi PB";
		String email = "pb@pb.pb";
		String phone = "0959596000";
		MessageServiceInjector injector = null;
		Consumer app = null;
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}