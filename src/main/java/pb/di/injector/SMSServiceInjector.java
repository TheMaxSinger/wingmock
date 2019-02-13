package pb.di.injector;

import pb.di.app.MyDIApplication;
import pb.di.consumer.Consumer;
import pb.di.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}