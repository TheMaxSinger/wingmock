package pb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pb.domain.Task;


@Service
public class MockService { 

    public List<Task> getTasks(String wingId) { 
    	List<Task> tasks = new ArrayList<>();
    	Task task = new Task();
    	tasks.add(task);
    	return tasks;
    }

}
