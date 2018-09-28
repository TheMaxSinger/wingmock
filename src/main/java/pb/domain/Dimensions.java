package pb.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Dimensions {
	
	private BigDecimal width;
	private BigDecimal height;
	private BigDecimal length;
	private BigDecimal weight;
	
	public BigDecimal getWidth() {
		return width;
	}
	
	public void setWidth(BigDecimal width) {
		this.width = width;
	}
	
	public BigDecimal getHeight() {
		return height;
	}
	
	public void setHeight(BigDecimal height) {
		this.height = height;
	}
	
	public BigDecimal getLength() {
		return length;
	}
	
	public void setLength(BigDecimal length) {
		this.length = length;
	}
	
	public BigDecimal getWeight() {
		return weight;
	}
	
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	
}
