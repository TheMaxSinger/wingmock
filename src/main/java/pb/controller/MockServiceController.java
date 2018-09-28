package pb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import pb.domain.Response;
import pb.domain.Status;
import pb.domain.Task;
import pb.service.MockService;

@RestController
@RequestMapping(value = "/wm")
@Api(value = "Wing Mock API", tags = {"Wing Mock API"})
public class MockServiceController {

    @Autowired
    private MockService mockService;
    
    @ApiOperation(value = "Get Task For Wingman")
    @GetMapping(path = "/task/{wing_id:.+}")
    public Response<List<Task>> getDownloadHistoryList(@PathVariable("wing_id") String wingId) {
    	Response<List<Task>> response = new Response<>();
    	response.setStatus(Status.SUCCESS);
    	response.setData(mockService.getTasks(wingId));
        return response;
    }

}

enum SuggestionKey {
    merchant,
    shop
}

enum SelectionKey {
    product,
    sof_type,
    order_status,
    order_status_code,
    order_type
}

enum ResponseStatus {
    success,
    failed
}
