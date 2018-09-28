package pb.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pb.domain.Customer;
import pb.domain.Dimensions;
import pb.domain.Task;


@Service
public class MockService { 

    public List<Task> getTasks(String wingId) { 
    	List<Task> tasks = new ArrayList<>();
    	Task task = new Task();
    	task.setDueDate(LocalDateTime.now());
    	task.setCreateDate(LocalDateTime.now());
    	Customer customer = new Customer();
    	customer.setCustomerId("4gdfg6");
    	customer.setCustomerName("Mr. Somchai");
    	task.setCustomer(customer);
    	Dimensions dimensions = new Dimensions();
    	dimensions.setHeight(new BigDecimal(50));
    	dimensions.setLength(new BigDecimal(50));
    	dimensions.setWeight(new BigDecimal(50));
    	dimensions.setWidth(new BigDecimal(50));
    	task.setDimensions(dimensions);
    	task.setJobId("");
    	task.setNote("");
    	task.setPaymentMethod("credit_card");
    	task.setReceiverLocation("13.699789,100.49151");
    	task.setSenderLocation("13.731808,100.579370");
    	task.setShipmentState("on_going");
    	task.setTaskStatus("now");
    	task.setTotalPrice(1500);
    	tasks.add(task);
    	return tasks;
    }

}
