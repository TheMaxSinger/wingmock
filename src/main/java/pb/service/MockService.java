package pb.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pb.domain.Customer;
import pb.domain.Dimensions;
import pb.domain.Task;
import pb.domain.Work;


@Service
public class MockService { 

    public List<Task> getTasks(String wingId) { 
    	List<Task> tasks = new ArrayList<>();
    	Task task = new Task();
    	task.setDueDate(LocalDateTime.now());
    	task.setCreateDate(LocalDateTime.now());
    	Customer customer = new Customer();
    	customer.setCustomerId("4gdfg6");
    	customer.setCustomerName("Mr. Smith");
    	task.setCustomer(customer);
    	Dimensions dimensions = new Dimensions();
    	dimensions.setHeight(new BigDecimal(50));
    	dimensions.setLength(new BigDecimal(50));
    	dimensions.setWeight(new BigDecimal(50));
    	dimensions.setWidth(new BigDecimal(50));
    	task.setDimensions(dimensions);
    	task.setJobId("3gdsa6");
    	task.setNote("ผู้ส่งของต้องการคนช่วยขน 2 คน");
    	task.setPaymentMethod("credit_card");
    	task.setReceiverLocation("13.699789,100.49151");
    	task.setSenderLocation("13.731808,100.579370");
    	task.setShipmentState("on_going");
    	task.setTaskStatus("now");
    	task.setTotalPrice(1500);
    	tasks.add(task);
    	return tasks;
    }
    
    public List<Work> getWorks(String wingId) {
    	List<Work> works = new ArrayList<>();
    	Work work1 = new Work();
    	work1.setPaymentMethod("credit_card");
    	work1.setDueDate(LocalDateTime.now());
    	work1.setCreateDate(LocalDateTime.now());
    	Customer customer = new Customer();
    	customer.setCustomerId("12345");
    	customer.setCustomerName("Mr. James");
    	work1.setCustomer(customer);
    	work1.setLocationImage("https://images.mentalfloss.com/sites/default/files/styles/mf_image_16x9/public/traffic_primary.jpg?itok=6hVRNcu_&resize=1100x1100");
    	work1.setTotalPrice(new BigDecimal(151));
    	works.add(work1);
    	Work work2 = new Work();
    	work2.setPaymentMethod("credit_card");
    	work2.setDueDate(LocalDateTime.now());
    	work2.setCreateDate(LocalDateTime.now());
    	Customer customer2 = new Customer();
    	customer2.setCustomerId("12345");
    	customer2.setCustomerName("Mr. James");
    	work2.setCustomer(customer2);
    	work2.setLocationImage("https://images.mentalfloss.com/sites/default/files/styles/mf_image_16x9/public/traffic_primary.jpg?itok=6hVRNcu_&resize=1100x1100");
    	work2.setTotalPrice(new BigDecimal(151));
    	works.add(work2);
    	Work work3 = new Work();
    	work3.setPaymentMethod("credit_card");
    	work3.setDueDate(LocalDateTime.now());
    	work3.setCreateDate(LocalDateTime.now());
    	Customer customer3 = new Customer();
    	customer3.setCustomerId("12345");
    	customer3.setCustomerName("Mr. James");
    	work3.setCustomer(customer3);
    	work3.setLocationImage("https://images.mentalfloss.com/sites/default/files/styles/mf_image_16x9/public/traffic_primary.jpg?itok=6hVRNcu_&resize=1100x1100");
    	work3.setTotalPrice(new BigDecimal(151));
    	works.add(work3);
    	Work work4 = new Work();
    	work4.setPaymentMethod("credit_card");
    	work4.setDueDate(LocalDateTime.now());
    	work4.setCreateDate(LocalDateTime.now());
    	Customer customer4 = new Customer();
    	customer4.setCustomerId("12345");
    	customer4.setCustomerName("Mr. James");
    	work4.setCustomer(customer4);
    	work4.setLocationImage("https://images.mentalfloss.com/sites/default/files/styles/mf_image_16x9/public/traffic_primary.jpg?itok=6hVRNcu_&resize=1100x1100");
    	work4.setTotalPrice(new BigDecimal(151));
    	works.add(work4);
    	Work work5 = new Work();
    	work5.setPaymentMethod("credit_card");
    	work5.setDueDate(LocalDateTime.now());
    	work5.setCreateDate(LocalDateTime.now());
    	Customer customer5 = new Customer();
    	customer5.setCustomerId("12345");
    	customer5.setCustomerName("Mr. James");
    	work5.setCustomer(customer5);
    	work5.setLocationImage("https://images.mentalfloss.com/sites/default/files/styles/mf_image_16x9/public/traffic_primary.jpg?itok=6hVRNcu_&resize=1100x1100");
    	work5.setTotalPrice(new BigDecimal(151));
    	works.add(work5);
    	return works;
    }

}
