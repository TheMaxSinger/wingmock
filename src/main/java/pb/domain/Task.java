package pb.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import pb.util.JsonUtility;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Task extends DateAttributes { 
	
	private String taskStatus;
	private String jobId;
	private String shipmentState;
	private Integer totalPrice;
	private String paymentMethod;
	private Customer customer;
	private String receiverLocation;
	private String senderLocation;
	private Dimensions dimensions;
	private String note;
	
	public String getTaskStatus() {
		return taskStatus;
	}
	
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	
	public String getJobId() {
		return jobId;
	}
	
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	
	public String getShipmentState() {
		return shipmentState;
	}
	
	public void setShipmentState(String shipmentState) {
		this.shipmentState = shipmentState;
	}
	
	public Integer getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String getPaymentMethod() {
		return paymentMethod;
	}
	
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String getReceiverLocation() {
		return receiverLocation;
	}
	
	public void setReceiverLocation(String receiverLocation) {
		this.receiverLocation = receiverLocation;
	}
	
	public String getSenderLocation() {
		return senderLocation;
	}
	
	public void setSenderLocation(String senderLocation) {
		this.senderLocation = senderLocation;
	}
	
	public Dimensions getDimensions() {
		return dimensions;
	}
	
	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String toString() {
		try {
			return JsonUtility.getJsonString(this);
		} catch (JsonProcessingException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

}