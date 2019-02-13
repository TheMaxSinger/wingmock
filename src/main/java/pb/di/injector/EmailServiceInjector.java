package pb.di.injector;

import pb.di.app.MyDIApplication;
import pb.di.consumer.Consumer;
import pb.di.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}

}