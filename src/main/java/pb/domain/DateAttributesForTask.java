package pb.domain;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModelProperty;
import pb.util.DateTimeUtility;
import pb.util.LocalDateTimeDeserializer;
import pb.util.LocalDateTimeSerializer;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class DateAttributesForTask { 
	
	@ApiModelProperty(value = DateTimeUtility.WING_DATE_FORMAT, required = true , example = "require")
    @DateTimeFormat(pattern = DateTimeUtility.WING_DATE_FORMAT)
    @JsonFormat(pattern = DateTimeUtility.WING_DATE_FORMAT)
    @NotNull
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)  
    @JsonSerialize(using = LocalDateTimeSerializer.class)  
    private LocalDateTime createDate;

    @ApiModelProperty(value = DateTimeUtility.WING_DATE_FORMAT, required = true , example = "require")
    @DateTimeFormat(pattern = DateTimeUtility.WING_DATE_FORMAT)
    @JsonFormat(pattern = DateTimeUtility.WING_DATE_FORMAT)
    @NotNull
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)  
    @JsonSerialize(using = LocalDateTimeSerializer.class)  
    private LocalDateTime dueDate;

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}

}