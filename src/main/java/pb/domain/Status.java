package pb.domain;


public class Status {

    public static final Status SUCCESS = new Status("success", "success");

    private String code;
    private String message;

    public Status() {
    }

    public Status(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Status{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
